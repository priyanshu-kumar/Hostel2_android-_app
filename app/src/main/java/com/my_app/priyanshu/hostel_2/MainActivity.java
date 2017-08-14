package com.my_app.priyanshu.hostel_2;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class MainActivity extends AppCompatActivity   {
     String Message2="monday";
     String transfer;
     String news_data;
     String image_transfer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TabHost tab_host = (TabHost) findViewById(R.id.tab_host);
        tab_host.setup();
        TabHost.TabSpec tab_spec = tab_host.newTabSpec("tag_mess_menu");
        tab_spec.setContent(R.id.mess_menu);
        tab_spec.setIndicator("Mess Menu");
        tab_host.addTab(tab_spec);

        tab_spec = tab_host.newTabSpec("tag_news");
        tab_spec.setContent(R.id.news);
        tab_spec.setIndicator("Updates");
        tab_host.addTab(tab_spec);





       Button sun=(Button)findViewById(R.id.sun);
        Button mon=(Button)findViewById(R.id.mon);
         Button tue=(Button)findViewById(R.id.tue);
          Button wed=(Button)findViewById(R.id.wed);
           Button thu=(Button)findViewById(R.id.thu);
            Button fri=(Button)findViewById(R.id.fri);
             Button sat=(Button)findViewById(R.id.sat);
        new BackgroundTask().execute();
        new BackgroundtaskNews().execute();


        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, mess_display.class);
                Message2 = "sunday";
                if (transfer == null) {
                    Toast.makeText(getApplicationContext(), "NO Internet", Toast.LENGTH_SHORT).show();

                } else {
                    intent.putExtra("day", Message2);
                    intent.putExtra("data",transfer);
                    startActivity(intent);

                }
            }});

        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,mess_display.class);
                Message2="monday";
                if (transfer == null) {
                    Toast.makeText(getApplicationContext(), "NO Internet", Toast.LENGTH_SHORT).show();

                } else {
                    intent.putExtra("day", Message2);
                    intent.putExtra("data",transfer);
                    startActivity(intent);

                }
            }
        });

        tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,mess_display.class);
                Message2="tuesday";
                if (transfer == null) {
                    Toast.makeText(getApplicationContext(), "NO Internet", Toast.LENGTH_SHORT).show();

                } else {
                    intent.putExtra("day", Message2);
                    intent.putExtra("data",transfer);
                    startActivity(intent);

                }
            }
        });
        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,mess_display.class);
                Message2="wednesday";
                if (transfer == null) {
                    Toast.makeText(getApplicationContext(), "NO Internet", Toast.LENGTH_SHORT).show();

                } else {
                    intent.putExtra("day", Message2);
                    intent.putExtra("data",transfer);
                    startActivity(intent);

                }
            }
        });
        thu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,mess_display.class);
                Message2="thursday";
                if (transfer == null) {
                    Toast.makeText(getApplicationContext(), "NO Internet", Toast.LENGTH_SHORT).show();

                } else {
                    intent.putExtra("day", Message2);
                    intent.putExtra("data",transfer);
                    startActivity(intent);

                }
            }
        });
        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,mess_display.class);
                Message2="friday";
                if (transfer == null) {
                    Toast.makeText(getApplicationContext(), "NO Internet", Toast.LENGTH_SHORT).show();

                } else {
                    intent.putExtra("day", Message2);
                    intent.putExtra("data",transfer);
                    startActivity(intent);

                }
            }
        });
        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,mess_display.class);
                Message2="saturday";
                if (transfer == null) {
                    Toast.makeText(getApplicationContext(), "NO Internet", Toast.LENGTH_SHORT).show();

                } else {
                    intent.putExtra("day", Message2);
                    intent.putExtra("data",transfer);
                    startActivity(intent);

                }
            }
        });







        Button news_button=(Button)findViewById(R.id.news_button);
        news_button.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.news,0,0,0);
        news_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (news_data == null) {
                    Toast.makeText(getApplicationContext(), "NO Internet", Toast.LENGTH_SHORT).show();

                } else {
                    Intent intent = new Intent(MainActivity.this, news.class);
                    intent.putExtra("get", news_data);
                    startActivity(intent);
                }
            }
        });

        Button gc_tally_button=(Button)findViewById(R.id.gc_tally);
        gc_tally_button.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.trophy,0,0,0);
        gc_tally_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, gc_tally.class);
                startActivity(intent);

            }
        });

        Button gallery_cult_button=(Button)findViewById(R.id.gallery_cult_button);
        gallery_cult_button.setCompoundDrawablesWithIntrinsicBounds(0,0,R.mipmap.cult,0);
        gallery_cult_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, gallery_cult.class);
                    startActivity(intent);

            }
        });

        Button gallery_button=(Button)findViewById(R.id.gallery_button);
        gallery_button.setCompoundDrawablesWithIntrinsicBounds(0,0,R.mipmap.sports,0);
        gallery_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, gallery.class);
                startActivity(intent);

            }
        });


    }

    class BackgroundTask extends AsyncTask<Void,Void,String>
    {
        String url;

        @Override
        protected void onPreExecute()
        {
            url="https://gymkhana.iitb.ac.in/~hostel2/menu_app.json";
        }

        @Override
        protected String doInBackground(Void...voids)
        {
            try {
                URL url1 = new URL(url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url1.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder=new StringBuilder();
                while ((url=bufferedReader.readLine())!=null)
                {
                    stringBuilder.append(url+"\n");

                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return stringBuilder.toString().trim();
            }catch (MalformedURLException e){

                e.printStackTrace();

            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void...values)
        {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result)
        {

            transfer=result;
        }
    }




















    class BackgroundtaskNews extends AsyncTask<Void,Void,String>
    {
        String url;

        @Override
        protected void onPreExecute()
        {
            url="https://gymkhana.iitb.ac.in/~hostel2/news.json";
        }

        @Override
        protected String doInBackground(Void...voids)
        {
            try {
                URL url1 = new URL(url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url1.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder=new StringBuilder();
                while ((url=bufferedReader.readLine())!=null)
                {
                    stringBuilder.append(url+"\n");

                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return stringBuilder.toString().trim();
            }catch (MalformedURLException e){

                e.printStackTrace();

            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void...values)
        {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result)
        {

            news_data=result;
        }
    }



















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the council_list; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id) {
            //noinspection SimplifiableIfStatement
            case R.id.action_search: {
                Intent intent = new Intent(this, maint.class);
                startActivity(intent);
                break;
            }
            case R.id.action_search2: {
                Intent intent = new Intent(this, mess.class);
                startActivity(intent);
                break;

            }


            case R.id.action_search4: {
                Intent intent = new Intent(this, council.class);
                 startActivity(intent);
                break;

            }
            case R.id.action_search5: {
                Intent intent = new Intent(this, about_us.class);
                startActivity(intent);
                break;

            }


        }
        return super.onOptionsItemSelected(item);
    }
}
