package E_Learning.view;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class SignupPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel LFirstName, LLastName, LPassword;
	private JTextField tfFirstName, tfLastName;
	private JPasswordField tfPassword;
	private JButton bSignup;
	public SignupPanel() {
		initialize();
	}
	private void initialize() {
		LFirstName = new JLabel("First Name");
		LFirstName.setBounds(21, 13, 65, 14);
		
		tfFirstName = new JTextField(10);
		tfFirstName.setBounds(96, 10, 150, 20);
		
		LLastName = new JLabel("Last Name");
		LLastName.setBounds(21, 43, 65, 14);
		
		tfLastName = new JTextField(10);
		tfLastName.setBounds(96, 40, 150, 20);

		LPassword = new JLabel("Password");
		LPassword.setBounds(21, 73, 65, 14);
		
		tfPassword = new JPasswordField(10);
		tfPassword.setBounds(96, 70, 150, 20);
		
		bSignup = new JButton("Signup");
		bSignup.setBounds(96, 105, 75, 23);
		setLayout(null);

		add(LFirstName);
		add(tfFirstName);
		add(LLastName);
		add(tfLastName);
		add(LPassword);
		add(tfPassword);
		add(bSignup);
	}
	public void addActionListener(ActionListener a) {
		bSignup.addActionListener(a);
	}
	public JButton getBSignup(){
		return bSignup;
	}
	public JTextField getTfFirstName() {
		return tfFirstName;
	}
	public JTextField getTfLastName() {
		return tfLastName;
	}
	public JPasswordField getPfPassword() {
		return tfPassword;
	}
}