package br.com.leonardomiyagi.architecturecomponentstest.domain.repository

import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import retrofit2.Callback

/**
 * Created by lmiyagi on 23/01/18.
 */
interface UserRepository {

    fun getUsers(callback: Callback<List<User>>)
}