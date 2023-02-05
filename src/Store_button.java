import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class Store_button extends JButton {
		
	public Store_button(Panel panel) {
		JButton stobtn = new JButton("매장");
		setText("매장");
		setFont(new Font("HY헤드라인M", Font.PLAIN, 13));
		setBackground(new Color(243, 156, 18));
		setForeground(Color.white);
		Border border = BorderFactory.createLineBorder(new Color(243, 156, 18), 1);
		setBorder(border); 
		setBounds(391, 20, 80, 35);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//panel.storeButtonOn();
				
			}
		});

	
	}
}
