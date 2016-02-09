package com.slgp.gestionprojet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by godef on 09/02/2016.
 */
public class ClientDB {

    private ConnectionDB conn;

    public ClientDB(){
        this.conn = new ConnectionDB();
    }

    public ArrayList<ItemClientDB> getListClient(){
        ArrayList<ItemClientDB> myList = null;
        try{
            conn.dbConnect();
            Statement statement = conn.conn.createStatement();
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
        conn.dbClose();
        return myList;
    }

    public String getNbClient(){
        ArrayList<ItemClientDB> myList = null;
        try{
            conn.dbConnect();
            Statement statement = conn.conn.createStatement();
            String strSql = "select * from T_Client;";
            ResultSet rs = statement.executeQuery(strSql);
            conn.dbClose();
            return "Done";
        }catch(Exception e){
            return "Fail";
        }


    }
}
