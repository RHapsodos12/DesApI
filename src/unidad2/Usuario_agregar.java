package unidad2;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Usuario_agregar extends JFrame implements ActionListener {
	
	private JLabel img_enfermera, lbl_matricula, lbl_nombre, lbl_direccion, lbl_telefono, lbl_contacto, lbl_sexo, lbl_tiposangre, lbl_imagen_usuario;
	private JTextField tf_matricula, tf_nombre, tf_direccion, tf_telefono, tf_contacto;
	private String[] sexo={"Masculino","Femenino"};
	private JComboBox sexolist;
	private JRadioButton rb_ap, rb_an;
	private ButtonGroup sangreGroup;
	private JButton btn_aceptar, btn_cancelar, btn_regresar, btn_seleccionar_imagen;
	private JFileChooser fc_imagen;
	private ImageIcon ic;
	private File foto_usuario;
	
	private Usuario usuario=new Usuario();
	private UsuarioDAO usuario_dao=new UsuarioDAO();
	
	public Usuario_agregar() {
		
		super("Agregar usuario");
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		Image im=Toolkit.getDefaultToolkit().getImage("icon.png");
		setIconImage(im);
		
		img_enfermera= new JLabel(new ImageIcon("enfermera.jpg"));
		img_enfermera.setBounds(10, 10, 237, 300);
		add(img_enfermera);
		
		lbl_matricula= new JLabel("Matrícula:");
		lbl_matricula.setBounds(260, 10, 100, 30);
		add(lbl_matricula);
		
		tf_matricula= new JTextField();
		tf_matricula.setBounds(320, 10, 190, 25);
		add(tf_matricula);
		
		lbl_nombre= new JLabel("Nombre:");
		lbl_nombre.setBounds(260, 50, 120, 30);
		add(lbl_nombre);
		
		tf_nombre= new JTextField();
		tf_nombre.setBounds(320, 50, 190, 25);
		add(tf_nombre);
		
		lbl_direccion= new JLabel("Dirección:");
		lbl_direccion.setBounds(260, 90, 120, 30);
		add(lbl_direccion);
		
		tf_direccion= new JTextField();
		tf_direccion.setBounds(320, 90, 190, 25);
		add(tf_direccion);
		
		lbl_telefono= new JLabel("Teléfono:");
		lbl_telefono.setBounds(260, 130, 120, 30);
		add(lbl_telefono);
		
		tf_telefono= new JTextField();
		tf_telefono.setBounds(320, 130, 190, 25);
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
		
		sexolist=new JComboBox(sexo);
		sexolist.setBounds(320, 210, 120, 25);
		add(sexolist);
		
		lbl_tiposangre= new JLabel("Tipo de sangre:");
		lbl_tiposangre.setBounds(260, 250, 130, 30);
		add(lbl_tiposangre);
		
		rb_ap= new JRadioButton("A+");
		rb_ap.setBounds(350, 250, 40, 30);
		add(rb_ap);
		
		rb_an= new JRadioButton("A-");
		rb_an.setBounds(390, 250, 40, 30);
		add(rb_an);
		
		sangreGroup= new ButtonGroup();
		sangreGroup.add(rb_ap);
		sangreGroup.add(rb_an);
		
		lbl_imagen_usuario= new JLabel();
		lbl_imagen_usuario.setBounds(550,20, 180, 150);
		add(lbl_imagen_usuario);
		
		btn_seleccionar_imagen= new JButton("Seleccionar imagen");
		btn_seleccionar_imagen.setBounds(550, 200, 180, 25);
		btn_seleccionar_imagen.addActionListener(this);
		add(btn_seleccionar_imagen);
		
		btn_aceptar= new JButton("Aceptar");
		btn_aceptar.setBounds(260, 290, 100, 25);
		btn_aceptar.addActionListener(this);
		add(btn_aceptar);
		
		btn_cancelar= new JButton("Cancelar");
		btn_cancelar.setBounds(380, 290, 100, 25);
		add(btn_cancelar);
		
		btn_regresar= new JButton("Regresar");
		btn_regresar.setBounds(500, 290, 100, 25);
		add(btn_regresar);
		
		fc_imagen= new JFileChooser();
		FileNameExtensionFilter filtro= new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "jpeg", "png", "gif");
		fc_imagen.setFileFilter(filtro);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Usuario_agregar usuario=new Usuario_agregar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== btn_aceptar) {
			
			usuario.setMatricula(tf_matricula.getText());
			usuario.setNombre(tf_nombre.getText());
			usuario.setDireccion(tf_direccion.getText());
			usuario.setTelefono(tf_telefono.getText());
			usuario.setTelefono_contacto(tf_contacto.getText());
			usuario.setFoto(foto_usuario);
			
			boolean bs= (sexolist.getSelectedIndex()==0) ? false : true;
			usuario.setSexo(bs);
			
			char ts=(rb_ap.isSelected()) ? 'a' : 'b';
			usuario.setTipo_sangre(ts);
			
			if(usuario_dao.agregarUsuario(usuario)) {
				JOptionPane.showMessageDialog(null, "Usuario agregado");
			} else {
				JOptionPane.showMessageDialog(null, "Error");
			}
			
			System.out.print(usuario);
		}
		
		if(e.getSource()== btn_seleccionar_imagen) {
			
			int valor= fc_imagen.showOpenDialog(this);
			
			if(valor== JFileChooser.APPROVE_OPTION) {
				ImageIcon imagen= new ImageIcon (fc_imagen.getSelectedFile().getAbsolutePath());
				ic= new ImageIcon (imagen.getImage().getScaledInstance(180, 150, Image.SCALE_DEFAULT));
				lbl_imagen_usuario.setIcon(ic);
				foto_usuario= new File (fc_imagen.getSelectedFile().getPath());
				System.out.println(fc_imagen.getSelectedFile().getAbsolutePath());
			}
		}
	}
}
