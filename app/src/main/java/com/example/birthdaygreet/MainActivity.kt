package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn(view: View) {
        val name=input_name.editableText.toString().trim()
      //  Toast.makeText( this, "hello+$name",Toast.LENGTH_SHORT).show()
        val intent=Intent(this,GreetingCard::class.java)
        intent.putExtra(GreetingCard.name1,name)
        startActivity(intent)
    }
}