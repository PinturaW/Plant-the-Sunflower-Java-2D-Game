package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import object.OBJ_Sunflower;

public class UI extends JFrame{
    GamePanel gp;
    Font arial_40;
    BufferedImage keyImage;
    public static boolean gameFinished = false;
    public static double playTime;
    public int t=0;
    protected String time;
    DecimalFormat dFormat = new DecimalFormat("#0");
    public UI(GamePanel gp){
        this.gp = gp;
        arial_40 = new Font("Arial", Font.PLAIN, 40);
        OBJ_Sunflower flower = new OBJ_Sunflower();
        keyImage = flower.image;
    }
    public void draw(Graphics2D g2){
        if(gameFinished == false){
            if(t < 120){
            JPanel panel = new JPanel();
            panel.setBounds(38, 34, 133, 92);
            g2.setFont(arial_40);
            g2.setColor(Color.black);
            g2.drawString("Flower = "+ gp.player.hasFlower,512,100);
            playTime +=(double)1/60;
            
            time = dFormat.format(playTime);
            g2.drawString("Time:"+time, 512,50);
            // System.out.println(time);
            t = Integer.parseInt(time);
            }
            if(t >= 120){
                gp.gameState = gp.pauseState;
                drawGameOverScreen(g2);
            }
        }
        else{
            success(g2);
        }
    }
    public void drawGameOverScreen(Graphics2D g2){
        g2.setColor(new Color(0,0,0,150));
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 110f));

        text = "Game Over";
        g2.setColor(Color.black);
        x = gp.tileSize*2;
        y = gp.tileSize*4;
        g2.drawString(text, x, y);
        g2.setColor(Color.white);
        g2.drawString(text, x-4, y-4);

        g2.setFont(g2.getFont().deriveFont(50f));


    }
    public void success(Graphics2D g2){
        g2.setColor(new Color(0,0,0,150));
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 110f));

        text = "Stage Clear!!!";
        g2.setColor(Color.black);
        x = gp.tileSize*2;
        y = gp.tileSize*4;
        g2.drawString(text, x, y); 
        g2.setColor(Color.white);
        g2.drawString(text, x-4, y-4);

        g2.setFont(g2.getFont().deriveFont(50f));

    }
}
