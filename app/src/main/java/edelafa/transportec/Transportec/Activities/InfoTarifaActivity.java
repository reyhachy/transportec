package edelafa.transportec.Transportec.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.totalplay.mvp.BaseActivity;
import com.totalplay.mvp.BasePresenter;

import butterknife.ButterKnife;
import edelafa.transportec.R;

/**
 * Created by deadp on 01/11/2017.
 */

public class InfoTarifaActivity extends BaseActivity{

    public static void launch(AppCompatActivity appCompatActivity) {
        Intent intent = new Intent(appCompatActivity, InfoTarifaActivity.class);
        appCompatActivity.startActivity(intent);
    }

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tarifa);
        ButterKnife.bind(this);
    }
}
