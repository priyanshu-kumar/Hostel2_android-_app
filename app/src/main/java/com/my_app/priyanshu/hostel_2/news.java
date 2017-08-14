package com.my_app.priyanshu.hostel_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Kumar Priyanshu on 16-03-2017.
 */

public class news extends AppCompatActivity {
    String bre, lun, tif, din, week;

    String news_data;
    JSONObject jsonObject;
    JSONArray jsonArray;
    String[] data= new String[11];


    int count;
    TextView block0;
    TextView block1;
    TextView block2;
    TextView block3;
    TextView block4;
    TextView block5;
    TextView block6;
    TextView block7;
    TextView block8;
    TextView block9;
    TextView block10;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
        {

            block0 = (TextView) findViewById(R.id.block0);
            block1 = (TextView) findViewById(R.id.block1);
            block2 = (TextView) findViewById(R.id.block2);
            block3 = (TextView) findViewById(R.id.block3);
            block4 = (TextView) findViewById(R.id.block4);
            block5 = (TextView) findViewById(R.id.block5);
            block6 = (TextView) findViewById(R.id.block6);
            block7 = (TextView) findViewById(R.id.block7);
            block8 = (TextView) findViewById(R.id.block8);
            block9 = (TextView) findViewById(R.id.block9);
            block10 = (TextView) findViewById(R.id.block10);

            news_data = getIntent().getExtras().getString("get");



            try
            {
                jsonObject = new JSONObject(news_data);

                jsonArray = jsonObject.getJSONArray("NEWS");


                for(int i=0;i<11;i++)
                {
                    data[i]  =jsonArray.getString(i);

                }




            } catch (JSONException e)
            {
                e.printStackTrace();

            }
            try
                {
                    block0.setText(data[0]);
                    block1.setText(data[1]);
                    block2.setText(data[2]);
                    block3.setText(data[3]);
                    block4.setText(data[4]);
                    block5.setText(data[5]);
                    block6.setText(data[6]);
                    block7.setText(data[7]);
                    block8.setText(data[8]);
                    block9.setText(data[9]);
                    block10.setText(data[10]);
                }catch (NullPointerException e)
            {
                e.printStackTrace();
            }

        }

    }




}
