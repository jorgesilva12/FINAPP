package com.example.finapp.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.finapp.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnTelUsu = findViewById(R.id.btnTelUsu) as Button


        btnTelUsu.setOnClickListener{
                telaCadUsu()
        }

    }

    private fun telaCadUsu() {
        startActivity(Intent(this,CadUsuActivity::class.java))
    }
}