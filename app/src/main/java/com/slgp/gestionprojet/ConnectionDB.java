package com.slgp.gestionprojet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by godef on 09/02/2016.
 */
public class ConnectionDB {
   public Connection conn;
    public void dbConnect() {
        try {

            //String ConnectionString = "jdbc:jtds:sqlserver://213.186.33.40:5432;" + ""
            //        + "databaseName=menkussogwm1isi.postgresql.db;"
            //        + "user=menkussogwm1isi;"
            //        + "password=Projetm1;";
            Class.forName("org.postgresql.Driver");
            String url;//phppgadmin.ovh.net
            url = "jdbc:postgresql://213.186.33.40:5432/menkussogwm1isi.postgresql.db" +
            "?sslfactory=org.postgresql.ssl.NonValidatingFactory" +
            "&ssl=true" ;
            conn = DriverManager.getConnection(url,"menkussogwm1isi","Projetm1" ) ;


        } catch (Exception e) {

        }
    }

    public void dbClose(){
        try {
            conn.close();
        } catch (SQLException e) {

        }
    }
}
