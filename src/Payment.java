

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Payment extends JLabel{

  // private JFrame frame;
   //JLabel payment = new JLabel();
   /**
    * Launch the application.
    */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//            	Payment window = new Payment();
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//            
//            //payment.setVisible(false);
//         }
//      });
//   }

   /**
    * Create the application.
    */
   public Payment() {
      //initialize();
//	   		frame = new JFrame();
//	      frame.setBounds(100, 100, 600, 1000);
//	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	      frame.getContentPane().setLayout(null);
//	      frame.getContentPane().setBackground(Color.white);
//	      frame.setLocationRelativeTo(null);
	      
	      
	      JLabel lblNewLabel = new JLabel("결제가 완료되었습니다");
	      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	      lblNewLabel.setBounds(108, 98, 351, 97);
	      lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
	      
	      
	      JLabel lblNewLabel_2 = new JLabel("대기번호");
	      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	      lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 38));
	      lblNewLabel_2.setBounds(154, 205, 258, 49);
	     
	      
	      JLabel lblNewLabel_3 = new JLabel("919");
	      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	      lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 25));
	      lblNewLabel_3.setBounds(251, 283, 59, 37);
	    
	      
	      JLabel lblNewLabel_4 = new JLabel("영수증을 꼭 가져가세요");
	      lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
	      lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 25));
	      lblNewLabel_4.setBounds(150, 368, 273, 31);
	      
	      
	      JLabel lblNewLabel_5 = new JLabel("제품 수령시 영수증의 대기번호가 필요합니다");
	      lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 23));
	      lblNewLabel_5.setBounds(48, 772, 492, 24);
	      
	      
	      JLabel lblNewLabel_6 = new JLabel("꼭 소지부탁드립니다");
	      lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 23));
	      lblNewLabel_6.setBounds(185, 821, 238, 24);
	      
	      
	      JLabel lblNewLabel_1 = new JLabel("결제 완료");
	      lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
	      lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
	      lblNewLabel_1.setBackground(new Color(230, 149, 0));
	      lblNewLabel_1.setForeground(new Color(255, 255, 255));
	      lblNewLabel_1.setOpaque(true); 
	      lblNewLabel_1.setBounds(0, 0, 586, 68);
	      
	      
	      JLabel lblNewLabel_1_1 = new JLabel("");
	      lblNewLabel_1_1.setOpaque(true);
	      lblNewLabel_1_1.setForeground(Color.WHITE);
	      lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 15));
	      lblNewLabel_1_1.setBackground(new Color(230, 149, 0));
	      lblNewLabel_1_1.setBounds(0, 943, 586, 18);
	     
	      
	      JLabel lblNewLabel_7 = new JLabel("");
	      lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
	      BufferedImage bufferedImage;
	      try {
	         BufferedImage buffered = ImageIO.read(new File("myFiles/images/background/receipt.png"));
	         Image scaledImage =
	                     buffered.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	         lblNewLabel_7.setIcon(new ImageIcon(scaledImage));  
	         
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	      lblNewLabel_7.setBounds(154, 444, 258, 273);
	      
	   
	   
	      
	      add(lblNewLabel);
	      add(lblNewLabel_2);
	      add(lblNewLabel_3);
	      add(lblNewLabel_4);
	      add(lblNewLabel_5);
	      add(lblNewLabel_6);
	      add(lblNewLabel_1);
	      add(lblNewLabel_1_1);
	      add(lblNewLabel_7);
	      
	      
	      setSize(600,1000);
	      setLocation(0,0);
   }
}

   /**
    * Initialize the contents of the frame.
    */
