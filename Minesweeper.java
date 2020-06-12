package mine;

import java.awt.BorderLayout;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Minesweeper extends JFrame {

    private JLabel statusbar;
    
    public Minesweeper() {

        initUI();
    }
    
    private void initUI() {
    	ImageIcon i = new ImageIcon("D:\\eclipse\\mine\\src\\mine\\smiley.png\\");
        statusbar = new JLabel(i);
        add(statusbar, BorderLayout.NORTH);
        add(new Board(statusbar));

        setResizable(false);
        pack();

        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new Minesweeper();
            ex.setVisible(true);
        });
    }
}
