package com.example.app.listapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

//import static com.example.app.listapp.R.id.parent;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fruits = {"apple", "orange", "mango", "peach"};

        final ListAdapter la = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits);
        final ListView myList = (ListView) findViewById(R.id.myList);
        myList.setAdapter(la);

        myList.setOnClickListener(
                new AdapterView.OnItemClickListener() {
                   @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String fruit = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(MainActivity.this, fruit, Toast.LENGTH_LONG).show();
                    }
                }
        );

    }

}
