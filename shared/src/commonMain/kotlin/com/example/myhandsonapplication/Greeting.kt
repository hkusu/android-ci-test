package com.example.myhandsonapplication

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "HelloAAA, ${platform.name}!"
    }
}
