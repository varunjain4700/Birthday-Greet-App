package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greeting__card.*

class GreetingCard : AppCompatActivity() {
    companion object{
        const val name1="name1"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting__card)

        val name=intent.getStringExtra("name1")
        greet.text="Happy Birthday $name"



    }
}