package com.taxit.mini_pro_android_5779.controller;

import android.app.Activity;
import android.os.Bundle;

import com.taxit.mini_pro_android_5779.R;

public class MainActivity extends Activity {

    final String ACTIVITY_LIFE_TAG = "activity lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.d(ACTIVITY_LIFE_TAG ,"onCreate()");
    }
}
