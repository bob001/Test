package com.qiu.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String firstData = getIntent().getStringExtra("data");
        Log.d(TAG, firstData);
        Intent intent = new Intent();
        intent.putExtra("dataReturn", "SecondActivityData");
        setResult(RESULT_OK, intent);
        finish();
    }
}
