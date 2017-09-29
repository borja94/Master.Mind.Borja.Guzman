package masterMind.models;

public enum Color {

	A("A-amarillo"), 
	R("R-rojo"), 
	V("V-verde"), 
	Z("Z-azul"), 
	B("B-blanco"), 
	N("N-negro");

	private String title;

	private Color(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public static int getSize() {
		return values().length;
	}
	
	public static Color getRandomColor() {
		return Color.values()[(int) (Math.random() * Color.getSize()) + 1];
	}
	
	public static Color getCoincidentColor(char c ) {
		
		for(Color color : Color.values()) {
			if(color.name().toCharArray()[0]== c )
				return color;
		}
		return null;
	}
	
}
