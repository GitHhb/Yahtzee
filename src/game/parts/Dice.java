package game.parts;

/**
 * Created by leandro on 14-1-2016.
 */
public class Dice {
    private int value;

    public int getValue() {
        return value;
    }

    public void roll() {
        this.value = ((int)(Math.random()*6) + 1);
    }
}
