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
import static com.NovelSoft.LMS.Initialization.Settings.settingsLocation;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joshua
 */
public class FileConn {

    private String DB;
    private Connection Connec;
    FileReader sFile = null;
    String FilLoc;

    public FileConn(String File) {
FilLoc = File;
        try {
            //We are going to be refernecing one line at a time
            String line = null;
            sFile = new FileReader("./" + File);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());//We are first run

        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void WriteLine(String CurrLine, String NewLine) {
        String[] Temp = new String[0];
        String[] TempFile = new String[0];
        BufferedReader sBuff = new BufferedReader(sFile);
        String line;
        try {
            while ((line = sBuff.readLine()) != null) {//go through all the and put them in the new array
                
                if (line.contains(CurrLine)) {
                    //skip the line when we find it to add it again at the end of the file
                } else {
                    Temp = new String[Temp.length + 1];
                    for (int i = 0; i < Temp.length - 1; i++) {
                        Temp[i] = TempFile[i];
                        
                    }
                    Temp[Temp.length - 1] = line;
                    TempFile = Temp;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FileConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        Temp = new String[Temp.length + 1];
        for (int i = 0; i < Temp.length - 1; i++) {
            Temp[i] = TempFile[i];

        }
        Temp[Temp.length - 1] = NewLine;
        TempFile = Temp;
        try {
            PrintWriter writer = new PrintWriter(FilLoc, "UTF-8");
            for(int i = 0; i < Temp.length;i++){
                writer.println(Temp[i]);
            }
            writer.println(NewLine);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public String[] Find(String Key) {
        String[] result = new String[0];
        try {
            //This is to pull from files
            BufferedReader sBuff = new BufferedReader(sFile);//to pull full lines

            String line = null;
            while ((line = sBuff.readLine()) != null) {//go through all the lines until we find it

                if (line.contains(Key)) {
                    String[] tempr = new String[result.length + 1];
                    for (int i = 0; i < tempr.length - 1; i++) {
                        tempr[i] = result[i];
                    }
                    tempr[tempr.length - 1] = line;
                    System.out.println("We Found: " + line);

                    result = tempr;
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(FileConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
