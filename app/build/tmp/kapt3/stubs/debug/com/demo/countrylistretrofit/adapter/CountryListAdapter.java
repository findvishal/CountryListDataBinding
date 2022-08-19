package com.demo.countrylistretrofit.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/demo/countrylistretrofit/adapter/CountryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/demo/countrylistretrofit/adapter/CountryListAdapter$MyViewHolder;", "()V", "countryList", "", "Lcom/demo/countrylistretrofit/data/CountryModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCountryList", "Companion", "MyViewHolder", "app_debug"})
public final class CountryListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.demo.countrylistretrofit.adapter.CountryListAdapter.MyViewHolder> {
    private java.util.List<com.demo.countrylistretrofit.data.CountryModel> countryList;
    @org.jetbrains.annotations.NotNull()
    public static final com.demo.countrylistretrofit.adapter.CountryListAdapter.Companion Companion = null;
    
    public final void setCountryList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.demo.countrylistretrofit.data.CountryModel> countryList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.demo.countrylistretrofit.adapter.CountryListAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.demo.countrylistretrofit.adapter.CountryListAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public CountryListAdapter() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadImage"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView flagImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/demo/countrylistretrofit/adapter/CountryListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/demo/countrylistretrofit/databinding/CountryListRowBinding;", "(Lcom/demo/countrylistretrofit/databinding/CountryListRowBinding;)V", "getBinding", "()Lcom/demo/countrylistretrofit/databinding/CountryListRowBinding;", "bind", "", "data", "Lcom/demo/countrylistretrofit/data/CountryModel;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.demo.countrylistretrofit.databinding.CountryListRowBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.demo.countrylistretrofit.data.CountryModel data) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.demo.countrylistretrofit.databinding.CountryListRowBinding getBinding() {
            return null;
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.demo.countrylistretrofit.databinding.CountryListRowBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/demo/countrylistretrofit/adapter/CountryListAdapter$Companion;", "", "()V", "loadImage", "", "flagImage", "Landroid/widget/ImageView;", "url", "", "app_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"loadImage"})
        public final void loadImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView flagImage, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        private Companion() {
            super();
        }
    }
}