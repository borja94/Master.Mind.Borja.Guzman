package masterMind.models;

public class Game {

	private Code secretCode;
	private State state;
	private Board board;

	private static final int NUM_COLORS_CODE = 4;

	public Game() {
		state = State.INITIAL;
		board = new Board();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void GenerateSecretCode() {
		secretCode = new Code(NUM_COLORS_CODE);
		secretCode.GenerateRandomCode();
	}
	
	public boolean completeBoard() {
		return board.complete();
	}
	
	public boolean existWinner(Code newCodeChoosed) {
		ResultCompare result =  board.existWinner(newCodeChoosed);
		result.write();
		return result.isWiner();
	}
	
	public void clearBoard() {
		board.clear();
	}

}
