package E_Learning.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class ELearningAdmin extends JFrame {
	private static final long serialVersionUID = -5657010641971393143L;
	private JPanel contentPane;
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ELearningAdmin frame = new ELearningAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*
	 * Create the frame.
	 */
	public ELearningAdmin() {
		setTitle("Admin\r\n");
		initialize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocation(0, 0);
		setSize(1360, 730);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	private void initialize() {
		
	}
}