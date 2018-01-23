package br.com.leonardomiyagi.architecturecomponentstest.di

import android.app.Activity
import br.com.leonardomiyagi.architecturecomponentstest.main.MainActivity
import br.com.leonardomiyagi.architecturecomponentstest.main.MainComponent
import dagger.Binds
import dagger.Module
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
}