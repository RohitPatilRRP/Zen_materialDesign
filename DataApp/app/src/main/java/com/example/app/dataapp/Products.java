package com.example.app.dataapp;

/**
 * Created by Rohit Patil on 03-07-2017.
 */

public class Products {

    private  int _id;
    private String _pName;

    public Products(){

    }

    public Products(String pName) {
        this._pName = pName;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_pName(String _pName) {
        this._pName = _pName;
    }

    public int get_id() {
        return _id;
    }

    public String get_pName() {
        return _pName;
    }
}
