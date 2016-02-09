package com.slgp.gestionprojet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.sql.Connection;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;

public class SplashScreen extends Activity {

    private ProgressBar progressBar;
    private Button btnLocal;
    private Button btnConnexion;
    private Intent accueil;
    private Intent projetAccueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        initialize();

        setListener();

        if(testConnection()){
            btnConnexion.setVisibility(View.VISIBLE);
        }
        btnLocal.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.INVISIBLE);

        setTest();
    }

    private void setTest() {
        Button btnTest = (Button) findViewById(R.id.btnLocal);

        btnTest.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                startActivity(projetAccueil);
            }
        });
    }

    private boolean testConnection() {
        //Connection conn = new ConnectionDB().dbConnect();
        //return conn != null;
        return true;
    }

    private void setListener() {
        btnLocal.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences prefs = getSharedPreferences(getString(R.string.sharedPrefs), Context.MODE_PRIVATE);
                prefs.edit().putBoolean("connected",false).apply();
                finish();
                startActivity(accueil);
            }
        });

        btnConnexion.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences prefs = getSharedPreferences(getString(R.string.sharedPrefs), Context.MODE_PRIVATE);
                prefs.edit().putBoolean("connected",true).apply();
                finish();
                startActivity(accueil);
            }
        });
    }

    private void initialize() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnLocal = (Button) findViewById(R.id.btnLocal);
        btnConnexion = (Button) findViewById(R.id.btnConnexion);
        accueil = new Intent(this, Accueil.class);

        //test
        projetAccueil = new Intent(this, ProjetAccueil.class);

    }
}
