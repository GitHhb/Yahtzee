package game;
import game.parts.*;

/**
 * Created by leandro on 14-1-2016.
 */
public class TestArea {
    public static void main(String[] argh) {
        Throw t = new Throw();
        int [] i;
        t.rollTheDices();


        for (int x: t.getDiceValues()) System.out.print(x + " ");

        System.out.println();
        t.dontRollDice(2);
        t.rollTheDices();
        for (int x: t.getDiceValues()) System.out.print(x + " ");

        System.out.println();
        t.dontRollDice(2);
        t.rollTheDices();
        for (int x: t.getDiceValues()) System.out.print(x + " ");

        System.out.println();
        t.dontRollDice(2);
        t.rollTheDices();
        for (int x: t.getDiceValues()) System.out.print(x + " ");

    }


}
