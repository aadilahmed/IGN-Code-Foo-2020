package com.example.igncodefooandroidapp.Model;

import java.util.ArrayList;

public class VideoMetadata {
    private String title;
    private String description;
    private String publishDate;
    private String state;
    private ArrayList<String> networks;

    public VideoMetadata(String title, String description, String publishDate, String state,
                           ArrayList<String> networks) {
        this.title = title;
        this.description = description;
        this.publishDate = publishDate;
        this.state = state;
        this.networks = networks;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ArrayList<String> getNetworks() {
        return networks;
    }
}
