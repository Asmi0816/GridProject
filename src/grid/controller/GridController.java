package grid.controller;
import grid.model.NumberPanel;
import grid.view.GridFrame;

public class GridController
{
	private GridFrame baseFrame;
	private NumberPanel [][] grid;
	
	

	public GridController()
	{
		grid = new NumberPanel[9][9];
		fillGrid();
		
		
		baseFrame = new GridFrame(this);
	}
	public void start()
	{
		System.out.print("This is my new project 2D ");
	}
	
	private void fillGrid()
	{
		for (int row = 0; row< grid.length; row++)
		{
			for(int col = 0; col < grid[0].length; col++)
			{
				grid[row][col] = new NumberPanel();
			}
		}
		
	}
	
	
	public NumberPanel[][] getGrid() 
	{
		return grid;
	}
	public void setGrid(NumberPanel[][] grid) 
	{
		this.grid = grid;
	}
	public GridFrame getFrame()
	{
		return baseFrame;
	}
	public void setFrame(GridFrame baseFrame) 
	{
		this.baseFrame = baseFrame;
	}
}
