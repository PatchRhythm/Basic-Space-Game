import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 *Created by PatchRhythm on 05/30/2016,
 more info can be found @ https://github.com/PatchRhythm.

 Credits go to:
 RealTutsGML @ https://www.youtube.com/channel/UCOs7Q7IeuzgRyARaEqif75A
 */
    public class Player extends GlobalPosition {

    int velX = 0;
    int velY = 0;

    private String playerimage = "images/playerimage.png";

    private LinkedList<Enemy> e = Controller.getEnemyBounds();

    public Player(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    public void update(){
        x+=velX;
        y+=velY;

        //Collision with outside
        if(x < 0){
            x = 0;
        }
        if(y < 0){
            y = 0;
        }
        if(x > 992){
            x = 992;
        }
        if(y > 736){
            y = 736;
        }

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key==KeyEvent.VK_RIGHT){
            velX = 5;
        }
        else if (key==KeyEvent.VK_LEFT){
            velX = -5;
        }
        else if (key==KeyEvent.VK_DOWN){
            velY = 5;
        }
        else if (key==KeyEvent.VK_UP){
            velY = -5;
        }
    }
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key==KeyEvent.VK_RIGHT){
            velX = 0;
        }
        else if (key==KeyEvent.VK_LEFT){
            velX = 0;
        }
        else if (key==KeyEvent.VK_DOWN){
            velY = 0;
        }
        else if (key==KeyEvent.VK_UP){
            velY = 0;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(getPlayerImage(), x, y, null);

        g2d.draw(getBounds());

    }

    public Image getPlayerImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
        return i.getImage();
    }
}
