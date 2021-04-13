package com.weimont.indicadordollarappandroid.responses;

import com.google.gson.annotations.SerializedName;
import com.weimont.indicadordollarappandroid.models.Indicador;

import java.util.List;

public class IndicadorResponse {

    @SerializedName("version")
    private String version;

    @SerializedName("autor")
    private String autor;

    @SerializedName("codigo")
    private String codigo;

    @SerializedName("nombre")
    private String nombre;

    @SerializedName("unidad_medida")
    private String unidad_medida;

    @SerializedName("serie")
    private List<Indicador> indicadors;

    public String getVersion() {
        return version;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public List<Indicador> getIndicadors() {
        return indicadors;
    }
}
