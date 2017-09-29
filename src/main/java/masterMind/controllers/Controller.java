package masterMind.controllers;

import masterMind.models.Game;
import masterMind.models.Board;
import masterMind.models.State;

public abstract class Controller {

	protected Game game;
	protected Board board;

	public Controller(Game game) {
		this.game = game;
	}

	public abstract void control();

	public State getState() {
		return game.getState();
	}

	public void setState(State state) {
		game.setState(state);
	}

	public Board getBoard() {
		return board;
	}
	
}
