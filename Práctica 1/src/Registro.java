import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Registro {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void mostrar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
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
	public Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblRegistro);
		
		JLabel lblNewLabel = new JLabel("Nombre*");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(170, 0, 102, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idiomas que hablas");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JCheckBox chckbxIngls = new JCheckBox("Ingl\u00E9s");
		panel_1.add(chckbxIngls);
		
		JCheckBox chckbxFrancs = new JCheckBox("Franc\u00E9s");
		panel_1.add(chckbxFrancs);
		
		JCheckBox chckbxAlemn = new JCheckBox("Alem\u00E1n");
		panel_1.add(chckbxAlemn);
		
		JCheckBox chckbxItaliano = new JCheckBox("Italiano");
		panel_1.add(chckbxItaliano);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo*");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setSelected(true);
		buttonGroup.add(rdbtnMasculino);
		panel_2.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		buttonGroup.add(rdbtnFemenino);
		panel_2.add(rdbtnFemenino);
		
		JLabel lblEmail = new JLabel("E-mail*");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblEmail);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4);
		
		textField_1 = new JTextField();
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel_5 = new JPanel();
		frame.getContentPane().add(panel_5);
		
		JDateChooser dateChooser = new JDateChooser();
		panel_5.add(dateChooser);
		
		JLabel lblNewLabel_4 = new JLabel("\u00BFAceptas las condiciones?*");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_4);
		
		JPanel panel_6 = new JPanel();
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SI", "NO"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(180, 11, 81, 17);
		panel_6.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3);
		
		JButton btnAceptar = new JButton("Aceptar");
		panel_3.add(btnAceptar);
		
		JButton btnVolver = new JButton("Volver");
		panel_3.add(btnVolver);
		
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login();
				log.getFrame().setVisible(true);
				log.getFrame().setLocationRelativeTo(null);
				frame.dispose();
			}
		});
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()>0 && textField_1.getText().length() > 0) {
					JOptionPane.showMessageDialog(null, "Registro completo");
				Login log = new Login();
				log.getFrame().setVisible(true);
				log.getFrame().setLocationRelativeTo(null);
				frame.dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "Campos vacios o incorrectos.");
			}
		});
	}
}
