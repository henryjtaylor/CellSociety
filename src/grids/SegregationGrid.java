package grids;

import cells.SegregationCell;
import games.Game;

/**
 * Grid Class for Segregation
 *
 */
public class SegregationGrid extends Grid {

	public SegregationGrid(int dimensions, Game game, String cellShape) {
		super(dimensions, game, cellShape);
	}

	@Override
	protected SegregationCell cellType(int x, int y, String shape) {
		return new SegregationCell(x, y, "empty", shape, getGame().getData().getGridType(), getGame().getData().getNeighborType());
	}

	@Override
	protected String resetType() {
		return "empty";
	}
	
}
