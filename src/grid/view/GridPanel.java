package grid.view;

import javax.swing.JPanel;
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import grid.controller.GridController;
import javax.swing.table.*;
import java.awt.color.*;


public class GridPanel extends JPanel 
{
	private GridController baseController;
	private SpringLayout baseLayout;
	private JLabel xLabel;
	private JLabel yLabel;
	private JLabel dontTouch;
	private JLabel dontTouch2;
	private JLabel myProject;
	private JLabel footer;
	private JComboBox xPosition;
	private JComboBox yPosition;
	private JButton chooseButton;
	
	
	private JScrollPane gridPane;
	private JTable gridTable;
	
	public GridPanel(GridController baseController)
	{
		this.baseController = baseController;
		this.xPosition = new JComboBox();
		this.yPosition = new JComboBox();
		this.xLabel = new JLabel("X-Axis");
		this.yLabel = new JLabel("Y-Axis");
		this.chooseButton = new JButton("Make your changes here");
		this.baseLayout = new SpringLayout();
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String [] {"1","2","3","4","5","6","7","8","9"});
		gridTable = new JTable();
		
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		baseLayout.putConstraint(SpringLayout.SOUTH, chooseButton, -6, SpringLayout.NORTH, gridPane);
		
		gridPane.setViewportView(gridTable);
		
	}
	
	private void setupPanel()
	{
	this.setLayout(baseLayout);
	this.setBackground(Color.GRAY);
	this.add(xPosition);
	this.add(yPosition);
	this.add(gridPane);
	this.add(xLabel);
	this.add(yLabel);
	this.add(chooseButton);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 34, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 57, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -15, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, -34, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, yLabel, 102, SpringLayout.EAST, xLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, yLabel, 0, SpringLayout.NORTH, xLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, xLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, xLabel, 10, SpringLayout.WEST, this);
		gridTable.setBackground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, chooseButton, 9, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chooseButton, 97, SpringLayout.EAST, yLabel);
		baseLayout.putConstraint(SpringLayout.EAST, chooseButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, yPosition, 0, SpringLayout.NORTH, xPosition);
		baseLayout.putConstraint(SpringLayout.WEST, yPosition, 11, SpringLayout.EAST, yLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, xPosition, -4, SpringLayout.NORTH, xLabel);
		baseLayout.putConstraint(SpringLayout.WEST, xPosition, 6, SpringLayout.EAST, xLabel);
		
		
	}
	private void setupListeners()
	{
		chooseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent click)
			{
				
			}
		});
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
