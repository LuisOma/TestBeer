package com.example.newbase.ui.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.newbase.constants.Constants;
import com.example.newbase.core.entity.Resource;
import com.example.newbase.data.entities.beer.BeerResults;
import com.example.newbase.databinding.BeerItemBinding;
import com.example.newbase.databinding.NetworkStateItemBinding;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\'()B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bH\u0016J\u000e\u0010&\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/newbase/ui/main/adapter/BeerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "beerList", "Ljava/util/ArrayList;", "Lcom/example/newbase/data/entities/beer/BeerResults;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "beerFilterList", "getBeerFilterList", "()Ljava/util/ArrayList;", "setBeerFilterList", "(Ljava/util/ArrayList;)V", "listener", "Lcom/example/newbase/ui/main/adapter/BeerAdapter$itemClickListener;", "networkState", "Lcom/example/newbase/core/entity/Resource$Status;", "addItems", "", "list", "", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "getItemViewType", "position", "hasExtraRow", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemListener", "NetworkStateItemViewHolder", "PokemonItemViewHolder", "itemClickListener", "app_debug"})
public final class BeerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements android.widget.Filterable {
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.example.newbase.data.entities.beer.BeerResults> beerList = null;
    private com.example.newbase.core.entity.Resource.Status networkState;
    private com.example.newbase.ui.main.adapter.BeerAdapter.itemClickListener listener;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.example.newbase.data.entities.beer.BeerResults> beerFilterList;
    
    public BeerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.newbase.data.entities.beer.BeerResults> beerList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.example.newbase.data.entities.beer.BeerResults> getBeerFilterList() {
        return null;
    }
    
    public final void setBeerFilterList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.newbase.data.entities.beer.BeerResults> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void setItemListener(@org.jetbrains.annotations.NotNull
    com.example.newbase.ui.main.adapter.BeerAdapter.itemClickListener listener) {
    }
    
    private final boolean hasExtraRow() {
        return false;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.newbase.data.entities.beer.BeerResults> list) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/newbase/ui/main/adapter/BeerAdapter$PokemonItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/newbase/databinding/BeerItemBinding;", "(Lcom/example/newbase/databinding/BeerItemBinding;)V", "bind", "", "beer", "Lcom/example/newbase/data/entities/beer/BeerResults;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class PokemonItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.newbase.databinding.BeerItemBinding binding = null;
        
        public PokemonItemViewHolder(@org.jetbrains.annotations.NotNull
        com.example.newbase.databinding.BeerItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable
        com.example.newbase.data.entities.beer.BeerResults beer, @org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/newbase/ui/main/adapter/BeerAdapter$NetworkStateItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/newbase/databinding/NetworkStateItemBinding;", "(Lcom/example/newbase/databinding/NetworkStateItemBinding;)V", "bind", "", "networkState", "Lcom/example/newbase/core/entity/Resource$Status;", "app_debug"})
    public static final class NetworkStateItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.newbase.databinding.NetworkStateItemBinding binding = null;
        
        public NetworkStateItemViewHolder(@org.jetbrains.annotations.NotNull
        com.example.newbase.databinding.NetworkStateItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable
        com.example.newbase.core.entity.Resource.Status networkState) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/newbase/ui/main/adapter/BeerAdapter$itemClickListener;", "", "onItemClicked", "", "beer", "Lcom/example/newbase/data/entities/beer/BeerResults;", "app_debug"})
    public static abstract interface itemClickListener {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull
        com.example.newbase.data.entities.beer.BeerResults beer);
    }
}