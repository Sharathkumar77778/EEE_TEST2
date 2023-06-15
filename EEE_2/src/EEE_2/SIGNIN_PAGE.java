package EEE_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class SIGNIN_PAGE {

	private JFrame frame;
	private JTextField TB1;
	private JTextField TB2;
	private JTextField TB3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SIGNIN_PAGE window = new SIGNIN_PAGE();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SIGNIN_PAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN IN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(222, 30, 132, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(45, 101, 125, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USER NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(45, 174, 151, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(45, 244, 125, 43);
		frame.getContentPane().add(lblNewLabel_3);
		
		TB1 = new JTextField();
		TB1.setBounds(221, 110, 238, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		TB2 = new JTextField();
		TB2.setBounds(222, 183, 237, 20);
		frame.getContentPane().add(TB2);
		TB2.setColumns(10);
		
		TB3 = new JTextField();
		TB3.setBounds(222, 258, 238, 20);
		frame.getContentPane().add(TB3);
		TB3.setColumns(10);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=TB1.getText();
				String un=TB2.getText();
				String ps=TB3.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EEE8","root","mrec");
					String q="select count(*)from logindetails where username=? and password=?";
					PreparedStatement pss=con.prepareStatement(q);
					pss.setString(1, un);
					pss.setString(2, ps);
					ResultSet rs=pss.executeQuery();
					rs.next();
					int c=rs.getInt(1);
					if(c==0)
					{
						JOptionPane.showMessageDialog(btnNewButton, "invalid");
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Hello"+n+"\n login done");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(222, 355, 158, 43);
		frame.getContentPane().add(btnNewButton);
	}
}
