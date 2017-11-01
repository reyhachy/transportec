package edelafa.transportec.Transportec.presenters;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public class BasePresenter {

    protected AppCompatActivity mAppCompatActivity;
    protected final Context mContext;

    public BasePresenter(AppCompatActivity appCompatActivity) {
        mAppCompatActivity = appCompatActivity;
        mContext = appCompatActivity;
    }

    public void onCreate() {

    }

    public void onStart() {

    }

    public void onResume() {

    }

    public void onPause() {

    }

    public void onStop() {

    }

    public void onDestroy() {

    }
}
