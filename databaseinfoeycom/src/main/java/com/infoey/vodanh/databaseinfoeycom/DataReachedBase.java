package com.infoey.vodanh.databaseinfoeycom;

import android.app.Activity;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DataReachedBase extends AsyncTask<Void,Void,String> {
    public static String data,datasec,datathi,datafou = "";
    public static String datafif,datase,datasev,dataeig,nindata = "";
    private final TaskListener taskListener;
    public static String website = "https://";
    public static String websiter = "databaseinfoey.";
    public static String websita = website+websiter;
    public static String name = "netlify.com/";
    public static String json = "main.txt";
    public static String dater = websita+name;
    public static String sinParsed = "";
    public static String sivParsed = "";
    public static String sibParsed = "";
    public static String simParsed = "";
    public static String siqParsed = "";
    private String moviedata,moviesecdata,moviethidata;
    private String moviefoudata,moviefifdata,moviesedata;
    private String moviesevdata,movieeigdata,movienindata;
    public DataReachedBase(Activity activity){
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
                moviedata = "" + JO.get("website");moviesecdata = "" + JO.get("secwebsite");
                moviethidata = "" + JO.get("thiwebsite");moviefoudata = "" + JO.get("fouwebsite");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL(moviedata);
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
            URL url = new URL(moviesecdata);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String lines = "";
            while (lines != null) {
                lines = bufferedReader.readLine();
                datasec = datasec + lines;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL(moviethidata);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String linethi = "";
            while (linethi != null) {
                linethi = bufferedReader.readLine();
                datathi = datathi + linethi;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL(moviefoudata);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String linefou = "";
            while (linefou != null) {
                linefou = bufferedReader.readLine();
                datafou = datafou + linefou;
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
