package edelafa.transportec.Transportec.back.response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import edelafa.transportec.Transportec.back.Pojos.Taxi;

public class TaxiResponse extends BaseResponse {
    @SerializedName("Taxis")
    public Taxis taxis;

    public static class Taxis{
        @SerializedName("taxi")
        public ArrayList<Taxi> taxi;
    }
}
