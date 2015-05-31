/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NovelSoft.LMS.Initialization;

import java.io.FileWriter;

/**
 *
 * @author joshua
 */
public class Default {
    private final String DefSettings[] = {
        "## This is an Automatic Settings File, Please edit though the settings menu only",
        "DBLocation=127.0.0.1",
        "DBUser=Median",
        "DBPass=Average",
        "FRun=False"  
        
    };
    private final String DefSettingsLoc = "settings.conf";
    
    
    
    
    public void initSettings(){
        try{
            java.io.File s = new java.io.File(DefSettingsLoc);
            s.delete();
            s.createNewFile();
            System.out.println(s.exists());
        }catch(Exception e){
            
        }
        //this is for the first gen of the settings file
        try{
            FileWriter wFile = new FileWriter(DefSettingsLoc);
            
            for(int i=0;i<DefSettings.length;i++){
                wFile.write(DefSettings[i]);
                wFile.write("\n");
            }
            wFile.close();
            
            
            
            
            
            
            
            
        }catch(Exception e){
            
        }
        
    } 
    
}
