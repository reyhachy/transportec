package edelafa.transportec.Transportec.Activities;

import android.os.Bundle;

import com.totalplay.mvp.BaseActivity;
import com.totalplay.mvp.BasePresenter;

import butterknife.ButterKnife;
import edelafa.transportec.R;

/**
 * Created by deadp on 01/11/2017.
 */

public class InfoTarifaActivity extends BaseActivity{

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tarifa);
        ButterKnife.bind(this);


    }
}
