package UnidadI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tarea extends JFrame implements ActionListener{
	private JLabel lbl_mensaje;
	private JButton btn_aceptar;
	private JTextField tf_mensaje;
	
	public tarea()	{
		super("Hello World Tr3s");
		setLayout(null);
		setSize(240,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_mensaje=new JLabel();
		lbl_mensaje.setBounds(50, 100, 120, 30);
		add(lbl_mensaje);
		
		tf_mensaje=new JTextField(20);
		tf_mensaje.setBounds(50, 20, 120, 30);
		add(tf_mensaje);
		
		btn_aceptar=new JButton("Aceptar");
		btn_aceptar.setBounds(50, 60, 120, 30);
		add(btn_aceptar);
		btn_aceptar.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea ventana=new tarea();
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
