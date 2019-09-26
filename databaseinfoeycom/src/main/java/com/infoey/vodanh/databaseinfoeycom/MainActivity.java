package com.infoey.vodanh.databaseinfoeycom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static String website = "https://";
    public static String websiter = "databaseinfoey.";
    public static String websita = website+websiter;
    public static String name = "netlify.com/";
    public static String json = "main.txt";
    public static String dater = websita+name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
