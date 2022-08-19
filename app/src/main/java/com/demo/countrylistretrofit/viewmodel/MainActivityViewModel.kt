package com.demo.countrylistretrofit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demo.countrylistretrofit.adapter.CountryListAdapter
import com.demo.countrylistretrofit.data.CountryModel
import com.demo.countrylistretrofit.retrofit.RetroInstance
import com.demo.countrylistretrofit.retrofit.RetroServiceInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityViewModel: ViewModel() {

    var liveDataList: MutableLiveData<List<CountryModel>>
    var countryListAdapter:CountryListAdapter

    init {
        liveDataList = MutableLiveData()
        countryListAdapter=CountryListAdapter()

    }
    fun getAdapter():CountryListAdapter{
        return countryListAdapter
    }
    fun setAdapterData(data:List<CountryModel>){
        countryListAdapter.setCountryList(data)
        countryListAdapter.notifyDataSetChanged()

    }

    fun getLiveDataObserver(): MutableLiveData<List<CountryModel>> {
        return liveDataList
    }

    fun makeAPICall() {
        val retroInstance = RetroInstance.getRetroInstance()
        val retroService  = retroInstance.create(RetroServiceInterface::class.java)
        val call  = retroService.getCountryList()
        call.enqueue(object : Callback<List<CountryModel>> {
            override fun onFailure(call: Call<List<CountryModel>>, t: Throwable) {
                liveDataList.postValue(null)
            }

            override fun onResponse(
                call: Call<List<CountryModel>>,
                response: Response<List<CountryModel>>
            ) {
                liveDataList.postValue(response.body())
            }
        })


    }
}