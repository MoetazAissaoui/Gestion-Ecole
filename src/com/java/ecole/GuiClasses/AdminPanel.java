package com.java.ecole.GuiClasses;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel frame = new AdminPanel();
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
	public AdminPanel() {
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
		
		JLabel lblNewLabel_2 = new JLabel("Portail Administration");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(59, 22, 262, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8_administrator_male_40px.png")));
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
		lblNewLabel_2_1.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-linkedin-20.png")));
		lblNewLabel_2_1.setBounds(1063, 31, 20, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblBeInTouch = new JLabel("Be in touch");
		lblBeInTouch.setForeground(Color.LIGHT_GRAY);
		lblBeInTouch.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		lblBeInTouch.setBounds(996, 31, 65, 14);
		panel_1.add(lblBeInTouch);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-facebook-20.png")));
		lblNewLabel_2_1_1.setBounds(1093, 31, 20, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0,0,139));
		panel_2.setBounds(0, 71, 1158, 438);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();		
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new AjouterEnseignant().show();
			}
		});
		panel_3.setBackground(new Color(0,0,139));
		panel_3.setBounds(29, 58, 133, 122);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Ajouter Enseignant");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 97, 113, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-add-column-64.png")));
		lblNewLabel_5.setBounds(26, 11, 83, 82);
		panel_3.add(lblNewLabel_5);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_1);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_1);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new ModifierEnseignant().show();
			}
		});
		panel_3_1.setBackground(new Color(0,0,139));
		panel_3_1.setBounds(172, 58, 133, 122);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Modifier Enseignant");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(10, 97, 113, 14);
		panel_3_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-update-100.png")));
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setBounds(10, 15, 83, 71);
		panel_3_1.add(lblNewLabel_5_1);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_1_1);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_1_1);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new SupprimerEnseignant().show();
			}
		});
		panel_3_1_1.setBackground(new Color(0,0,139));
		panel_3_1_1.setBounds(315, 58, 154, 122);
		panel_2.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JLabel lblNewLabel_4_2 = new JLabel("Supprimer Enseignant");
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_2.setBounds(10, 97, 134, 14);
		panel_3_1_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-delete-column-64.png")));
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setBounds(31, 15, 83, 71);
		panel_3_1_1.add(lblNewLabel_5_1_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(0, 0, 139));
		panel_3_2.setBounds(29, 229, 133, 122);
		panel_2.add(panel_3_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Ajouter Etudiant");
		lblNewLabel_4_3.setForeground(Color.WHITE);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_3.setBounds(10, 97, 113, 14);
		panel_3_2.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-add-column-64.png")));
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setBounds(26, 11, 83, 82);
		panel_3_2.add(lblNewLabel_5_2);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBackground(new Color(0, 0, 139));
		panel_3_1_2.setBounds(172, 229, 133, 122);
		panel_2.add(panel_3_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Modifier Etudiant");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_1.setBounds(10, 97, 113, 14);
		panel_3_1_2.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("");
		lblNewLabel_5_1_2.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-update-100.png")));
		lblNewLabel_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_5_1_2.setBounds(10, 15, 83, 71);
		panel_3_1_2.add(lblNewLabel_5_1_2);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBackground(new Color(0, 0, 139));
		panel_3_1_1_1.setBounds(315, 229, 154, 122);
		panel_2.add(panel_3_1_1_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Supprimer Etudiant");
		lblNewLabel_4_2_1.setForeground(Color.WHITE);
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_2_1.setBounds(10, 97, 134, 14);
		panel_3_1_1_1.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("");
		lblNewLabel_5_1_1_1.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-delete-column-64.png")));
		lblNewLabel_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1.setBounds(31, 15, 83, 71);
		panel_3_1_1_1.add(lblNewLabel_5_1_1_1);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBackground(new Color(0, 0, 139));
		panel_3_3.setBounds(508, 58, 133, 122);
		panel_2.add(panel_3_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Ajouter Matiere");
		lblNewLabel_4_4.setForeground(Color.WHITE);
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4.setBounds(10, 97, 113, 14);
		panel_3_3.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_5_3 = new JLabel("");
		lblNewLabel_5_3.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-add-column-64.png")));
		lblNewLabel_5_3.setForeground(Color.WHITE);
		lblNewLabel_5_3.setBounds(26, 11, 83, 82);
		panel_3_3.add(lblNewLabel_5_3);
		
		JPanel panel_3_1_3 = new JPanel();
		panel_3_1_3.setLayout(null);
		panel_3_1_3.setBackground(new Color(0, 0, 139));
		panel_3_1_3.setBounds(651, 58, 133, 122);
		panel_2.add(panel_3_1_3);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Modifier Matiere");
		lblNewLabel_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_2.setBounds(10, 97, 113, 14);
		panel_3_1_3.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("");
		lblNewLabel_5_1_3.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-update-100.png")));
		lblNewLabel_5_1_3.setForeground(Color.WHITE);
		lblNewLabel_5_1_3.setBounds(10, 15, 83, 71);
		panel_3_1_3.add(lblNewLabel_5_1_3);
		
		JPanel panel_3_1_1_2 = new JPanel();
		panel_3_1_1_2.setLayout(null);
		panel_3_1_1_2.setBackground(new Color(0, 0, 139));
		panel_3_1_1_2.setBounds(794, 58, 154, 122);
		panel_2.add(panel_3_1_1_2);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("Supprimer Matiere");
		lblNewLabel_4_2_2.setForeground(Color.WHITE);
		lblNewLabel_4_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_2_2.setBounds(10, 97, 134, 14);
		panel_3_1_1_2.add(lblNewLabel_4_2_2);
		
		JLabel lblNewLabel_5_1_1_2 = new JLabel("");
		lblNewLabel_5_1_1_2.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-delete-column-64.png")));
		lblNewLabel_5_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_2.setBounds(31, 15, 83, 71);
		panel_3_1_1_2.add(lblNewLabel_5_1_1_2);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setLayout(null);
		panel_3_4.setBackground(new Color(0, 0, 139));
		panel_3_4.setBounds(508, 229, 133, 122);
		panel_2.add(panel_3_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Ajouter Fili\u00E8re");
		lblNewLabel_4_5.setForeground(Color.WHITE);
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_5.setBounds(10, 97, 113, 14);
		panel_3_4.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_5_4 = new JLabel("");
		lblNewLabel_5_4.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-add-column-64.png")));
		lblNewLabel_5_4.setForeground(Color.WHITE);
		lblNewLabel_5_4.setBounds(26, 11, 83, 82);
		panel_3_4.add(lblNewLabel_5_4);
		
		JPanel panel_3_1_4 = new JPanel();
		panel_3_1_4.setLayout(null);
		panel_3_1_4.setBackground(new Color(0, 0, 139));
		panel_3_1_4.setBounds(651, 229, 133, 122);
		panel_2.add(panel_3_1_4);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Modifier Fili\u00E8re");
		lblNewLabel_4_1_3.setForeground(Color.WHITE);
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_3.setBounds(10, 97, 113, 14);
		panel_3_1_4.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("");
		lblNewLabel_5_1_4.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-update-100.png")));
		lblNewLabel_5_1_4.setForeground(Color.WHITE);
		lblNewLabel_5_1_4.setBounds(10, 15, 83, 71);
		panel_3_1_4.add(lblNewLabel_5_1_4);
		
		JPanel panel_3_1_1_3 = new JPanel();
		panel_3_1_1_3.setLayout(null);
		panel_3_1_1_3.setBackground(new Color(0, 0, 139));
		panel_3_1_1_3.setBounds(794, 229, 154, 122);
		panel_2.add(panel_3_1_1_3);
		
		JLabel lblNewLabel_4_2_3 = new JLabel("Supprimer Fili\u00E8re");
		lblNewLabel_4_2_3.setForeground(Color.WHITE);
		lblNewLabel_4_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_2_3.setBounds(10, 97, 134, 14);
		panel_3_1_1_3.add(lblNewLabel_4_2_3);
		
		JLabel lblNewLabel_5_1_1_3 = new JLabel("");
		lblNewLabel_5_1_1_3.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-delete-column-64.png")));
		lblNewLabel_5_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_3.setBounds(31, 15, 83, 71);
		panel_3_1_1_3.add(lblNewLabel_5_1_1_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(151, 216, 154, 2);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(630, 216, 154, 2);
		panel_2.add(separator_1);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setLayout(null);
		panel_3_3_1.setBackground(new Color(0, 0, 139));
		panel_3_3_1.setBounds(986, 305, 133, 122);
		panel_2.add(panel_3_3_1);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("Saisie Notes");
		lblNewLabel_4_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4_1.setBounds(10, 104, 113, 14);
		panel_3_3_1.add(lblNewLabel_4_4_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("");
		lblNewLabel_5_3_1.setIcon(new ImageIcon(AdminPanel.class.getResource("/img/icons8-input-96.png")));
		lblNewLabel_5_3_1.setForeground(Color.WHITE);
		lblNewLabel_5_3_1.setBounds(26, 11, 97, 82);
		panel_3_3_1.add(lblNewLabel_5_3_1);
		
		panel_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_2);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new AjouterEtudiant().show();
			}
		});
		
		
		panel_3_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_1_2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_1_2);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new ModifierEtudiant().show();
			}
		});
		
		
		
		panel_3_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_1_1_1);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_1_1_1);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new SupprimerEtudiant().show();
			}
		});
	
		panel_3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_3);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_3);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new AjouterMatiere().show();
			}
		});
		panel_3_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_1_3);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_1_3);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new ModifierMatiere().show();
			}
		});
		panel_3_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_1_1_2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_1_1_2);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new SupprimerMatiere().show();
			}
		});
		panel_3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_4);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_4);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new AjouterFiliere().show();
			}
		});
		panel_3_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_1_4);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_1_4);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new ModifierFiliere().show();
			}
		});
		
		
		panel_3_1_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_1_1_3);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_1_1_3);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new SupprimerFilere().show();
			}
		});
		
		
		panel_3_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackgroundwhenclicked(panel_3_3_1);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetBackgroundwhenclicked(panel_3_3_1);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new SaisieNotes().show();
			}
		});
		
	}
	
	private void setBackgroundwhenclicked(JPanel panel)
	{
		panel.setBackground(new Color(0,0,128));
	}
	
	private void resetBackgroundwhenclicked(JPanel panel)
	{
		panel.setBackground(new Color(0,0,139));
	}
}
