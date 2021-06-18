package com.java.ecole.GuiClasses;

import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.java.bd.ConnectDB;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import sun.jvm.hotspot.oops.Metadata;

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
import javax.swing.JComboBox;

public class SaisieNotes extends JFrame {

	private Vector<String>cols = new Vector<String>();
	private Vector<String>rows = new Vector<String>();
	
	private JPanel contentPane;
	private JTextField cin;
	private JTextField note;
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
					SaisieNotes frame = new SaisieNotes();
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
	public SaisieNotes() {

		String[] Matieres = new String[10];
		Matieres[0]="Selectionner une Matiere !";
		
		
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
		
		JLabel lblNewLabel_2 = new JLabel("Saisie Notes");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(59, 22, 262, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(SaisieNotes.class.getResource("/img/icons8_administrator_male_40px.png")));
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
		lblNewLabel_2_1.setIcon(new ImageIcon(SaisieNotes.class.getResource("/img/icons8-linkedin-20.png")));
		lblNewLabel_2_1.setBounds(1063, 31, 20, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblBeInTouch = new JLabel("Be in touch");
		lblBeInTouch.setForeground(Color.LIGHT_GRAY);
		lblBeInTouch.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblBeInTouch.setBounds(996, 31, 65, 14);
		panel_1.add(lblBeInTouch);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(SaisieNotes.class.getResource("/img/icons8-facebook-20.png")));
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
		
		JLabel lblNewLabel_4 = new JLabel("CIN :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 27, 124, 26);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Note :");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_1.setBounds(10, 106, 124, 26);
		panel_3.add(lblNewLabel_4_1);
		
		cin = new JTextField();
		cin.setBounds(119, 31, 173, 20);
		panel_3.add(cin);
		cin.setColumns(10);
		
		note = new JTextField();
		note.setColumns(10);
		note.setBounds(119, 110, 173, 20);
		panel_3.add(note);
		
		JPanel panel_4 = new JPanel();
		
		panel_4.setBounds(55, 286, 84, 80);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Ajouter");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_5.setBounds(20, 66, 64, 14);
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(SaisieNotes.class.getResource("/img/icons8_add_100px_2.png")));
		lblNewLabel_6.setBounds(-13, 0, 97, 58);
		panel_4.add(lblNewLabel_6);
		
		JPanel panel_4_1 = new JPanel();

		panel_4_1.setLayout(null);
		panel_4_1.setBounds(172, 271, 90, 107);
		panel_3.add(panel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Chercher");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(16, 82, 64, 14);
		panel_4_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon(SaisieNotes.class.getResource("/img/icons8-update-100.png")));
		lblNewLabel_6_1.setBounds(0, 11, 96, 69);
		panel_4_1.add(lblNewLabel_6_1);
		
		ConnectDB db = new ConnectDB();
		try {
			
			Connection con = (Connection) db.createConnection();
			Statement st = ((java.sql.Connection) con).createStatement();
			ResultSet rs = st.executeQuery("select lib from matiere");
			int i=1;
				while(rs.next())
				{
					Matieres[i]=rs.getString(1);
					i++;
				}					

			

			st.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JComboBox mat = new JComboBox(Matieres);
		mat.setBounds(119, 64, 173, 22);
		panel_3.add(mat);
		
        
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Matiere :");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_1_1.setBounds(10, 64, 124, 26);
		panel_3.add(lblNewLabel_4_1_1);
		

		
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
		String column[]={"CINETUDIANT","NOM","PRENOM","MATIERE","NOTE"};  
		String data[][]= new String[23][5];
		
		panel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ConnectDB db = new ConnectDB();
				try {
					
					Connection con = (Connection) db.createConnection();
					Statement st = ((java.sql.Connection) con).createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
					ResultSet rs = st.executeQuery("select m.cinetudiant , e.nom,e.prenom,mm.lib,m.note from etudiant e,notes m , matiere mm where m.matiere_id = mm.idMatiere and m.CINEtudiant = e.CINEtudiant and m.CINEtudiant = '"+cin.getText()+"'");
					int i=0;
					if (rs.next())
					{
					rs.previous();
					while(rs.next())
					{
						for (int j = 0 ; j<5;j++)
						{
						data[i][j]=rs.getString(j+1);
						System.out.println(data[i][j]);
						}
						i++;
						
						table_2 = new JTable(data,column);
						table_2.setBorder(null);
						scrollPane.setViewportView(table_2);

					}
					}else
					{
						JOptionPane.showInternalMessageDialog(null, "no marks found");
					}
					st.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		

		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                ConnectDB db = new ConnectDB();
				try {
					
					Connection con = (Connection) db.createConnection();

					Statement stm=con.createStatement();
					ResultSet rs = stm.executeQuery("select * from notes where CINEtudiant = '"+cin.getText()+"' and (select idmatiere from matiere where lib = '"+String.valueOf(mat.getSelectedItem())+"') = matiere_id;");
					System.out.println(rs);
					if (rs.next())
					{
						// already exist , so updating to record
						
						
						PreparedStatement st=con.prepareStatement("UPDATE Notes set note = ? where cinetudiant = ? and matiere_id = '"+rs.getObject(3)+"'");
						System.out.println(st);
						st.setObject(1, note.getText());
						st.setString(2,cin.getText());
						st.executeUpdate();
						st.close();
						JOptionPane.showInternalMessageDialog(null, "La note est modifiée");
						
					stm.close();
					}
					else
					{
						//get matiere id ;
						
						Statement st0 = con.createStatement();
						ResultSet rs0 = st0.executeQuery("select idmatiere from matiere where lib = '"+String.valueOf(mat.getSelectedItem())+"'");
						rs0.next();
						String id = rs0.getObject(1).toString();
						
						st0.close();
						System.out.println(id+"\n la requete prepare \n");
						
						
						String sql="INSERT INTO `notes` (`idNotes`, `CINEtudiant`, `Matiere_id`, `Note`) VALUES (NULL, ?, ?, ?);";
						PreparedStatement st2=con.prepareStatement(sql);
						
						st2.setString(1, cin.getText());
						st2.setString(2, id);
						st2.setString(3, note.getText());
						
						System.out.println(st2.toString());
						st2.executeUpdate();
						st2.close();
						JOptionPane.showInternalMessageDialog(null, "Note est ajoutée");
						//record not existing
					}
					
				

					
					

					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showInternalMessageDialog(null, "erreur");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showInternalMessageDialog(null, "erreur");
				}
				
			}
		});

		
 


       


		
	}
}
