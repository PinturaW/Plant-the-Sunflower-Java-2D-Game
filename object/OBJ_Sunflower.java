package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Sunflower extends SuperObject{
    public OBJ_Sunflower(){
        name = "Sunflower";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/obj/sunflower.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
