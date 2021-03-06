package Resources;

import javax.imageio.ImageIO;
import javax.swing.*;

import Main.GameSetUp;
import UI.UIObject;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by AlexVR on 7/1/2018.
 */

/*
 * Here we add sprites/animations, and crop them (use paint to find coordinates), 
 */
public class Images {


    public static BufferedImage[] butstart;
    public static BufferedImage title;
    public static BufferedImage Pause;
    public static BufferedImage GameOver;
    public static BufferedImage[] Resume;
    public static BufferedImage[] BTitle;
    public static BufferedImage[] Options;
    public static ImageIcon icon;
    public static String str;
    public static BufferedImage icon2;

    public static SpriteSheet playerSheet;
    public static SpriteSheet playerSheet2;
    public static SpriteSheet treesheet;
    public static BufferedImage[] Player;
    public static BufferedImage[] Turtle;
    public static SpriteSheet WaterSheet;
    public static BufferedImage[] Water;


    public static BufferedImage player;
    
    public static BufferedImage grassArea;
    public static BufferedImage waterArea;
    public static BufferedImage emptyArea;
    public static BufferedImage lilly;
    public static BufferedImage log;
    public static BufferedImage grass;
    public static BufferedImage trees;
    
    public static BufferedImage truck;
    public static BufferedImage car_1;
    public static BufferedImage car_2;

    public static BufferedImage[] object;


    public Images() {

        butstart = new BufferedImage[3];
        Resume = new BufferedImage[2];
        BTitle = new BufferedImage[2];
        Options = new BufferedImage[2];
        Player = new BufferedImage[8];
        Turtle = new BufferedImage[20];
        Water = new BufferedImage[3];
        object = new BufferedImage[6];

        try {
            playerSheet2 = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/gameSprites2.png")));
            playerSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/gameSprites.png")));
            treesheet =  new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/trees.png")));
            WaterSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/water.png")));

            title = ImageIO.read(getClass().getResourceAsStream("/Sheets/Frogger2.png"));
            Pause = ImageIO.read(getClass().getResourceAsStream("/Buttons/Pause.png"));
            GameOver = ImageIO.read(getClass().getResourceAsStream("/Buttons/gameover.png"));
            Resume[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/ResumeButton.png"));
            Resume[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/ResumeButton2.png"));
            BTitle[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/TitleButton.png"));
            BTitle[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/TitleButton2.png"));
            Options[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/OptionsButton.png"));
            Options[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/OptinsButton2.png"));
            butstart[0]= ImageIO.read(getClass().getResourceAsStream("/Buttons/StartButton.png"));//normbut
            butstart[1]= ImageIO.read(getClass().getResourceAsStream("/Buttons/Startbutton2.png"));//hoverbut
            butstart[2]= ImageIO.read(getClass().getResourceAsStream("/Buttons/StartButton3.png"));//clickbut
            
            Player[0]= playerSheet.crop(0,30,52,39);
            Player[1]= playerSheet.crop(53,25,59,46);
            Player[2]= playerSheet.crop(114,20,56,51);
            Player[3]= playerSheet.crop(173,9,53,64);
            Player[4]= playerSheet.crop(230,2,54,73);
            Player[5]= playerSheet.crop(229,1,56,75);
            Player[6]= playerSheet.crop(285,18,59,54);
            Player[7]= playerSheet.crop(0,30,52,39);
            
            // emerges
            Turtle[0] = playerSheet2.crop(502, 88, 71, 57);
            Turtle[1] = playerSheet2.crop(447, 88, 71, 57);
            Turtle[2] = playerSheet2.crop(379, 88, 71, 57);
            
            Turtle[3] = playerSheet2.crop(403, 10, 71, 58);
            Turtle[4] = playerSheet2.crop(479, 8, 71, 62);
            
            Turtle[5] = playerSheet2.crop(7, 82, 71, 68);
            Turtle[6] = playerSheet2.crop(79, 82, 72, 68);
            Turtle[7] = playerSheet2.crop(153, 83, 71, 66);
            
            Turtle[8] = playerSheet2.crop(228, 88, 72, 57);
            Turtle[9] = playerSheet2.crop(300, 88, 71, 57);
            Turtle[10] = playerSheet2.crop(403, 10, 71, 58);
            
            Turtle[11] = playerSheet2.crop(479, 8, 71, 62);
            Turtle[12] = playerSheet2.crop(7, 82, 71, 68);
            Turtle[13] = playerSheet2.crop(79, 82, 72, 68);
            

            Turtle[14] = playerSheet2.crop(153, 83, 71, 66);
            Turtle[15] = playerSheet2.crop(228, 88, 72, 57);
            Turtle[16] = playerSheet2.crop(300, 88, 71, 57);
            
            // sinks
            Turtle[17] = playerSheet2.crop(379, 88, 71, 57);
            Turtle[18] = playerSheet2.crop(447, 88, 71, 57);
            Turtle[19] = playerSheet2.crop(502, 88, 71, 57);

            Water[0]= WaterSheet.crop(0,0,32,32);
            Water[1]= WaterSheet.crop(32,0,32,32);
            Water[2]= WaterSheet.crop(64,0,32,32);


            lilly = playerSheet.crop(6,170,61,55);
            trees = treesheet.crop(0,0,360,482);
            log = playerSheet.crop(387,259,184,57);
            
            truck = playerSheet.crop(202, 402, 287, 69);
            car_1 = playerSheet.crop(156, 481, 135, 76);
            car_2 = playerSheet.crop(10, 481, 129, 73);
            
            object[0] = ImageIO.read(getClass().getResourceAsStream("/Sheets/Objects/object1.png"));
            object[1] = ImageIO.read(getClass().getResourceAsStream("/Sheets/Objects/object2.png"));
            object[2] = ImageIO.read(getClass().getResourceAsStream("/Sheets/Objects/object3.png"));
            object[3] = ImageIO.read(getClass().getResourceAsStream("/Sheets/Objects/object4.png"));
            object[4] = ImageIO.read(getClass().getResourceAsStream("/Sheets/Objects/object5.png"));
            object[5] = ImageIO.read(getClass().getResourceAsStream("/Sheets/Objects/object6.png"));
            str = GameSetUp.str;

            icon =  new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/Sheets/froggy.png")));
            
            player = ImageIO.read(getClass().getResourceAsStream("/Sheets/froggy.png"));
            grass = ImageIO.read(getClass().getResourceAsStream("/Sheets/grass.jpg"));

            grassArea = ImageIO.read(getClass().getResourceAsStream("/Sheets/grassArea.png"));
            waterArea = ImageIO.read(getClass().getResourceAsStream("/Sheets/waterArea.png"));
            //emptyArea = ImageIO.read(getClass().getResourceAsStream("/Sheets/sand.jpg"));
            emptyArea = playerSheet.crop(314, 158, 84, 84);

            
        }catch (IOException e) {
        e.printStackTrace();
    }


    }

    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(Images.class.getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}
