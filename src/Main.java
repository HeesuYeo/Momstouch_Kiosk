import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Main {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Main() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("키오스크");
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(228, 185, 1, 1);
		panel.add(layeredPane);

		JButton btnNewButton = new JButton("포장\r\n\r\nTake Out");
		btnNewButton.setBackground(new Color(230, 149, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(89, 630, 140, 78);
		panel.add(btnNewButton);

		JButton btnEatIn = new JButton("매장 Eat In");
		btnEatIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEatIn.setBackground(new Color(230, 149, 0));
		btnEatIn.setBounds(354, 630, 140, 78);
		panel.add(btnEatIn);

		JLabel lblNewLabel = new JLabel("카드 전용 주문 기기 입니다");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(103, 500, 389, 63);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("현금 및 기타 결제는 카운터에서 진행해주세요");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(143, 559, 302, 26);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel();

		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Gi7C-09\\Desktop\\새 폴더\\TDAY 싸이버거.png"));
		lblNewLabel_2.setBounds(12, 10, 560, 458);
		panel.add(lblNewLabel_2);
		
		BufferedImage bufferedImage;
		try {
			bufferedImage = ImageIO.read(new File("C:\\Users\\Gi7C-09\\Desktop\\새 폴더\\TDAY 싸이버거.png"));
			Image scaledImage = bufferedImage.getScaledInstance(580, 505, Image.SCALE_DEFAULT);
			lblNewLabel_2.setIcon(new ImageIcon(scaledImage));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
