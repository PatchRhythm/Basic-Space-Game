import javax.swing.JFrame;

/**
 *Created by PatchRhythm on 05/30/2016,
 more info can be found @ https://github.com/PatchRhythm.

 Credits go to:
 RealTutsGML @ https://www.youtube.com/channel/UCOs7Q7IeuzgRyARaEqif75A
 */

public class Main {

    public static final int WIDTH = 1024, HEIGHT = 768;
    public static final String TITLE = "My First Game PatchRhythm";

    public static void main(String[] args) {
        System.out.println("Hello World! My First Game!");

        JFrame frame = new JFrame(TITLE);
        frame.pack();
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(new Game());
        frame.setVisible(true);

    }
}
