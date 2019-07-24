package me.ibrahimsn.viewmodel.data.rest;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;
import me.ibrahimsn.viewmodel.data.model.Repo;
import me.ibrahimsn.viewmodel.util.Logger;

public class RepoRepository {

    private final RepoService repoService;

    @Inject
    public RepoRepository(RepoService repoService) {
        this.repoService = repoService;
    }

    public Single<List<Repo>> getRepositories() {
        Logger.logDebug();
        return repoService.getRepositories();
    }

    public Single<Repo> getRepo(String owner, String name) {
        return repoService.getRepo(owner, name);
    }
}
