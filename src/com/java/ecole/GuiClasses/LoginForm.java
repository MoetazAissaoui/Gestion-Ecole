package com.java.ecole.GuiClasses;
import com.java.bd.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;


import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 799, 72);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Connecter Vous");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 22, 262, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 11, 45, 40);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0,0,139));
		panel_1.setBounds(0, 72, 799, 313);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Identifiant");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(61, 66, 128, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Mot De Passe");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(61, 137, 160, 29);
		panel_1.add(lblNewLabel_4);
		
		id = new JTextField();
		id.setBorder(null);
		id.setForeground(Color.WHITE);
		id.setBackground(new Color(0,0,139));
		id.setBounds(255, 76, 198, 20);
		panel_1.add(id);
		id.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(241, 107, 180, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(241, 178, 180, 2);
		panel_1.add(separator_1);
		
		pass = new JTextField();
		pass.setForeground(Color.WHITE);
		pass.setBorder(null);
		pass.setBackground(new Color(0,0,139));
		pass.setBounds(255, 147, 198, 20);
		panel_1.add(pass);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginForm.class.getResource("/img/univ_logo_325x270.png")));
		lblNewLabel.setBounds(445, 0, 325, 291);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				String pwd = pass.getText().strip();
				String user=id.getText().strip();
				
				// create db session
				
				ConnectDB db = new ConnectDB();

				try {
					Connection con = db.createConnection();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from users where username = '"+user+"' and password = '"+pwd+"'");
					
					// valid credentials
					if(rs.next())
					{
						//testing previleges
						dispose();
						if (user.equals("admin"))
							new AdminPanel().show();
						else
							new EtudiantPanel().show();
						
					}
					else
						JOptionPane.showInternalMessageDialog(null, "identifiant ou mot de passe incorrect");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showInternalMessageDialog(null, "Base de données non connecté/trouvé");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showInternalMessageDialog(null, "Base de données non connecté/trouvé");
					e1.printStackTrace();
				}

			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(LoginForm.class.getResource("/img/icons8_login_48px.png")));
		lblNewLabel_5.setBounds(241, 218, 48, 48);
		panel_1.add(lblNewLabel_5);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
