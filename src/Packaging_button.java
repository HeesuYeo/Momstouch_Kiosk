
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Packaging_button extends JButton {
	
	public Packaging_button(Panel panel) {
		
		setText("포장");
		setFont(new Font("HY헤드라인M", Font.PLAIN, 13));
		setBackground(Color.white);
		Border border = BorderFactory.createLineBorder(Color.white, 1);
		setForeground(new Color(243, 156, 18));
	    setBorder(border); 
		setBounds(299, 20, 80, 35);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				panel.packagingButtonOn();
				
			}
		});
		  
	}

}
