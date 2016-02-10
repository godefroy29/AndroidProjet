package com.slgp.gestionprojet;

import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by godef on 09/02/2016.
 */
/*public class ConnectionDB extends AsyncTask<Void, Void, Void> {
   public Connection conn;
    public String test;
    public void dbConnect() {
        try {

            //String ConnectionString = "jdbc:jtds:sqlserver://213.186.33.40:5432;" + ""
            //        + "databaseName=menkussogwm1isi.postgresql.db;"
            //        + "user=menkussogwm1isi;"
            //        + "password=Projetm1;";
            test = "-1";
            Class.forName("org.postgresql.Driver");
            test = "0";
            String url;//phppgadmin.ovh.net
            url = "jdbc:postgresql://213.186.33.40:5432/menkussogwm1isi.postgresql.db";
            conn = DriverManager.getConnection(url,"menkussogwm1isi","Projetm1" ) ;
            test = "1";
            String sql = "SELECT * FROM T_CLIENT;";
            Statement st = conn.createStatement();
            test = "2";
            ResultSet rs = st.executeQuery(sql);
            test = rs.getString(2);
            rs.close();
            st.close();


        }catch (Exception e) {
            test = e.toString();
        }
    }

    public void dbClose(){
        try {
            conn.close();
        } catch (SQLException e) {

        }
    }

    @Override
    protected Void doInBackground() {
        try {

            test = "-1";
            Class.forName("org.postgresql.Driver");
            test = "0";
            String url;//phppgadmin.ovh.net
            url = "jdbc:postgresql://213.186.33.40:5432/menkussogwm1isi.postgresql.db";
            conn = DriverManager.getConnection(url,"menkussogwm1isi","Projetm1" ) ;
            test = "1";
            String sql = "SELECT * FROM T_CLIENT;";
            Statement st = conn.createStatement();
            test = "2";
            ResultSet rs = st.executeQuery(sql);
            test = rs.getString(2);
            rs.close();
            st.close();

        }catch (Exception e) {
            test = e.toString();
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Void... progress) {

    }

    @Override
    protected void onPostExecute(Void result) {

    }
}*/

public class ConnectionDB extends AsyncTask<Void, Integer, Void>
{

    public String test = "0";
    public EditText eT;
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Integer... values){
        super.onProgressUpdate(values);
        // Mise à jour de la ProgressBar
        //mProgressBar.setProgress(values[0]);
    }

    @Override
    protected Void doInBackground(Void... arg0) {

        int progress;
        for (progress=0;progress<=100;progress++)
        {
            for (int i=0; i<1000000; i++){}
            //la méthode publishProgress met à jour l'interface en invoquant la méthode onProgressUpdate
            publishProgress(progress);
            progress++;
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void result) {
        //Toast.makeText(getApplicationContext(), "Le traitement asynchrone est terminé", Toast.LENGTH_LONG).show();
        test = "1";
        eT.setText("JobDone");
    }
}
