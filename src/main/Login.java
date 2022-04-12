package main;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("사원관리 프로그램 로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(82, 91, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(82, 129, 130, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(82, 167, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnAccountRegist = new JButton("회원가입");
		btnAccountRegist.setBounds(211, 167, 117, 29);
		contentPane.add(btnAccountRegist);
		
		ImageIcon logoIcon = new ImageIcon("img/samsungLogo.png");
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(82, 6, 270, 73);
		Image img = logoIcon.getImage().getScaledInstance(
						(int)lblNewLabel.getBounds().getWidth()
						,(int)lblNewLabel.getBounds().getHeight()
						,java.awt.Image.SCALE_SMOOTH);
		logoIcon = new ImageIcon(img);
		lblNewLabel.setIcon(logoIcon);
		contentPane.add(lblNewLabel);
	}
}
