/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        //window variables
        int tileSize= 32;
        int rows= 16;
        int columns= 16;
        int boardWidth= tileSize * columns; // 32 * 16 = 512 px
        int boardHeight= tileSize * rows; // 32 *16 = 512 px
        
        JFrame frame= new JFrame("Space Invaders");
       // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SpaceInvaders spaceInvaders= new SpaceInvaders();
        frame.add(spaceInvaders);
        frame.pack();
        spaceInvaders.requestFocus();
        frame.setVisible(true);
    }
}
