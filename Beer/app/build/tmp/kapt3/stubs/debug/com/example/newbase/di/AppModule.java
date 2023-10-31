package com.example.newbase.di;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import com.example.newbase.data.dataSource.local.sharedPrefs.LoginDataSource;
import com.example.newbase.data.dataSource.remote.BeerRemoteDataSource;
import com.example.newbase.data.dataSource.remote.BeerService;
import com.example.newbase.data.repo.BeerRepository;
import com.example.newbase.data.repo.LoginRepository;
import com.example.newbase.domain.useCase.GetBeerUseCase;
import com.example.newbase.domain.useCase.LoginUseCase;
import com.google.gson.GsonBuilder;
import dagger.hilt.android.qualifiers.ApplicationContext;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0007J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020#H\u0007J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001dH\u0007J\u0010\u0010*\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006+"}, d2 = {"Lcom/example/newbase/di/AppModule;", "", "()V", "okHttpClient", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "requestInterceptor", "Lokhttp3/Interceptor;", "getRequestInterceptor", "()Lokhttp3/Interceptor;", "provideBeerRemoteDataSource", "Lcom/example/newbase/data/dataSource/remote/BeerRemoteDataSource;", "beerService", "Lcom/example/newbase/data/dataSource/remote/BeerService;", "provideBeerRepository", "Lcom/example/newbase/data/repo/BeerRepository;", "remoteDataSource", "provideBeerService", "retrofit", "Lretrofit2/Retrofit;", "provideContext", "Landroid/content/Context;", "context", "provideGetBeerUseCase", "Lcom/example/newbase/domain/useCase/GetBeerUseCase;", "beerRepository", "provideGson", "Lcom/google/gson/Gson;", "provideLoginDataSource", "Lcom/example/newbase/data/dataSource/local/sharedPrefs/LoginDataSource;", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideLoginRepository", "Lcom/example/newbase/data/repo/LoginRepository;", "loginDataSource", "provideLoginUseCase", "Lcom/example/newbase/domain/useCase/LoginUseCase;", "loginRepository", "provideRetrofit", "gson", "provideSharedPreferences", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.newbase.di.AppModule INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static final okhttp3.Interceptor requestInterceptor = null;
    private static final okhttp3.OkHttpClient okHttpClient = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Interceptor getRequestInterceptor() {
        return null;
    }
    
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.example.newbase.data.dataSource.remote.BeerService provideBeerService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.newbase.data.dataSource.remote.BeerRemoteDataSource provideBeerRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.example.newbase.data.dataSource.remote.BeerService beerService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.newbase.data.repo.BeerRepository provideBeerRepository(@org.jetbrains.annotations.NotNull
    com.example.newbase.data.dataSource.remote.BeerRemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.newbase.domain.useCase.GetBeerUseCase provideGetBeerUseCase(@org.jetbrains.annotations.NotNull
    com.example.newbase.data.repo.BeerRepository beerRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.newbase.data.dataSource.local.sharedPrefs.LoginDataSource provideLoginDataSource(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.newbase.data.repo.LoginRepository provideLoginRepository(@org.jetbrains.annotations.NotNull
    com.example.newbase.data.dataSource.local.sharedPrefs.LoginDataSource loginDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.newbase.domain.useCase.LoginUseCase provideLoginUseCase(@org.jetbrains.annotations.NotNull
    com.example.newbase.data.repo.LoginRepository loginRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}