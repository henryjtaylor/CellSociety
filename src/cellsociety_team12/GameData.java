package cellsociety_team12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Element;

public class GameData {

	public static final String DATA_TYPE = "GameData";
	
	public static final List<String> DATA_FIELDS = Arrays.asList("gametype", "dimension",
			"initialPositions","prob","initialPositions2", "initialPositions3");

	private HashMap<String, String[]> myData;
	
	
	
	
	public GameData(HashMap<String, String[]> data) { //FIX THIS BY MAKING IT ABSTRACT
		myData = data;
	}
	
	
	public String getGameType() {
		return myData.get(DATA_FIELDS.get(0))[0];
	}
	
	public int getDimensions() {
		return Integer.parseInt(myData.get(DATA_FIELDS.get(1))[0]);
	}
	
	public String[] getPositions1(){
		return myData.get(DATA_FIELDS.get(2));
	}
	
	public String[] getPositions2(){
		return myData.get(DATA_FIELDS.get(4));
	}
	
	public String[] getPositions3(){
		return myData.get(DATA_FIELDS.get(5));
	}
	
	public int[][] getInitialPositions(String[] stringPositions) {
		int[][] intPositions = new int[stringPositions.length][2];
		for (int i = 0; i < stringPositions.length; i++) {
			String[] sublist = stringPositions[i].split(" ");
			intPositions[i][0] = Integer.parseInt(sublist[0]);
			intPositions[i][1] = Integer.parseInt(sublist[1]);
			checkBounds(intPositions[i][0]);
			checkBounds(intPositions[i][1]);
		}	
		return intPositions;
	}
	
	private void checkBounds(int k) {
		if (k > getDimensions() || k < 0) {
			throw new XMLException("Initial starting point is out of bounds %s", k);
		}
	}
	
	public double getProb(){
		return Double.parseDouble(myData.get(DATA_FIELDS.get(3))[0]);
	}
	
	
}
