package views;
import java.awt.Button;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_password;
	private JTextField textField_email;
	private JTextField textField_name;
	private JTextField textField_surname;
	private JTextField textField_username;
	JButton resetButton = new JButton("Reset");
	JButton signUpButton = new JButton("Sign Up");

	/**
	 * Launch the application.
	 */

	// Create the frame.
	public LoginUI() {
		setTitle("SignUp");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Button btn_login = new Button("Login");
		btn_login.setBounds(565, 480, 70, 22);
		btn_login.setForeground(Color.WHITE);
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_login.setBackground(Color.GRAY);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.GRAY);
		separator_1_1.setBounds(447, 136, 289, 2);

		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(Color.WHITE);
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(447, 34, 118, 14);

		textField_name = new JTextField();
		textField_name.setBounds(447, 48, 289, 20);
		textField_name.setColumns(10);

		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBackground(Color.GRAY);
		separator_1_1_1.setBounds(447, 79, 289, 2);

		JLabel lblSurname = new JLabel("SURNAME");
		lblSurname.setForeground(Color.WHITE);
		lblSurname.setBackground(Color.WHITE);
		lblSurname.setBounds(447, 92, 118, 14);

		textField_surname = new JTextField();
		textField_surname.setColumns(10);
		textField_surname.setBounds(447, 107, 289, 20);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.GRAY);
		separator_2.setBounds(406, 363, 362, -9);

		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(447, 149, 118, 14);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBackground(Color.WHITE);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.GRAY);
		separator_3.setBounds(457, 322, 289, 2);

		textField_username = new JTextField();
		textField_username.setColumns(10);
		textField_username.setBounds(447, 164, 289, 20);

		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setBounds(447, 208, 46, 14);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setBounds(447, 253, 289, 2);

		textField_email = new JTextField();
		textField_email.setBounds(447, 222, 289, 20);
		textField_email.setColumns(10);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(447, 266, 92, 14);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBackground(Color.WHITE);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.GRAY);
		separator_1.setBounds(447, 195, 289, 2);

		textField_password = new JTextField();
		textField_password.setBounds(447, 281, 289, 20);
		textField_password.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 382, 512);
		panel.setLayout(null);
		contentPane.add(panel);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(-80, -12, 512, 537);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Pictures\\Wallpapers\\Sports-Wallpapers-and-Backgrounds-HD-by-Pocket-Books.jpg"));

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\Facebook_logo_(square) (1).png"));
		btnNewButton_1.setBounds(552, 416, 40, 40);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\219-2197783_training-documents-google-logo-icon-png (1).png"));
		btnNewButton_2.setBounds(602, 416, 40, 40);

		JLabel lblAlternative = new JLabel("Or sign up with:");
		lblAlternative.setForeground(Color.WHITE);
		lblAlternative.setBounds(552, 393, 96, 14);

		JLabel lblNewLabel_5 = new JLabel("Or");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(589, 460, 46, 14);

		resetButton.setBackground(Color.GRAY);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		resetButton.setBounds(450, 345, 89, 23);

		signUpButton.setBackground(Color.ORANGE);
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		signUpButton.setBounds(602, 345, 89, 23);

		// adding stuff to content pane
		contentPane.add(separator);
		contentPane.add(separator_2);
		contentPane.add(separator_3);
		contentPane.add(separator_1);
		contentPane.add(separator_1_1);
		contentPane.add(separator_1_1_1);
		contentPane.add(lblName);
		contentPane.add(lblPassword);
		contentPane.add(lblUsername);
		contentPane.add(lblEmail);
		contentPane.add(lblSurname);
		contentPane.add(textField_name);
		contentPane.add(textField_surname);
		contentPane.add(textField_username);
		contentPane.add(textField_email);
		contentPane.add(textField_password);
		contentPane.add(btn_login);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(lblAlternative);
		contentPane.add(lblNewLabel_5);
		contentPane.add(resetButton);
		contentPane.add(signUpButton);
	}

	public JButton getDeleteButton() {
		return resetButton;

	}
	public JButton getSignUpButton() {
		return signUpButton;
	}
	public void resetForm() {
		textField_password.setText(" ");
		textField_email.setText(" ");
		textField_name.setText(" ");
		textField_surname.setText(" ");
		textField_username.setText(" ");
	}
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	public String getName() {
		return textField_password.getText();
	}
	public String getSurname() {
		return textField_email.getText();
	}
	public String getUsername() {
		return textField_name.getText();
	}
	public String getEmail() {
		return textField_surname.getText();
	}
	public String getPassword() {
		return textField_username.getText();
	}
}