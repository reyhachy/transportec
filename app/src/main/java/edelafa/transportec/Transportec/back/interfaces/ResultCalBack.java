package edelafa.transportec.Transportec.back.interfaces;

import edelafa.transportec.R;

public interface ResultCalBack {

    void onRequestWS(String requestUrl);

    void onSuccessLoadResponse(String requestUrl, R BasePojo);

    void onErrorLoadResponse(String requestUrl, String messageError);

    void onErrorConnection();
}
