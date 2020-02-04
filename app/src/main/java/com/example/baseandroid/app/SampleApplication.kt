package com.example.baseandroid.app

import com.example.baseandroid.di.component.DaggerAppComponent
import com.icom.base_livedata.config.BaseConfig
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class Application : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }

    override fun onCreate() {
        super.onCreate()

        BaseConfig.BASE_URL = "https://cpmx-soriticket-api-staging.azurewebsites.net/"
    }
}