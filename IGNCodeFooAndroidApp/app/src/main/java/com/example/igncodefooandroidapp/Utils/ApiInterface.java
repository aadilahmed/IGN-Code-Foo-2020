package com.example.igncodefooandroidapp.Utils;

import com.example.igncodefooandroidapp.Model.ArticleList;
import com.example.igncodefooandroidapp.Model.CommentList;
import com.example.igncodefooandroidapp.Model.VideoList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("content")
    Call<ArticleList> getContent();

    @GET("content")
    Call<VideoList> getVideoContent();

    @GET("comments")
    Call<CommentList> getComments(@Query("ids") String query);
}
