package br.com.leonardomiyagi.architecturecomponentstest.presentation.di

import br.com.leonardomiyagi.architecturecomponentstest.data.repository.DefaultUserRepository
import br.com.leonardomiyagi.architecturecomponentstest.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by lmiyagi on 23/01/18.
 */
@Singleton
@Module
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindUserRepository(repository: DefaultUserRepository): UserRepository
}