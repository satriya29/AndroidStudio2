package com.example.prejekpertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var button_open1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_open1 = findViewById(R.id.button_open)
        button_open1.setOnClickListener(){
            val intent = Intent ( this, newLayout::class.java)
        startActivity(intent)
        }

    }

}
