package unidadI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dinner extends JFrame {
	
	private Container contents;
	private JLabel labelText;
	private JLabel labelImage;
	
	//CONSTRUCTOR
	
	public Dinner() {
		super("What's for dinner?");
		contents=getContentPane();
		//call JFrame constructor
		//get content pane
		
		setLayout(new FlowLayout());
		//set layout manager
		//use the JLabel  constructor with a string argument
		labelText=new JLabel("Sushi tonight?");
		
		//set label properties
		
		labelText.setForeground(java.awt.Color.WHITE);
		labelText.setBackground(java.awt.Color.BLUE);
		labelText.setOpaque(true);
		
		//Use the JLabel constructor with an imageicon arument 
		labelImage=new JLabel (new ImageIcon("sushi.jpg"));
		// set tool tip text
		labelImage.setToolTipText("photo of sushi");
		//add the two labels to the content pane
		
		contents.add(labelText);
		contents.add(labelImage);
		
		setSize(300,250);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dinner dinner=new Dinner();
		dinner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
