package unidadI;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloWorldTres extends JFrame implements ActionListener{
	private JLabel lbl_mensaje;
	private JButton btn_aceptar;
	private JTextField tf_mensaje;
	
	public HelloWorldTres()	{
		super("Hello World Tr3s");
		setSize(400,200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon ic=new ImageIcon("PogChamp.jpg");
		
		
		lbl_mensaje=new JLabel(ic);
		add(lbl_mensaje);
		
		tf_mensaje=new JTextField(20);
		add(tf_mensaje);
		
		btn_aceptar=new JButton("Aceptar");
		add(btn_aceptar);
		btn_aceptar.addActionListener(this);
		
		Image img= Toolkit.getDefaultToolkit().getImage("PogChamp.jpg");
		setIconImage(img);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldTres ventana=new HelloWorldTres();
	}

	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		if(e.getSource()==btn_aceptar){
			String nombre;
			nombre=tf_mensaje.getText();
			lbl_mensaje.setText("Hello "+nombre);
				
			//tf_mensaje.setText(""); //Limpia el cuadro de texto
			//tf_mensaje.setEnabled(false); //Desactiva el cuadro de texto
			//tf_mensaje.setVisible(false); //Desaparece el cuadro de texto
		}
	}
}