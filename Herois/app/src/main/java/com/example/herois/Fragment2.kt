package com.example.herois

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class Fragment2 : Fragment() {

    private lateinit var displayName: TextView
    private lateinit var displayAge: TextView
    private lateinit var displayPhone: TextView
    private lateinit var btnGoToSecondActivity: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate o layout para este fragmento
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        // Inicializa os TextViews
        displayName = view.findViewById(R.id.displayName)
        displayAge = view.findViewById(R.id.displayAge)
        displayPhone = view.findViewById(R.id.displayPhone)
        btnGoToSecondActivity = view.findViewById(R.id.btnGoToSecondActivity)

        // Recupera os dados passados do Fragment1
        val name = arguments?.getString("name")
        val age = arguments?.getString("age")
        val phone = arguments?.getString("phone")

        // Define os textos nos TextViews
        displayName.text = "Name: $name"
        displayAge.text = "Age: $age"
        displayPhone.text = "Phone: $phone"

        // Ação do botão para ir para SecondMainActivity
        btnGoToSecondActivity.setOnClickListener {
            val intent = Intent(activity, SecondActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}
