package com.example.finapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val TAG = "FINAPP"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activy_splash)

        val maxSplashTime: Long = 5000

        Log.d(TAG,"Iniciando Splah")

        Handler().postDelayed({
            carregaActivity()
        },maxSplashTime)

    }

    fun carregaActivity(){
        startActivity(Intent(this,LoginActivity::class.java))
        finish()

    }
}