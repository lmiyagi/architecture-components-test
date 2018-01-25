package br.com.leonardomiyagi.architecturecomponentstest.presentation.di

import br.com.leonardomiyagi.architecturecomponentstest.data.repository.DefaultUserRepository
import br.com.leonardomiyagi.architecturecomponentstest.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by lmiyagi on 23/01/18.
 */
@Singleton
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideUserRepository(): UserRepository {
        return DefaultUserRepository()
    }
}