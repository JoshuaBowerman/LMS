/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NovelSoft.LMS.Initialization.Run;

/**
 *
 * @author joshua
 */
public class InitRun {
    public static void main(String[] args){
        
        //This is the beggining of the program
        //Find out if we are first run
         if (com.NovelSoft.LMS.Initialization.Settings.getIsFirstRun()){
           //FirstRun.Begin();
             //@depricated
             NormalRun.Begin();
         }else{
           NormalRun.Begin();
         }
    }
}
