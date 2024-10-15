package com.example.herois

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class liga_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_liga)

        // Configurando o botão Voltar
        val btnVoltar = findViewById<Button>(R.id.btnVoltar) // Encontra o botão pelo ID

        // Define um OnClickListener para o botão
        btnVoltar.setOnClickListener {
            finish() // Volta para a SecondActivity
        }


    }
}
