package masterMind.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import masterMind.utils.IO;

public class Board {

	private Code secretCode;

	private ArrayList<Integer> codesChoosed;
	
	private static final int MaxNumsTried = 10;

	public Board() {
		codesChoosed = new ArrayList<Integer>();
	}
	
	public boolean complete() {
				
		return codesChoosed.size()== MaxNumsTried;
	}
	
	public ResultCompare existWinner(Code newCodeChoosed) {
		ResultCompare result =  secretCode.compare(newCodeChoosed);
		return result;
	}
	
	public void clear() {
		codesChoosed= new ArrayList<Integer>();
	}
}
