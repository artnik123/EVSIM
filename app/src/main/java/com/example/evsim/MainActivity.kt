package com.example.evsim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var list:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list=findViewById<Button>(R.id.but1)
        list.setOnClickListener{
            startActivity(Intent(this,SecondaryScreen::class.java))
        }
    }
}