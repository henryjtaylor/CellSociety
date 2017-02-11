package grids;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import cells.FireCell;
import games.Game;

public class FireGrid extends Grid {

	public FireGrid(int dimensions, Game game, String cellShape) {
		super(dimensions, game, cellShape);
	}

	@Override
	protected FireCell cellType(int x, int y, Shape shape) {
		return new FireCell(x, y, "tree", shape);
	}
	
}
