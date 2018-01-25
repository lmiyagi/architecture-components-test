package br.com.leonardomiyagi.architecturecomponentstest.data.repository

import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import br.com.leonardomiyagi.architecturecomponentstest.domain.repository.UserRepository
import java.util.*

/**
 * Created by lmiyagi on 23/01/18.
 */
class DefaultUserRepository() : UserRepository {

    override fun getUsers(): List<User> {
        val random = Random()
        val users = ArrayList<User>()
        for (i in 0..9) {
            users.add(User(random.nextInt(100).toString()))
        }
        return users
    }
}