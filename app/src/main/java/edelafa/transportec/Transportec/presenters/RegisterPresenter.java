package edelafa.transportec.Transportec.presenters;

import android.support.v7.app.AppCompatActivity;

import edelafa.transportec.R;
import edelafa.transportec.Transportec.back.interfaces.ResultCalBack;

public class RegisterPresenter extends BasePresenter implements ResultCalBack{


    public RegisterPresenter(AppCompatActivity appCompatActivity) {
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
}
