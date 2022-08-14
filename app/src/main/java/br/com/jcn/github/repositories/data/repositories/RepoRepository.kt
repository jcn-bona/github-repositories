package br.com.jcn.github.repositories.data.repositories

import br.com.jcn.github.repositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}