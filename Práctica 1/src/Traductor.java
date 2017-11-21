import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Traductor {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void mostrar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traductor window = new Traductor();
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
	public Traductor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 471, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTraductor = new JLabel("TRADUCTOR");
		lblTraductor.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblTraductor.setBounds(153, 11, 131, 40);
		frame.getContentPane().add(lblTraductor);
		
		JPanel panel = new JPanel();
		panel.setBounds(153, 85, 131, 109);
		frame.getContentPane().add(panel);
		
		JLabel lblPalabraEnEspaol = new JLabel("Palabra en Espa\u00F1ol:");
		lblPalabraEnEspaol.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		panel.add(lblPalabraEnEspaol);
		lblPalabraEnEspaol.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ingl\u00E9s", "Franc\u00E9s", "Italiano", "Alem\u00E1n"}));
		
		JButton btnTraducir = new JButton("Traducir");
		panel.add(btnTraducir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(69, 228, 300, 64);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFocusable(false);
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 23));
		textArea.setBackground(SystemColor.activeCaption);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(69, 55, 300, 180);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("Bandera-Inglesa.png"));
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(356, 306, 89, 23);
		frame.getContentPane().add(btnSalir);
		
		btnTraducir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				URL web = null;
				InputStream contenido = null;
				String pagWeb = "";
				String idioma;
				if(textField.getText().length()>0)	{
					switch (comboBox.getSelectedIndex()) {
						case 0: idioma = "esen";
							break;
						case 1: idioma = "esfr";
							break;
						case 2: idioma = "esit";
							break;
						case 3: idioma = "esde";
							break;
						default: idioma = "esen";
					}
					try {
						web = new URL("http://www.wordreference.com/"+idioma+"/"+textField.getText());
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				
					try {
						contenido = web.openStream();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					// Convertir InputStream en String
					pagWeb = getStringFromInputStream(contenido);
					String palabra_1 = pagWeb.substring(pagWeb.indexOf("class='ToWrd' >")+15, pagWeb.indexOf("class='ToWrd' >")+50);
					String palabra_traducida=palabra_1.substring(0, palabra_1.indexOf("<"));
					if(palabra_traducida.length()==1)
						textArea.setText("Palabra no válida");
					else
					textArea.setText(palabra_traducida);
				}
				else 
					JOptionPane.showMessageDialog(null, "Campo vacío");
				
				
			}
		});
		
		
		
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				URL web = null;
				InputStream contenido = null;
				String pagWeb = "";
				String idioma;
				switch (comboBox.getSelectedIndex()) {
					case 0: idioma = "esen";
						lblNewLabel.setIcon(new ImageIcon("Bandera-Inglesa.png"));
						break;
					case 1: idioma = "esfr";
						lblNewLabel.setIcon(new ImageIcon("Bandera-francesa.png"));
						break;
					case 2: idioma = "esit";
						lblNewLabel.setIcon(new ImageIcon("bandera-italiana.jpg"));
						break;
					case 3: idioma = "esde";
						lblNewLabel.setIcon(new ImageIcon("bandera-alemana.jpg"));
						break;
					default: idioma = "esen";
				}
				//if(textField.getText().length()>0)	{
					try {
						web = new URL("http://www.wordreference.com/"+idioma+"/"+textField.getText());
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				
					try {
						contenido = web.openStream();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					// Convertir InputStream en String
					pagWeb = getStringFromInputStream(contenido);
					String palabra_1 = pagWeb.substring(pagWeb.indexOf("class='ToWrd' >")+15, pagWeb.indexOf("class='ToWrd' >")+50);
					String palabra_traducida=palabra_1.substring(0, palabra_1.indexOf("<"));
					if(palabra_traducida.length()==1)
						textArea.setText("Palabra vacia o incorrecta");
					else
					textArea.setText(palabra_traducida);
				//}
				//else 
				//	JOptionPane.showMessageDialog(null, "Campo vacío");
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SALIR
				Login log = new Login();
				log.getFrame().setVisible(true);
				log.getFrame().setLocationRelativeTo(null);
				frame.dispose();
			}
		});
		
	}
	private static String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}
}
