package br.com.leonardomiyagi.architecturecomponentstest.domain.user

import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import br.com.leonardomiyagi.architecturecomponentstest.domain.repository.UserRepository
import br.com.leonardomiyagi.architecturecomponentstest.presentation.util.RetrofitLiveData

/**
 * Created by lmiyagi on 23/01/18.
 */
class GetUsers(private val userRepository: UserRepository) {

    fun execute(): RetrofitLiveData<List<User>> {
        return userRepository.getUsers()
    }
}