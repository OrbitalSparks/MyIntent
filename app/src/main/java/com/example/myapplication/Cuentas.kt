package com.example.myapplication

import android.os.Parcel

abstract class Cuentas {

    var numerodecuenta= 0
    var dni =0
    var saldo=0.0
    var Titular=""
//
    abstract fun Depositar(monto: Double):Double
    abstract fun Extraer(monto: Double):Double
    abstract fun ConsultarSaldo()

     open fun whriteparcel(parcel: Parcel, flags: Int){
        parcel.writeInt(dni)
        parcel.writeInt(numerodecuenta)
        parcel.writeString(Titular)
        parcel.writeDouble(saldo)

    }
}