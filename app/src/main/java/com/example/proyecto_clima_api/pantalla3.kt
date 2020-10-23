package com.example.proyecto_clima_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pantalla3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla3)
    }
    fun pantalla1(view: View) {
        val cambio = Intent(this, MainActivity::class.java)
        startActivity(cambio)
    }
    fun pantalla2(view: View) {
        val cambio = Intent(this, pantalla2::class.java)
        startActivity(cambio)
    }
}