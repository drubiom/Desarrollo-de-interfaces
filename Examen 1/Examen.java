//Examen Práctico 10/10/2017 
//DESARROLLO DE INTERFACES (DAM)
//DAVID RUBIO MATEOS 
//This work is licensed under a Creative Commons Attribution-NonCommercial 4.0 International License.
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Examen {

	static JFrame frmViiajesDam;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public JComboBox comboBox;
	public JComboBox comboBox_1;
	public JComboBox comboBox_2;
	public JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	//VARIABLES
	int origen = 0;
	int destino = 0;
	int matriz[][] = {{30,50},{15,25},{20,35},{12,20}};
	int idavuelta = 1;
	int numerobilletes=1;
	boolean comision=false;
	boolean numerosa=false;
	boolean joven=false;
	boolean desempleado=false;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
					window.frmViiajesDam.setVisible(true);
					window.frmViiajesDam.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Examen() {
		initialize();
	}

	private void initialize() {
		frmViiajesDam = new JFrame();
		frmViiajesDam.setResizable(false);
		frmViiajesDam.setTitle("VIAJES DAM");
		frmViiajesDam.setBounds(100, 100, 676, 371);
		frmViiajesDam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmViiajesDam.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 11, 293, 273);
		frmViiajesDam.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCaractersticasDeSu = new JLabel("Caracter\u00EDsticas de su billete de viaje:");
		lblCaractersticasDeSu.setBounds(23, 0, 244, 14);
		panel.add(lblCaractersticasDeSu);
		
		JLabel lblOrigen = new JLabel("Origen:*");
		lblOrigen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOrigen.setBounds(33, 25, 73, 14);
		panel.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino:*");
		lblDestino.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDestino.setBounds(43, 50, 63, 14);
		panel.add(lblDestino);
		
		JLabel lblNDeBilletes = new JLabel("N\u00BA de billetes:");
		lblNDeBilletes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeBilletes.setBounds(23, 75, 83, 14);
		panel.add(lblNDeBilletes);
		
		JLabel lblTipoDeViaje = new JLabel("Tipo de viaje:");
		lblTipoDeViaje.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDeViaje.setBounds(10, 100, 96, 14);
		panel.add(lblTipoDeViaje);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFormaDePago.setBounds(10, 125, 96, 14);
		panel.add(lblFormaDePago);
		
		JLabel lblDescuentos = new JLabel("Descuentos:");
		lblDescuentos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentos.setBounds(10, 150, 96, 14);
		panel.add(lblDescuentos);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MADRID", "BARCELONA"}));
		comboBox.setBounds(116, 25, 116, 20);
		comboBox.setSelectedIndex(-1);
		panel.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BILBAO", "ZARAGOZA"}));
		comboBox_1.setBounds(116, 47, 116, 20);
		comboBox_1.setSelectedIndex(-1);
		panel.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setBounds(116, 71, 46, 20);
		panel.add(comboBox_2);
		
		JRadioButton rdbtnIdavta = new JRadioButton("Ida/Vta");
		buttonGroup.add(rdbtnIdavta);
		rdbtnIdavta.setSelected(true);
		rdbtnIdavta.setBounds(116, 98, 67, 23);
		panel.add(rdbtnIdavta);
		
		JRadioButton rdbtnSloIda = new JRadioButton("S\u00F3lo Ida");
		buttonGroup.add(rdbtnSloIda);
		rdbtnSloIda.setBounds(181, 98, 86, 23);
		panel.add(rdbtnSloIda);
		
		JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
		
		buttonGroup_1.add(rdbtnTarjeta);
		rdbtnTarjeta.setSelected(true);
		rdbtnTarjeta.setBounds(116, 121, 67, 23);
		panel.add(rdbtnTarjeta);
		
		JRadioButton rdbtnIban = new JRadioButton("IBAN (+5%)");
		buttonGroup_1.add(rdbtnIban);
		rdbtnIban.setBounds(181, 122, 86, 20);
		panel.add(rdbtnIban);
		
		JCheckBox chckbxFamiliaNumerosa = new JCheckBox("Familia Numerosa (-10%)");
		chckbxFamiliaNumerosa.setBounds(116, 147, 147, 23);
		panel.add(chckbxFamiliaNumerosa);
		
		JCheckBox chckbxCarnetJoven = new JCheckBox("Carnet Joven(-8%)");
		chckbxCarnetJoven.setBounds(116, 175, 147, 23);
		panel.add(chckbxCarnetJoven);
		
		JCheckBox chckbxDesempleado = new JCheckBox("Desempleado(-6%)");
		chckbxDesempleado.setBounds(116, 201, 147, 23);
		panel.add(chckbxDesempleado);
		
		JLabel lblTotalAPagar = new JLabel("Total a PAGAR:");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAPagar.setBounds(10, 245, 106, 20);
		panel.add(lblTotalAPagar);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(126, 245, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lbluros = new JLabel("\u20ACuros");
		lbluros.setHorizontalAlignment(SwingConstants.LEFT);
		lbluros.setBounds(227, 245, 56, 20);
		panel.add(lbluros);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(327, 36, 323, 112);
		frmViiajesDam.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDatosTarjeta = new JLabel("Datos tarjeta:");
		lblDatosTarjeta.setBounds(24, 11, 74, 14);
		panel_1.add(lblDatosTarjeta);
		
		JLabel lblTitular = new JLabel("Titular:*");
		lblTitular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitular.setBounds(34, 36, 64, 14);
		panel_1.add(lblTitular);
		
		JLabel lblNTarjeta = new JLabel("N\u00BA Tarjeta:*");
		lblNTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNTarjeta.setBounds(24, 56, 74, 14);
		panel_1.add(lblNTarjeta);
		
		JLabel lblCvv = new JLabel("CVV:*");
		lblCvv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCvv.setBounds(34, 80, 64, 14);
		panel_1.add(lblCvv);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 36, 188, 17);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 54, 151, 17);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(108, 78, 46, 17);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDigit = new JLabel("16 DIGIT");
		lblDigit.setBounds(269, 56, 46, 14);
		panel_1.add(lblDigit);
		
		JLabel lbldigit = new JLabel("3DIGIT");
		lbldigit.setBounds(164, 81, 46, 14);
		panel_1.add(lbldigit);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"VISA", "MASTERCARD"}));
		comboBox_3.setBounds(220, 78, 82, 16);
		panel_1.add(comboBox_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(327, 159, 323, 84);
		frmViiajesDam.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDatosCuentaIban = new JLabel("Datos cuenta IBAN:");
		lblDatosCuentaIban.setBounds(10, 8, 117, 14);
		panel_2.add(lblDatosCuentaIban);
		
		JLabel lblIbanEs = new JLabel("IBAN - ES:*");
		lblIbanEs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIbanEs.setBounds(20, 30, 75, 20);
		panel_2.add(lblIbanEs);
		
		JLabel lblBanco = new JLabel("Banco:*");
		lblBanco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBanco.setBounds(10, 52, 85, 14);
		panel_2.add(lblBanco);
		
		textField_4 = new JTextField();
		textField_4.setBounds(113, 30, 147, 20);
		textField_4.setColumns(10);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(113, 51, 200, 20);
		textField_5.setColumns(10);
		panel_2.add(textField_5);
		
		JLabel lblDigit_1 = new JLabel("22 DIGIT");
		lblDigit_1.setBounds(270, 33, 53, 14);
		panel_2.add(lblDigit_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(327, 248, 323, 72);
		frmViiajesDam.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 323, 72);
		panel_3.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(24, 295, 293, 45);
		frmViiajesDam.getContentPane().add(panel_4);
		
		JButton btnProcederAlPago = new JButton("Proceder al pago");
		panel_4.add(btnProcederAlPago);
		
		JButton btnSalir = new JButton("Salir");
		
		panel_4.add(btnSalir);
		
		JLabel lblMtodosDePago = new JLabel("M\u00E9todos de pago:");
		lblMtodosDePago.setBounds(392, 11, 143, 14);
		frmViiajesDam.getContentPane().add(lblMtodosDePago);

		//CAMBIO DE ORIGEN
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedIndex()==0)
					origen=1;
				else if(comboBox.getSelectedIndex()==1)
					origen=2;
				imprime();}});
		//CAMBIO DE DESTINO
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1.getSelectedIndex()==0)
					destino=1;
				else if(comboBox_1.getSelectedIndex()==1)
					destino=2;
				imprime();}});
		//CAMBIA NUMERO BILLETES
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerobilletes=comboBox_2.getSelectedIndex()+1;
				imprime();}});
		//CAMBIA IDA/VUELTA
		rdbtnIdavta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idavuelta=1;
				imprime();}});
		//CABIA A SOLO IDA
		rdbtnSloIda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idavuelta=0;
				imprime();}});
		//CAMBIA A TARJETA
		rdbtnTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				comision=false;
				imprime();}});
		//CAMBIA A IBAN
		rdbtnIban.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				comision=true;
				imprime();}});
		//CONFIRMA DESCUENTO FAMILIA NUMEROSA
		chckbxFamiliaNumerosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFamiliaNumerosa.isSelected()) {
					numerosa=true;}
				else {
					numerosa=false;}
				imprime();}});
		//CONFIRMA DESCUENTO JOVEN
		chckbxCarnetJoven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCarnetJoven.isSelected()) {
					joven=true;}
				else {
					joven=false;}
				imprime();}});
		//CONFIRMA DESCUENTO DESEMPLEADO
		chckbxDesempleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDesempleado.isSelected()) {
					desempleado=true;}
				else {
					desempleado=false;}
				imprime();}});
		//CLICK EN SALIR
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i= JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
				if(i==0) {
					System.exit(0);}
				}});
		//CLICK EN PAGO
		btnProcederAlPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SI ESTA EN TARJETA
				if(!comision) {
					//COMPRUEBA ORIGEN/DESTINO
					if(comboBox.getSelectedIndex()==-1 || comboBox_1.getSelectedIndex()==-1) {
						JOptionPane.showMessageDialog(null, "Datos de viaje incompletos", "Error de datos", JOptionPane.ERROR_MESSAGE);
					}
					else {
						//COMPRUEBA DATOS PAGO
						if(textField_1.getText().length()<3 || textField_2.getText().length()!=16 || textField_3.getText().length() !=3) {
							JOptionPane.showMessageDialog(null, "Datos de compra incorrectos", "Error de compra", JOptionPane.ERROR_MESSAGE);
						}
						else {
						//PROCEDE AL PAGO
							paga();}
					}
				}
				//SI ESTA EN IBAN
				else {
					//COMPRUEBA ORIGEN/DESTINO
					if(comboBox.getSelectedIndex()==-1 || comboBox_1.getSelectedIndex()==-1) {
						JOptionPane.showMessageDialog(null, "Datos de viaje incompletos", "Error de datos", JOptionPane.ERROR_MESSAGE);
					}
					else {
						//COMPRUEBA DATOS PAGO
						if(textField_4.getText().length()!=22 || textField_5.getText().length()<5) {
							JOptionPane.showMessageDialog(null, "Datos de compra incorrectos", "Error de compra", JOptionPane.ERROR_MESSAGE);
						}
						else {
							//PROCEDE AL PAGO
							paga();}
					}
				}		
			}
		});	
	}
	//METODO PARA CALCULAR EL PRECIO
	void imprime() {
		int aux=-1;
		//COMPRUEBA QUE ESTÉ SELECCIONADO ORIGEN Y DESTINO
		if(comboBox.getSelectedIndex() != -1 && comboBox_1.getSelectedIndex() != -1) {
			if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==0)
				aux=0;
			else if(comboBox.getSelectedIndex()==0 && comboBox_1.getSelectedIndex()==1)
				aux=1;
			else if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==0)
				aux=2;
			else if(comboBox.getSelectedIndex()==1 && comboBox_1.getSelectedIndex()==1)
				aux=3;
			double temporal =matriz[aux][idavuelta]*numerobilletes;
			if(comision) {
				temporal = temporal + (temporal*0.05);}
			if(numerosa) {
				temporal = temporal - (temporal*0.10);}
			if(joven) {
				temporal = temporal - (temporal*0.08);}
			if(desempleado) {
				temporal = temporal - (temporal*0.06);}
			textField.setText(Double.toString(temporal));
		}
	}
	//METODO PARA SACAR DETALLES DEL PAGO
	void paga() {
		String or="error";
		String des="error";
		switch (origen) {
		case 1:or="MADRID";
		break;
		case 2: or="BARCELONA";
		break;}
		switch (destino) {
		case 1:des="BILBAO";
		break;
		case 2: des="ZARAGOZA";
		break;}
		String t = "RESUMEN DE SU COMPRA\n"+"Origen:"+or+"\nDestino:"+des+"\nNúmero de billetes:"+numerobilletes+"\nTotal pagado:"+textField.getText();
		textArea.setText(t);
		limpia();}
	//METODO PARA LIMPIAR DATOS CUANDO PAGA.
	void limpia() {
		comboBox.setSelectedIndex(-1);
		comboBox_1.setSelectedIndex(-1);
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
	}}
