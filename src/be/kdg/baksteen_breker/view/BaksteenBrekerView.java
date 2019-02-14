package be.kdg.baksteen_breker.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class BaksteenBrekerView extends BorderPane {

    // VIEW
    // Dient voor visuele implementaties (Wat de gebruiker ziet)

    /*
    Attributen
     */
    private Button start, highscores, spel, help;
    private VBox vbox;
    private static final String IMAGE_PATH = "pixel_background_menu_test.png";
    private BackgroundImage hoofdmenu = new BackgroundImage(new Image(IMAGE_PATH),BackgroundRepeat.REPEAT,
            BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

    public BaksteenBrekerView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        //initialisatie van nodes zoals "button" en "label"
        // this.start = new Button("START");
        this.start = new Button("START");
        this.highscores = new Button("HIGHSCORES");
        this.spel = new Button("SPELINFO");
        this.help = new Button("HELP");
        this.vbox = new VBox(start, highscores, spel, help);
    }

    private void layoutNodes() {
        //layout van de nodes, zoals "insets", "padding" en "alignment"
        vbox.setBackground(new Background(hoofdmenu));
        this.setCenter(vbox);
        vbox.setAlignment(Pos.CENTER);
        start.setMinWidth(200);
        start.setMinHeight(100);
        highscores.setMinWidth(200);
        highscores.setMinHeight(100);
        spel.setMinWidth(200);
        spel.setMinHeight(100);
        help.setMinWidth(200);
        help.setMinHeight(100);
        vbox.setSpacing(10);

    }
}

