package br.com.leonardomiyagi.architecturecomponentstest.presentation.di

import android.content.Context
import br.com.leonardomiyagi.architecturecomponentstest.data.api.ApiClient
import br.com.leonardomiyagi.architecturecomponentstest.data.repository.DefaultUserRepository
import br.com.leonardomiyagi.architecturecomponentstest.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by lmiyagi on 23/01/18.
 */
@Singleton
@Module
class AppModule(private val context: Context) {

    @Provides
    @Singleton
    @Named("APP_CONTEXT")
    fun provideAppContext(): Context {
        return context
    }

    @Provides
    @Singleton
    fun provideUserRepository(apiClient: ApiClient): UserRepository {
        return DefaultUserRepository(apiClient)
    }
}