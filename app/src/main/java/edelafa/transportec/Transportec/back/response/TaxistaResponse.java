package edelafa.transportec.Transportec.back.response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import edelafa.transportec.Transportec.back.Pojos.TaxiDriver;

public class TaxistaResponse extends BaseResponse {
    @SerializedName("taxistas")
    public Taxista taxistas;

    public static class Taxista {
        @SerializedName("taxista")
        public ArrayList<TaxiDriver> taxista;
    }
}
