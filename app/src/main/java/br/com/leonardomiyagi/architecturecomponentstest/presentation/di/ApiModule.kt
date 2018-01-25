package br.com.leonardomiyagi.architecturecomponentstest.presentation.di

import br.com.leonardomiyagi.architecturecomponentstest.data.api.ApiClient
import br.com.leonardomiyagi.architecturecomponentstest.data.api.ApiService
import br.com.leonardomiyagi.architecturecomponentstest.presentation.util.API_BASE_URL
import br.com.leonardomiyagi.architecturecomponentstest.presentation.util.EXTRA_API_BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by lmiyagi on 25/01/18.
 */
@Module
class ApiModule {

    @Provides
    @Singleton
    @Named(EXTRA_API_BASE_URL)
    fun provideApiBaseUrl(): String {
        return API_BASE_URL
    }

    @Provides
    @Singleton
    fun provideGsonFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Provides
    @Singleton
    fun provideRetrofit(@Named(EXTRA_API_BASE_URL) apiBaseUrl: String,
                        gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(gsonConverterFactory)
                .baseUrl(apiBaseUrl)
                .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideApiClient(apiService: ApiService): ApiClient {
        return ApiClient(apiService)
    }
}