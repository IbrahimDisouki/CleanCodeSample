package com.example.cleancodesample.application

import android.app.Application
import com.crashlytics.android.Crashlytics
import com.example.cleancodesample.di.getProjectModules
import io.fabric.sdk.android.Fabric
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CleanCodeApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Fabric.with(this, Crashlytics())
        startKoin {
            androidContext(this@CleanCodeApp)
            modules(getProjectModules())
        }
    }
}