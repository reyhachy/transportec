package edelafa.transportec.Transportec.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;
import edelafa.transportec.R;

/**
 * Created by deadp on 15/09/2017.
 */

public class InfoTarifaActivity extends Activity {
    @BindView(R.id.lvTarifa)
    private ListView listViewTarifa;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tarifa);
        ButterKnife.bind(this);

    }
}
