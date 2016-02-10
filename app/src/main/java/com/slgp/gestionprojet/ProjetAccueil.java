package com.slgp.gestionprojet;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.BaseColumns;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProjetAccueil extends Activity {

    private ProgressBar mProgressBar;
    private Button mButton;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

            StrictMode.enableDefaults();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projet_accueil);


        // On récupère les composants de notre layout
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar2);
        mButton = (Button) findViewById(R.id.button);

        // On met un Listener sur le bouton
        mButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                BigCalcul calcul=new BigCalcul();
                calcul.execute();
            }
        });
    }
    private class BigCalcul extends AsyncTask<Void, Integer, Void>
    {

        String strResult ="";
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(getApplicationContext(), "Début du traitement asynchrone", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onProgressUpdate(Integer... values){
            super.onProgressUpdate(values);
            // Mise à jour de la ProgressBar
            mProgressBar.setProgress(values[0]);
        }

        @Override
        protected Void doInBackground(Void... arg0) {

            int progress;
            try{
                Connection conn;
                Class.forName("org.postgresql.Driver");
                String url;//phppgadmin.ovh.net:5432
                url = "jdbc:postgresql://213.186.33.40:5432/menkussogwm1isi.postgresql.db" +
                        "?sslfactory=org.postgresql.ssl.NonValidatingFactory" +
                        "&ssl=true";
                conn = DriverManager.getConnection(url,"menkussogwm1isi","Projetm1" ) ;
                String sql = "SELECT * FROM T_CLIENT;";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                strResult = rs.getString(2);
                rs.close();
                st.close();
                //strResult = "true";
            }catch (Exception e){
                strResult = e.getMessage();
            }


            for (progress=0;progress<=100;progress++)
            {


                //la méthode publishProgress met à jour l'interface en invoquant la méthode onProgressUpdate
                publishProgress(progress);
                progress++;
            }



            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            TextView tv = (TextView) findViewById(R.id.textView2);
            tv.setText(strResult);
            Toast.makeText(getApplicationContext(), strResult, Toast.LENGTH_LONG).show();
        }
    }
}

