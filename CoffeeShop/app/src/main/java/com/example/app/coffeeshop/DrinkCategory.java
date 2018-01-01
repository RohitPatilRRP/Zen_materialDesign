package com.example.app.coffeeshop;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

public class DrinkCategory extends ListActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listDrinks = getListView();

        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(
                this,
                android.R.layout.simple_list_item_1,
                Drinks.drinks
        );
        listDrinks.setAdapter(listAdapter);
    }
        public void OnListItemClick(ListView listView,View itemView,int pos, long id)
        {
            Intent intent=new Intent(DrinkCategory.this,DrinkActivity.class);
        //intent.putExtra(DrinkActivity.EXTRA_DRINKNO,(int) id);
        startActivity(intent);
        }
    }

