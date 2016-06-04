import java.awt.*;
import java.util.LinkedList;

/**
 *Created by PatchRhythm on 05/30/2016,
 more info can be found @ https://github.com/PatchRhythm.

 Credits go to:
 RealTutsGML @ https://www.youtube.com/channel/UCOs7Q7IeuzgRyARaEqif75A
 */
public class Controller {
    /*
    intellij idea popped up with this tip about LinkedList<Enemy>();

    "Explicit type argument Enemy can be replaced with <> less... (Ctrl+F1)
    This inspection reports all new expressions with type arguments which can be
    replaced with diamond type <> Such <> syntax is not supported under Java 1.6 or earlier JVMs.﻿"
     */
    static LinkedList<Enemy> e = new LinkedList<Enemy>();

    Enemy TempEnemy;

    public Controller() {
        addEnemy(new Enemy(100,100));
        addEnemy(new Enemy(100,200));
        addEnemy(new Enemy(100,300));
        addEnemy(new Enemy(100,400));
        addEnemy(new Enemy(100,500));
        addEnemy(new Enemy(100,600));

    }

    public void draw(Graphics2D g2d) {
        for(int i = 0; i < e.size(); i++) {
            TempEnemy = e.get(i);

            TempEnemy.draw(g2d);
        }
    }

    public void update() {
        for(int i = 0; i < e.size(); i++) {
            TempEnemy = e.get(i);

            TempEnemy.update();
        }
    }

    public void addEnemy(Enemy enemy) {
        e.add(enemy);
    }

    public static LinkedList<Enemy> getEnemyBounds() {
        return e;
    }

}
