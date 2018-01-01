package com.example.app.intendapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Bundle firstdata=getIntent().getExtras();

        if(firstdata==null){
            return;
        }

            String firstmsg=firstdata.getString("firstmsg");
            final TextView scndTxt=(TextView) findViewById(R.id.SecondText);
            scndTxt.setText(firstmsg);
    }

}
