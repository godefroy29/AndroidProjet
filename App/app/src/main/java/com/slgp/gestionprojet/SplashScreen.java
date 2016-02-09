package com.slgp.gestionprojet;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }

    private boolean testConnection() {
        return true;
    }

    private void setListener() {
        btnLocal.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //TODO : passer à l'activité suivante
                //TODO : fermer celle ci
            }
        });

        btnConnexion.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //TODO : passer à l'activité suivante
                //TODO : fermer celle ci
            }
        });
    }

    private void initialize() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnLocal = (Button) findViewById(R.id.btnLocal);
        btnConnexion = (Button) findViewById(R.id.btnConnexion);
        //accueil = Intent(this, plop.class);

    }
}
