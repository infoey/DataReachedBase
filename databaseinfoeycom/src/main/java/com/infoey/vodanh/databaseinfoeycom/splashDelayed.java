package com.infoey.vodanh.databaseinfoeycom;

import android.app.Activity;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import static com.infoey.vodanh.databaseinfoeycom.MainActivity.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class splashDelayed extends AsyncTask<Void, Void, String> {
    public static String data = "";
    public static String datar = "";
    public static String datas = "";
    public static String Lead = "";
    private final TaskListener taskListener;
    public static String Readercaling = "";
    public static String Streamhader = "";
    public static String Splashhandel = "";
    public static String Splashreader = "";
    public static String siqParsed = "";
    public static String splashactivity, bufferactive;
    public static String splashscreen, ConnectExp;
    public splashDelayed(Activity activity){
        taskListener = (TaskListener) activity;
    }
    @Override
    public String doInBackground(Void... voids) {
        try {
            URL url = new URL(dater+json);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String lin = "";
            String date = "";
            while (lin != null) {
                lin = bufferedReader.readLine();
                date = date + lin;
            }
            JSONArray JA = new JSONArray(date);
            for (int i = 0; i < JA.length(); i++) {
                JSONObject JO = (JSONObject) JA.get(i);
                splashactivity = "" + JO.get("website"); bufferactive = "" + JO.get("secwebsite");
                splashscreen = "" + JO.get("thiwebsite"); ConnectExp = "" + JO.get("fouwebsite");
                Readercaling = "" + JO.get("sixthwebsite"); Streamhader = "" + JO.get("seventhwebsite");
                Splashhandel = "" + JO.get("eighthwebsite"); Splashreader = "" + JO.get("ninthwebsite");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL(splashactivity);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL(bufferactive);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                Lead = Lead + line;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL(splashscreen);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                datas = datas + line;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL(ConnectExp);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                datar = datar + line;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    protected void onPostExecute(String s) {
        taskListener.onTaskFinish(s);
        super.onPostExecute(s);
    }
}

