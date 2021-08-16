package com.example.retrofit

import retrofit2.Call
import retrofit2.http.*

interface Interfacedata {
    @GET("posts")
    fun fetchPosts():Call<List<Model>>
    @GET("posts/{id}/comments")
    fun fetchpostidcomment(@Path("id")id:Int):Call<List<Model>>
    @GET("comments")
    fun fetchpostcomment(@Query("postId")postId:Int):Call<List<Model>>
    @GET("yannski/3019778/raw/dfb34d018165f47b61b3bf089358a3d5ca199d96/movies.json")
    fun getmoves():Call<List<Model>>
    @GET("v2/everything")

    fun newsApi(@Query("q")q:String,@Query("from")from:String,@Query("sortBy")sortBy:String,@Query("apiKey")apiKey:String):Call<newsApi>
    @FormUrlEncoded
    @POST("register.php")
    fun registerpost(@Field("name")name:String,@Field("user_name")user_name:String,
                     @Field("user_password")user_password:String):Call<RegisterModel>
}
// https://newsapi.org/v2/everything?q=tesla&from=2021-02-21&sortBy=publishedAt&apiKey=fffb7e3e97484c7b8aa316bdee2e506c