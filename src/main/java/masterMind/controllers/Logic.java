package masterMind.controllers;

import masterMind.models.Game;

public class Logic {

	private Game game;
	private StartController startController;
	private ContinueController continueController;
	private ChooseController chooseController;
	private ChooseControllerAut chooseControllerAut;


	public Logic() {
		game = new Game();
        startController = new StartController(game);
        continueController = new ContinueController(game);
        chooseController = new ChooseController(game);
        chooseControllerAut = new ChooseControllerAut(game);

	}
	
	public Controller getController() {
        switch (game.getState())
        {
            case INITIAL:
                return startController;
            case IN_GAME_MANUAL:
                if (!game.completeBoard())
                {
                    return chooseController;
                }
                else
                {
                    return continueController;
                }
            case IN_GAME_AUTOMATICALLY:
                if (!game.completeBoard())
                {
                    return chooseControllerAut;
                }
                else
                {
                    return chooseControllerAut;
                }
            case FINAL:
                return continueController;
            case EXIT:
            default:
                return null;
        }
    }
}
