package com.curso.android.app.practica.proyectofinalargprog

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompararTextosUI() {
        onView(withId(R.id.editText1))
            .perform(typeText("hola"))

        onView(withId(R.id.editText2))
            .perform(typeText("hola"))

        onView(withId(R.id.compararButton))
            .perform(click())

        onView(withId(R.id.resultadoTextView))
            .check(matches(withText("Los textos son iguales")))
    }
}
