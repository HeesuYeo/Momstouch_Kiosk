import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JPanel;

public class Mainselect {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainselect window = new Mainselect();
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
	public Mainselect() {
		initialize();
	}

	
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("포장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(299, 20, 80, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("매장");
		btnNewButton_1.setBounds(391, 20, 80, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("첫화면");
		btnNewButton_1_1.setBounds(483, 20, 80, 35);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("신제품");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(38, 167, 80, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("버거");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(164, 167, 80, 43);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("치킨");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_2.setBounds(312, 167, 80, 43);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("순살치킨");
		btnNewButton_2_3.setBounds(446, 167, 90, 43);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JLabel lblNewLabel = new JLabel("          제품명                          수량                             금액                                                                 주문수량");
		lblNewLabel.setBackground(new Color(196, 198, 197));
		lblNewLabel.setBounds(0, 560, 585, 35);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(196, 198, 197));
		
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true); 
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(20, 593, 318, 170);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(196, 198, 197));
		lblNewLabel_3.setBounds(378, 560, 34, 203);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(0, 208, 585, 353);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("제품명");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 571, 90, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(408, 593, 177, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("                주문 금액");
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setBackground(new Color(196, 198, 197));
		lblNewLabel_3_1.setBounds(408, 633, 177, 18);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(408, 652, 177, 35);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton_3 = new JButton("전체 취소");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(70, 50, 41));
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(408, 684, 177, 30);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("결제 확인");
		btnNewButton_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1.setBackground(new Color(230, 149, 0));
		btnNewButton_3_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_3_1.setBounds(408, 458, 177, 52);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("                주문 금액");
		lblNewLabel_3_1_1.setOpaque(true);
		lblNewLabel_3_1_1.setBackground(new Color(196, 198, 197));
		lblNewLabel_3_1_1.setBounds(0, 383, 283, 18);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("결제 확인");
		btnNewButton_3_1_1.setForeground(Color.WHITE);
		btnNewButton_3_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_3_1_1.setBackground(new Color(230, 149, 0));
		btnNewButton_3_1_1.setBounds(77, 333, 187, 190);
		frame.getContentPane().add(btnNewButton_3_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(164, 533, 10, 58);
		frame.getContentPane().add(panel);
	}
}
