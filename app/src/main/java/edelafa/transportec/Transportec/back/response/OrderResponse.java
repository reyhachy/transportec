package edelafa.transportec.Transportec.back.response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import edelafa.transportec.Transportec.back.Pojos.Orden;

/**
 * Created by reype on 19/10/2017.
 */

public class OrderResponse extends BaseResponse {
    @SerializedName("Ordenes")
    public Order orders;

    public static class Order {
        @SerializedName("Orden")
        public ArrayList<Orden> order;
    }
}
