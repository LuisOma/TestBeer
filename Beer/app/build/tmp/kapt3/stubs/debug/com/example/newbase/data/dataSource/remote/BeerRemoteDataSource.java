package com.example.newbase.data.dataSource.remote;

import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/newbase/data/dataSource/remote/BeerRemoteDataSource;", "Lcom/example/newbase/data/dataSource/remote/BaseRemoteDataSource;", "beerService", "Lcom/example/newbase/data/dataSource/remote/BeerService;", "(Lcom/example/newbase/data/dataSource/remote/BeerService;)V", "getBeers", "Lcom/example/newbase/core/entity/Resource;", "", "Lcom/example/newbase/data/entities/beer/BeerResults;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class BeerRemoteDataSource extends com.example.newbase.data.dataSource.remote.BaseRemoteDataSource {
    private final com.example.newbase.data.dataSource.remote.BeerService beerService = null;
    
    @javax.inject.Inject
    public BeerRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.example.newbase.data.dataSource.remote.BeerService beerService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBeers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.newbase.core.entity.Resource<? extends java.util.List<com.example.newbase.data.entities.beer.BeerResults>>> continuation) {
        return null;
    }
}