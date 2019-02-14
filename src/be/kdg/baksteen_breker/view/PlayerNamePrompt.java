package be.kdg.baksteen_breker.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class PlayerNamePrompt extends GridPane {
    /*
    Attributen
     */
    private Label name;
    private TextField insertName;
    private Button confirmName;

    public PlayerNamePrompt() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.confirmName = new Button("Confirm");
        this.insertName = new TextField();
        this.name = new Label("Name:");
    }

    private void layoutNodes() {
//        GridPane gridpanePlayerPrompt = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(15);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(60);

        this.getColumnConstraints().addAll(column1, column2);
        this.add(confirmName, 2, 0);
        this.add(insertName, 1, 0);
        this.add(name, 0, 0);
        this.setGridLinesVisible(false);
        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setPadding(new Insets(10,10,10,10));

//        gridpanePlayerPrompt.setAlignment(Pos.CENTER);
//        gridpanePlayerPrompt.getColumnConstraints().addAll(column1,column2);
//        gridpanePlayerPrompt.add(confirmName, 0,1);
//        gridpanePlayerPrompt.add(insertName, 1,1);
//        gridpanePlayerPrompt.add(name,2,1);
//        gridpanePlayerPrompt.setGridLinesVisible(true);
    }
}
