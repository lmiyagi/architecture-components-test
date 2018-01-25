package br.com.leonardomiyagi.architecturecomponentstest

import br.com.leonardomiyagi.architecturecomponentstest.presentation.di.AppModule
import br.com.leonardomiyagi.architecturecomponentstest.presentation.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by lmiyagi on 23/01/18.
 */
class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}