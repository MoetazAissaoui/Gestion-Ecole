package com.java.ecole.GuiClasses;
import com.java.bd.*;

import java.sql.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.JCheckBox;

public class AjouterFiliere extends JFrame {

	private Vector<String>cols = new Vector<String>();
	private Vector<String>rows = new Vector<String>();
	
	private JPanel contentPane;
	private JTextField lib;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterFiliere frame = new AjouterFiliere();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AjouterFiliere() {
		
		
		setTitle("Administration Panel");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1164, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(0,0,128));
		panel.setBounds(0, 0, 1158, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Ajouter Fili\u00E8re");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(59, 22, 262, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(AjouterFiliere.class.getResource("/img/icons8_administrator_male_40px.png")));
		lblNewLabel_3.setBounds(10, 11, 45, 40);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 509, 1158, 72);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("High School SWING Project");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 308, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Copyright \u00A9 2021 All rights reserved.");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(34, 31, 308, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(AjouterFiliere.class.getResource("/img/icons8-linkedin-20.png")));
		lblNewLabel_2_1.setBounds(1063, 31, 20, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblBeInTouch = new JLabel("Be in touch");
		lblBeInTouch.setForeground(Color.LIGHT_GRAY);
		lblBeInTouch.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblBeInTouch.setBounds(996, 31, 65, 14);
		panel_1.add(lblBeInTouch);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(AjouterFiliere.class.getResource("/img/icons8-facebook-20.png")));
		lblNewLabel_2_1_1.setBounds(1093, 31, 20, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0,0,139));
		panel_2.setBounds(0, 71, 1158, 438);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 27, 360, 389);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Libelle :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 11, 124, 26);
		panel_3.add(lblNewLabel_4);
		
		lib = new JTextField();
		lib.setBounds(119, 15, 173, 20);
		panel_3.add(lib);
		lib.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (lib.getText().isBlank())
					JOptionPane.showInternalMessageDialog(null, "Champ Vide !");
				else
				{
				ConnectDB db = new ConnectDB();
				try {
					
					Connection con = (Connection) db.createConnection();
					Statement st = ((java.sql.Connection) con).createStatement();
					st.executeUpdate("insert into filiere values('"+lib.getText().strip().toUpperCase()+"')");
					JOptionPane.showInternalMessageDialog(null, "Fili�re ajout�e");
					

					st.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
					
			}
		});
		panel_4.setBounds(119, 175, 84, 80);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Ajouter");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_5.setBounds(20, 66, 64, 14);
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(AjouterFiliere.class.getResource("/img/icons8_add_100px_2.png")));
		lblNewLabel_6.setBounds(-13, 0, 97, 58);
		panel_4.add(lblNewLabel_6);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		separator.setBounds(450, 111, 2, 218);
		panel_2.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(534, 27, 601, 389);
		panel_2.add(scrollPane);
		
		//creation colonnes de tableau
		String column[]={"LIBELLE"};  
		String data[][]= new String[23][1];
		ConnectDB db = new ConnectDB();
		try {
			
			Connection con = (Connection) db.createConnection();
			Statement st = ((java.sql.Connection) con).createStatement();
			ResultSet rs = st.executeQuery("select * from filiere");
			
			int i=0;
			while(rs.next())
			{
				data[i][0]=rs.getString(1);
				i++;
			}
			st.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		table_2 = new JTable(data,column);
		table_2.setBorder(null);
		scrollPane.setViewportView(table_2);
		

		
 


       


		
	}
}
