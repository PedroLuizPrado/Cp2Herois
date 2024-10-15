package com.example.herois

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Fragment1 : Fragment() {

    private lateinit var inputName: EditText
    private lateinit var inputAge: EditText
    private lateinit var inputPhone: EditText
    private lateinit var btnSubmit: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_1, container, false)

        // Inicializar os campos de entrada e botão
        inputName = view.findViewById(R.id.inputName)
        inputAge = view.findViewById(R.id.inputAge)
        inputPhone = view.findViewById(R.id.inputPhone)
        btnSubmit = view.findViewById(R.id.btnSubmit)


        btnSubmit.setOnClickListener {
            val name = inputName.text.toString()
            val age = inputAge.text.toString()
            val phone = inputPhone.text.toString()

            // Passar os dados para o Fragment2
            val fragment2 = Fragment2()
            val bundle = Bundle()
            bundle.putString("name", name)
            bundle.putString("age", age)
            bundle.putString("phone", phone)
            fragment2.arguments = bundle

            // Iniciar a transição para o Fragment2
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.FragmentContaneir, fragment2)
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        return view
    }
}
