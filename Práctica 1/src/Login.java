import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 409, 187);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(44, 56, 46, 14);
		frame.getContentPane().add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(100, 53, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(27, 91, 73, 14);
		frame.getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 88, 86, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setBounds(236, 56, 128, 34);
		frame.getContentPane().add(btnAcceder);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(174, 11, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setBounds(275, 125, 89, 23);
		frame.getContentPane().add(btnRegistro);
		
		
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = textField.getText();
				String pas = passwordField.getText();
				if(user.equals(pas) && user.length()>0) {
					Traductor trad = new Traductor ();
					trad.mostrar();
					frame.dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Login Incorrecto");
				}
			}
		});
		
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registro reg = new Registro ();
				reg.mostrar();
				frame.dispose();
				
			}
		});
		
		
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
