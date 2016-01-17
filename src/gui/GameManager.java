package gui;

import game.parts.Throw;

import javafx.scene.control.Label;

/**
 * Created by leandro on 18-1-2016.
 */
public class GameManager {
    Throw aThrow = new Throw();


    public void rollMyDices(Label[] label){
        // New throw
        aThrow.rollTheDices();
        int[] diceValue = aThrow.getDiceValues();
        // Show dice values on screen
        for (int i = 0; i < Throw.nrDices; i++)
            label[i].setText("" + diceValue[i]);
    }
}
