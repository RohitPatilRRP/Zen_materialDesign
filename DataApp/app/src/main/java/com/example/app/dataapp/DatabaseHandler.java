package com.example.app.dataapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Rohit Patil on 03-07-2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="products.db";
    private static final String TABLE_NAME="products";
    private static final String COLUMN_ID="id";
    private static final String COLUMN_NAME="productname";

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context,DATABASE_NAME , factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query="CREATE TABLE"+TABLE_NAME+"("+COLUMN_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+COLUMN_NAME+"TEXT"+");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        onCreate(db);
    }

    public void addProduct(Products products){
        ContentValues val= new ContentValues();
        val.put(COLUMN_NAME.products.get_productname);
        SQLiteDatabase db=getWritableDatabase();
        db.insert(TABLE_NAME,null,val);
        db.close();
    }

    public  void deleteProduct(String productname){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("DELETE FROM"+TABLE_NAME+"WHERE"+COLUMN_NAME+"=");


    }
}
