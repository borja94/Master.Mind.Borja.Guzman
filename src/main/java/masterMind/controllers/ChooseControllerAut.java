package masterMind.controllers;

import masterMind.models.Game;
import masterMind.models.State;
import masterMind.models.Code;


public class ChooseControllerAut extends Controller{

	public ChooseControllerAut(Game game) {
		super(game);
	}

	@Override
	public void control() {
		assert this.getState() == State.IN_GAME_AUTOMATICALLY;
		
		Code code = new Code(4);
		code.GenerateRandomCode();
		if(game.existWinner(code)) {
			this.setState(State.FINAL);
		}
		
	}

}
