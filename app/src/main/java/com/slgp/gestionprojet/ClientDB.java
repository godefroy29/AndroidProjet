package com.slgp.gestionprojet;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by godef on 09/02/2016.
 */
public class ClientDB {

    private ConnectionDB connection;

    public ClientDB(){
        this.connection = new ConnectionDB();
    }
/*
    public ArrayList<ItemClientDB> getListClient(){
        ArrayList<ItemClientDB> myList = null;
        try{
            connection.dbConnect();
            Statement statement = connection.conn.createStatement();
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
        connection.dbClose();
        return myList;
    }*/

    public String getNbClient(){
        ArrayList<ItemClientDB> myList = null;
        String str="-2";
        try{
            connection.execute();
            str = connection.test;
            /*Statement statement = connection.conn.createStatement();
            str = "3";
            String strSql = "select * from T_Client;";
            ResultSet rs = statement.executeQuery(strSql);
            str = "4";
            connection.dbClose();
            str = "done";*/
        }catch(Exception e){

        }
        return str;


    }
}
