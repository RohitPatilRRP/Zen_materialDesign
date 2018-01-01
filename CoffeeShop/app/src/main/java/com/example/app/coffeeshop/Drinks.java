package com.example.app.coffeeshop;


public class Drinks {

    private String name;
    private String desc;
    private int imageID;

    private Drinks(String name,String desc,int imageID){
        this.name=name;
        this.desc=desc;
        this.imageID=imageID;
    }

    public static final Drinks[] drinks={
      new Drinks("Latte","This is Latte",R.drawable.matcha_latte),
            new Drinks("Cappuccino","This is Cappuccino",R.drawable.Cappuccino),
            new Drinks("Filer","This is Filter",R.drawable.filter)
    };

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    public int getImageID(){
        return imageID;
    }

    public String toString(){
        return this.name;
    }
}


