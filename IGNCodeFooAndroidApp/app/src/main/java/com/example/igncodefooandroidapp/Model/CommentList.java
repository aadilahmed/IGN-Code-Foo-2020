package com.example.igncodefooandroidapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CommentList {
    @SerializedName("content")
    private ArrayList<Comment> commentArrayList;

    public ArrayList<Comment> getCommentArrayList() {
        return commentArrayList;
    }

    public void setCommentArrayList(ArrayList<Comment> commentArrayList) {
        this.commentArrayList = commentArrayList;
    }
}
