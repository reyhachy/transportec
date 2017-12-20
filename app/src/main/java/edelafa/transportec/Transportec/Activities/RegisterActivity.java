package edelafa.transportec.Transportec.Activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import edelafa.transportec.R;

public class RegisterActivity extends Activity implements OnClickListener{
    @BindView(R.id.nombre_texto)
    EditText nombre;
    @BindView(R.id.apellidos_texto)
    EditText apellidos;
    @BindView(R.id.edad_texto)
    EditText edad;
    @BindView(R.id.phone_texto)
    EditText phone;
    @BindView(R.id.password_texto)
    EditText password;
    @BindView(R.id.password2_texto)
    EditText password2;
    @BindView(R.id.b_registrarse)
    Button bRegistrarse;

    // Progress Dialog
    private ProgressDialog pDialog;


    //testing on Emulator:
    private static final String REGISTER_URL = "https://transportec.000webhostapp.com/JSON/register.php";

    //ids
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";

    public static void launch(AppCompatActivity appCompatActivity) {
        Intent intent = new Intent(appCompatActivity, RegisterActivity.class);
        appCompatActivity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        ButterKnife.bind(this);
        bRegistrarse.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        new CreateUser().execute();
    }

    class CreateUser extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(RegisterActivity.this);
            pDialog.setMessage("Creating User...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... args) {
            // TODO Auto-generated method stub
            // Check for success tag
            int success;

            return null;
        }

        protected void onPostExecute(String file_url) {
            // dismiss the dialog once product deleted
            pDialog.dismiss();
            if (file_url != null){
                Toast.makeText(RegisterActivity.this, file_url, Toast.LENGTH_LONG).show();
            }
        }
    }
}