package com.example.baseandroid.di.component

import android.app.Application
import com.example.baseandroid.di.anotations.PerActivity
import com.example.baseandroid.di.modules.ActivityModule
import com.example.baseandroid.di.modules.RetrofitModule
import com.example.baseandroid.di.modules.ViewModelModule
import com.icom.base_livedata.di.module.BaseRetrofitModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@PerActivity
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    BaseRetrofitModule::class,
    RetrofitModule::class,
    ViewModelModule::class,
    ActivityModule::class
])

interface AppComponent : AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}