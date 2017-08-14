package com.my_app.priyanshu.hostel_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;


public class mess_display  extends AppCompatActivity
{
    String bre, lun, tif, din, week;

    String transfer,day;
    JSONObject jsonObject;
    JSONArray jsonArray;
    String[] data= new String[5];


    int count;
    TextView breakfast;
    TextView lunch ;
    TextView tiffin ;
    TextView dinner;
    TextView meal;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mess_display);
        {
            String[] days={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};

            breakfast = (TextView) findViewById(R.id.breakfast);
            lunch = (TextView) findViewById(R.id.lunch);
            tiffin = (TextView) findViewById(R.id.tiffin);
            dinner = (TextView) findViewById(R.id.dinner);
            transfer = getIntent().getExtras().getString("data");
            day = getIntent().getExtras().getString("day");
            count = Arrays.asList(days).indexOf(day);

            try
            {
                        jsonObject = new JSONObject(transfer);

                        jsonArray = jsonObject.getJSONArray("DAY");



                        JSONObject JO = jsonArray.getJSONObject(count);

                        bre = JO.getString("BREAKFAST");
                        lun = JO.getString("LUNCH");
                        tif = JO.getString("TIFFIN");
                        din = JO.getString("DINNER");

                        data[1]=bre;
                        data[2]=lun;
                        data[3]=tif;
                        data[4]=din;



            } catch (JSONException e)
            {
                        e.printStackTrace();

            }
                    try
                     {
                        breakfast.setText(data[1]);
                        lunch.setText(data[2]);
                        tiffin.setText(data[3]);
                        dinner.setText(data[4]);
                    }catch (NullPointerException e)
                    {
                        e.printStackTrace();
                    }

        }

    }









}

