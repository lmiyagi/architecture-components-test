package br.com.leonardomiyagi.architecturecomponentstest.domain.user

import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import br.com.leonardomiyagi.architecturecomponentstest.domain.repository.UserRepository
import retrofit2.Callback

/**
 * Created by lmiyagi on 23/01/18.
 */
class GetUsers(private val userRepository: UserRepository) {

    fun execute(callback: Callback<List<User>>) {
        return userRepository.getUsers(callback)
    }
}