package com.kmalif.predictioncalculator.util

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class DisableDarkmode : Application()  {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}