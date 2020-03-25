package com.example.igncodefooandroidapp.Model;

import java.util.ArrayList;

public class ArticleMetadata {
    private String headline;
    private String description;
    private String publishDate;
    private String state;
    private ArrayList<String> networks;

    public ArticleMetadata(String headline, String description, String publishDate, String state,
                           ArrayList<String> networks) {
        this.headline = headline;
        this.description = description;
        this.publishDate = publishDate;
        this.state = state;
        this.networks = networks;
    }


    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
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
