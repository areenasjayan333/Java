/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdemo;

import javax.swing.*;
public class MyFrame extends JFrame{
    AppletDemo appletDemo = new AppletDemo();
    public MyFrame(){
        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(appletDemo);
        this.setVisible(true);
    }
}

