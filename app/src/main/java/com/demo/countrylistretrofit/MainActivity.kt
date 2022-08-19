package com.demo.countrylistretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.countrylistretrofit.adapter.CountryListAdapter
import com.demo.countrylistretrofit.databinding.ActivityMainBinding
import com.demo.countrylistretrofit.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val recyclerAdapter: CountryListAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel=initViewModel()
        setupBinding(viewModel)

    }
    fun setupBinding(viewModel: MainActivityViewModel){
        val activityMainBinding:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        activityMainBinding.setVariable(BR.viewModel,viewModel)
        activityMainBinding.executePendingBindings()

        countryListRecyclerview.apply{
            layoutManager=LinearLayoutManager(this@MainActivity)


        }
    }

    fun initViewModel(): MainActivityViewModel {
        val viewModel:MainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getLiveDataObserver().observe(this, Observer {
            it?.let {
                with(recyclerAdapter) {
                    viewModel.setAdapterData(it)
                }
            }
        })
        viewModel.makeAPICall()
        return viewModel
    }
}