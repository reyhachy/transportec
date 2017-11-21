package edelafa.transportec.Transportec.presenters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import edelafa.transportec.R;
import edelafa.transportec.Transportec.Activities.MenuActivity;
import edelafa.transportec.Transportec.Activities.RegisterActivity;
import edelafa.transportec.Transportec.back.interfaces.ResultCalBack;

/**
 * Created by reype on 11/10/2017.
 */

public class LogginPresenter extends BasePresenter implements ResultCalBack{

    public LogginPresenter(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override
    public void onRequestWS(String requestUrl) {

    }

    @Override
    public void onSuccessLoadResponse(String requestUrl, R BasePojo) {

    }

    @Override
    public void onErrorLoadResponse(String requestUrl, String messageError) {

    }

    @Override
    public void onErrorConnection() {

    }

    public void loggin(String user, String pass) {
        if(user == "Pablito" && pass == "123456"){
            Intent i = new Intent(mAppCompatActivity, MenuActivity.class);
            mAppCompatActivity.startActivity(i);
        }
        else{
            MenuActivity.launch(mAppCompatActivity);
        }
    }
}
