package br.com.leonardomiyagi.architecturecomponentstest.data.repository

import br.com.leonardomiyagi.architecturecomponentstest.data.api.ApiClient
import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import br.com.leonardomiyagi.architecturecomponentstest.domain.repository.UserRepository
import retrofit2.Callback


/**
 * Created by lmiyagi on 23/01/18.
 */
class DefaultUserRepository(private val apiClient: ApiClient) : UserRepository {

    override fun getUsers(callback: Callback<List<User>>) {
        return apiClient.getUsers().enqueue(callback)
    }
}