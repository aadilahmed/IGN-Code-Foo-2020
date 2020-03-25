package com.example.igncodefooandroidapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class VideoList {
    @SerializedName("data")
    private ArrayList<Video> videoList;

    public ArrayList<Video> getContentArrayList() {
        return videoList;
    }

    public void setContentArrayList(ArrayList<Video> videoArrayList) {
        this.videoList = videoArrayList;
    }
}
