package com.verizon.testingconst;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String TAG = "TeatingConst";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SecondClass sc = new SecondClass();
        String str = "123nikh456nikh9090";
        String subStr = "nikh";
        String[] strings = str.split(subStr);
        String before = strings[0];
        String after = strings[1];
        for (int i = 0; i < strings.length; i++) {
            Log.d(TAG, "onCreate: " + strings[i]);
        }
    }
}