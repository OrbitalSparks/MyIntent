package com.example.myapplication

abstract class Cuentas() {

    //
    abstract fun Depositar(monto: Double):Double
    abstract fun Extraer(monto: Double):Double
    abstract fun ConsultarSaldo()


}