package com.slgp.gestionprojet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by godef on 09/02/2016.
 */
public class ConnectionDB {
    //String Host, String Port, String db_userid, String db_password
    public Connection dbConnect() {
        try {
            String ConnectionString = "jdbc:jtds:sqlserver://" + "213.186.33.40";// + ":" + R.string.port;
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(ConnectionString, "menkussogwm1isi", "Projetm1");
            //System.out.println("connected");
            return conn;

        } catch (Exception e) {
            //Db_list.add("Error");
            //e.printStackTrace();
        }
        return null;
    }
}
