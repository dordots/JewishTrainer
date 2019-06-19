package org.basim.uhabits.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.basim.uhabits.R;
import org.basim.uhabits.activities.habits.list.ListHabitsScreen;

import java.util.ArrayList;


public class CustomPopups {
    public static void showSplashPopup(Activity activity){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.splash_popup_screen);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button optionA = (Button) dialog.findViewById(R.id.optionA);
        optionA.setOnClickListener(v -> {
            String url = "http://www.google.com";
            try {
                Intent i = new Intent("android.intent.action.MAIN");
                i.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
                i.addCategory("android.intent.category.LAUNCHER");
                i.setData(Uri.parse(url));
                activity.startActivity(i);
            }
            catch(ActivityNotFoundException e) {
                // Chrome is not installed
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                activity.startActivity(i);
            }
        });

        Button optionB = (Button) dialog.findViewById(R.id.optionB);
        optionB.setOnClickListener(v -> {
            String url = "http://www.google.com";
            try {
                Intent i = new Intent("android.intent.action.MAIN");
                i.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
                i.addCategory("android.intent.category.LAUNCHER");
                i.setData(Uri.parse(url));
                activity.startActivity(i);
            }
            catch(ActivityNotFoundException e) {
                // Chrome is not installed
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                activity.startActivity(i);
            }
        });

        Button optionC = (Button) dialog.findViewById(R.id.optionC);
        optionC.setOnClickListener(v -> {
            String url = "http://www.google.com";
            try {
                Intent i = new Intent("android.intent.action.MAIN");
                i.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
                i.addCategory("android.intent.category.LAUNCHER");
                i.setData(Uri.parse(url));
                activity.startActivity(i);
            }
            catch(ActivityNotFoundException e) {
                // Chrome is not installed
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                activity.startActivity(i);
            }
        });
        dialog.show();
    }

    public static void showCategoryyPopup(Activity activity, ListHabitsScreen screen){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.habits_popup_screen);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ListView habitsList = (ListView) dialog.findViewById(R.id.habitsList);

        ArrayList<String> catList = new ArrayList<>();
        ArrayList<String> colorList = new ArrayList<>();
        Constants.categories.add("Custom");
        Constants.colors.add("#D3D3D3");
        for (int i = 0; i < Constants.categories.size(); i++){
            if(i != 0){
                if(!Constants.categories.get(i).equals(Constants.categories.get(i-1))){
                    catList.add(Constants.categories.get(i));
                    colorList.add(Constants.colors.get(i));
                }
            } else {
                catList.add(Constants.categories.get(i));
                colorList.add(Constants.colors.get(i));
            }
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(activity, android.R.layout.simple_list_item_1, catList) {


            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                ViewGroup.LayoutParams params = view.getLayoutParams();
                view.setLayoutParams(params);

                TextView textview = (TextView) view;
                textview.setTextSize(15);
                textview.setGravity(Gravity.CENTER);
                textview.setTextColor(Color.WHITE);


                textview.setBackgroundColor(Color.parseColor(colorList.get(position)));





                return textview;
            }
        };

















        habitsList.setAdapter(adapter);
        habitsList.setOnItemClickListener((parent, view, position, id) -> {
            int itemPosition     = position;
            String  itemValue    = (String) habitsList.getItemAtPosition(position);
            String  categoryValue = Constants.categories.get(position);
            String  colorValue    = colorList.get(position);
            Constants.selectedCategory = itemValue;
            Constants.selectedColor = colorValue;
            if(itemValue.equals("Custom")){
                Constants.selectedHabit = null;
                screen.showCreateHabitScreen();
            } else {
                showHabitPopup(activity, screen);
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    public static void showHabitPopup(Activity activity, ListHabitsScreen screen){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.habits_popup_screen);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ListView habitsList = (ListView) dialog.findViewById(R.id.habitsList);

        ArrayList<String> habitList = new ArrayList<>();
        for (int i = 0; i < Constants.habits.size(); i++){
            if(Constants.categories.get(i).equals(Constants.selectedCategory)){
                habitList.add(Constants.habits.get(i));
            }
        }


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(activity, android.R.layout.simple_list_item_1, habitList) {


            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                ViewGroup.LayoutParams params = view.getLayoutParams();
                view.setLayoutParams(params);

                TextView textview = (TextView) view;
                textview.setTextSize(15);
                textview.setGravity(Gravity.CENTER);
                textview.setTextColor(Color.WHITE);


                textview.setBackgroundColor(Color.parseColor(Constants.selectedColor));

                return textview;
            }
        };


        habitsList.setAdapter(adapter);
        habitsList.setOnItemClickListener((parent, view, position, id) -> {
            int itemPosition     = position;
            String  itemValue    = (String) habitsList.getItemAtPosition(position);
            String  categoryValue = Constants.categories.get(position);
            String  colorValue    = Constants.colors.get(position);
            Constants.selectedHabit = itemValue;
            Constants.selectedCategory = categoryValue;
            Constants.selectedColor = colorValue;
            screen.showCreateHabitScreen();
            dialog.dismiss();
        });
        dialog.show();
    }



}
