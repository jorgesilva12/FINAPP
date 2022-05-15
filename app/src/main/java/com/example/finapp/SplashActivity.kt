package com.example.finapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val TAG: String = "FINAPP"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activy_splash)

        Log.d(TAG,"Iniciando Splah")

        carregaActivity()
    }

    fun carregaActivity(){
        //var telaLogin: Intent = Intent(SplashActivity.this,LoginActivity.class)

    }
}