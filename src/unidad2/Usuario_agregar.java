package unidad2;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Usuario_agregar extends JFrame implements ActionListener
{
	private JLabel img_enfermera, lbl_matricula, lbl_nombre, lbl_direccion, lbl_telefono, lbl_contacto, lbl_sexo, lbl_tiposangre, lbl_imagen_usuario;
	private JTextField tf_matricula, tf_nombre, tf_direccion, tf_telefono, tf_contacto;
	private String[] sexo={"Masculino","Femenino"};
	private JRadioButton a,b,o;
	private JButton btn_aceptar, btn_cancelar, btn_regresar, btn_seleccionarimagen;
	private JFileChooser fc_imagen;
	
	private Usuario usuario=new Usuario();
	
	public Usuario_agregar()
	{
		super("Agregar usuario");
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		Image im=Toolkit.getDefaultToolkit().getImage("icon.png");
		setIconImage(im);
		
		lbl_imagen_usuario= new JLabel(new ImageIcon("enfermera.jpg"));
		lbl_imagen_usuario.setBounds(10, 10, 237, 300);
		add(lbl_imagen_usuario);
		
		lbl_matricula= new JLabel("Matrícula:");
		lbl_matricula.setBounds(260, 10, 100, 30);
		add(lbl_matricula);
		
		tf_matricula= new JTextField();
		tf_matricula.setBounds(340, 10, 120, 25);
		add(tf_matricula);
		
		lbl_nombre= new JLabel("Nombre:");
		lbl_nombre.setBounds(260, 50, 120, 30);
		add(lbl_nombre);
		
		tf_nombre= new JTextField();
		tf_nombre.setBounds(340, 50, 120, 25);
		add(tf_nombre);
		
		lbl_direccion= new JLabel("Dirección:");
		lbl_direccion.setBounds(260, 90, 120, 30);
		add(lbl_direccion);
		
		tf_direccion= new JTextField();
		tf_direccion.setBounds(340, 90, 120, 25);
		add(tf_direccion);
		
		lbl_telefono= new JLabel("Teléfono:");
		lbl_telefono.setBounds(260, 130, 120, 30);
		add(lbl_telefono);
		
		tf_telefono= new JTextField();
		tf_telefono.setBounds(340, 130, 120, 25);
		add(tf_telefono);
		
		lbl_contacto= new JLabel("Teléfono de contacto:");
		lbl_contacto.setBounds(260, 170, 130, 30);
		add(lbl_contacto);
		
		tf_contacto= new JTextField();
		tf_contacto.setBounds(390, 170, 120, 25);
		add(tf_contacto);
		
		lbl_sexo= new JLabel("Sexo:");
		lbl_sexo.setBounds(260, 210, 120, 30);
		add(lbl_sexo);
		
		JComboBox sexolist=new JComboBox(sexo);
		sexolist.setBounds(340, 210, 120, 25);
		add(sexolist);
		
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		Usuario_agregar usuario=new Usuario_agregar();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

}
