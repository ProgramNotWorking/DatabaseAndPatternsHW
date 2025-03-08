package com.example.domain.task3

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("posts/{id}")
    fun getPost(@Path("id") id: Int): Call<Post>
}