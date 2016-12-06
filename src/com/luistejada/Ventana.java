package com.luistejada;

import javax.swing.*;
import java.awt.*;

/**
 * Created by luistejada on 06/12/16.
 */
public class Ventana extends JFrame {

    public Ventana(int sizeX, int sizeY) {

        setTitle("Juego de parchis");
        setSize(sizeX, sizeY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("/Volumes/Datos/Work/Parche/src/res/parchis800x600.png")));
        setLayout(new FlowLayout());
        setSize(sizeX-1,sizeY-1);
        setSize(sizeX,sizeY);
    }
}
