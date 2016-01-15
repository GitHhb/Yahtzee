package game;
import game.parts.*;

/**
 * Created by leandro on 14-1-2016.
 */
public class TestArea {
    public static void main(String[] argh) {
        Dice d = new Dice();
        d.roll();
        System.out.println(d.getValue());

    }


}
