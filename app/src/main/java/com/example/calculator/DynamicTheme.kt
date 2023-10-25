package com.example.calculator

import android.app.Application
import com.google.android.material.color.DynamicColors

class DynamicTheme: Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}