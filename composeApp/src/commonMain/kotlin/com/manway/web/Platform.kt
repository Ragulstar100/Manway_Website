package com.manway.web

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform