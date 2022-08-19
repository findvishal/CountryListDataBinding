package com.demo.countrylistretrofit.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0004J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/demo/countrylistretrofit/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "countryListAdapter", "Lcom/demo/countrylistretrofit/adapter/CountryListAdapter;", "getCountryListAdapter", "()Lcom/demo/countrylistretrofit/adapter/CountryListAdapter;", "setCountryListAdapter", "(Lcom/demo/countrylistretrofit/adapter/CountryListAdapter;)V", "liveDataList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/demo/countrylistretrofit/data/CountryModel;", "getLiveDataList", "()Landroidx/lifecycle/MutableLiveData;", "setLiveDataList", "(Landroidx/lifecycle/MutableLiveData;)V", "getAdapter", "getLiveDataObserver", "makeAPICall", "", "setAdapterData", "data", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.demo.countrylistretrofit.data.CountryModel>> liveDataList;
    @org.jetbrains.annotations.NotNull()
    private com.demo.countrylistretrofit.adapter.CountryListAdapter countryListAdapter;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.demo.countrylistretrofit.data.CountryModel>> getLiveDataList() {
        return null;
    }
    
    public final void setLiveDataList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.demo.countrylistretrofit.data.CountryModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.countrylistretrofit.adapter.CountryListAdapter getCountryListAdapter() {
        return null;
    }
    
    public final void setCountryListAdapter(@org.jetbrains.annotations.NotNull()
    com.demo.countrylistretrofit.adapter.CountryListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.countrylistretrofit.adapter.CountryListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.demo.countrylistretrofit.data.CountryModel> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.demo.countrylistretrofit.data.CountryModel>> getLiveDataObserver() {
        return null;
    }
    
    public final void makeAPICall() {
    }
    
    public MainActivityViewModel() {
        super();
    }
}