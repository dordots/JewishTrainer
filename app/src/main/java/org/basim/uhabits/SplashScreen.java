package org.basim.uhabits;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.widget.Toast;

import org.basim.uhabits.activities.habits.list.ListHabitsActivity;
import org.basim.uhabits.utils.Constants;
import org.basim.uhabits.utils.CustomPopups;
import org.basim.uhabits.utils.InternetConnectionCheck;
import org.basim.uhabits.utils.JSONParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class SplashScreen extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Handler handler=new Handler();
        handler.postDelayed(() -> {
            Intent i = new Intent(SplashScreen.this, ListHabitsActivity.class);
            startActivity(i);
            finish();
        },SPLASH_TIME_OUT);

    }


    @Override
    protected void onResume() {
        super.onResume();
    }
}
