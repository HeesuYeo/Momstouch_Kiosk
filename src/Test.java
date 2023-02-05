import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Test {

	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel label = new JLabel();
		JButton btn = new JButton();
		JLabel btnLabel = new JLabel();
		
		
//		JLabel btnLabel = new JLabel();
//		btnLabel.setBounds(100, 100, 100, 100);
//		btnLabel.setOpaque(true);
//		btnLabel.setBackground(Color.black);
		
		label.setBounds(0, 0, 300, 300);
		label.setOpaque(true);
		label.setBackground(Color.black);
		//label.add(btnLabel);
		label.add(btn);
		label.setLayout(null);
		btn.setLocation(100, 100);
		btn.setSize(100, 100);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//label.add
				
			}
		});
//		btn.setBounds(0,0,100,100);
//		btn.addActionListener(new ActionListener() {
//		
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				label.add(btnLabel);
//				
//			}
//		});
		
//		JButton btn = new JButton();
////		JScrollPane pane = new JScrollPane();
////		f.add(pane);
////		pane.setBounds(0, 0, 200, 200);
//		f.add(btn);
//		btn.setSize(100, 40);
//		btn.setText("click");
//		btn.setLocation(200, 400);
//		
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JLabel label = new JLabel();
//				JLabel label2 = new JLabel();
//				JButton btn2 = new JButton();
//				f.add(label);
//				f.add(label2);
//				label.setText("test");
//				label.setLocation(200, 200);
//				label.setOpaque(true);
//				label.add(btn2);
//				label2.setText("test2");
//				label2.setLocation(200, 200);
//				label2.setSize(200, 200);
//				label2.setOpaque(true);
//				label2.setVisible(false);
//				btn2.setLocation(100, 100);
//				btn2.setSize(30, 30);
//				label.setBackground(Color.white);
//				label.setSize(200, 200);
//				btn2.addActionListener(new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						label.setVisible(false);
//						label2.setVisible(true);
//						
//						
//					}
//				});
//				
//			}
//		});
//		JPanel panel = new JPanel();
//		JScrollPane pane = new JScrollPane();
//		panel.add(pane);
//		f.add(panel);
//		pane.setBounds(0,0, 500, 500);
//		panel.setBounds(0, 0, 500, 500);
//		panel.setBackground(Color.black);
//		panel.setLayout(null);
//		f.add(panel);
		f.add(label);
//		
		//f.setLayout(null);
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		List<JLabel> testList = new ArrayList<>();
//		JLabel a = new LineLabel();
//		JLabel b = new OrderQtyLabel();
//		JLabel c = new OrderAmountLabel();
//		
//		testList.add(a);
//		testList.add(b);
//		testList.add(c);
//		System.out.println(testList);
	}
}
