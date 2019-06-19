/*
 * Copyright (C) 2016 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.basim.uhabits.activities.habits.list;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.provider.Settings;
import android.support.annotation.*;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.yarolegovich.lovelydialog.LovelyChoiceDialog;

import org.basim.uhabits.*;
import org.basim.uhabits.models.*;
import org.basim.uhabits.activities.*;
import org.basim.uhabits.activities.habits.list.model.*;
import org.basim.uhabits.preferences.*;
import org.basim.uhabits.utils.Constants;
import org.basim.uhabits.utils.CustomPopups;
import org.basim.uhabits.utils.InternetConnectionCheck;
import org.basim.uhabits.utils.JSONParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.ArrayList;

import javax.inject.*;

@ActivityScope
public class ListHabitsMenu extends BaseMenu
{
    @NonNull
    private final ListHabitsScreen screen;

    private final HabitCardListAdapter adapter;

    private boolean showArchived;

    private boolean showCompleted;

    private final Preferences preferences;

    private ThemeSwitcher themeSwitcher;

    @Inject
    public ListHabitsMenu(@NonNull BaseActivity activity,
                          @NonNull ListHabitsScreen screen,
                          @NonNull HabitCardListAdapter adapter,
                          @NonNull Preferences preferences,
                          @NonNull ThemeSwitcher themeSwitcher)
    {
        super(activity);
        this.screen = screen;
        this.adapter = adapter;
        this.preferences = preferences;
        this.themeSwitcher = themeSwitcher;

        showCompleted = preferences.getShowCompleted();
        showArchived = preferences.getShowArchived();
        updateAdapterFilter();
    }

    @Override
    public void onCreate(@NonNull Menu menu)
    {
        MenuItem nightModeItem = menu.findItem(R.id.actionToggleNightMode);
        nightModeItem.setChecked(themeSwitcher.isNightMode());

        MenuItem hideArchivedItem = menu.findItem(R.id.actionHideArchived);
        hideArchivedItem.setChecked(!showArchived);

        MenuItem hideCompletedItem = menu.findItem(R.id.actionHideCompleted);
        hideCompletedItem.setChecked(!showCompleted);
    }

    @Override
    public boolean onItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.actionToggleNightMode:
                screen.toggleNightMode();
                return true;

            case R.id.actionAdd:
                sendCall();
                return true;

            case R.id.actionIntroSlide:
                screen.showIntroScreen();
                return true;

            case R.id.actionFAQ:
                screen.showFAQScreen();
                return true;

            case R.id.actionAbout:
                screen.showAboutScreen();
                return true;

            case R.id.actionSettings:
                screen.showSettingsScreen();
                return true;

            case R.id.actionHideArchived:
                toggleShowArchived();
                invalidate();
                return true;

            case R.id.actionHideCompleted:
                toggleShowCompleted();
                invalidate();
                return true;

            case R.id.actionSortColor:
                adapter.setOrder(HabitList.Order.BY_COLOR);
                return true;

            case R.id.actionSortManual:
                adapter.setOrder(HabitList.Order.BY_POSITION);
                return true;

            case R.id.actionSortName:
                adapter.setOrder(HabitList.Order.BY_NAME);
                return true;

            case R.id.actionSortScore:
                adapter.setOrder(HabitList.Order.BY_SCORE);
                return true;

            default:
                return false;
        }
    }


    @Override
    protected int getMenuResourceId()
    {
        return R.menu.list_habits;
    }

    private void toggleShowArchived()
    {
        showArchived = !showArchived;
        preferences.setShowArchived(showArchived);
        updateAdapterFilter();
    }

    private void toggleShowCompleted()
    {
        showCompleted = !showCompleted;
        preferences.setShowCompleted(showCompleted);
        updateAdapterFilter();
    }

    private void updateAdapterFilter()
    {
        adapter.setFilter(new HabitMatcherBuilder()
            .setArchivedAllowed(showArchived)
            .setCompletedAllowed(showCompleted)
            .build());
        adapter.refresh();
    }

    private void sendCall() {
        if(!InternetConnectionCheck.isConnected(activity)){
            new AlertDialog.Builder(activity)
                    .setTitle(activity.getResources().getString(R.string.no_internet_title))
                    .setMessage(activity.getResources().getString(R.string.no_internet_title_content))

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            activity.startActivity(new Intent(Settings.ACTION_WIRELESS_SETTINGS));
                        }
                    })

                    .setNegativeButton(android.R.string.no, null)
                    .setCancelable(false)
                    .show();
        } else {

            if(Constants.categories == null){
                new GetDataTask().execute();
            } else {
                screen.showHabitsPopuptScreen(screen);
            }

        }
    }

    class GetDataTask extends AsyncTask<Void, Void, Void> {
        ProgressDialog progress = new ProgressDialog(activity);

        int jIndex;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            /**
             * Progress Dialog for User Interaction
             */
            progress.setMessage("Loading... ");
            progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progress.setIndeterminate(true);
            progress.show();
        }

        @Nullable
        @Override
        protected Void doInBackground(Void... params) {

            /**
             * Getting JSON Object from Web Using okHttp
             */
            JSONObject jsonObject = JSONParser.getDataFromWeb();

            try {
                /**
                 * Check Whether Its NULL???
                 */
                if (jsonObject != null) {
                    /**
                     * Check Length...
                     */
                    if(jsonObject.length() > 0) {
                        /**
                         * Getting Array named "contacts" From MAIN Json Object
                         */
                        JSONArray array = jsonObject.getJSONArray("Sheet1");

                        /**
                         * Check Length of Array...
                         */

                        ArrayList<String> habits = new ArrayList<>();
                        ArrayList<String> categories = new ArrayList<>();
                        ArrayList<String> colors = new ArrayList<>();
                        int lenArray = array.length();
                        if(lenArray > 0) {
                            for( ; jIndex < lenArray; jIndex++) {

                                JSONObject c = array.getJSONObject(jIndex);

                                // Storing each json item in variable
                                String habit = c.getString("habit");
                                String category = c.getString("category");
                                String color = c.getString("color");
                                habits.add(habit);
                                categories.add(category);
                                colors.add(color);


                                Log.e("DATAAAAA", "question1: " + habit);


                            }
                        }
                        Constants.habits = habits;
                        Constants.categories = categories;
                        Constants.colors = colors;

                    }
                } else {

                }
            } catch (JSONException je) {
                Log.i(JSONParser.TAG, "" + je.getLocalizedMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            /**
             * Checking if List size if more than zero then
             * Update ListView
             */
            progress.dismiss();
            screen.showHabitsPopuptScreen(screen);
        }
    }

}
