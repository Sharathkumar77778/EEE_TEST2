package EEE_ECOMERS;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SIGNUP_PAGE {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SIGNUP_PAGE window = new SIGNUP_PAGE();
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
	public SIGNUP_PAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGNUP PAGE\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(206, 28, 218, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(50, 93, 66, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setBounds(50, 144, 109, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DEPARTMENT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(50, 189, 122, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel programming = new JLabel("FAVOURITE\r\n PROGRAMMING\r\nLANGUAGE");
		programming.setFont(new Font("Tahoma", Font.PLAIN, 17));
		programming.setBounds(50, 211, 342, 82);
		frame.getContentPane().add(programming);
		
		tb = new JTextField();
		tb.setBounds(195, 93, 299, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("MALE\r\n");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		r1.setBounds(195, 152, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		r2.setBounds(306, 152, 109, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "ECE", "CSE", "CSE AIML", "CSE DS", "CSE CS", "CSE ORACLE", "IOT", "MINING", "CIVIL", "MECHANICAL", "AERONAUTICAL"}));
		c1.setBounds(195, 197, 180, 22);
		frame.getContentPane().add(c1);
		
		JCheckBox cb1 = new JCheckBox("JAVA");
		cb1.setBounds(60, 286, 97, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("PYTHON");
		cb2.setBounds(159, 286, 97, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("DATA STRUCTURES");
		cb3.setBounds(258, 286, 134, 23);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("SUBMIT\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if(r1.isSelected())
				{
					g="female";
				}
				else if(r2.isSelected())
				{
					g="male";
				}
				else
				{
					g="invalid";
				}
				String b=(String) c1.getSelectedItem();
				String p;
				if(cb1.isSelected())
						{
					p="java";
					
						}
				else if (cb2.isSelected())
				{
					p="python";
				}
				else
				{
					p="data structures";
				}
			JOptionPane.showConfirmDialog(btnNewButton, "hello"+n+"\n gender : "+g+"\n branch"+b+"\n programming"+p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(206, 379, 128, 41);
		frame.getContentPane().add(btnNewButton);
	}
}

					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
			
				