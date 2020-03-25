package com.example.igncodefooandroidapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Video {
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

    public Video(String contentId, String contentType, ArrayList<Thumbnail> thumbnailList,
                   ArticleMetadata metadata, ArrayList<String> tags) {
        this.contentId = contentId;
        this.contentType = contentType;
        this.thumbnailList = thumbnailList;
        this.metadata = metadata;
        this.tags = tags;
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
}
