/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NovelSoft.LMS.Windows;

import com.NovelSoft.LMS.Database.FileConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author joshua
 */
public class Main extends javax.swing.JFrame {
String User;
String CurXML;
String CurLine;
String CurIndex;
    String[][] Dat = new String[0][7];

    /**
     * Creates new form Main
     */
    public void begin() {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        initComponents();

        FileConn User = new FileConn("Users");
        String[] res = User.Find(",");
        String[] Form = new String[res.length];
        for (int i = 0; i < res.length; i++) {
            Form[i] = res[i].split(",")[0];
            System.out.println(Form[i]);
        }
        jList2.setListData(Form);

        FileConn User2 = new FileConn("Resource");
        String[] res2 = User2.Find(",");
        String[] Form2 = new String[res2.length];
        for (int i = 0; i < res2.length; i++) {
            Form2[i] = res2[i].split(",")[0];
            
            System.out.println(Form2[i]);
        }
        jList3.setListData(Form2);

        //jSpinner4,jSpinner5,jSpinner6
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //get current date time with Date()
        Date date = new Date();
        jSpinner4.setValue(Integer.parseInt(dateFormat.format(date).split("/")[0]));
        jSpinner5.setValue(Integer.parseInt(dateFormat.format(date).split("/")[1]));
        jSpinner6.setValue(Integer.parseInt(dateFormat.format(date).split("/")[2]));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Users = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NovelSoft: -- LMS");

        jTabbedPane1.setName("Books"); // NOI18N

        Users.setName("Users"); // NOI18N

        jSplitPane2.setDividerLocation(400);

        jLabel1.setText("Username");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Role");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Resources Taken Out Today");

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 210, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel1);

        jTextField5.setText("jTextField5");

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane2.setRightComponent(jPanel6);

        javax.swing.GroupLayout UsersLayout = new javax.swing.GroupLayout(Users);
        Users.setLayout(UsersLayout);
        UsersLayout.setHorizontalGroup(
            UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        UsersLayout.setVerticalGroup(
            UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        jTabbedPane1.addTab("User", Users);

        jSplitPane3.setDividerLocation(400);

        jLabel8.setText("Resource Name");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setText("Description");

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Days Until Available");

        jLabel14.setText("0");

        jLabel17.setText("Schedule");

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList6.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList6);

        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton3.setText("Reserve");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jButton2))
                .addGap(12, 12, 12))
        );

        jSplitPane3.setLeftComponent(jPanel7);

        jTextField10.setText("jTextField5");

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList3ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane3.setRightComponent(jPanel9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );

        jTabbedPane1.addTab("Resources", jPanel2);

        jMenu1.setText("File");

        jMenuItem4.setText("Properties");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Quit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("User");

        jMenuItem3.setText("New User");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem7.setText("Delete User");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Resources");

        jMenuItem1.setText("New Resource");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Remove Resource");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem6.setText("New Type");
        jMenu3.add(jMenuItem6);

        jMenuItem8.setText("Delete Types");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Settings Button
        PasswordProtect s = new PasswordProtect();
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jList3ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList3ValueChanged
        int index = jList3.getSelectedIndex();
        FileConn User = new FileConn("Resource");
        String[] ress = User.Find(jList3.getSelectedValue().toString());
                CurLine = ress[0];
        System.out.println(ress.length);
        String[] res = ress[0].split(",");
        System.out.println("We got:" + jList3.getSelectedValue().toString());
        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);
        System.out.println(res[3]);
        System.out.println(res.length);
        jTextField6.setText(ress[0].split(",")[0]);
        jTextPane1.setText(ress[0].split(",")[2]);

       //This is where i will do some xml stuff
        String XML = res[3];
        String[] SplitXML = XML.split("<");
        CurXML = XML;
        System.out.println("--XML INFO--");
        System.out.println(SplitXML.length);
        String[][] Data = new String[0][7];//7 because day,month,year,period1,period2,period3,period4
        for (int i = 0; i < SplitXML.length; i++) {
            System.out.println(SplitXML[i]);
            if (SplitXML[i].matches("Date>") && !SplitXML[i].matches("/Date>")) {
                System.out.println("we have a date");
                String[] Date = SplitXML[i + 1].split(">")[0].split("-");//This is just splitting the dateinto 3 parts (day,month,year)
                String[][] temp = new String[Data.length + 1][7];
                for (int t = 0; t < Data.length; t++) {
                    for (int d = 0; d < 7; d++) {
                        temp[t][d] = Data[t][d];

                    }

                }
                System.out.println("Date Gen Below");
                System.out.println(Date[0]);
                System.out.println(Date[1]);
                System.out.println(Date[2]);
                System.out.println("Date Above");
                temp[temp.length - 1][0] = Date[0];
                temp[temp.length - 1][1] = Date[1];
                temp[temp.length - 1][2] = Date[2];
                Data = temp;

            }
            if (SplitXML[i].matches("P1>")) {
                Data[Data.length-1][3] = SplitXML[i + 1];
            }
            if (SplitXML[i].matches("P2>")) {
                Data[Data.length-1][4] = SplitXML[i + 1];
            }
            if (SplitXML[i].matches("P3>")) {
                Data[Data.length-1][5] = SplitXML[i + 1];
            }
            if (SplitXML[i].matches("P4>")) {
                Data[Data.length-1][6] = SplitXML[i + 1];
            }
        }
        for (int i = 0; i < Data.length; i++) {
            if (Data[i][0] == jSpinner4.getValue() && Data[i][1] == jSpinner5.getValue() && Data[i][2] == jSpinner6.getValue()) {
                String[] per = new String[4];
                per[0] = Data[i][0];
                per[1] = Data[i][1];
                per[2] = Data[i][2];
                per[3] = Data[i][3];
                jList6.setListData(per);
            }

        }
        Dat = Data;
        System.out.println(Dat.length);
        System.out.println(Data.length);
        System.out.println(Dat.length);
        for (int i = 0; i < Dat.length; i++) {

            System.out.println("Dates Below");
            System.out.print(jSpinner4.getValue());
            System.out.print(jSpinner5.getValue());
            System.out.println(jSpinner6.getValue());
            System.out.print(Dat[i][0]);
            System.out.print(Dat[i][1]);
            System.out.println(Dat[i][2]);
            String forma = String.valueOf(jSpinner4.getValue()) + String.valueOf(jSpinner5.getValue()) + String.valueOf(jSpinner6.getValue());
            if (forma.matches(Dat[i][0] + Dat[i][1] + Dat[i][2])) {
                System.out.println("Got a Match");
                String[] per = new String[4];
                per[0] = Dat[i][3];
                per[1] = Dat[i][4];
                per[2] = Dat[i][5];
                per[3] = Dat[i][6];
                jList6.setListData(per);
            }

        }

    


    }//GEN-LAST:event_jList3ValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
      int index = jList2.getSelectedIndex();
      FileConn User = new FileConn("Users");
        String[] res = User.Find(jList2.getSelectedValue().toString());
       jTextField1.setText(res[0].split(",")[0]);
       jTextField3.setText(res[0].split(",")[2]);
      
    }//GEN-LAST:event_jList2ValueChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
       System.out.println(Dat.length);
       String[] perf = new String[4];
                 perf[0] = "Open";
                 perf[1] = "Open";
                 perf[2] = "Open";
                 perf[3] = "Open";
               jList6.setListData(perf);
        for(int i = 0; i < Dat.length;i++){
            
           System.out.println("Dates Below");
           System.out.print(jSpinner4.getValue());
           System.out.print(jSpinner5.getValue());
           System.out.println(jSpinner6.getValue());
           System.out.print(Dat[i][0]);
           System.out.print(Dat[i][1]);
           System.out.println(Dat[i][2]);
           String forma = String.valueOf(jSpinner4.getValue()) + String.valueOf(jSpinner5.getValue()) + String.valueOf(jSpinner6.getValue());
           if(forma.matches(Dat[i][0]+Dat[i][1]+Dat[i][2])){
               System.out.println("Got a Match");
               String[] per = new String[4];
               System.out.println(Dat[i][3]);
               System.out.println(Dat[i][4]);
               System.out.println(Dat[i][5]);
               System.out.println(Dat[i][6]);
               per[0] = Dat[i][3];
               per[1] = Dat[i][4];
               per[2] = Dat[i][5];
               per[3] = Dat[i][6];
               jList6.setListData(per);
           }
           
       }
      
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //User is name
        // First format the date
        FileConn Users = new FileConn("Users");
        String[] SplitXML = CurXML.split("<");
        String rDate1 = "<" + String.valueOf(jSpinner4.getValue()) + "|" + String.valueOf(jSpinner5.getValue()) + "|" +  String.valueOf(jSpinner6.getValue()) +">";
        String rDate2 = "</" + String.valueOf(jSpinner4.getValue()) + "|" + String.valueOf(jSpinner5.getValue()) + "|" +  String.valueOf(jSpinner6.getValue()) +">";
        String period1 = "";
        String period2 = "";
        String Name = "<"+ User;
        
        if(jList6.getSelectedIndex() == 0){
            period1 = "<P1>";
            period2 = "</P1><P2><Open</P2><P3><Open</P3><P4><Open</P4>";
            
        }
        if(jList6.getSelectedIndex() == 1){
            period1 = "<P2>";
            period2 = "</P2><P1><Open</P1><P3><Open</P3><P4><Open</P4>";
        }
        if(jList6.getSelectedIndex() == 2){
            period1 = "<P3>";
            period2 = "</P3><P2><Open</P2><P1><Open</P1><P4><Open</P4>";
        }
        if(jList6.getSelectedIndex() == 3){
            period1 = "<P4>";
            period2 = "</P4><P2><Open</P2><P3><Open</P3><P1><Open</P1>";
        }
        String Reserve = period1 + Name + period2;
        //Does the date even exist?
        Boolean Dexist = false;
        for(int i = 0; i < SplitXML.length;i++){
           if(SplitXML[i] == rDate1){
            Dexist = true;
        }
        if(!Dexist){
            String Line = CurLine + "<Date>" + rDate1 + period1 + Name + period2 + rDate2 + "</Date>";
            Users.WriteLine(CurLine, Line);
        }
        if(Dexist){
            String Line = CurLine + "<Date>" + rDate1 + period1 + Name + period2 + rDate2 + "</Date>";
            Users.WriteLine(CurLine, Line);
        }
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String us) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        //</editor-fold>
    String User = us;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Users;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JList jList6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
