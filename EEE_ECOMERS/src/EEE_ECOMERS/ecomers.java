package EEE_ECOMERS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecomers {

	private JFrame frame;
	int i=0;
	int b=0;
	private JTextField txtRs;
	private JTextField txtRs_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecomers window = new ecomers();
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
	public ecomers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 638, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(212, 25, 156, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\omline lab\\Desktop\\New folder\\3.jpg"));
		lblNewLabel_1.setBounds(21, 100, 207, 146);
		frame.getContentPane().add(lblNewLabel_1);
		JLabel lb2 = new JLabel("TOTAL = 0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lb2.setBounds(488, 53, 101, 20);
		frame.getContentPane().add(lb2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\omline lab\\Desktop\\New folder\\1.jpg"));
		lblNewLabel_2.setBounds(274, 100, 232, 146);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtRs = new JTextField();
		txtRs.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs.setText("RS:300");
		txtRs.setBounds(71, 288, 86, 20);
		frame.getContentPane().add(txtRs);
		txtRs.setColumns(10);
		
		txtRs_1 = new JTextField();
		txtRs_1.setText("RS:300");
		txtRs_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtRs_1.setBounds(356, 290, 86, 20);
		frame.getContentPane().add(txtRs_1);
		txtRs_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KINDLE VERSION", "PDF", "PAPER"}));
		comboBox.setBounds(71, 348, 129, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "PAPER", "PDF", "KINDLE"}));
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setBounds(358, 343, 121, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lb = new JLabel("CART : 0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb.setBounds(478, 11, 111, 31);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				b=b+300;
				lb2.setText("BILL:"+b);
			}
		});
		btnNewButton.setBounds(68, 394, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
				b=b+300;
				lb2.setText("BILL:"+b);
			}
		});
		btnNewButton_1.setBounds(365, 394, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
