package com.example.igncodefooandroidapp.Model;

import com.google.gson.annotations.SerializedName;

public class Comment {
    @SerializedName("id")
    private String id;
    @SerializedName("count")
    private int count;

    public Comment(String id, int count){
        this.id = id;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
