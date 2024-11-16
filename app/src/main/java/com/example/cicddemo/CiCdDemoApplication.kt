package com.example.cicddemo

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class CiCdDemoApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        initAppCenter()
    }

    private fun initAppCenter() {
        AppCenter.start(
            this,
            "c7fe4a3c-8346-4a2f-a668-8848a1b31466",
            Analytics::class.java, Crashes::class.java
        )
    }
}