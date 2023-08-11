package com.curso.android.app.practica.proyectofinalargprog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.curso.android.app.practica.proyectofinalargprog.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ComparacionViewModel
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ComparacionViewModel::class.java)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compararButton.setOnClickListener {
            val texto1 = binding.editText1.text.toString()
            val texto2 = binding.editText2.text.toString()

            val resultado = viewModel.compararTextos(texto1, texto2)

            if (resultado) {
                binding.resultadoTextView.text = "Los textos son iguales"
            } else {
                binding.resultadoTextView.text = "Los textos son diferentes"
            }
        }
    }
}

