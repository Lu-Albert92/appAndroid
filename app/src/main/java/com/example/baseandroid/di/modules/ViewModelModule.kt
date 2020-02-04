package com.example.baseandroid.di.modules

import android.arch.lifecycle.ViewModel
import com.example.baseandroid.di.component.ViewModelKey
import com.example.baseandroid.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(userViewModel: MainViewModel): ViewModel

}