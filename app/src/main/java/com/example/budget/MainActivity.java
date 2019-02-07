package com.example.budget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
        ListView listMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting a variable to get resources (shortcut for time)
        Resources res = getResources();
        //Assigning the string array created in res/values/strings.xml
        String [] bills = res.getStringArray(R.array.bills);
        //Setting up our command to get our ListView on our app
        listMain = (ListView) findViewById(R.id.lstView);
        //Adapting a String[] to listMain, using 3 parameters: context, layout file, String[]
        listMain.setAdapter(new ArrayAdapter<String>(this, R.layout.bills, bills));





    }
}
