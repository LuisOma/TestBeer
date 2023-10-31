package com.example.newbase.domain.useCase;

import com.example.newbase.data.repo.BeerRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/newbase/domain/useCase/GetBeerUseCase;", "", "beerRepository", "Lcom/example/newbase/data/repo/BeerRepository;", "(Lcom/example/newbase/data/repo/BeerRepository;)V", "getAllBeers", "Landroidx/lifecycle/LiveData;", "Lcom/example/newbase/core/entity/Resource;", "", "Lcom/example/newbase/data/entities/beer/BeerResults;", "app_debug"})
public final class GetBeerUseCase {
    private final com.example.newbase.data.repo.BeerRepository beerRepository = null;
    
    @javax.inject.Inject
    public GetBeerUseCase(@org.jetbrains.annotations.NotNull
    com.example.newbase.data.repo.BeerRepository beerRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.newbase.core.entity.Resource<java.util.List<com.example.newbase.data.entities.beer.BeerResults>>> getAllBeers() {
        return null;
    }
}