import javax.swing.*;
import java.awt.*;

/**
 *Created by PatchRhythm on 05/30/2016,
 more info can be found @ https://github.com/PatchRhythm.

 Credits go to:
 RealTutsGML @ https://www.youtube.com/channel/UCOs7Q7IeuzgRyARaEqif75A
 */

public class Enemy extends GlobalPosition{

    private String enemyimage = "images/enemyimage.png";

    int speed = 5;

    public Enemy(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    public void update() {
        x+=speed;
        if(x > Main.WIDTH-32){
            speed = -5;
        }
        if(x < 0 ){
            speed = 5;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(getEnemyImage(), x, y, null);

        g2d.draw(getBounds());

    }

    public Image getEnemyImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(enemyimage));
        return i.getImage();
    }
}
