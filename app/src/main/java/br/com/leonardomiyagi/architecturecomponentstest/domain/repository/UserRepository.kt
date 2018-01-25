package br.com.leonardomiyagi.architecturecomponentstest.domain.repository

import br.com.leonardomiyagi.architecturecomponentstest.data.model.User

/**
 * Created by lmiyagi on 23/01/18.
 */
interface UserRepository {

    fun getUsers(): List<User>
}