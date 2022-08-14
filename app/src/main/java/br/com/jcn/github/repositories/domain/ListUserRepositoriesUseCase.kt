package br.com.jcn.github.repositories.domain

import br.com.jcn.github.repositories.core.UseCase
import br.com.jcn.github.repositories.data.model.Repo
import br.com.jcn.github.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
):  UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}