package br.com.leonardomiyagi.architecturecomponentstest.main

import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by lmiyagi on 23/01/18.
 */
@Subcomponent(modules = arrayOf(MainComponent.MainModule::class))
interface MainComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

    @Module
    abstract class MainModule {}
}