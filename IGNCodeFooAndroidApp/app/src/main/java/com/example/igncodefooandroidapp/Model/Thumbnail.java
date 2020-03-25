package com.example.igncodefooandroidapp.Model;

import com.google.gson.annotations.SerializedName;

public class Thumbnail {
    @SerializedName("url")
    private String url;
    @SerializedName("size")
    private String size;
    @SerializedName("width")
    private int width;
    @SerializedName("height")
    private int height;

    public Thumbnail(String url, String size, int width, int height) {
        this.url = url;
        this.size = size;
        this.width = width;
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
