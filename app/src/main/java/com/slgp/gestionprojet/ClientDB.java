package com.slgp.gestionprojet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by godef on 09/02/2016.
 */
public class ClientDB {

    private Connection conn;

    public ClientDB(){
        this.conn = new ConnectionDB().dbConnect();
    }

    public ArrayList<ItemClientDB> getListClient(){
        ArrayList<ItemClientDB> myList = null;
        try{
            Statement statement = conn.createStatement();
            String strSql = "select * ";
            strSql = strSql + "from T_Client;";
            ResultSet rs = statement.executeQuery(strSql);
            myList = new ArrayList<ItemClientDB>();
            int i = 1;
            while (rs.next()) {
                myList.add((ItemClientDB)rs.getObject(i));
                i++;
            }
        }catch(Exception e){

        }
        return myList;
    }
}
