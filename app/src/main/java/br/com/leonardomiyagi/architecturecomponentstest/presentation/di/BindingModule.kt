package br.com.leonardomiyagi.architecturecomponentstest.presentation.di

import android.app.Activity
import br.com.leonardomiyagi.architecturecomponentstest.presentation.main.MainActivity
import br.com.leonardomiyagi.architecturecomponentstest.presentation.main.MainComponent
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import javax.inject.Singleton

/**
 * Created by lmiyagi on 23/01/18.
 */
@Singleton
@Module(subcomponents = arrayOf(MainComponent::class))
abstract class BindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivity(builder: MainComponent.Builder): AndroidInjector.Factory<out Activity>

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun provideMainComponentBuilder() = MainComponent.Builder()
    }
}