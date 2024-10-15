package com.example.herois

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Marvel : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_marvel)

        // Configurando o botão Voltar
        val btnVoltar2 = findViewById<Button>(R.id.btnVoltar2) // Encontra o botão pelo ID

        // Define um OnClickListener para o botão
        btnVoltar2.setOnClickListener {
            finish() // Volta para a SecondActivity
        }


    }
}
