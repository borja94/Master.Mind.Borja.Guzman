package masterMind.controllers;

import masterMind.models.Game;
import masterMind.models.State;
import masterMind.models.Code;


public class ChooseController extends Controller{

	public ChooseController(Game game) {
		super(game);
	}

	@Override
	public void control() {
		assert this.getState() == State.IN_GAME_MANUAL;
		
		Code code = Code.read();
		if(game.existWinner(code)) {
			this.setState(State.FINAL);
		}
		
	}

}
