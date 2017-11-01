package edelafa.transportec.Transportec.Activities.taxistaapi;

import edelafa.transportec.Transportec.Activities.models.TaxistaRespuesta;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by deadp on 01/11/2017.
 */

public interface RetrofitService {

    @GET ("taxistas/get_all_taxistas.php")
    Call<TaxistaRespuesta> obtenerListaTaxistas();

}
