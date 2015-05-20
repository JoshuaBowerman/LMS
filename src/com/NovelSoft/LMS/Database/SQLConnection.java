/*
 * resultsets are what is returned from the functions in this class, they are
 * an araay in a way as you can do 
 * Resultset r;
 * r.getString(1)// this will get the string value of the first result, it works
 * with many other types of values
 * getResultSet needs the filter which is what you are looking for exactly,
 * you can use wildcards (*), it also needs the name of the field you are looking for.
 * it returns a resultset.
*
*          Implementation is not complete but you can make tables with mysql on localhost. the whole class is an objet that needs the name of the table when you initialize it.
*
 */
package com.NovelSoft.LMS.Database;

import com.NovelSoft.LMS.Initialization.Settings;
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

        
        try {
            Conn = DriverManager.getConnection(Settings.getDBLocation(), Settings.getDBUser(), Settings.getDBPass());
            Connec = Conn;
        } catch (Exception e) {
            System.out.println("ERR:" + e.getMessage());
        }
    }
//Res 
  
    
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
