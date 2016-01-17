package gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Glow;

public class Controller {
    public Label msgDice1;
    public Label msgDice2;
    public Label msgDice3;
    public Label msgDice4;
    public Label msgDice5;
    public Button butThrow;
    public Label labelDice1;
    public Label labelDice2;
    public Label labelDice3;
    public Label labelDice4;
    public Label labelDice5;
    GameManager game = new GameManager();

    public void selectDice1 (Event event) {
        switchDiceStatus(msgDice1);
    }
    public void selectDice2 (Event event) {
        switchDiceStatus(msgDice2);
    }
    public void selectDice3 (Event event) {
        switchDiceStatus(msgDice3);
    }
    public void selectDice4 (Event event) {
        switchDiceStatus(msgDice4);
    }
    public void selectDice5 (Event event) {
        switchDiceStatus(msgDice5);
    }

    void switchDiceStatus(Label dice){
        dice.setText(dice.getText().equals("ROLL") ? "KEEP" : "ROLL");
    }

    public void doQuit(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void doThrow(ActionEvent actionEvent) {
        Label[] l = {labelDice1, labelDice2, labelDice3, labelDice4, labelDice5};
        game.rollMyDices(l);

    }
}
