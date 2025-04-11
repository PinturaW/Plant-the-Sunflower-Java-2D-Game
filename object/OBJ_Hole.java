package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Hole extends SuperObject{
    public OBJ_Hole(){
        name = "Hole";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/obj/hole.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
