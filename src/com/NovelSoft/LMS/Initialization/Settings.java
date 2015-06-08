/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NovelSoft.LMS.Initialization;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joshua
 */
public class Settings {
    public static String[] Arguments = null;

    public static String settingsLocation = "./settings.conf";//This is so that it is easy to change the path of the settings file.
    //
    //
    //
    //
    //
    //This Class is no longer used as preferances are no longer needed
    //
    //
    //
    //
    //
    //
     
    
    
    
    
    
    
    //This class will contain the settings that are used to load all preferences
    @Deprecated
    private static String pullFromSettings(String key) {//This should only be used by inernal methods.
        FileReader sFile = null;
        try {
            //We are going to be refernecing one line at a time
            String line = null;
            sFile = new FileReader(settingsLocation);
            BufferedReader sBuff = new BufferedReader(sFile);//to pull full lines

            while ((line = sBuff.readLine()) != null) {//go through all the settings until we find it

                if (line.startsWith(key)) {
                    String[] keyProper = line.split(key + "=");//split it so that we have the part without the beggining
                    System.out.println(keyProper[1]);//Testing
                    return keyProper[1];//this contains the pare after the key
                }
            }
            return null;//It's not in the file
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());//We are first run
            return null;

        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;//we are first run

    }
    @Deprecated
    public static boolean getIsFirstRun() {//returns whether or not this is the first time the application has been run on this machine
        String FRun = pullFromSettings("FRun");
        if (FRun == "False") {
            return false;
        } else {
            return true;
        }

    }

    public static String getDBLocation() {//Returns the location of the DB server (127.0.0.1) is the location if this machine is the server
        String DB = pullFromSettings("DBLocation");
        return DB;
    }
    @Deprecated
    public static String getDBUser() {//Returns the location of the DB server (127.0.0.1) is the location if this machine is the server
        String DB = pullFromSettings("DBUser");
        return DB;
    }
    @Deprecated
    public static String getDBPass() {//Returns the location of the DB server (127.0.0.1) is the location if this machine is the server
        String DB = pullFromSettings("DBPassword");
        return DB;
    }
    @Deprecated
    public static void setProgramArgs(String[] Args) {//Returns the location of the DB server (127.0.0.1) is the location if this machine is the server
        Arguments = Args;
    }
}
