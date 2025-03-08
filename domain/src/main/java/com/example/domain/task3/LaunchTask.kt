package com.example.domain.task3

import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun main() {
    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(StatusCodeLoggingInterceptor())
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(ApiService::class.java)
    val call = apiService.getPost(1)

    call.enqueue(object : Callback<Post> {
        override fun onResponse(call: Call<Post>, response: Response<Post>) {
            if (response.isSuccessful) {
                val post = response.body()
                println("Post: ${post?.title}")
            }
        }

        override fun onFailure(call: Call<Post>, t: Throwable) {
            println("Error: ${t.message}")
        }
    })

}