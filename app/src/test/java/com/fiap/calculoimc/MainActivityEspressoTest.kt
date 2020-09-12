package com.fiap.calculoimc

import androidx.test.espresso.Espresso
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextBehaviorTest {

    /*private lateinit var stringToBetyped: String

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)

    @Before
    fun initValidString() {
        // Specify a valid string.
        stringToBetyped = "Espresso"
    }

    @Test
    fun changeText_sameActivity() {
        // Type text and then press the button.
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
            .perform(ViewActions.typeText(stringToBetyped), closeSoftKeyboard())
        Espresso.onView(ViewMatchers.withId(R.id.changeTextBt)).perform(click())

        // Check that the text was changed.
        Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))
            .check(ViewAssertions.matches(withText(stringToBetyped)))
    }*/
}