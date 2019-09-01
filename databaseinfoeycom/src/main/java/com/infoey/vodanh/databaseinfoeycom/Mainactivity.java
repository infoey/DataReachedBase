package com.infoey.vodanh.databaseinfoeycom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static String website = "https://databaseinfoey.netlify.com/";
    public static String name = "netlify.com/";
    public static String json = "main.txt";
    public static String dater = website+name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
