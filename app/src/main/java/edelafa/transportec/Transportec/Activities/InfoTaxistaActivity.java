package edelafa.transportec.Transportec.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ListView;

import com.totalplay.view.BaseSimpleRecyclerView.BaseSimpleRecyclerView;
import com.totalplay.view.BaseSimpleRecyclerView.RefreshBaseRecyclerCallback;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import edelafa.transportec.R;
import edelafa.transportec.Transportec.Activities.taxistaapi.BaseActivity;
import edelafa.transportec.Transportec.Adapters.InfoTaxistaAdapter;
import edelafa.transportec.Transportec.back.Pojos.TaxiDriver;
import edelafa.transportec.Transportec.presenters.BasePresenter;
import edelafa.transportec.Transportec.presenters.InfoTarifaPresenter;

public class InfoTaxistaActivity extends BaseActivity implements RefreshBaseRecyclerCallback, InfoTarifaPresenter.InfoTaxistasCallback{


    @BindView(R.id.act_recicler_taxistas)
    RecyclerView mRecyvlerTaxistas;

    InfoTarifaPresenter mInfoTaxistaPresenter;
    InfoTaxistaAdapter mInfoTaxistaAdapter;

    private BaseSimpleRecyclerView mBaseSimpleRecyclerView;
    public ArrayList<TaxiDriver> mTaxistas;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_taxista);
        ButterKnife.bind(this);

        mBaseSimpleRecyclerView = new BaseSimpleRecyclerView(this, R.id.act_recicler_taxistas, R.id.act_refresh_taxistas)
                .setRefreshBaseRecycler(this)
                .setAdapter(mInfoTaxistaAdapter = new InfoTaxistaAdapter(this))
                .setEmptyView(R.id.base_recicler_empy)
                .addBottomOffsetDecoration(200);

        mTaxistas = new ArrayList<TaxiDriver>(){{
            add(new TaxiDriver("francisco","Lopez", "25", "calle 8 entre avenidas 1 y 2", "985784","2731203456","124"));

        }};

        mBaseSimpleRecyclerView.update(mTaxistas);

    }

    @Override
    protected BasePresenter getPresenter(){
        return mInfoTaxistaPresenter = new InfoTarifaPresenter(this);

    }



    @Override
    public void onRefreshItems() {

    }

    @Override
    public void onSuccessLoadTaxistas(ArrayList<TaxiDriver> mTaxista) {
        mBaseSimpleRecyclerView.update(mTaxista);
    }
}