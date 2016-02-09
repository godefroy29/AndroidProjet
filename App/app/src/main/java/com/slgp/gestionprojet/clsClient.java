package com.slgp.gestionprojet;

import android.os.Bundle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by godef on 09/02/2016.
 */
public class clsClient {

    private Connection conn;

    public clsClient(){
        this.conn = new clsConnection().dbConnect();
    }

    public ArrayList<clsItemClient> getListClient(){
        ArrayList<clsItemClient> myList = null;
        try{
            Statement statement = conn.createStatement();
            String strSql = "select * ";
            strSql = strSql + "from T_Client;";
            ResultSet rs = statement.executeQuery(strSql);
            myList = new ArrayList<clsItemClient>();
            int i = 1;
            while (rs.next()) {
                myList.add((clsItemClient)rs.getObject(i));
                i++;
            }
        }catch(Exception e){

        }
        return myList;
    }
}
