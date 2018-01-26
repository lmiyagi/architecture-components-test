package br.com.leonardomiyagi.architecturecomponentstest.data

import android.arch.paging.PageKeyedDataSource
import br.com.leonardomiyagi.architecturecomponentstest.data.api.ApiClient
import br.com.leonardomiyagi.architecturecomponentstest.data.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by lmiyagi on 26/01/18.
 */
class UserDataSource(private val apiClient: ApiClient) : PageKeyedDataSource<Int, User>() {

    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, User>) {
        // nothing
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, User>) {
        // todo implement this
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, User>) {
        apiClient.getUsers(since = params.key).enqueue(object : Callback<List<User>> {

            override fun onFailure(call: Call<List<User>>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<List<User>>?, response: Response<List<User>>?) {
                val result = response?.body() ?: emptyList()
                var next: Int? = null
                if (result.isNotEmpty()) {
                    next = result[result.size - 1].id
                }
                callback.onResult(result, next)
            }

        })
    }
}