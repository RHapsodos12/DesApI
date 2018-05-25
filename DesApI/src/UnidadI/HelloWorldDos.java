package UnidadI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldDos extends JFrame 
{
	private JLabel lbl_mensaje;
	private JButton btn_aceptar;
	
	public HelloWorldDos()
	{
		super("Hello World 2");
		setLayout(null);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_mensaje=new JLabel("Aqui está la etiqueta");
		lbl_mensaje.setBounds(50, 10, 150, 30);
		
		add(lbl_mensaje);
		
		btn_aceptar=new JButton("Aceptar");
		btn_aceptar.setBounds(70, 50, 100, 30);
		
		add(btn_aceptar);
		
		//pack();
		
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		HelloWorldDos ventana=new HelloWorldDos();
	}
}
