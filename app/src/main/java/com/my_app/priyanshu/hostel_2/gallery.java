package com.my_app.priyanshu.hostel_2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.net.URL;
import android.graphics.*;
import android.os.*;
import java.io.*;
import java.net.*;
import android.app.ProgressDialog;

/**
 * Created by Kumar Priyanshu on 16-03-2017.
 */

public class gallery extends AppCompatActivity {
String imageFileName=null;
ImageView block[]=new ImageView[11];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        block[0]  =   (ImageView) findViewById(R.id.block0);
        block[1]  =   (ImageView) findViewById(R.id.block1);
        block[2]  =   (ImageView) findViewById(R.id.block2);
        block[3]  =   (ImageView) findViewById(R.id.block3);
        block[4]  =   (ImageView) findViewById(R.id.block4);
        block[5]  =   (ImageView) findViewById(R.id.block5);
        block[6]  =   (ImageView) findViewById(R.id.block6);
        block[7]  =   (ImageView) findViewById(R.id.block7);
        block[8]  =   (ImageView) findViewById(R.id.block8);
        block[9]  =   (ImageView) findViewById(R.id.block9);
        block[10]  =   (ImageView) findViewById(R.id.block10);


            new Image_Async().execute();

    }


    class Image_Async extends AsyncTask<Bitmap[],Bitmap[],Bitmap[]>
    {

        ProgressDialog progDailog = new ProgressDialog(gallery.this);
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();}

        @Override
        protected Bitmap[] doInBackground(Bitmap[]... arg0) {
            // TODO Auto-generated method stub
            Bitmap  bmp[]= new Bitmap[11];


            try {
                URL url =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s0.jpg");
                URL url1 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s1.jpg");
                URL url2 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s2.jpg");
                URL url3 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s3.jpg");
                URL url4 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s4.jpg");
                URL url5 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s5.jpg");
                URL url6 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s6.jpg");
                URL url7 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s7.jpg");
                URL url8 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s8.jpg");
                URL url9 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s9.jpg");
                URL url10 =   new URL("https://gymkhana.iitb.ac.in/~hostel2/gallery/sport/s10.jpg");

                try {

                    bmp[0] =   BitmapFactory.decodeStream(url.openConnection().getInputStream());
                    bmp[1] =   BitmapFactory.decodeStream(url1.openConnection().getInputStream());
                    bmp[2] =   BitmapFactory.decodeStream(url2.openConnection().getInputStream());
                    bmp[3] =   BitmapFactory.decodeStream(url3.openConnection().getInputStream());
                    bmp[4] =   BitmapFactory.decodeStream(url4.openConnection().getInputStream());
                    bmp[5] =   BitmapFactory.decodeStream(url5.openConnection().getInputStream());
                    bmp[6] =   BitmapFactory.decodeStream(url6.openConnection().getInputStream());
                    bmp[7] =   BitmapFactory.decodeStream(url7.openConnection().getInputStream());
                    bmp[8] =   BitmapFactory.decodeStream(url8.openConnection().getInputStream());
                    bmp[9] =   BitmapFactory.decodeStream(url9.openConnection().getInputStream());
                    bmp[10] =   BitmapFactory.decodeStream(url10.openConnection().getInputStream());

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return bmp;
        }

        @Override
        protected void onPostExecute(Bitmap[] result)
        {
            // TODO Auto-generated method stub
            for(int i=0;i<11;i++)
                try {

                    block[i].setImageBitmap(result[i]);
                    }catch (NullPointerException e)
                {
                    e.printStackTrace();
                }
            progDailog.dismiss();



        }



    }

}
