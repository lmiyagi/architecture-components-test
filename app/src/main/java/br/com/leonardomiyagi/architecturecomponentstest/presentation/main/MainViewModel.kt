package br.com.leonardomiyagi.architecturecomponentstest.presentation.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import br.com.leonardomiyagi.architecturecomponentstest.domain.user.GetUsers
import javax.inject.Inject

/**
 * Created by lmiyagi on 23/01/18.
 */
class MainViewModel(private val getUsers: GetUsers) : ViewModel() {

    private val usersLiveData: MutableLiveData<List<User>> = MutableLiveData()

    init {
        getUsers()
    }

    fun users(): LiveData<List<User>> {
        return usersLiveData
    }

    fun getUsers() {
        usersLiveData.value = getUsers.execute()
    }

    class MainViewModelFactory @Inject constructor(private val getUsers: GetUsers) : ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
                return MainViewModel(getUsers) as T
            } else {
                throw IllegalArgumentException("Unknown ViewModel Class")
            }
        }
    }
}