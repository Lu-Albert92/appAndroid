package com.example.baseandroid.di.modules

import com.example.baseandroid.repository.api.ApiServer
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RetrofitModule {

    @Provides
    @Singleton
    fun provideSampleApi(client: Retrofit): ApiServer {
        return client.create(ApiServer::class.java)
    }
}