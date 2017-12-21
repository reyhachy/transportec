package edelafa.transportec.Transportec.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import edelafa.transportec.R;
import edelafa.transportec.Transportec.Activities.taxistaapi.BaseActivity;

public class ServiceActivity extends BaseActivity {

    public static void launch(AppCompatActivity appCompatActivity) {
        Intent intent = new Intent(appCompatActivity, ServiceActivity.class);
        appCompatActivity.startActivity(intent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        ButterKnife.bind(this);
    }
}
