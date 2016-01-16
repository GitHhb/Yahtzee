package game.parts;

/**
 * Created by leandro on 15-1-2016.
 */

class ytzDice extends Dice {
    // Implement dices we don't want to roll again
    private boolean roll = true;

    public void roll() { if (roll) super.roll();}
}

public class Throw {
    final private static int nrDices = 5; // one throw contains 5 dices
    private Dice[] dices = new Dice[nrDices];
    private boolean[] dicesToRoll = new boolean[nrDices]; // true == roll this dice
    final private int nrOfThrows = 3;

    // Init theDices
    { for (int i = 0; i<nrDices; i++)
        dices[i] = new Dice();
      selectAllDices();
    }

    void throwTheDices(){
        for (int i = 0; i<nrDices; i++)
            if (dicesToRoll[i]) dices[i].roll();
        //for (Dice d: dices)
            //if (dicesToRoll[i]) d.roll();

    }

    void selectAllDices(){
        for (int i = 0; i<nrDices; i++)
            dicesToRoll[i] = true;
    }

    void selectDice(int diceNr){
        dicesToRoll[diceNr] = true;
    }

    public int[] getDices() {
        int[] diceValues = new int[nrDices];
        for (int i = 0; i < nrDices; i++)
            diceValues[i] = dices[i].getValue();
        return diceValues;
    }

}
