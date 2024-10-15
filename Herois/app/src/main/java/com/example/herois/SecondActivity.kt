package com.example.herois

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)



        val imageViewMarvel = findViewById<ImageView>(R.id.btnMarvel)
        val imageViewJL = findViewById<ImageView>(R.id.btnjustica)

        // Tornar a imagem do Marvel um botão
        imageViewMarvel.setOnClickListener {
            // Iniciar MarvelActivity
            val intent = Intent(this, Marvel::class.java)
            startActivity(intent)
        }

        // Tornar a imagem da Liga da Justiça um botão
        imageViewJL.setOnClickListener {
            // Iniciar LigaActivity
            val intent = Intent(this, liga_Activity::class.java)
            startActivity(intent)
        }
    }
}