package com.example.gmail.models

data class Email(
    val sender: String,
    val subject: String,
    val summary: String,
    val time: String,
    val avatarResId: Int
)