package E_Learning.model;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import E_Learning.dao.ELearningDAO;
import E_Learning.properties.ELearningConstants;
import E_Learning.runtime.ELearningViewRuntimePhotoshop;
import E_Learning.view.ELearningDesignGUIPhotoshop;
import E_Learning.view.ELearningIntro;
import E_Learning.view.LoginPanel;
import E_Learning.view.LoginSignup;
import E_Learning.view.SignupPanel;
public class ELearningSystemModel implements ActionListener {
	static Connection con = null;
	PreparedStatement ps = null;
	private LoginSignup ls;
	private LoginPanel login;
	private ELearningViewRuntimePhotoshop Photo;
	private static ELearningDesignGUIPhotoshop PS;
	private static ELearningIntro ELI;
	public ELearningDAO DAO;
	private static int usn;
	private int lesson1;
	private String lesson1g;
	private int lesson2;
	private String lesson2g;
	private int lesson3;
	private String lesson3g;
	private int lesson4;
	private String lesson4g;
	private int lesson5;
	private String lesson5g;
	private int lesson6;
	private String lesson6g;
	private int lesson7;
	private String lesson7g;
	private int lesson8;
	private String lesson8g;
	private int lesson9;
	private String lesson9g;
	private int fgrade;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public int getLesson1() {
		return lesson1;
	}
	public void setLesson1(int lesson1) {
		this.lesson1 = lesson1;
	}
	public String getLesson1g() {
		return lesson1g;
	}
	public void setLesson1g(String lesson1g) {
		this.lesson1g = lesson1g;
	}
	public int getLesson2() {
		return lesson2;
	}
	public void setLesson2(int lesson2) {
		this.lesson2 = lesson2;
	}
	public String getLesson2g() {
		return lesson2g;
	}
	public void setLesson2g(String lesson2g) {
		this.lesson2g = lesson2g;
	}
	public int getLesson3() {
		return lesson3;
	}
	public void setLesson3(int lesson3) {
		this.lesson3 = lesson3;
	}
	public String getLesson3g() {
		return lesson3g;
	}
	public void setLesson3g(String lesson3g) {
		this.lesson3g = lesson3g;
	}
	public int getLesson4() {
		return lesson4;
	}
	public void setLesson4(int lesson4) {
		this.lesson4 = lesson4;
	}
	public String getLesson4g() {
		return lesson4g;
	}
	public void setLesson4g(String lesson4g) {
		this.lesson4g = lesson4g;
	}
	public int getLesson5() {
		return lesson5;
	}
	public void setLesson5(int lesson5) {
		this.lesson5 = lesson5;
	}
	public String getLesson5g() {
		return lesson5g;
	}
	public void setLesson5g(String lesson5g) {
		this.lesson5g = lesson5g;
	}
	public int getLesson6() {
		return lesson6;
	}
	public void setLesson6(int lesson6) {
		this.lesson6 = lesson6;
	}
	public String getLesson6g() {
		return lesson6g;
	}
	public void setLesson6g(String lesson6g) {
		this.lesson6g = lesson6g;
	}
	public int getLesson7() {
		return lesson7;
	}
	public void setLesson7(int lesson7) {
		this.lesson7 = lesson7;
	}
	public String getLesson7g() {
		return lesson7g;
	}
	public void setLesson7g(String lesson7g) {
		this.lesson7g = lesson7g;
	}
	public int getLesson8() {
		return lesson8;
	}
	public void setLesson8(int lesson8) {
		this.lesson8 = lesson8;
	}
	public String getLesson8g() {
		return lesson8g;
	}
	public void setLesson8g(String lesson8g) {
		this.lesson8g = lesson8g;
	}
	public int getLesson9() {
		return lesson9;
	}
	public void setLesson9(int lesson9) {
		this.lesson9 = lesson9;
	}
	public String getLesson9g() {
		return lesson9g;
	}
	public void setLesson9g(String lesson9g) {
		this.lesson9g = lesson9g;
	}
	public int getFgrade() {
		return fgrade;
	}
	public void setFgrade(int fgrade) {
		this.fgrade = fgrade;
	}
	public static String SwitchProgram(String to) {
		JOptionPane.showMessageDialog(null,"Switching to "+to);
		return to;
	}
	public void signout() {
	}
	public void pson() {
		SwitchProgram(ELearningConstants.PHOTO_SHOP);
		PS.setEnabled(true);
		PS.setVisible(true);
	}
	public void psoff() {
		PS.getContentPane().removeAll();
		PS.setVisible(false);
		PS.setEnabled(false);
	}
	public void signup(SignupPanel sp) {
		boolean AllFieldsAreFilled = false;
		if (!sp.getTfFirstName().getText().trim().contentEquals("")
			&& !sp.getTfLastName().getText().trim().contentEquals("")
			&& !sp.getPfPassword().getPassword().toString().trim().contentEquals("")) {
			AllFieldsAreFilled = true;
		}
		if ((sp.getTfFirstName().getText().trim().length() < 3) || (sp.getTfLastName().getText().trim().length() < 3)) {
			JOptionPane.showMessageDialog(null,"Please enter three or more characters for your first and last name");
			AllFieldsAreFilled = false;
		}
		if (AllFieldsAreFilled) {
			String tempLast = sp.getTfLastName().getText();
			String tempFirst = sp.getTfLastName().getText();
			String usname = ((tempLast).substring(0,2)).concat((tempFirst).substring((tempFirst.length())-3));
			int usn = usname.hashCode();
			try {
				final String PASSWORD_PATTERN = "((?=.*\\d) (?=.*[a-z]) (?=.*[A-Z]) (?=.*[@#$%]))";
				Pattern pattern=Pattern.compile(PASSWORD_PATTERN);
				Matcher matcher=pattern.matcher(sp.getPfPassword().getPassword().toString());
				if ((matcher.lookingAt() == false) && (sp.getPfPassword().getPassword().toString().length()>=6 || sp.getPfPassword().getPassword().toString().length()<=20)) {
					//ELearningDAO.connect();
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearningdb?useSSL=false", "root", "root");
					String insertSContent = "Insert into student(usn, fname, lname, pass)"
							+ " values(?,?,?,?)";
					ps = (PreparedStatement) con.prepareStatement(insertSContent);
					
					ps.setInt(1, usn);
					ps.setString(2, sp.getTfFirstName().getText());
					ps.setString(3, sp.getTfLastName().getText());
					ps.setString(4, String.valueOf(sp.getPfPassword().getPassword()));			 
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Congratulations! Copy your username ("+usn+") to log in.");
				} else {
					JOptionPane.showMessageDialog(null, "Password must contain at least:\n- Numbers from 0-9\n- At least one lowercase character\n- At least one uppercase character\n- At least one of these special characters (@#$%)\n- A minimum of 6 characters and a maximum of 20 characters");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Please fill out all fields before clicking Signup.");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void updategrades(int logusn, String topic) {
		String results = ELearningDAO.searchData(logusn, topic);
		String lessong = "fgrade";
		String lines[] = results.split("\\r?\\n");
		int score = 0;
		int numq = 0;
		for (int x = 1; x < lines.length; x++) {
			String linescore[] = (lines[x]).trim().split("\\s+");
			if ((x%2) == 0) {
				score = score + Integer.parseInt(linescore[linescore.length - 1]);
				numq++;
			}
		}
		// Math Class
		score = (int) Math.ceil(score/numq);
		try {
			ELearningDAO.updateInt(logusn, lessong, score, topic);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	public static void openfile(String filename) {
		try {   				
			File file = new File(filename);
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			e.getMessage();
		}	
	}
	public static String grabILO(String lesson, int logusn) {
		String[] lessons = new String[15];
		String[] ILO = new String[15];
		String pickILO = "";
		lessons = ELearningDAO.getData(logusn);
		ILO = ELearningDAO.getILO(logusn);
		for (int x = 0; x < lessons.length; x++) {
			if(lesson.equals(lessons[x])) {
				pickILO = ILO[x];
			}
		}
		return pickILO;
	}
	public static String grabFileType(String lesson, int logusn) {
		String[] lessons = new String[15];
		String[] filetype = new String[15];
		String file = "";
		lessons = ELearningDAO.getData(logusn);
		filetype = ELearningDAO.getFiletype(logusn);
		for (int x = 0; x < lessons.length; x++) {
			if(lesson.equals(lessons[x])) {
				file = filetype[x];
			}
		}
		return file;
	}
	public static String searchtopic(String[] lessons, String searchresult) {
		String result = "Search Found:";
		for(int x = 0; x < lessons.length; x++) {
			Pattern p = Pattern.compile(searchresult);
			Matcher m = p.matcher(lessons[x]);
			if(m.matches()) {
				result = (result+ "\n "+lessons[x]);
			}	
		}
		return result;
	}
}