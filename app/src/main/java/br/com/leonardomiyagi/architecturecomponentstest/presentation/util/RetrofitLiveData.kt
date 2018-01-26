package br.com.leonardomiyagi.architecturecomponentstest.presentation.util

import android.arch.lifecycle.LiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by lmiyagi on 1/25/18.
 */
class RetrofitLiveData<T>(private val call: Call<T>) : LiveData<T>(), Callback<T> {


    override fun onActive() {
        if (!call.isCanceled && !call.isExecuted) call.enqueue(this)
    }

    override fun onResponse(call: Call<T>?, response: Response<T>?) {
        value = response?.body()
    }

    override fun onFailure(call: Call<T>?, t: Throwable?) {
        t?.printStackTrace()
    }

    fun cancel() = if (!call.isCanceled) call.cancel() else Unit
}