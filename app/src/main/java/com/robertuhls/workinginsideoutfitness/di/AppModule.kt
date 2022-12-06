package com.robertuhls.workinginsideoutfitness.di

import android.app.Application
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.robertuhls.workinginsideoutfitness.data.CustomerRepository
import com.robertuhls.workinginsideoutfitness.data.CustomerRepositoryImpl
import com.robertuhls.workinginsideoutfitness.data.auth.AuthApi
import com.robertuhls.workinginsideoutfitness.data.auth.AuthRepository
import com.robertuhls.workinginsideoutfitness.data.auth.AuthRepositoryImpl
import com.robertuhls.workinginsideoutfitness.data.network.CustomerHttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAuthApi(): AuthApi {
        return Retrofit.Builder()
            .baseUrl("http://10.0.0.60:8080/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun provideSharedPref(app: Application): SharedPreferences {
        return app.getSharedPreferences("prefs", MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun provideAuthRepository(api: AuthApi, prefs: SharedPreferences): AuthRepository {
        return AuthRepositoryImpl(api, prefs)
    }

    @Provides
    fun getHttpClient(httpClient: CustomerHttpClient): HttpClient = httpClient.getHttpClient()

    @Provides
    fun getCustomerRepository(impl: CustomerRepositoryImpl): CustomerRepository = impl
}