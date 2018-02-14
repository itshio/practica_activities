package com.example.practica_activities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DIDACT on 14/02/2018.
 */

public class Valoracion implements Parcelable{

    String Nombre;
    String opinion;
    int valoracion;

    public static final Parcelable.Creator<Valoracion> CREATOR = new Parcelable.Creator<Valoracion>(){
        public Valoracion createFromParcel(Parcel in) {
            return new Valoracion(in);
        }
        public Valoracion[] newArray(int size){
            return new Valoracion[size];        }
    };


    public Valoracion(String nombre, String opinion, int valoracion) {
        Nombre = nombre;
        this.opinion = opinion;
        this.valoracion = valoracion;
    }

    public Valoracion (Parcel parcel){

        readFromParcel(parcel);


    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(this.Nombre);
        dest.writeString(this.opinion);
        dest.writeInt(this.valoracion);

    }

    private void readFromParcel (Parcel parcel){

        this.Nombre = parcel.readString();
        this.opinion = parcel.readString();
        this.valoracion = parcel.readInt();
    }
}
