package com.star_zero.robolectricofflinesample

import android.os.Build
import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(manifest = Config.NONE, sdk = intArrayOf(Build.VERSION_CODES.O))
class CalculatorTest {

    @Test
    fun addInt() {
        val calculator = Calculator()
        assertThat(calculator.add(1, 2), `is`(3))
    }

    @Test
    fun addString() {
        val calculator = Calculator()
        assertThat(calculator.add("1", "2"), `is`(3))
        assertThat(calculator.add("", ""), `is`(0))
    }
}