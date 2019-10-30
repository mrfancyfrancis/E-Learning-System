package E_Learning.view;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import E_Learning.dao.ELearningDAO;
import java.awt.event.ActionEvent;
public class LoginPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel LUsername, LPassword;
	private JTextField tfUsername;
	private JPasswordField tfPassword;
	private JButton bLogin;
	private ELearningDAO elp;
	private ELearningDesignGUIPhotoshop IF;
	private ELearningIntro EI;
	private LoginPanel LP;
	public LoginPanel(ELearningDAO elp,ELearningDesignGUIPhotoshop IF) {
		initialize();
		this.elp = elp;
		this.IF = IF;
	}
	private void initialize() {
		LUsername = new JLabel("Student No");
		LUsername.setBounds(21, 13, 65, 14);
		
		tfUsername = new JTextField(10);
		tfUsername.setBounds(96, 10, 150, 20);
		
		LPassword = new JLabel("Password");
		LPassword.setBounds(21, 43, 65, 14);
		
		tfPassword = new JPasswordField(10);
		tfPassword.setBounds(96, 40, 150, 20);
		
		bLogin = new JButton("Login");
		bLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				if(validateLogin()) {
					IF.setVisible(true);
					IF.setUsn(Integer.parseInt(getTfUsername().getText()));
				} else {
					JOptionPane.showMessageDialog(null, "Access Denied.");
				}
			}
		});
		bLogin.setBounds(96, 82, 70, 23);
		setLayout(null);
		
		add(LUsername);
		add(tfUsername);
		add(LPassword);
		add(tfPassword);
		add(bLogin);
	}
	public void addActionListener(ActionListener a) {
		bLogin.addActionListener(a);
	}
	public JButton getBLogin(){
		return bLogin;
	}
	public JTextField getTfUsername() {
		return tfUsername;
	}
	public JPasswordField getPfPassword() {
		return tfPassword;
	}
	@SuppressWarnings("deprecation")
	public boolean validateLogin() {
		boolean success = false;
		if(!ELearningDAO.retrieveUsernameAndPassword(Integer.parseInt(tfUsername.getText()), tfPassword.getText()).isEmpty()) {
			this.setVisible(false);
			success = true;
		}
		return success;
	}
}