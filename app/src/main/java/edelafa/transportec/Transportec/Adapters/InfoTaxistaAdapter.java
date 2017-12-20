package edelafa.transportec.Transportec.Adapters;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.totalplay.view.BaseSimpleRecyclerView.BaseSimpleAdapter;
import com.totalplay.view.BaseSimpleRecyclerView.BaseViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;
import edelafa.transportec.R;
import edelafa.transportec.Transportec.back.Pojos.TaxiDriver;

/**
 * Created by ReyHac on 18/12/17.
 */

public class InfoTaxistaAdapter extends BaseSimpleAdapter<TaxiDriver, InfoTaxistaAdapter.AdapterViewHolder> {

    private AppCompatActivity appCompatActivity;

public InfoTaxistaAdapter(AppCompatActivity appCompatActivity){
    this.appCompatActivity = appCompatActivity;
}

    @Override
    public int getItemLayout() {
        return R.layout.item_taxista;
    }

    @Override
    public BaseViewHolder getViewHolder(View view) {
        return new AdapterViewHolder(view);
    }

    class AdapterViewHolder extends BaseViewHolder<TaxiDriver> {

    @BindView(R.id.ta_name)
    public TextView nName;
    @BindView(R.id.ta_no)
    public TextView nNumero;
    @BindView(R.id.ta_folio)
    public TextView nFolio;
    @BindView(R.id.ta_lastN)
    public TextView nlastN;


        public AdapterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void populate(BaseViewHolder holder, int position, TaxiDriver taxiDriver) {
            nName.setText(taxiDriver.name);
            nlastN.setText(taxiDriver.lastName);
            nNumero.setText(taxiDriver.taxiNumber);
            nFolio.setText(taxiDriver.folioNumber);

        }

    }

}
