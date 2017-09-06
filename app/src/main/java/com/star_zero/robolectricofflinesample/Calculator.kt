package com.star_zero.robolectricofflinesample

import android.text.TextUtils

class Calculator {

    fun add(x: Int, y: Int) = x + y

    fun add(s1: String, s2: String): Int {
        val x = if (TextUtils.isEmpty(s1)) 0 else s1.toInt()
        val y = if (TextUtils.isEmpty(s2)) 0 else s2.toInt()
        return add(x, y)
    }
}