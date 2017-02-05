package cellsociety_team12;

import cells.Cell;


public abstract class Game {
	
	private Grid myGrid;
	
	
	public Game(GameData data) {
		myGrid = createGrid(data.getDimensions());
		setInitialPositions(data);
		myGrid.updateCellNeighbors();
	}
	
	private void setInitialPositions(GameData data) {
		//if (data.getInitialPositions().length == 0) {
		//setDefaultPositions(data);
		//} else {
			String[] pos1 = data.getPositions1(); 
			String[] pos2 = data.getPositions2(); 
			String[] pos3 = data.getPositions3(); 
			if(pos1.length> 0) System.out.print("1: " + pos1.length); setPositions(data, pos1, 0);
			if(pos2.length > 0) System.out.print("2: " + pos2.length); setPositions(data, pos2, 1);
			if(pos3.length > 0) System.out.print("3: " + pos3.length); setPositions(data, pos3, 2);
				
		//}
	}
	
	private void setPositions(GameData data, String[] initialPositions, int type){
		int[][] positions = data.getInitialPositions(initialPositions);
		for (int[] each : positions) {
			getGrid().getCell(each[0],each[1]).setType(setInitialCellType(type));
		}
	}
	
	
	protected abstract Grid createGrid(int dimensions);
	
	protected abstract void gameLogic(Cell currentCell);

	protected abstract String setInitialCellType(int type);

	protected abstract void setDefaultPositions(GameData data);
	
	public Grid getGrid() {
		return myGrid;
	}
	
	public void updateGrid() {
		myGrid.updateGrid();
	}


	
}
