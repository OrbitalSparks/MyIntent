package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

data class CajaAhorro(val parcel: Parcel) : Cuentas(), Parcelable {

//
 override fun whriteparcel(parcel: Parcel, flags: Int){
  parcel.writeInt(dni)
  parcel.writeInt(numerodecuenta)
  parcel.writeString(Titular)
  parcel.writeDouble(saldo)

 }


 override fun Depositar(monto: Double):Double {
  this.saldo=this.saldo+monto
  return this.saldo
 }

 override fun Extraer(monto: Double):Double {
  this.saldo=this.saldo-monto
  return this.saldo
 }

 override fun ConsultarSaldo() {
  println("El Saldo Actual de ${this.Titular}es ${this.saldo}$")


 }

 override fun writeToParcel(parcel: Parcel, flags: Int) {
  parcel.writeInt(numerodecuenta)
  parcel.writeInt(dni)
  parcel.writeDouble(saldo)
  parcel.writeString(Titular)
 }

 override fun describeContents(): Int {
  return 0
 }

 companion object CREATOR : Parcelable.Creator<CajaAhorro> {
  override fun createFromParcel(parcel: Parcel): CajaAhorro {
   return CajaAhorro(parcel)
  }

  override fun newArray(size: Int): Array<CajaAhorro?> {
   return arrayOfNulls(size)
  }
 }

}
