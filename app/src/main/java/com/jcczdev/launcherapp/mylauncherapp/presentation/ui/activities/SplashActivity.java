package com.jcczdev.launcherapp.mylauncherapp.presentation.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jcczdev.launcherapp.mylauncherapp.MainActivity;
import com.jcczdev.launcherapp.mylauncherapp.R;

/**
 * Created by Juan on 11/03/2018.
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(MainActivity.makeIntent(this));
        finish();
    }
}
