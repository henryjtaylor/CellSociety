package grids;

import cells.FireCell;
import games.Game;

/**
 * Grid Class for Fire
 *
 */
public class FireGrid extends Grid {

	public FireGrid(int dimensions, Game game, String cellShape) {
		super(dimensions, game, cellShape);
	}

	@Override
	protected FireCell cellType(int x, int y, String shape) {
		return new FireCell(x, y, "tree", shape, getGame().getData().getGridType(), getGame().getData().getNeighborType());
	}

	@Override
	protected String resetType() {
		return "tree";
	}
	
}
