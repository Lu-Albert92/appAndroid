package com.example.baseandroid.di.modules

import com.example.baseandroid.repository.SorianaRepository
import com.example.baseandroid.repository.api.ApiServer
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideUserRepository(sampleApi: ApiServer) =
            SorianaRepository(sampleApi)
}