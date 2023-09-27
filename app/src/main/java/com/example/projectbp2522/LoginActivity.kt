package com.example.projectbp2522

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //instance
        val btnLogin: Button = findViewById(R.id.buttonLogin)
        //event
        btnLogin.setOnClickListener {
            val intentHome = Intent(this,HomeActivity::class.java)
            startActivity(intentHome)
        }

    }
}