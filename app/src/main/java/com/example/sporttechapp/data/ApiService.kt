package com.example.sporttechapp.data

import retrofit2.http.GET

interface ApiService {
    @GET("skills.json")  // Replace with your endpoint
    suspend fun getSkills(): List<Skill>
}