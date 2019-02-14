package be.kdg.baksteen_breker.view;

import be.kdg.baksteen_breker.model.BaksteenBrekerModel;

public class BaksteenBrekerPresenter {

    // PRESENTER
    // Behandelt de logica tussen het Model en de View


    private BaksteenBrekerModel model;
    private BaksteenBrekerView view;
    private PlayerNamePrompt playerNamePrompt;

    public BaksteenBrekerPresenter(BaksteenBrekerModel model, BaksteenBrekerView view, PlayerNamePrompt playerNamePrompt){
        this.model = model;
        this.view = view;
        this.playerNamePrompt = playerNamePrompt;
        this.addEventHandlers();
        this.updateView();
    }
    private void addEventHandlers(){
        //Koppelt anonieme inner klassen aan controls uit view
    }

    private void updateView(){
        //Vult view met date uit model
    }

    public void addWindowEventHandlers(){

    }
}
