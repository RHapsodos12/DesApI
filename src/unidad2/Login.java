package unidad2;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener
{
	private JLabel lbl_img_usuario,lbl_img_candado, lbl_img_ok, lbl_user, lbl_pass;
	private JButton btn_aceptar, btn_borrar;
	private JTextField tf_user;
	private JPasswordField pf_pass;
	
	public Login()
	{
		super("Inicio de sesión");
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		Image im=Toolkit.getDefaultToolkit().getImage("icon.png");
		setIconImage(im);
		
		lbl_img_usuario=new JLabel(new ImageIcon("user.png"));
		lbl_img_usuario.setBounds(20, 20, 70, 70);
		add(lbl_img_usuario);
		
		lbl_user=new JLabel("Usuario: ");
		lbl_user.setBounds(90, 40, 100, 30);
		add(lbl_user);
		
		tf_user=new JTextField();
		tf_user.setBounds(170, 40, 130, 30);
		add(tf_user);

		lbl_img_candado=new JLabel(new ImageIcon("pass.png"));
		lbl_img_candado.setBounds(20, 90, 70, 70);
		add(lbl_img_candado);
		
		lbl_pass=new JLabel("Contrasena: ");
		lbl_pass.setBounds(90,110,100,30);
		add(lbl_pass);
		
		pf_pass=new JPasswordField();
		pf_pass.setBounds(170, 110, 130, 30);
		add(pf_pass);
		
		btn_aceptar=new JButton("Aceptar");
		btn_aceptar.setBounds(80,170,100,20);
		btn_aceptar.addActionListener(this);
		add(btn_aceptar);
		
		btn_borrar=new JButton("Borrar");
		btn_borrar.setBounds(200,170,100,20);
		btn_borrar.addActionListener(this);
		add(btn_borrar);
		
		lbl_img_ok=new JLabel(new ImageIcon());
		lbl_img_ok.setBounds(305, 55, 70, 70);
		add(lbl_img_ok);
		
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Login ventana=new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn_aceptar) 
		{
			String usuario=tf_user.getText();
			
			
			///////////////
			Pattern pattern = Pattern.compile("^[\\d]{6}?$");
			Matcher m = pattern.matcher(usuario);
			boolean b = m.matches();
			System.out.println(b);
			
			///////////////
			String password= String.valueOf(pf_pass.getPassword());
			Pattern pattern1 = Pattern.compile("^[[a-zA-Z0-9\\W]]++$");
			Matcher m1 = pattern1.matcher(password);
			boolean b1 = m1.matches();
			System.out.println(b1);
			//////////////
			
			/*
			String password= String.valueOf(pf_pass.getPassword());
			
			if(usuario.equals("abrete") && password.equals("sesamo")) 
			{
				lbl_img_ok.setIcon(new ImageIcon("v.png"));
			}
			else {
				lbl_img_ok.setIcon(new ImageIcon("x.png"));
			}
			*/
		}
		
		if(e.getSource()==btn_borrar)
		{
			tf_user.setText("");
			pf_pass.setText("");
		}
	}
}