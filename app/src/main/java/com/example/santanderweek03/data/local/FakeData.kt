package com.example.santanderweek03.data.local

import com.example.santanderweek03.data.Cartao
import com.example.santanderweek03.data.Cliente
import com.example.santanderweek03.data.Conta

class FakeData {

    fun getLocalData() : Conta {
        val cliente = Cliente("Ricardo")
        val cartao: Cartao ("123456789")
        return Conta(
            "123456-7",
            "1234-5",
            "R$ 1234,56",
            "2345,61",
            cliente,
            cartao
        );

    }




}
