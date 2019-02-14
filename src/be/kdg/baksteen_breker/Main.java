package be.kdg.baksteen_breker;

import be.kdg.baksteen_breker.model.BaksteenBrekerModel;
import be.kdg.baksteen_breker.view.BaksteenBrekerPresenter;
import be.kdg.baksteen_breker.view.BaksteenBrekerView;
import be.kdg.baksteen_breker.view.PlayerNamePrompt;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// MAIN
// Dient voor init van presenter en view


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        BaksteenBrekerModel model = new BaksteenBrekerModel();
        BaksteenBrekerView view = new BaksteenBrekerView();
        PlayerNamePrompt playername = new PlayerNamePrompt();
        BaksteenBrekerPresenter presenter = new BaksteenBrekerPresenter(model, view, playername);

        Stage playerNameStage = new Stage();

        // add var inits
        primaryStage.setTitle("Baksteen Breker");
        primaryStage.setWidth(860);
        primaryStage.setHeight(980);
        primaryStage.getIcons().add(new Image("bb_icon_512x512.jpg"));
        primaryStage.setResizable(false);

        playerNameStage.setTitle("Insert playername");
        playerNameStage.setWidth(400);
        playerNameStage.setHeight(80);
        playerNameStage.setResizable(false);

        // Make scene
        Scene scene = new Scene(view);
        Scene scene2= new Scene(playername);
        // Allocate scene to "Primary stage"
        primaryStage.setScene(scene);
        playerNameStage.setScene(scene2);
        // Show primary stage
        primaryStage.show();
        playerNameStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
