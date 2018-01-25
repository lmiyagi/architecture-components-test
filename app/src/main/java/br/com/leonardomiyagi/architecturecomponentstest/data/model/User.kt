package br.com.leonardomiyagi.architecturecomponentstest.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by lmiyagi on 23/01/18.
 */
class User {

    @SerializedName("id")
    var id: Int? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("html_url")
    var url: String? = null
}