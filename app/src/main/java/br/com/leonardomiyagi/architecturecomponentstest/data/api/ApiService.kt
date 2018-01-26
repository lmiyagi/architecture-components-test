package br.com.leonardomiyagi.architecturecomponentstest.data.api

import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by lmiyagi on 25/01/18.
 */
interface ApiService {

    @GET("/users")
    fun getUsers(@Query("since") since: Int): Call<List<User>>
}