package br.com.leonardomiyagi.architecturecomponentstest.presentation.di

import br.com.leonardomiyagi.architecturecomponentstest.BaseApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by lmiyagi on 23/01/18.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ApiModule::class,
        BindingModule::class))
interface AppComponent : AndroidInjector<BaseApplication> {
}