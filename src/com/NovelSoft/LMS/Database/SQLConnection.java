/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NovelSoft.LMS.Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joshua
 */
public class SQLConnection {

    private String DB;
    private Connection Connec;

    public SQLConnection(String DBName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection Conn = null;
        Driver driv = null;

        DB = DBName;
        String user = "Median";
        String passwd = "Average";
        try {
            Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "Median", "Average");
            Connec = Conn;
        } catch (Exception e) {
            System.out.println("ERR:" + e.getMessage());
        }
    }

    public ResultSet getResSet(String Filter, String FiltField) {
        ResultSet ResSet = null;
        Statement Stat = null;
        try {
            System.out.println("INFO:" + "SELECT * FROM " + DB + " WHERE " + FiltField + " LIKE '" + Filter + "';");
            ResSet = Connec.prepareStatement("SELECT * FROM " + DB + " WHERE " + FiltField + " LIKE '" + Filter + "';").executeQuery();

        } catch (Exception e) {
            System.out.println("ERR:" + e.getMessage());
        }
        return ResSet;
    }
    

}
