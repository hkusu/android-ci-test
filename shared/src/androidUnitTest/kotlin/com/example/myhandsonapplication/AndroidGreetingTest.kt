package com.example.myhandsonapplication

import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidGreetingTest {
    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", Greeting().greet().contains("Android"))
    }

    @Test
    fun testExample2() {
        assertTrue("Check Android is mentioned", Greeting().greet().contains("Android"))
    }
}
