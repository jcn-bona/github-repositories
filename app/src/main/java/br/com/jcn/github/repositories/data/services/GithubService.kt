package br.com.jcn.github.repositories.data.services

import br.com.jcn.github.repositories.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}