package br.com.leonardomiyagi.architecturecomponentstest.presentation.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection

/**
 * Created by lmiyagi on 23/01/18.
 */
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState, persistentState)
    }
}