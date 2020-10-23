package com.example.proyecto_clima_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)
    }

    fun pantalla1(view: View) {
        val cambio = Intent(this, MainActivity::class.java)
        startActivity(cambio)
    }
    fun pantalla3(view: View) {
        val cambio = Intent(this, pantalla3::class.java)
        startActivity(cambio)
    }
}