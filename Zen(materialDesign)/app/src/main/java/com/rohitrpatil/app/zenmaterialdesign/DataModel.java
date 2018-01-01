package com.rohitrpatil.app.zenmaterialdesign;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Rohit Patil on 1/1/2018.
 */

public class DataModel {
    private String mContent;
    private String mAuthor;

    public static DataModel fromJSON(JSONObject jsonObject){

        try{
            DataModel dataModel = new DataModel();
            dataModel.mContent = jsonObject.getString("content");
            dataModel.mAuthor = jsonObject.getJSONObject("author").getString("name");
            return dataModel;
        }
        catch (JSONException e){
            e.printStackTrace();
            return null;
        }

    }

    public String getContent() {
        return mContent;
    }

    public String getAuthor() {
        return mAuthor;
    }
}

