package edelafa.transportec.Transportec.Activities.taxistaapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.InflateException;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import edelafa.transportec.Transportec.presenters.BasePresenter;

/**
 * Created by reype on 01/11/2017.
 */

public class BaseActivity extends AppCompatActivity {

    Toolbar mToolbar;
    private BasePresenter[] mPresenters;
    private BasePresenter mPresenter;
    private boolean toolbarEnabled;
    private boolean homeAsUpEnabled;

    protected void setToolbarEnabled(boolean enabled) {
        this.toolbarEnabled = enabled;
    }

    protected void setHomeAsUpEnabled(boolean enabled) {
        this.homeAsUpEnabled = enabled;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toolbarEnabled = true;
        homeAsUpEnabled = true;
        mPresenters = getPresenters();
        mPresenter = getPresenter();
        if (mPresenters != null) {
            for (BasePresenter basePresenter : mPresenters) {
                if (basePresenter != null) {
                    basePresenter.onCreate();
                }
            }
        }
        if (mPresenter != null) mPresenter.onCreate();
    }

    protected BasePresenter getPresenter() {
        return null;
    }

    protected BasePresenter[] getPresenters() {
        return null;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mPresenters != null) {
            for (BasePresenter basePresenter : mPresenters) {
                if (basePresenter != null) {
                    basePresenter.onStart();
                }
            }
        }
        if (mPresenter != null) mPresenter.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPresenters != null) {
            for (BasePresenter basePresenter : mPresenters) {
                if (basePresenter != null) {
                    basePresenter.onResume();
                }
            }
        }
        if (mPresenter != null) mPresenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mPresenters != null) {
            for (BasePresenter basePresenter : mPresenters) {
                if (basePresenter != null) {
                    basePresenter.onPause();
                }
            }
        }
        if (mPresenter != null) mPresenter.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mPresenters != null) {
            for (BasePresenter basePresenter : mPresenters) {
                if (basePresenter != null) {
                    basePresenter.onStop();
                }
            }
        }
        if (mPresenter != null) mPresenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenters != null) {
            for (BasePresenter basePresenter : mPresenters) {
                if (basePresenter != null) {
                    basePresenter.onDestroy();
                }
            }
        }
        if (mPresenter != null) mPresenter.onDestroy();
    }

}

