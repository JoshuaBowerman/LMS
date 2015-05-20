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
public class NormalRun {

    static void Begin() {
        com.NovelSoft.LMS.Windows.Main mScreen = new com.NovelSoft.LMS.Windows.Main();
        mScreen.begin();
        mScreen.setVisible(true);
        System.out.println("Got To End");
    }
    
}
