package com.example.javier.navegomonitoreo;

import android.app.Activity;
import android.os.Vibrator;
import android.support.design.widget.TextInputEditText;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.Loader;
import android.database.Cursor;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.example.javier.navegomonitoreo.variables.Messages;


public class LoginActivity extends Activity implements LoaderCallbacks<Cursor> {


    private TextInputEditText mEmailView;
    private TextInputEditText mPasswordView;
    private Button btnLoginn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        // Set up the login form.
        addElements();

    }

    private void addElements(){
        mEmailView      = (TextInputEditText) findViewById(R.id.etUsuario);
        mPasswordView   = (TextInputEditText) findViewById(R.id.etClave);
        btnLoginn       = (Button) findViewById(R.id.btnLoginn);

        btnLoginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                error();
//                loguearUsuario();
                validarLoggin();
            }
        });
    }

    private void validarLoggin(){
        String usuario = mEmailView.getText().toString().trim();
        String clave = mPasswordView.getText().toString().trim();
        /*
        if (Validation.validateUser(usuario, clave)) {
            validateAllPermissionsToLogin();
        }
        else {
            Toast.makeText(getApplication(),  Messages.MSJ_DATOS_LOGIN_OBLIGATORIOS, Toast.LENGTH_SHORT).show();
        }
        */
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }

    /**
     * Shows the progress UI and hides the login form.
     */



}

