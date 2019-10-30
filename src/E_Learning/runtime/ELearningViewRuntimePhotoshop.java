package E_Learning.runtime;
import java.awt.EventQueue;
import E_Learning.dao.ELearningDAO;
import E_Learning.model.ELearningPhotoshopModel;
import E_Learning.model.ELearningSystemModel;
import E_Learning.runtime.ELearningViewRuntimePhotoshop;
import E_Learning.view.ELearningDesignGUIPhotoshop;
import E_Learning.view.LoginSignup;
public class ELearningViewRuntimePhotoshop {
	public ELearningViewRuntimePhotoshop(ELearningDAO pr, ELearningPhotoshopModel pm) {
		this();
	}
	public ELearningViewRuntimePhotoshop() {
	}
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ELearningDesignGUIPhotoshop IF = new ELearningDesignGUIPhotoshop("E-Learning System");
					ELearningDAO elp = new ELearningDAO();
					ELearningSystemModel els = new ELearningSystemModel();
					LoginSignup ls = new LoginSignup("Welcome", elp, IF, els);
					ls.setVisible(true);
					ls.setLocationRelativeTo(null);
				} catch (Exception e) {
					System.out.println("Error "+ e.getMessage());
				}
			}
		});
	}
}