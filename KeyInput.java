import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *Created by PatchRhythm on 05/30/2016,
 more info can be found @ https://github.com/PatchRhythm.

 Credits go to:
 RealTutsGML @ https://www.youtube.com/channel/UCOs7Q7IeuzgRyARaEqif75A
 */
public class KeyInput extends KeyAdapter {
    Player p;

    public KeyInput(Player p) {
        this.p = p;
    }

    public void keyPressed(KeyEvent e) {
        p.keyPressed(e);
    }
    public void keyReleased(KeyEvent e) {
        p.keyReleased(e);
    }
}
