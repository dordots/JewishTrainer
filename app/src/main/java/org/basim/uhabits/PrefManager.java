package org.basim.uhabits;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;

import org.basim.uhabits.models.ColorsListBody;

public class PrefManager {
    public static void saveColorsList(ColorsListBody colorList, Context context) {

        Gson gson = new Gson();
        String posJson = gson.toJson(colorList);

        savePreferences("ColorsList", posJson, context);
    }

    public static String loadPreferences(Context context, String Key) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        String Value = sp.getString(Key, "0");
        return Value;

    }

    public static ColorsListBody getColorsList(Context context) {
        Gson gson = new Gson();
        if (loadPreferences(context, "ColorsList").equals("0")){
            return null;
        }else {
            ColorsListBody pos = gson.fromJson(loadPreferences(context,"ColorsList"), ColorsListBody.class);
            return pos;
        }
    }

    public static void savePreferences(String key, String value, Context context) {
        SharedPreferences sp = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key, value);
        edit.commit();
    }
}
