package com.weimont.indicadordollarappandroid.models;

import com.google.gson.annotations.SerializedName;

public class Indicador {

    @SerializedName("fecha")
    private String fecha;

    @SerializedName("valor")
    private double valor;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
