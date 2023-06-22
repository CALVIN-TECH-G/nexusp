package com.example.tutproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button = findViewById<Button>(R.id.btnlogin)
        val textv = findViewById<TextView>(R.id.txtsignup)

        button.setOnClickListener {
            val i =Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        textv.setOnClickListener {
            val r = Intent(this,MainActivity::class.java)
            startActivity(r)
        }
    }

}