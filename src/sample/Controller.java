package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML // fx:id="button1"
    private Button button1;

    @FXML
    void onAction(ActionEvent event) {
        System.out.println("Pressed!");
    }

}

/*
<GridPane fx:controller="sample.Controller"
          xmlns:fx="http://javafx.com/fxml" alignment="center" hgap="10" vgap="10">
</GridPane>
 */
