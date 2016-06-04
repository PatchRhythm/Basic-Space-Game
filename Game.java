import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *Created by PatchRhythm on 05/30/2016,
 more info can be found @ https://github.com/PatchRhythm.

 Credits go to:
 RealTutsGML @ https://www.youtube.com/channel/UCOs7Q7IeuzgRyARaEqif75A
 */

public class Game extends JPanel implements ActionListener{

    private static final long serialVersionUID = 1L;

    //Game Loop for timing sequence for applet.
    Timer gamelooptimer;

    //Variables
    private String background = "images/space-background.png";

    //Objects
    Player p;
    Controller c;


    public Game(){
        setFocusable(true);

        gamelooptimer = new Timer(10, this);
        gamelooptimer.start();

        p = new Player(100, 100);
        c = new Controller();


        addKeyListener(new KeyInput(p));
    }



    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(getBackgroundImage(),0,0,null);

        p.draw(g2d);
        c.draw(g2d);
    }

    public Image getBackgroundImage() {
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }

    @Override
    public void actionPerformed(ActionEvent ee) {
        repaint();
        p.update();
        c.update();

    }
}
