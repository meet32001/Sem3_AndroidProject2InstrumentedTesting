/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.testing.espresso.BasicSample

import androidx.test.ext.junit.rules.activityScenarioRule
import android.app.Activity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.rules.ActivityScenarioRule


@RunWith(AndroidJUnit4::class)
class ChangeTextBehaviorKtTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    companion object {
        const val INPUT_123 = "123"
        const val INPUT_ABCDEF = "abcdef"
        const val EMPTY_STRING = ""
    }

    // Test 2: Enter "123", press Change Text button, and validate TextView content
    @Test
    fun testChangeText_with123() {
        onView(withId(R.id.editTextUserInput))
            .perform(typeText(INPUT_123), closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged))
            .check(matches(withText(INPUT_123)))
    }

    // Test 3: Enter "abcdef", press Change Text button, and validate TextView content
    @Test
    fun testChangeText_withAbcdef() {
        onView(withId(R.id.editTextUserInput))
            .perform(typeText(INPUT_ABCDEF), closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged))
            .check(matches(withText(INPUT_ABCDEF)))
    }
    // Test 4: Empty input, press Change Text button, and validate TextView content
    @Test
    fun testChangeText_withEmptyInput() {
        onView(withId(R.id.editTextUserInput)).perform(clearText(), closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged))
            .check(matches(withText(EMPTY_STRING))) // Replace with the expected default if different
    }

    // Test 5: Enter "123", press Open Activity and Change Text button, and validate ShowTextActivity TextView
    @Test
    fun testOpenActivity_with123() {
        onView(withId(R.id.editTextUserInput))
            .perform(typeText(INPUT_123), closeSoftKeyboard())
        onView(withId(R.id.activityChangeTextBtn)).perform(click())
        onView(withId(R.id.show_text_view))
            .check(matches(withText(INPUT_123)))
    }
    // Test 6: Empty input, press Open Activity and Change Text button, and validate ShowTextActivity TextView
    @Test
    fun testOpenActivity_withEmptyInput() {
        onView(withId(R.id.editTextUserInput)).perform(clearText(), closeSoftKeyboard())
        onView(withId(R.id.activityChangeTextBtn)).perform(click())
        onView(withId(R.id.show_text_view))
            .check(matches(withText(EMPTY_STRING))) // Replace with expected default if needed
    }
}