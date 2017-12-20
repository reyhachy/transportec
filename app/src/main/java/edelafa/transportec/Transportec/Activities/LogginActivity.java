package edelafa.transportec.Transportec.Activities;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import edelafa.transportec.R;
import edelafa.transportec.Transportec.Activities.taxistaapi.BaseActivity;
import edelafa.transportec.Transportec.presenters.BasePresenter;
import edelafa.transportec.Transportec.presenters.LogginPresenter;

public class LogginActivity extends BaseActivity implements OnClickListener {
    @BindView(R.id.usuario_text)
    public EditText user;
    @BindView(R.id.password_text)
    public EditText pass;
    @BindView(R.id.acces_button)
    public Button bAcceder;
    @BindView(R.id.register_button)
    public Button bRegistro;
    ProgressDialog pDialog;
    private LogginPresenter mlogginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggin);
        ButterKnife.bind(this);
        bAcceder.setOnClickListener(this);
        bRegistro.setOnClickListener(this);

    }

    @Override
    protected BasePresenter[] getPresenters() {
        return new BasePresenter[]{
                mlogginPresenter = new LogginPresenter(this)
        };
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.acces_button:
                mlogginPresenter.loggin(user.getText().toString().trim(),pass.getText().toString().trim());
                break;
            case R.id.register_button:
                RegisterActivity.launch(this);
                break;

            default:
                break;
        }
    }
}

