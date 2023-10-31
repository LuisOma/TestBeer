package com.example.newbase.ui.main.beers;

import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import com.example.newbase.data.entities.beer.BeerResults;
import com.example.newbase.domain.useCase.GetBeerUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/example/newbase/ui/main/beers/BeersViewModel;", "Landroidx/lifecycle/ViewModel;", "getBeerUseCase", "Lcom/example/newbase/domain/useCase/GetBeerUseCase;", "(Lcom/example/newbase/domain/useCase/GetBeerUseCase;)V", "beers", "Landroidx/lifecycle/LiveData;", "Lcom/example/newbase/core/entity/Resource;", "", "Lcom/example/newbase/data/entities/beer/BeerResults;", "getBeers", "()Landroidx/lifecycle/LiveData;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "selectedBeer", "getSelectedBeer", "()Lcom/example/newbase/data/entities/beer/BeerResults;", "setSelectedBeer", "(Lcom/example/newbase/data/entities/beer/BeerResults;)V", "app_debug"})
public final class BeersViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable
    private androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.newbase.core.entity.Resource<java.util.List<com.example.newbase.data.entities.beer.BeerResults>>> beers = null;
    @org.jetbrains.annotations.Nullable
    private com.example.newbase.data.entities.beer.BeerResults selectedBeer;
    
    @javax.inject.Inject
    public BeersViewModel(@org.jetbrains.annotations.NotNull
    com.example.newbase.domain.useCase.GetBeerUseCase getBeerUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.Nullable
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.newbase.core.entity.Resource<java.util.List<com.example.newbase.data.entities.beer.BeerResults>>> getBeers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.newbase.data.entities.beer.BeerResults getSelectedBeer() {
        return null;
    }
    
    public final void setSelectedBeer(@org.jetbrains.annotations.Nullable
    com.example.newbase.data.entities.beer.BeerResults p0) {
    }
}