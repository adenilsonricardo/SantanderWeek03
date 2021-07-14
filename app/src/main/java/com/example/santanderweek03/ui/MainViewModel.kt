package com.example.santanderweek03.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.santanderweek03.data.Conta
import com.example.santanderweek03.data.local.FakeData

class MainViewModel :ViewModel(){
    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente() : LiveData<Conta> {
        mutableLiveData.value = FakeData().getLocalData()


        return mutableLiveData
    }



}