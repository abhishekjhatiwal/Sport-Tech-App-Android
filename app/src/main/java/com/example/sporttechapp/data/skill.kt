package com.example.sporttechapp.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Skill(
    val name: String,
    val level: String,
    val image: String
)