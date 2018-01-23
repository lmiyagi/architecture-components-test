package br.com.leonardomiyagi.architecturecomponentstest.di

import br.com.leonardomiyagi.architecturecomponentstest.BaseApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by lmiyagi on 23/01/18.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        AppModule::class))
interface AppComponent : AndroidInjector<BaseApplication> {
}