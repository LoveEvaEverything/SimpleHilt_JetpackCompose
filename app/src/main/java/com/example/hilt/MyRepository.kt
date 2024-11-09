package com.example.hilt

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyRepository @Inject constructor() {
    fun getWelcomeMessage() = "Hello from Hilt!"
}
