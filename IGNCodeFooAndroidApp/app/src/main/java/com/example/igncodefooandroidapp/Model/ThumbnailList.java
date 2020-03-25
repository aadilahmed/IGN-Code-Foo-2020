package com.example.igncodefooandroidapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ThumbnailList {
    @SerializedName("thumbnails")
    private ArrayList<Thumbnail> thumbnailList;

    public ArrayList<Thumbnail> getThumbnailArrayList() {
        return thumbnailList;
    }

    public void setThumbnailArrayList(ArrayList<Thumbnail> thumbnailArrayList) {
        this.thumbnailList = thumbnailArrayList;
    }
}
