package com.curso.android.app.practica.proyectofinalargprog

import org.junit.Assert.*
import org.junit.Test

class ComparacionViewModelTest {

    private val viewModel = ComparacionViewModel()

    @Test
    fun `test compararTextos() devuelve true para textos iguales`() {
        val resultado = viewModel.compararTextos("hola", "hola")
        assertTrue(resultado)
    }

    @Test
    fun `test compararTextos() devuelve false para textos diferentes`() {
        val resultado = viewModel.compararTextos("hola", "mundo")
        assertFalse(resultado)
    }
}
