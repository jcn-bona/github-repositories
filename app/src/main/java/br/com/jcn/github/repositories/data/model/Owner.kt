package br.com.jcn.github.repositories.data.model

import com.google.gson.annotations.SerializedName

data class Owner (
    val login: String,
    @SerializedName("avatar_url") // diz para o gson que o nome que vem do github é avatar_url
    val avatarURL: String
)
