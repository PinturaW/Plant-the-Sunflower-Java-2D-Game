package main;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main {

    JButton jb1;
    JLabel l1;

    public Main() {
        JFrame frame = new JFrame("Plant the sunflower");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        JLabel l1 = new JLabel("Plant the Sunflower 🌻");
        l1.setBounds(175, 100, 300, 50);
        l1.setFont(new Font("Serif", Font.PLAIN, 24));

        frame.add(l1);

        JLabel l2 = new JLabel("Let's plant the sunflower with your cat");
        l2.setBounds(150, 150, 300, 50);
        l2.setFont(new Font("Serif", Font.PLAIN, 18));

        frame.add(l2);
        jb1 = new JButton("Start");
        jb1.setBounds(200, 300, 180, 30);
        jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
                Map map = new Map();
                map.setVisible(true);
                map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
        frame.add(jb1);
        jb1 = new JButton("Quit");
        jb1.setBounds(200, 350, 180, 30);
        jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
			}
		});
        frame.add(jb1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600, 500);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new Main();
    }
}