package com.example.newbase.ui.main.beers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.newbase.R;
import com.example.newbase.core.entity.Resource;
import com.example.newbase.data.entities.beer.BeerResults;
import com.example.newbase.databinding.FragmentBeersBinding;
import com.example.newbase.ui.main.adapter.BeerAdapter;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\""}, d2 = {"Lcom/example/newbase/ui/main/beers/BeersFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/newbase/ui/main/adapter/BeerAdapter$itemClickListener;", "()V", "beerAdapter", "Lcom/example/newbase/ui/main/adapter/BeerAdapter;", "getBeerAdapter", "()Lcom/example/newbase/ui/main/adapter/BeerAdapter;", "beerAdapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/newbase/databinding/FragmentBeersBinding;", "viewModel", "Lcom/example/newbase/ui/main/beers/BeersViewModel;", "getViewModel", "()Lcom/example/newbase/ui/main/beers/BeersViewModel;", "viewModel$delegate", "initObservers", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onItemClicked", "beer", "Lcom/example/newbase/data/entities/beer/BeerResults;", "onViewCreated", "view", "setUpView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class BeersFragment extends androidx.fragment.app.Fragment implements com.example.newbase.ui.main.adapter.BeerAdapter.itemClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.newbase.databinding.FragmentBeersBinding binding;
    private final kotlin.Lazy beerAdapter$delegate = null;
    
    public BeersFragment() {
        super();
    }
    
    private final com.example.newbase.ui.main.beers.BeersViewModel getViewModel() {
        return null;
    }
    
    private final com.example.newbase.ui.main.adapter.BeerAdapter getBeerAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpView() {
    }
    
    private final void initObservers() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onItemClicked(@org.jetbrains.annotations.NotNull
    com.example.newbase.data.entities.beer.BeerResults beer) {
    }
}