package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;
import grid.view.GridPanel;
import java.awt.Dimension;
import javax.swing.*;

public class GridFrame extends JFrame
{
	private GridController baseController;
	
	private GridPanel basePanel;
	
		public GridFrame (GridController baseController)
		{
			super();
			this.baseController = baseController;
			basePanel = new GridPanel(baseController);
			
			setupFrame();
				
		}
		private void setupFrame()
		{
			
			this.setContentPane(basePanel);
			this.setTitle("Grid Title Of Funnnnn!!!!");
			this.setSize(new Dimension(1080, 600));
			this.setResizable(false);
			
			this.setVisible(true);
			
			
		}
		public GridController getBaseController()
		{
			return baseController;
		}
		public void setBaseController(GridController baseController)
		{
			this.baseController = baseController;
		}
	
}
