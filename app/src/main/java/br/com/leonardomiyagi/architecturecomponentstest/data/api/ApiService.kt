package br.com.leonardomiyagi.architecturecomponentstest.data.api

import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by lmiyagi on 25/01/18.
 */
interface ApiService {

    @GET("/users")
    fun getUsers(): Call<List<User>>
}