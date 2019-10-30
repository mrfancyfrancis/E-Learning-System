package E_Learning.view;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import E_Learning.dao.ELearningDAO;
import E_Learning.model.ELearningSystemModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class LoginSignup extends JFrame {
	private static final long serialVersionUID = 1L;
	private LoginPanel login;
	private SignupPanel signup;
	private JTabbedPane tab;
	private ELearningDAO elp;
	private ELearningDesignGUIPhotoshop IF;
	private ELearningSystemModel els;
	public LoginSignup(String title, ELearningDAO elp, ELearningDesignGUIPhotoshop IF, ELearningSystemModel els) {
		super(title);
		this.elp = elp;
		this.IF = IF;
		this.els = els;
		login = new LoginPanel(this.elp, this.IF);
		signup = new SignupPanel();
		signup.getBSignup().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				els.signup(signup);
			}
		});
		tab = new JTabbedPane();
		tab.addTab("           Signup           ", signup);
		tab.addTab("              Login              ", login);
		getContentPane().add(tab);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0, 0);
		setSize(280, 205);
		setResizable(false);
	}	
	public SignupPanel getSignupPanel(){
		return signup;
	}
	public LoginPanel getLoginPanel(){
		return login;
	}	
	public JTabbedPane getTab(){
		return tab;
	}
}