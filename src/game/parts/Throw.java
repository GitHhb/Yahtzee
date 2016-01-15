package game.parts;

/**
 * Created by leandro on 15-1-2016.
 */
public class Throw {
    final private static int nrDices = 5; // one throw contains 5 dices
    Dice[] theDices = new Dice[nrDices];
    boolean[] theDicesToRoll = new boolean[nrDices]; // true == roll this dice

    // Init theDices
    { for (int i = 0; i<nrDices; i++)
        theDices[i] = new Dice();
    }

}
