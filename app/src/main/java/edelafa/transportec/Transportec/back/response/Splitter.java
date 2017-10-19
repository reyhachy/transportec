package edelafa.transportec.Transportec.back.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Splitter implements Serializable {

    @SerializedName("ID")
    public String id;
    @SerializedName("Folio")
    public String folioNumber;
    @SerializedName("nombre")
    public String name;
    @SerializedName("apellidos")
    public String lastname;
    @SerializedName ("direccion")
    public String address;
    @SerializedName("telefono")
    public String phoneNumber;
    @SerializedName("edad")
    public String age;
    @SerializedName("origen")
    public String origin;
    @SerializedName("destino")
    public String destination;
    @SerializedName("hora")
    public String time;
    @SerializedName("fecha")
    public String date;
    @SerializedName("taxinumero")
    public String taxiNumber;
    @SerializedName("matricula")
    public String registrationNumber;

}
