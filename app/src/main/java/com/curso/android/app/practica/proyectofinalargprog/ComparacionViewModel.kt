package com.curso.android.app.practica.proyectofinalargprog

import androidx.lifecycle.ViewModel

class ComparacionViewModel : ViewModel() {
    fun compararTextos(texto1: String, texto2: String): Boolean {
        return texto1 == texto2
    }
}