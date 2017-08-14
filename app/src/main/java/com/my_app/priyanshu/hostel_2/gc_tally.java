package com.my_app.priyanshu.hostel_2;

import android.webkit.*;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Kumar Priyanshu on 16-03-2017.
 */

public class gc_tally extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gc_tally);

        Button gc_sports=(Button)findViewById(R.id.gc_sports_button);
        Button gc_cult=(Button)findViewById(R.id.gc_cult_button);
        Button gc_tech=(Button)findViewById(R.id.gc_tech_button);

        final WebView sports = (WebView)findViewById(R.id.gc_sports_WebView);
        final WebView tech = (WebView)findViewById(R.id.gc_tech_WebView);
        final WebView cult = (WebView)findViewById(R.id.gc_cult_WebView);





        gc_sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebSettings webSettings = sports.getSettings();
                webSettings.setJavaScriptEnabled(true);
                sports.loadUrl("https://gymkhana.iitb.ac.in/~sports/index.php?r=events/gc");
                sports.setVerticalScrollBarEnabled(true);
                sports.setHorizontalScrollBarEnabled(true);

            }});



        gc_cult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebSettings webSettings = cult.getSettings();
                webSettings.setJavaScriptEnabled(true);
                cult.loadUrl("https://gymkhana.iitb.ac.in/~cultural/index.php?key1=arch&key2=gc");
                cult.setVerticalScrollBarEnabled(true);
                cult.setHorizontalScrollBarEnabled(true);


            }});



        gc_tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebSettings webSettings = tech.getSettings();
                webSettings.setJavaScriptEnabled(true);
                tech.loadUrl("https://stab-iitb.org/tech-gc-points-2016");
                tech.setVerticalScrollBarEnabled(true);
                tech.setHorizontalScrollBarEnabled(true);
            }});



    }



}