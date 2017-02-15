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
	private JTextField footer;
	private JTextField xPosition;
	private JTextField yPosition;
	private JButton chooseButton;
	
	
	private JScrollPane gridPane;
	private JTable gridTable;
	
	public GridPanel(GridController baseController)
	{
		this.baseController = baseController;
		this.xPosition = new JTextField(3);
		this.yPosition = new JTextField(3);
		this.xLabel = new JLabel("Y-Axis");
		this.yLabel = new JLabel("X-Axis");
		this.chooseButton = new JButton("Make your changes here");
		this.baseLayout = new SpringLayout();
		this.dontTouch = new JLabel("Don't look for anything here");
		this.dontTouch2 = new JLabel("Type into the box what you want the box to say");
		this.footer = new JTextField(20);

		
		
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
	this.add(dontTouch);
	this.add(dontTouch2);
	this.add(footer);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 34, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 57, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, -34, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, yLabel, 102, SpringLayout.EAST, xLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, yLabel, 0, SpringLayout.NORTH, xLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, xLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, xLabel, 10, SpringLayout.WEST, this);
		gridTable.setBackground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, dontTouch2, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, dontTouch, 34, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chooseButton, 9, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, yPosition, 6, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chooseButton, 97, SpringLayout.EAST, yLabel);
		baseLayout.putConstraint(SpringLayout.EAST, chooseButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, dontTouch2, 6, SpringLayout.SOUTH, gridPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, dontTouch, -6, SpringLayout.NORTH, gridPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, chooseButton, -6, SpringLayout.NORTH, gridPane);
		baseLayout.putConstraint(SpringLayout.NORTH, footer, 0, SpringLayout.NORTH, dontTouch2);
		baseLayout.putConstraint(SpringLayout.WEST, footer, 84, SpringLayout.EAST, dontTouch2);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -39, SpringLayout.SOUTH, this);
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
				String xString = xPosition.getText();
				String yString = yPosition.getText();
				int xInt = Integer.parseInt(xString);
				int yInt = Integer.parseInt(yString);
				if(yInt < 10 || xInt < 10 || xInt > 1 || yInt > 1)
				{
				gridTable.setValueAt(footer.getText(), xInt - 1, yInt - 1);
				}
				else
				{
					System.out.println("Yha that doesn't work try again");
				}
			
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
