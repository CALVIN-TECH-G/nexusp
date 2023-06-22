package com.example.tutproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txxtv = findViewById<TextView>(R.id.txtlog)

        txxtv.setOnClickListener {
            val i =Intent(this,login::class.java)
            startActivity(i)
        }

    }
}