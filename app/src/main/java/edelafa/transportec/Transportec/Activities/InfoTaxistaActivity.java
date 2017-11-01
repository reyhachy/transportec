package edelafa.transportec.Transportec.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import edelafa.transportec.R;
import edelafa.transportec.Transportec.Activities.models.TaxistaRespuesta;
import edelafa.transportec.Transportec.Activities.models.Taxistas;
import edelafa.transportec.Transportec.Activities.taxistaapi.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InfoTaxistaActivity extends Activity {

    private static final String TAG = "taxista";

    @BindView(R.id.recyclerView)
    private ListView listViewTaxistas;
    private Retrofit retrofit;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_taxista);
        ButterKnife.bind(this);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://transportec.000webhostapp.com/?dir=JSON/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    private void obtenerDatos() {

        RetrofitService service = retrofit.create(RetrofitService.class);
        Call<TaxistaRespuesta> taxistaRespuestaCall = service.obtenerListaTaxistas();

        taxistaRespuestaCall.enqueue(new Callback<TaxistaRespuesta>() {
            @Override
            public void onResponse(Call<TaxistaRespuesta> call, Response<TaxistaRespuesta> response) {

                if (response.isSuccessful()){

                    TaxistaRespuesta taxistaRespuesta = response.body();
                    ArrayList<Taxistas> listaTaxista = taxistaRespuesta.getResults();
                }
                else{
                    Log.e(TAG, "onResponse: " + response.errorBody());
                }

            }

            @Override
            public void onFailure(Call<TaxistaRespuesta> call, Throwable t) {

            }
        });

    }
}