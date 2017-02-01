package grid.view;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;
import grid.controller.GridController;
import javax.swing.table.*;


public class GridPanel extends JPanel 
{
	private GridController baseController;
	private JLabel xLabel;
	private JLabel yLabel;
	private JComboBox xPosition;
	private JComboBox yPosition;
	private JButton chooseButton;
	
	
	private JScrollPane gridPane;
	private JTable gridTable;
	
	public GridPanel(GridController baseController)
	{
		this.xLabel = new JLabel("X-Axis");
		this.yLabel = new JLabel("Y-Axis");
		this.chooseButton = new JButton("");
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String [] {"1","2","3","4","5"})
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
		
	}
	
	private void setupPanel()
	{
	
	}
	private void setupLayout()
	{
	
	}
	private void setupListeners()
	{
	
	}
	

	
	
	
	
	
}
