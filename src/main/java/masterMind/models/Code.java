package masterMind.models;

import masterMind.utils.IO;

public class Code {
	private Color[] code;
	private int maxNumColors;

	public Code(int max) {
		maxNumColors = max;
		code = new Color[max];
	}

	public ResultCompare compare(Code reference) {
		int dead = 0;
		int wounded = 0;
		int i = 0;
		for (Color color : reference.code) {
			color.compareTo(this.code[i]);
			i++;
		}

		return new ResultCompare(dead, wounded);
	}

	public void GenerateRandomCode() {
		for (int i = 0; i < maxNumColors; i++) {
			code[i] = Color.getRandomColor();
		}
	}

	public static Code read() {
		IO io = new IO();
		boolean error = false;
		Code result ; 
		do{
			error = false;
			String title = "Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul, B-blanco, N-negro]";
			String string =  io.readString(title);
			result = Code.convert(string);
			error = result!=null;
		}while(!error);
		
		return result;
	}
	
	public static Code convert(String string) {
		assert string !=null;
		Code result = new Code(4);
		int i =0;
		for(char c : string.toCharArray()) {
			Color color= Color.getCoincidentColor(c);		
			if(color==null) return null;
			else
				result.addColor(i,color);
			i++;
		}
		return result;
	}
	public void addColor (int position , Color color) {
		assert position>0 && position< maxNumColors;
		assert color!=null;
		this.code[position] = color;
	}

}
