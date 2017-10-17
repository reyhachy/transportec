package edelafa.transportec.Transportec.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import edelafa.transportec.R;

public class InfoTaxistaActivity extends Activity {

    @BindView(R.id.lvTaxistas)
    private ListView listViewTaxistas;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_taxista);
        ButterKnife.bind(this);

    }
}