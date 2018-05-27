package UnidadI;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame
{
	private JLabel lbl_hello, lbl_hello1, lbl_hello2;
	
	public HelloWorld()
	{
		super("Hello World");
		setLayout(new FlowLayout());
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_hello=new JLabel("Hello World!");
		lbl_hello1=new JLabel ("3 A TIC's");
		lbl_hello2=new JLabel("Vamos por la acreditación!!!");
			
		add(lbl_hello);
		add(lbl_hello1);
		add(lbl_hello2);
		//pack();
		
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		HelloWorld ventana= new HelloWorld();
	}
}
