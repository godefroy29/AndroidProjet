package com.slgp.gestionprojet;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;

public class SplashScreen extends Activity {

    private ProgressBar progressBar;
    private Button btnlocal;
    private Button btnConnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        initialize();

        setListener();
    }

    private void setListener() {

    }

    private void initialize() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnlocal = (Button) findViewById(R.id.btnLocal);
        btnConnexion = (Button) findViewById(R.id.btnConnexion);

    }
}
