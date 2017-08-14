package com.my_app.priyanshu.hostel_2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class council extends ListActivity {

    String[] council_list = {"Heads","Web Council","Cult Council","Sports Council","Tech Council","Mess Council","Maintenance Council"};
    int direct=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(council.this,android.R.layout.simple_list_item_1,council_list));

    }

    @Override
    protected void onListItemClick(ListView l,View v,int position,long id)
    {
        super.onListItemClick(l,v,position,id);
        direct=position;
        String local="";
        switch(direct)
        {
            case 0 :
            {
                local="heads";
                break ;
            }

            case 1:
            {
                local="webcouncil";
                break ;
            }
            case 2:
            {
                local="cultcouncil";
                break ;
            }
            case 3 :
            {
                local="sportscouncil";
                break ;

            }
            case 4 :
            {
                local="techcouncil";
                break ;
            }
            case 5:
            {
                local="messcouncil";
                break ;
            }
            case 6:
            {
                local="maintcouncil";
                break ;
            }
            default:{
                break;
            }
        }
        try{
            Class ourclass= Class.forName("com.my_app.priyanshu.hostel_2."+local);
            Intent ourintent =new Intent(council.this,ourclass);
            startActivity(ourintent);
        }
        catch (ClassNotFoundException e){e.printStackTrace();}

    }
  /*  @Override
    public boolean onCreateOptionsMenu(android.view.Menu council_list){
        super.onCreateOptionsMenu(council_list);
        MenuInflater blowup= getMenuInflater();
        blowup.inflate(R.council_list.,council_list);
        return  true;
    }*/
}
