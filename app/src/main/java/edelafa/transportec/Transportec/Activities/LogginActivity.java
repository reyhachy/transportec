package edelafa.transportec.Transportec.Activities;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import edelafa.transportec.R;
import edelafa.transportec.Transportec.JSONParser;
import edelafa.transportec.Transportec.presenters.LogginPresenter;

public class LogginActivity extends Activity implements OnClickListener {
    @BindView(R.id.usuario_text)
    private EditText user;
    @BindView(R.id.password_text)
    private EditText pass;
    @BindView(R.id.acces_button)
    private Button bAcceder;
    @BindView(R.id.register_button)
    private Button bRegistro;
    private ProgressDialog pDialog;
    private LogginPresenter mlogginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggin);
        ButterKnife.bind(this);
        bAcceder.setOnClickListener(this);
        bRegistro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.acces_button:
                mlogginPresenter.loggin(user.getText().toString().trim(),pass.getText().toString().trim());
                break;
            case R.id.register_button:
                Intent i = new Intent(this, RegisterActivity.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}

