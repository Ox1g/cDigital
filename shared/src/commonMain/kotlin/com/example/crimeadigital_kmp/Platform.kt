package com.example.crimeadigital_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform