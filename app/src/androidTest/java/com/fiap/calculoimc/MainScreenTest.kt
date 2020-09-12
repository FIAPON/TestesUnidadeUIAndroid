package com.fiap.calculoimc

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)


    @Test
    fun camposEmBranco_textViewCorreta(){
        Espresso
            .onView(
                ViewMatchers.withId(R.id.btn_make_calc)
            )
            .perform(
                ViewActions.click()
            )

        Espresso
            .onView(
                ViewMatchers.withId(R.id.txt_result_imc_error)
            )
            .check(
                ViewAssertions.matches(ViewMatchers.isDisplayed())
            )

        Espresso
            .onView(
                ViewMatchers.withId(R.id.txt_result_imc_success)
            )
            .check(
                ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE))
            )
    }

}