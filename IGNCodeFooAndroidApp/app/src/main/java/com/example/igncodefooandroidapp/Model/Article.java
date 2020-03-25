package com.example.igncodefooandroidapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Article {
    @SerializedName("contentId")
    private String contentId;
    @SerializedName("contentType")
    private String contentType;
    @SerializedName("thumbnails")
    private ArrayList<Thumbnail> thumbnailList;
    @SerializedName("metadata")
    private ArticleMetadata metadata;
    @SerializedName("tags")
    private ArrayList<String> tags;
    @SerializedName("authors")
    private ArrayList<String> authors;

    public Article(String contentId, String contentType, ArrayList<Thumbnail> thumbnailList,
                   ArticleMetadata metadata, ArrayList<String> tags, ArrayList<String> authors) {
        this.contentId = contentId;
        this.contentType = contentType;
        this.thumbnailList = thumbnailList;
        this.metadata = metadata;
        this.tags = tags;
        this.authors = authors;
    }

    public String getContentId() {
        return this.contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public ArrayList<Thumbnail> getThumbnailList() {
        return thumbnailList;
    }

    public void setThumbnailList(ArrayList<Thumbnail> thumbnailList) {
        this.thumbnailList = thumbnailList;
    }

    public ArticleMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ArticleMetadata metadata) {
        this.metadata = metadata;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
}
