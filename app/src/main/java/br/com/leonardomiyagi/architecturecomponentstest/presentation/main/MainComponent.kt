package br.com.leonardomiyagi.architecturecomponentstest.presentation.main

import br.com.leonardomiyagi.architecturecomponentstest.domain.repository.UserRepository
import br.com.leonardomiyagi.architecturecomponentstest.domain.user.GetUsers
import br.com.leonardomiyagi.architecturecomponentstest.presentation.di.ActivityScoped
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by lmiyagi on 23/01/18.
 */
@ActivityScoped
@Subcomponent(modules = arrayOf(MainComponent.MainModule::class))
interface MainComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

    @Module
    class MainModule {

        @Provides
        @ActivityScoped
        fun provideGetUsers(userRepository: UserRepository): GetUsers {
            return GetUsers(userRepository)
        }

        @Provides
        @ActivityScoped
        fun provideMainViewModelFactory(getUsers: GetUsers): MainViewModel.MainViewModelFactory {
            return MainViewModel.MainViewModelFactory(getUsers)
        }
    }
}