package game.parts;

/**
 * Created by leandro on 15-1-2016.
 */

class ytzDice extends Dice {
    // Implement dices we don't want to roll again
    private boolean roll = true;

    public void roll() { if (roll) super.roll();}
    public void dontRoll() {roll = false;}
}

public class Throw {
    public static final int nrDices = 5; // one throw contains 5 dices

    private ytzDice[] dices = new ytzDice[nrDices];
    //private boolean[] dicesToRoll = new boolean[nrDices]; // true == roll this dice
    private int nrOfThrows = 3;

    // Init theDices
    { for (int i = 0; i<nrDices; i++)
        dices[i] = new ytzDice();
    }

    public int rollTheDices(){
        // roll dices that may be rolled, then return nr of throws left
        if (nrOfThrows == 0) return 0;
        for (Dice d: dices) d.roll();
        return --nrOfThrows;
    }

    public void dontRollDice(int diceNr) {
        dices[diceNr].dontRoll();
    }

    public int[] getDiceValues() {
        int[] diceValues = new int[nrDices];
        for (int i = 0; i < nrDices; i++)
            diceValues[i] = dices[i].getValue();
        return diceValues;
    }

}
