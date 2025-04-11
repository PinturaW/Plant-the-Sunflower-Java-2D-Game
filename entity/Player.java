package entity;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.YearMonth;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;
import main.Map;
import object.OBJ_Sunflower;
import tile.TileManager;
import main.UI;
import main.Map;
public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;
    public int hasFlower = 5;
    
    public final int screenX;
    public final int screenY;

    public Player(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);
        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 16;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 32;
        solidArea.height = 32;
        worldX = 345;
        worldY = 400;
        setDefaultValue();
        getPlayerImage();
    }
    public void setDefaultValue(){
        worldX = 380;
        worldY = 350;
        speed = 4;
        direction = "down";
    }
    public void getPlayerImage(){
        try{
            up1 = ImageIO.read(getClass().getResourceAsStream("/res/player/cat_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/res/player/cat_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/res/player/cat_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/res/player/cat_down_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/res/player/cat_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/res/player/cat_left_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/res/player/cat_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/res/player/cat_right_2.png"));

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void update(){
        if(keyH.upPressed == true || keyH.downPressed == true || keyH.rightPressed == true || keyH.leftPressed == true){
        if(keyH.upPressed == true){
            direction = "up";
            
        }
        else if(keyH.downPressed == true){
            direction = "down";
            
        }
        else if(keyH.leftPressed == true){
            direction = "left";
            
        }
        else if(keyH.rightPressed == true){
            direction = "right";
            
        }
        collisionOn =false;
        gp.cChecker.checkTile(this);

        int objIndex = gp.cChecker.checkObject(this, true);
        pickUpObject(objIndex);
        // IF Collision is false
        if(collisionOn == false){
            switch(direction){
                case "up":
                    worldY -= speed;
                    break;
                case "down":
                    worldY += speed;
                    break;
                case "left":
                    worldX -= speed;
                    break;
                case "right":
                    worldX += speed;
                    break;
            }
        }
    }
    }
    public void pickUpObject(int i){
        if(i != 999){
            String objectName = gp.obj[i].name;
            System.out.println(objectName);
            switch (objectName) {
            case "Hole":
                if(hasFlower > 0){
                    hasFlower--;
                    System.out.println(i);
                    if(i == 0){
                        gp.obj[12] = new OBJ_Sunflower();
                        gp.obj[12].worldX = 9 * gp.tileSize;
                        gp.obj[12].worldY = 9 * gp.tileSize;
                        
                    }
                    if(i == 1){
                        gp.obj[13] = new OBJ_Sunflower();
                        gp.obj[13].worldX = 12 * gp.tileSize;
                        gp.obj[13].worldY = 12 * gp.tileSize;
                    }
                    if(i == 2){
                        gp.obj[14] = new OBJ_Sunflower();
                        gp.obj[14].worldX = 15 * gp.tileSize;
                        gp.obj[14].worldY = 12 * gp.tileSize;
                    }
                    if(i == 3){
                        gp.obj[15] = new OBJ_Sunflower();
                        gp.obj[15].worldX = 13 * gp.tileSize;
                        gp.obj[15].worldY = 16 * gp.tileSize;
                    }
                    if(i == 4){
                        gp.obj[16] = new OBJ_Sunflower();
                        gp.obj[16].worldX = 18 * gp.tileSize;
                        gp.obj[16].worldY = 12 * gp.tileSize;
                    }
                    if(i == 5){
                        gp.obj[17] = new OBJ_Sunflower();
                        gp.obj[17].worldX = 15 * gp.tileSize;
                        gp.obj[17].worldY = 18 * gp.tileSize;
                    }
                    if(i == 6){
                        gp.obj[18] = new OBJ_Sunflower();
                        gp.obj[18].worldX = 11 * gp.tileSize;
                        gp.obj[18].worldY = 23 * gp.tileSize;
                    }
                    if(i == 7){
                        gp.obj[19] = new OBJ_Sunflower();
                        gp.obj[19].worldX = 8 * gp.tileSize;
                        gp.obj[19].worldY = 25 * gp.tileSize;
                    }
                    if(i == 8){
                        gp.obj[20] = new OBJ_Sunflower();
                        gp.obj[20].worldX = 13 * gp.tileSize;
                        gp.obj[20].worldY = 28 * gp.tileSize;
                    }
                    if(i == 9){
                        gp.obj[21] = new OBJ_Sunflower();
                        gp.obj[21].worldX = 21 * gp.tileSize;
                        gp.obj[21].worldY = 26 * gp.tileSize;
                    }
                    if(i == 10){
                        gp.obj[22] = new OBJ_Sunflower();
                        gp.obj[22].worldX = 17 * gp.tileSize;
                        gp.obj[22].worldY = 30 * gp.tileSize;
                    }
                }
                break;
            case "Door":
                if(hasFlower == 0 && i == 5 && objectName == "Door"){
                   gp.obj[i] = null;
                   UI.playTime = 0;
                   hasFlower = 5;
                }
                if(hasFlower == 0 && i == 11 && objectName == "Door"){
                    UI.gameFinished = true;
                 }
                break;
            }
        }
    }
    public void draw(Graphics2D g2){
        // g2.setColor(Color.white);

        // g2.fillRect(x, y, gp.tileSize, gp.tileSize);
        BufferedImage image = null;

        switch(direction){
            case "up":
                image = up1;
                break;
            case "down":
                image = down1;
                break;
            case "left":
                image = left1;
                break;
            case "right":
                image = right1;
                break;
        }
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
    }
}
