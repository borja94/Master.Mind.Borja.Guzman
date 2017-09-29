package masterMind.models;

import masterMind.utils.IO;
public class ResultCompare {

	private int dead;
	private int wounded;
	private static final int MAX_DEADS = 4;

	public ResultCompare() {
	}

	public ResultCompare(int dead, int wounded) {
		this.dead = dead;
		this.wounded = wounded;
	}

	public boolean isWiner() {
		return dead == MAX_DEADS;
	}
	
	public void write() {
		IO io = new IO();
		String title = this.dead + "muertos";
		if(this.dead== MAX_DEADS)
			title+="!!!! Victoria";
		else
			title +=" y "+this.wounded+" heridos";
		io.writeln(title);
	}

}
