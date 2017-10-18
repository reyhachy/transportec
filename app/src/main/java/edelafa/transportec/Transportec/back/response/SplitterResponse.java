package edelafa.transportec.Transportec.back.response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SplitterResponse extends BaseResponse {

    @SerializedName("taxistas")
    public SplitterObject splittertaxistas;
    @SerializedName("usuarios")
    public SplitterObject splitterusers;
    @SerializedName("peticiones")
    public SplitterObject splitterpeticiones;
    @SerializedName("ordenes")
    public SplitterObject splitterordenes;
    @SerializedName("taxis")
    public SplitterObject splittertaxis;

    public static class SplitterObject {
        @SerializedName("taxista")
        public ArrayList<Splitter> splitterstaxista;
        @SerializedName("usuario")
        public ArrayList<Splitter> splittersusuario;
        @SerializedName("peticion")
        public ArrayList<Splitter> splitterspeticion;
        @SerializedName("orden")
        public ArrayList<Splitter> splittersorden;
        @SerializedName("taxi")
        public ArrayList<Splitter> splitterstaxi;
    }


}
