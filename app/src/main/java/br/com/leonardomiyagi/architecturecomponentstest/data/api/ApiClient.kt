package br.com.leonardomiyagi.architecturecomponentstest.data.api

import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import retrofit2.Call

/**
 * Created by lmiyagi on 25/01/18.
 */
class ApiClient(private val apiService: ApiService) {

    fun getUsers(since: Int): Call<List<User>> {
        return apiService.getUsers(since)
    }
}