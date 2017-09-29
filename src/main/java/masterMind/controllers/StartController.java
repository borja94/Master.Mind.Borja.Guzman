package masterMind.controllers;

import masterMind.models.Game;
import masterMind.models.State;
import masterMind.utils.IO;

public class StartController extends Controller
{
    public StartController(Game game)
    {
        super(game);
    }

    @Override
    public void control()
    {
        assert this.getState() == State.INITIAL;
        this.game.GenerateSecretCode();
        this.game.clearBoard();
        State state = this.readOptions();
        this.setState(state);
    }
    
    private State readOptions() {
    	IO io = new IO();
    	State s = State.IN_GAME_MANUAL;
    	io.writeln("1.Partida");
    	io.writeln("2.Demo");
    	String title = "Option?";
		int value =-1;
		do {
			value=io.readInt(title);
			if(value==2)
				return State.IN_GAME_MANUAL;
			else if(value==2)
				return State.IN_GAME_AUTOMATICALLY;
		}while(value!=2|| value!=1);
		return State.IN_GAME_MANUAL;
    }
}
