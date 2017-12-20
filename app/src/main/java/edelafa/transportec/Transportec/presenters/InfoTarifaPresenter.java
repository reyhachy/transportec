package edelafa.transportec.Transportec.presenters;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import edelafa.transportec.Transportec.back.Pojos.Taxi;
import edelafa.transportec.Transportec.back.Pojos.TaxiDriver;

public class InfoTarifaPresenter extends BasePresenter {

    private InfoTaxistasCallback mInfoTaxistasCallback;

    public interface InfoTaxistasCallback {

        void onSuccessLoadTaxistas(ArrayList<TaxiDriver> mTaxista);

    }

    public InfoTarifaPresenter(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    public ArrayList<TaxiDriver> mTaxistas;


    public void chargeTaxistas(){

        mTaxistas = new ArrayList<TaxiDriver>(){{
            add(new TaxiDriver("francisco","Lopez", "25", "calle 8 entre avenidas 1 y 2", "985784","2731203456","124"));

        }};

        mInfoTaxistasCallback.onSuccessLoadTaxistas(mTaxistas);

    }


}
