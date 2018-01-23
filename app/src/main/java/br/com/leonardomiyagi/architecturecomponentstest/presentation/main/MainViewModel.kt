package br.com.leonardomiyagi.architecturecomponentstest.presentation.main

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * Created by lmiyagi on 23/01/18.
 */
class MainViewModel @Inject constructor() : ViewModel() {

    // todo figure this out

    class MainViewModelFactory : ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
                return MainViewModel() as T
            } else {
                throw IllegalArgumentException("Unknown ViewModel Class")
            }
        }
    }
}