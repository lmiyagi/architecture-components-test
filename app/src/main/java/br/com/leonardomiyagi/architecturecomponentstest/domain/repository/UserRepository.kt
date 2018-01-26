package br.com.leonardomiyagi.architecturecomponentstest.domain.repository

import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import br.com.leonardomiyagi.architecturecomponentstest.presentation.util.RetrofitLiveData

/**
 * Created by lmiyagi on 23/01/18.
 */
interface UserRepository {

    fun getUsers(): RetrofitLiveData<List<User>>
}