//   private void initialize() {
//      frame = new JFrame();
//      frame.setBounds(100, 100, 600, 1000);
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      frame.getContentPane().setLayout(null);
//      frame.getContentPane().setBackground(Color.white);
//      frame.setLocationRelativeTo(null);
//      
//      
//      JLabel lblNewLabel = new JLabel("결제가 완료되었습니다");
//      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//      lblNewLabel.setBounds(108, 98, 351, 97);
//      lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
//      frame.getContentPane().add(lblNewLabel);
//      
//      JLabel lblNewLabel_2 = new JLabel("대기번호");
//      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
//      lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 38));
//      lblNewLabel_2.setBounds(154, 205, 258, 49);
//      frame.getContentPane().add(lblNewLabel_2);
//      
//      JLabel lblNewLabel_3 = new JLabel("919");
//      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
//      lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 25));
//      lblNewLabel_3.setBounds(251, 283, 59, 37);
//      frame.getContentPane().add(lblNewLabel_3);
//      
//      JLabel lblNewLabel_4 = new JLabel("영수증을 꼭 가져가세요");
//      lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
//      lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 25));
//      lblNewLabel_4.setBounds(150, 368, 273, 31);
//      frame.getContentPane().add(lblNewLabel_4);
//      
//      JLabel lblNewLabel_5 = new JLabel("제품 수령시 영수증의 대기번호가 필요합니다");
//      lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 23));
//      lblNewLabel_5.setBounds(48, 772, 492, 24);
//      frame.getContentPane().add(lblNewLabel_5);
//      
//      JLabel lblNewLabel_6 = new JLabel("꼭 소지부탁드립니다");
//      lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 23));
//      lblNewLabel_6.setBounds(185, 821, 238, 24);
//      frame.getContentPane().add(lblNewLabel_6);
//      
//      JLabel lblNewLabel_1 = new JLabel("결제 완료");
//      lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
//      lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
//      lblNewLabel_1.setBackground(new Color(230, 149, 0));
//      lblNewLabel_1.setForeground(new Color(255, 255, 255));
//      lblNewLabel_1.setOpaque(true); 
//      lblNewLabel_1.setBounds(0, 0, 586, 68);
//      frame.getContentPane().add(lblNewLabel_1);
//      
//      JLabel lblNewLabel_1_1 = new JLabel("");
//      lblNewLabel_1_1.setOpaque(true);
//      lblNewLabel_1_1.setForeground(Color.WHITE);
//      lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 15));
//      lblNewLabel_1_1.setBackground(new Color(230, 149, 0));
//      lblNewLabel_1_1.setBounds(0, 943, 586, 18);
//      frame.getContentPane().add(lblNewLabel_1_1);
//      
//      JLabel lblNewLabel_7 = new JLabel("");
//      lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
//      BufferedImage bufferedImage;
//      try {
//         BufferedImage buffered = ImageIO.read(new File("myFiles/images/background/receipt.png"));
//         Image scaledImage =
//                     buffered.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
//         lblNewLabel_7.setIcon(new ImageIcon(scaledImage));  
//         
//      } catch (IOException e) {
//         e.printStackTrace();
//      }
//      lblNewLabel_7.setBounds(154, 444, 258, 273);
//      frame.getContentPane().add(lblNewLabel_7);
//   
//   
//      
//      payment.add(lblNewLabel);
//      payment.add(lblNewLabel_2);
//      payment.add(lblNewLabel_3);
//      payment.add(lblNewLabel_4);
//      payment.add(lblNewLabel_5);
//      payment.add(lblNewLabel_6);
//      payment.add(lblNewLabel_1);
//      payment.add(lblNewLabel_1_1);
//      payment.add(lblNewLabel_7);
//      
//      
//      frame.getContentPane().add(payment);
//      payment.setSize(600,1000);
//      payment.setLocation(0,0);
//      //close();
////      try {
////         payment.setVisible(true);
////         Thread.sleep(3000);
////         payment.setVisible(false);
////      } catch (InterruptedException e) {
////         // TODO Auto-generated catch block
////         e.printStackTrace();
////      }
//      
//   }
   
//   public void close() {
//      try {
//      
//      Thread.sleep(3000);
//   } catch (InterruptedException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//   }
//      payment.setVisible(false);
//   }
//}
