package com.example.newbase.di

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import com.example.newbase.BuildConfig.BASE_URL
import com.example.newbase.data.dataSource.local.sharedPrefs.LoginDataSource
import com.example.newbase.data.dataSource.remote.BeerRemoteDataSource
import com.example.newbase.data.dataSource.remote.BeerService
import com.example.newbase.data.repo.BeerRepository
import com.example.newbase.data.repo.LoginRepository
import com.example.newbase.domain.useCase.GetBeerUseCase
import com.example.newbase.domain.useCase.LoginUseCase
import com.google.gson.GsonBuilder
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    val requestInterceptor = Interceptor { chain ->
        val url = chain.request()
            .url()
            .newBuilder()
            .build()

        val request = chain.request()
            .newBuilder()
            .url(url)
            .build()
        return@Interceptor chain.proceed(request)
    }

    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(requestInterceptor)
        .connectTimeout(60, TimeUnit.SECONDS)
        .build()

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson) : Retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    fun provideBeerService(retrofit: Retrofit): BeerService = retrofit.create(BeerService::class.java)

    @Singleton
    @Provides
    fun provideBeerRemoteDataSource(beerService: BeerService) = BeerRemoteDataSource(beerService)

    @Singleton
    @Provides
    fun provideBeerRepository(remoteDataSource: BeerRemoteDataSource) =
        BeerRepository(remoteDataSource)

    @Singleton
    @Provides
    fun provideGetBeerUseCase(beerRepository: BeerRepository) =
        GetBeerUseCase(beerRepository)

    @Singleton
    @Provides
    fun provideLoginDataSource(sharedPreferences: SharedPreferences) = LoginDataSource(sharedPreferences)

    @Singleton
    @Provides
    fun provideLoginRepository(loginDataSource: LoginDataSource) =
        LoginRepository(loginDataSource)

    @Singleton
    @Provides
    fun provideLoginUseCase(loginRepository: LoginRepository) =
        LoginUseCase(loginRepository)

    @Provides
    @Singleton
    fun provideContext(@ApplicationContext context: Context): Context = context

    @Provides
    @Singleton
    fun provideSharedPreferences(context: Context): SharedPreferences =
        context.getSharedPreferences("my_prefs", Context.MODE_PRIVATE)
}