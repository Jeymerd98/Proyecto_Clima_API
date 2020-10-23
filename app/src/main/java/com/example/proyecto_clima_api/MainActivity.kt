package com.example.proyecto_clima_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pantalla2(view: View) {
        val cambio = Intent(this, pantalla2::class.java)
        startActivity(cambio)
    }
    fun pantalla3(view: View) {
        val cambio = Intent(this, pantalla3::class.java)
        startActivity(cambio)
    }
}