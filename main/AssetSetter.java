package main;

import object.OBJ_Door;
import object.OBJ_Hole;
import tile.TileManager;
public class AssetSetter {
    GamePanel gp;
        
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setObject(){
        gp.obj[0] = new OBJ_Hole();
        gp.obj[0].worldX = 9 * gp.tileSize;
        gp.obj[0].worldY = 9 * gp.tileSize;

        gp.obj[1] = new OBJ_Hole();
        gp.obj[1].worldX = 12 * gp.tileSize;
        gp.obj[1].worldY = 12 * gp.tileSize;

        gp.obj[2] = new OBJ_Hole();
        gp.obj[2].worldX = 15 * gp.tileSize;
        gp.obj[2].worldY = 12 * gp.tileSize;

        gp.obj[3] = new OBJ_Hole();
        gp.obj[3].worldX = 13 * gp.tileSize;
        gp.obj[3].worldY = 16 * gp.tileSize;

        gp.obj[4] = new OBJ_Hole();
        gp.obj[4].worldX = 18 * gp.tileSize;
        gp.obj[4].worldY = 12 * gp.tileSize;

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX = 15 * gp.tileSize;
        gp.obj[5].worldY = 18 * gp.tileSize;

        gp.obj[6] = new OBJ_Hole();
        gp.obj[6].worldX = 11 * gp.tileSize;
        gp.obj[6].worldY = 23 * gp.tileSize;

        gp.obj[7] = new OBJ_Hole();
        gp.obj[7].worldX = 8 * gp.tileSize;
        gp.obj[7].worldY = 25 * gp.tileSize;

        gp.obj[8] = new OBJ_Hole();
        gp.obj[8].worldX = 13 * gp.tileSize;
        gp.obj[8].worldY = 28 * gp.tileSize;

        gp.obj[9] = new OBJ_Hole();
        gp.obj[9].worldX = 21 * gp.tileSize;
        gp.obj[9].worldY = 26 * gp.tileSize;

        gp.obj[10] = new OBJ_Hole();
        gp.obj[10].worldX = 17 * gp.tileSize;
        gp.obj[10].worldY = 30 * gp.tileSize;

        gp.obj[11] = new OBJ_Door();
        gp.obj[11].worldX = 15 * gp.tileSize;
        gp.obj[11].worldY = 31 * gp.tileSize;

        
        
    }
}
