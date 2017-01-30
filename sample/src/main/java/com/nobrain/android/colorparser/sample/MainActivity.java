package com.nobrain.android.colorparser.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nobrain.android.colorparser.ColorParser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_main).setBackgroundColor(ColorParser.parse("purple"));

    }
}
