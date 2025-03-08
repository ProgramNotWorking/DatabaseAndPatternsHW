package com.example.domain.task3

import okhttp3.Interceptor
import okhttp3.Response

class StatusCodeLoggingInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        val statusCode = response.code

        println("HTTP status code: $statusCode")
//        Должно быть так, но использовал main() а не активность, поэтому просто print
//        Log.d("HTTP status code", statusCode.toString())

        return response
    }
}