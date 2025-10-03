package com.example.sporttechapp.data


import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {
    private val moshi = Moshi.Builder().build()

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://example.com/") // Change to your API base URL
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}