package com.ajanshisar.branch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int a = 1 + 1;

    public void newMethod(){
        int i = 2 * 2;

        String test = "test";
    }
}
