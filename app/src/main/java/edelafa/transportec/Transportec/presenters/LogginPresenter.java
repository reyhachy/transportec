package edelafa.transportec.Transportec.presenters;

import edelafa.transportec.R;
import edelafa.transportec.Transportec.back.interfaces.ResultCalBack;

/**
 * Created by reype on 11/10/2017.
 */

public class LogginPresenter extends BasePresenter implements ResultCalBack{



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
    }
}
