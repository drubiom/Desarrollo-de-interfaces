package sudoku4x4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Visual {

	private JFrame frame;
	private JButton btnComprobar;
	private JLabel lblSudoku;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public JTextField [][] array = {{textField, textField_1, textField_2, textField_3},{textField_4, textField_5, textField_6, textField_7},{textField_8, textField_9, textField_10, textField_11},{textField_12, textField_13, textField_14, textField_15}};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visual window = new Visual();
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
	public Visual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setResizable(false);
		frame.setBounds(100, 100, 706, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(178, 0, 362, 340);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		array[0][0] = new JTextField();
		array[0][0].setHorizontalAlignment(SwingConstants.CENTER);
		array[0][0].setBorder(new LineBorder(Color.RED, 3, true));
		array[0][0].setEditable(false);
		array[0][0].setBackground(SystemColor.activeCaption);
		array[0][0].setBounds(27, 11, 73, 52);
		array[0][0].setText("");
		panel_3.add(array[0][0]);
		array[0][0].setColumns(10);
		
		array[0][1] = new JTextField();
		array[0][1].setHorizontalAlignment(SwingConstants.CENTER);
		array[0][1].setBorder(new LineBorder(Color.RED, 3, true));
		array[0][1].setEditable(false);
		array[0][1].setBackground(SystemColor.activeCaption);
		array[0][1].setBounds(100, 11, 73, 52);
		panel_3.add(array[0][1]);
		array[0][1].setColumns(10);
		
		array[0][2] = new JTextField();
		array[0][2].setHorizontalAlignment(SwingConstants.CENTER);
		array[0][2].setBorder(new LineBorder(Color.YELLOW, 3, true));
		array[0][2].setEditable(false);
		array[0][2].setBackground(SystemColor.activeCaption);
		array[0][2].setBounds(183, 11, 73, 52);
		array[0][2].setColumns(10);
		panel_3.add(array[0][2]);
		
		array[0][3] = new JTextField();
		array[0][3].setHorizontalAlignment(SwingConstants.CENTER);
		array[0][3].setBorder(new LineBorder(Color.YELLOW, 3, true));
		array[0][3].setEditable(false);
		array[0][3].setBackground(SystemColor.activeCaption);
		array[0][3].setBounds(255, 11, 68, 52);
		array[0][3].setColumns(10);
		panel_3.add(array[0][3]);
		
		array[1][0] = new JTextField();
		array[1][0].setHorizontalAlignment(SwingConstants.CENTER);
		array[1][0].setBorder(new LineBorder(Color.RED, 3, true));
		array[1][0].setEditable(false);
		array[1][0].setBackground(SystemColor.activeCaption);
		array[1][0].setBounds(27, 63, 73, 52);
		array[1][0].setColumns(10);
		panel_3.add(array[1][0]);
		
		array[1][1] = new JTextField();
		array[1][1].setHorizontalAlignment(SwingConstants.CENTER);
		array[1][1].setBorder(new LineBorder(Color.RED, 3, true));
		array[1][1].setEditable(false);
		array[1][1].setBackground(SystemColor.activeCaption);
		array[1][1].setBounds(100, 63, 73, 52);
		array[1][1].setColumns(10);
		panel_3.add(array[1][1]);
		
		array[1][2] = new JTextField();
		array[1][2].setHorizontalAlignment(SwingConstants.CENTER);
		array[1][2].setBorder(new LineBorder(Color.YELLOW, 3, true));
		array[1][2].setEditable(false);
		array[1][2].setBackground(SystemColor.activeCaption);
		array[1][2].setBounds(183, 63, 73, 52);
		array[1][2].setColumns(10);
		panel_3.add(array[1][2]);
		
		array[1][3] = new JTextField();
		array[1][3].setHorizontalAlignment(SwingConstants.CENTER);
		array[1][3].setBorder(new LineBorder(Color.YELLOW, 3, true));
		array[1][3].setEditable(false);
		array[1][3].setBackground(SystemColor.activeCaption);
		array[1][3].setBounds(255, 63, 68, 52);
		array[1][3].setColumns(10);
		panel_3.add(array[1][3]);
		
		array[2][0] = new JTextField();
		array[2][0].setHorizontalAlignment(SwingConstants.CENTER);
		array[2][0].setBorder(new LineBorder(Color.BLUE, 3, true));
		array[2][0].setEditable(false);
		array[2][0].setBackground(SystemColor.activeCaption);
		array[2][0].setBounds(27, 126, 73, 52);
		array[2][0].setColumns(10);
		panel_3.add(array[2][0]);
		
		array[2][1] = new JTextField();
		array[2][1].setHorizontalAlignment(SwingConstants.CENTER);
		array[2][1].setBorder(new LineBorder(Color.BLUE, 3, true));
		array[2][1].setEditable(false);
		array[2][1].setBackground(SystemColor.activeCaption);
		array[2][1].setBounds(100, 126, 73, 52);
		array[2][1].setColumns(10);
		panel_3.add(array[2][1]);
		
		array[2][2] = new JTextField();
		array[2][2].setHorizontalAlignment(SwingConstants.CENTER);
		array[2][2].setBorder(new LineBorder(Color.MAGENTA, 3, true));
		array[2][2].setEditable(false);
		array[2][2].setBackground(SystemColor.activeCaption);
		array[2][2].setBounds(183, 126, 73, 52);
		array[2][2].setColumns(10);
		panel_3.add(array[2][2]);
		
		array[2][3] = new JTextField();
		array[2][3].setHorizontalAlignment(SwingConstants.CENTER);
		array[2][3].setBorder(new LineBorder(Color.MAGENTA, 3, true));
		array[2][3].setEditable(false);
		array[2][3].setBackground(SystemColor.activeCaption);
		array[2][3].setBounds(255, 126, 68, 52);
		array[2][3].setColumns(10);
		panel_3.add(array[2][3]);
		
		array[3][0] = new JTextField();
		array[3][0].setHorizontalAlignment(SwingConstants.CENTER);
		array[3][0].setBorder(new LineBorder(Color.BLUE, 3, true));
		array[3][0].setEditable(false);
		array[3][0].setBackground(SystemColor.activeCaption);
		array[3][0].setBounds(27, 176, 73, 52);
		array[3][0].setColumns(10);
		panel_3.add(array[3][0]);
		
		array[3][1] = new JTextField();
		array[3][1].setHorizontalAlignment(SwingConstants.CENTER);
		array[3][1].setBorder(new LineBorder(Color.BLUE, 3, true));
		array[3][1].setEditable(false);
		array[3][1].setBackground(SystemColor.activeCaption);
		array[3][1].setBounds(100, 176, 73, 52);
		array[3][1].setColumns(10);
		panel_3.add(array[3][1]);
		
		array[3][2] = new JTextField();
		array[3][2].setHorizontalAlignment(SwingConstants.CENTER);
		array[3][2].setBorder(new LineBorder(Color.MAGENTA, 3, true));
		array[3][2].setEditable(false);
		array[3][2].setBackground(SystemColor.activeCaption);
		array[3][2].setBounds(183, 177, 73, 51);
		array[3][2].setColumns(10);
		panel_3.add(array[3][2]);
		
		array[3][3] = new JTextField();
		array[3][3].setHorizontalAlignment(SwingConstants.CENTER);
		array[3][3].setBorder(new LineBorder(Color.MAGENTA, 3, true));
		array[3][3].setEditable(false);
		array[3][3].setBackground(SystemColor.activeCaption);
		array[3][3].setBounds(255, 176, 68, 52);
		array[3][3].setColumns(10);
		panel_3.add(array[3][3]);
		
		JButton btnComprobar_1 = new JButton("COMPROBAR");
		btnComprobar_1.setVisible(false);
		btnComprobar_1.setBounds(67, 271, 217, 41);
		panel_3.add(btnComprobar_1);
		
		btnComprobar = new JButton("RESOLVER");
		btnComprobar.setVisible(false);
		btnComprobar.setBounds(68, 271, 216, 41);
		panel_3.add(btnComprobar);
		btnComprobar.setFont(new Font("Segoe WP Black", Font.PLAIN, 11));
		
		JButton btnResolverAutomticamente = new JButton("RESOLVER AUTOM\u00C1TICAMENTE");
		btnResolverAutomticamente.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnResolverAutomticamente.setBounds(10, 55, 158, 37);
		panel.add(btnResolverAutomticamente);
		
		JButton btnResolverManualmente = new JButton("RESOLVER MANUALMENTE");
		btnResolverManualmente.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnResolverManualmente.setBounds(10, 186, 158, 37);
		panel.add(btnResolverManualmente);
		
		JCheckBox chckbxSombreado = new JCheckBox("SOMBREADO");
		chckbxSombreado.setSelected(true);
		chckbxSombreado.setBounds(559, 24, 123, 23);
		panel.add(chckbxSombreado);
		 DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		  tcr.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		lblSudoku = new JLabel("SUDOKU");
		panel_1.add(lblSudoku);
		lblSudoku.setFont(new Font("Segoe Script", Font.BOLD, 35));
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		JButton btnSalir = new JButton("Salir");
		panel_2.add(btnSalir);
		JButton btnNewButton = new JButton("Reiniciar");
		panel_2.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new CardLayout(0, 0));
		
		Sudoku resolve = new Sudoku();
		
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				String temp = String.valueOf(Sudoku.getGrid()[i][j]);
				array[i][j].setText(temp);
			}
		}
		
		JRadioButton rdbtnRedimensionar = new JRadioButton("REDIMENSIONAR");
		buttonGroup.add(rdbtnRedimensionar);
		rdbtnRedimensionar.setBounds(546, 157, 148, 23);
		panel.add(rdbtnRedimensionar);
		
		JRadioButton rdbtnNoRedimensionar = new JRadioButton("NO REDIMENSIONAR");
		rdbtnNoRedimensionar.setSelected(true);
		buttonGroup.add(rdbtnNoRedimensionar);
		rdbtnNoRedimensionar.setBounds(546, 131, 148, 23);
		panel.add(rdbtnNoRedimensionar);
		
		for(int i=0;i<4; i++)
			for(int j=0;j<4;j++) {
				if(Integer.parseInt(array[i][j].getText()) == 0)
					array[i][j].setText("");
			}
		
		
		
		btnResolverAutomticamente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				automatic();
				Cell newcell = new Cell(0,0);
				resolve.solve(newcell);
				for(int i=0;i<4; i++)
					for(int j=0;j<4;j++) {
						array[i][j].setText(Integer.toString(resolve.getGrid()[i][j]));
					}
				JOptionPane.showMessageDialog(null, "Resuelto automáticamente :)");
				
			}
		});
		btnResolverManualmente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnComprobar_1.setVisible(true);
				btnComprobar.setVisible(false);
				for(int i=0;i<4; i++)
					for(int j=0;j<4;j++) {
						array[i][j].setText(Integer.toString(Sudoku.getGrid()[i][j]));
					}
				
				for(int i=0;i<4; i++)
					for(int j=0;j<4;j++) {
						if(Integer.parseInt(array[i][j].getText()) == 0) {
							array[i][j].setEditable(true);
							array[i][j].setText("");
							array[i][j].setBackground(Color.green);
						}
					}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int inicial[][] = { { 2, 0, 0, 0}, //
						{ 0, 3, 0, 4}, //
						{ 3, 0, 0, 1}, //
						{ 4, 0, 3, 0} };
		        Sudoku.setGrid(inicial);
				frame.dispose();
		        Visual game = new Visual();
		        game.frame.setVisible(true);
				game.frame.setLocationRelativeTo(null);
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnComprobar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cell newcell = new Cell(0,0);
				resolve.solve(newcell);
				if(array[0][0].getText().equals(Integer.toString(Sudoku.getGrid()[0][0])) &&
						array[0][1].getText().equals(Integer.toString(Sudoku.getGrid()[0][1])) &&
						array[0][2].getText().equals(Integer.toString(Sudoku.getGrid()[0][2])) &&
						array[0][3].getText().equals(Integer.toString(Sudoku.getGrid()[0][3])) &&
						array[1][0].getText().equals(Integer.toString(Sudoku.getGrid()[1][0])) &&
						array[1][1].getText().equals(Integer.toString(Sudoku.getGrid()[1][1])) &&
						array[1][2].getText().equals(Integer.toString(Sudoku.getGrid()[1][2])) &&
						array[1][3].getText().equals(Integer.toString(Sudoku.getGrid()[1][3])) &&
						array[2][0].getText().equals(Integer.toString(Sudoku.getGrid()[2][0])) &&
						array[2][1].getText().equals(Integer.toString(Sudoku.getGrid()[2][1])) &&
						array[2][2].getText().equals(Integer.toString(Sudoku.getGrid()[2][2])) &&
						array[2][3].getText().equals(Integer.toString(Sudoku.getGrid()[2][3])) &&
						array[3][0].getText().equals(Integer.toString(Sudoku.getGrid()[3][0])) &&
						array[3][1].getText().equals(Integer.toString(Sudoku.getGrid()[3][1])) &&
						array[3][2].getText().equals(Integer.toString(Sudoku.getGrid()[3][2])) &&
						array[3][3].getText().equals(Integer.toString(Sudoku.getGrid()[3][3]))
						) {
					JOptionPane.showMessageDialog(null, "Correcto!!");
					
				}
				else 
				JOptionPane.showMessageDialog(null, "Vaya, parece que tienes algo mal :(");
			}
		});
		
		
		chckbxSombreado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSombreado.isSelected()) {
					for(int i=0;i<4; i++)
						for(int j=0;j<4;j++) {
							if(array[i][j].isEditable()) 
								array[i][j].setBackground(Color.green);
							else array[i][j].setBackground(SystemColor.activeCaption);
						}
				}
				else {
					for(int i=0;i<4; i++)
						for(int j=0;j<4;j++) {
							if(array[i][j].isEditable()) 
								array[i][j].setBackground(Color.green);
							else array[i][j].setBackground(SystemColor.white);
						}
				}
				
			}
		});
		
		
		rdbtnNoRedimensionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setResizable(false);
			}
		});
		rdbtnRedimensionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setResizable(true);
			}
			
		});
		
		
		
	}
	public void automatic() {
		
		for(int i=0;i<4; i++)
			for(int j=0;j<4;j++) {
				array[i][j].setEditable(false);
			}
		
		for(int i=0;i<4; i++)
			for(int j=0;j<4;j++) {
				array[i][j].setBackground(SystemColor.activeCaption);
			}
	}

	public JTextField [][] getArray() {
		return array;
	}

	public void setArray(JTextField [][] array) {
		this.array = array;
	}
}
