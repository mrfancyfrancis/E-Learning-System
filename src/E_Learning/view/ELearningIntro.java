package E_Learning.view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import E_Learning.dao.ELearningDAO;
import E_Learning.model.ELearningAttribute;
import E_Learning.model.ELearningSystemModel;
public class ELearningIntro extends JFrame {
	private LoginPanel login;
	private SignupPanel signup;
	private int usn;
	private static final long serialVersionUID = 1L;
	private JMenuBar mbCourses;
	private JMenu mOffice, mProg, mWeb;
	private ELearningDAO elp;
	private ELearningDesignGUIPhotoshop IF;
	private ELearningSystemModel els;
	private JMenuItem mWord, mExcel, mPowerpoint,
		 mJava1, mJava2, mHtml, mJs, mPhp, mPs, mDreamweaver;
	private JLabel LUsername, LLPassword;
	private JLabel lblLesson1, lblLesson2, lblLesson3, lblLesson4, lblLesson5, lblLesson6, lblLesson7, lblLesson8, lblLesson9, lblLesson10, lblLesson11, lblLesson12, lblLesson13, lblLesson14, lblLesson15,
	lblAssess1, lblAssess2, lblAssess3, lblAssess4, lblAssess5, lblAssess6, lblAssess7, lblAssess8, lblAssess9, lblAssess10, lblAssess11, lblAssess12, lblAssess13, lblAssess14, lblAssess15,
	lblQ1a, lblQ1b, lblQ1c, lblQ1d1, lblQ1d2, lblQ1e1, lblQ1e2, lblQ1f, lblQ1g, lblQ1h, lblQ1i, lblQ1j, 
	lblQ2a, lblQ2b, lblQ2c, lblQ2d1, lblQ2d2, lblQ2e, lblQ2f, lblQ2g, lblQ2h1, lblQ2h2, lblQ2i, lblQ2j, 
	lblQ3a, lblQ3b, lblQ3c1, lblQ3c2, lblQ3d, lblQ3e, lblQ3f, lblQ3g, lblQ3h, lblQ3i, lblQ3j, 
	lblQ4a, lblQ4b, lblQ4c, lblQ4d, lblQ4e, lblQ4f, lblQ4g, lblQ4h, lblQ4i, lblQ4j, 
	lblQ5a, lblQ5b, lblQ5c, lblQ5d, lblQ5e1, lblQ5e2, lblQ5f, lblQ5g, lblQ5h1, lblQ5h2, lblQ5i1, lblQ5i2, lblQ5j, 
	lblQ6a, lblQ6b, lblQ6c1, lblQ6c2, lblQ6d1, lblQ6d2, lblQ6e, lblQ6f, lblQ6g1, lblQ6g2, lblQ6h, lblQ6i1, lblQ6i2, lblQ6j, 
	lblQ7a, lblQ7b, lblQ7c1, lblQ7c2, lblQ7d, lblQ7e, lblQ7f, lblQ7g, lblQ7h, lblQ7i, lblQ7j, 
	lblQ8a, lblQ8b, lblQ8c, lblQ8d, lblQ8e1, lblQ8e2, lblQ8f, lblQ8g, lblQ8h, lblQ8i, lblQ8j1, lblQ8j2, 
	lblQ9a, lblQ9b1, lblQ9b2, lblQ9c1, lblQ9c2, lblQ9d, lblQ9e, lblQ9f, lblQ9g, lblQ9h, lblQ9i, lblQ9j, 
	lblQ10a, lblQ10b, lblQ10b1, lblQ10b2, lblQ10c1, lblQ10d, lblQ10d1, lblQ10e, lblQ10f, lblQ10g, lblQ10h, lblQ10h1, lblQ10i, lblQ10j, 
	lblQ11a, lblQ11b1, lblQ11b2, lblQ11c1, lblQ11c2, lblQ11d, lblQ11e, lblQ11e1, lblQ11f, lblQ11f1, lblQ11g, lblQ11h, lblQ11h1, lblQ11i, lblQ11j, lblQ11j1,
	lblQ12a, lblQ12b1, lblQ12c1, lblQ12c2, lblQ12d, lblQ12e, lblQ12e1, lblQ12f, lblQ12g, lblQ12g1, lblQ12h, lblQ12i, lblQ12j, 
	lblQ13a, lblQ13b1, lblQ13c1, lblQ13d, lblQ13e, lblQ13e1, lblQ13f, lblQ13g, lblQ13g1, lblQ13h, lblQ13h1, lblQ13i, lblQ13j, 
	lblQ14a, lblQ14b1, lblQ14b2, lblQ14c1, lblQ14c2, lblQ14d,lblQ14d1, lblQ14e, lblQ14f, lblQ14g, lblQ14h, lblQ14i, lblQ14j, 
	lblQ15a, lblQ15b1, lblQ15c1, lblQ15d, lblQ15d1, lblQ15e, lblQ15e1, lblQ15f, lblQ15g, lblQ15h, lblQ15h1, lblQ15i, lblQ15i1, lblQ15j;
	private JTextField tfUsername;
	private JPasswordField ltfPassword;
	private JButton bLogin;
	private JButton bOpenVid1, bOpenVid2, bOpenVid3, bOpenVid4, bOpenVid5, bOpenVid6, bOpenVid7, bOpenVid8, bOpenVid9, bOpenVid10, bOpenVid11, bOpenVid12, bOpenVid13, bOpenVid14, bOpenVid15,
	bOpenPpt1, bOpenPpt2, bOpenPpt3, bOpenPpt4, bOpenPpt5, bOpenPpt6, bOpenPpt7, bOpenPpt8, bOpenPpt9, bOpenPpt10, bOpenPpt11, bOpenPpt12, bOpenPpt13, bOpenPpt14, bOpenPpt15, 
	bAssess1, bAssess2, bAssess3, bAssess4, bAssess5, bAssess6, bAssess7, bAssess8, bAssess9, bAssess10, bAssess11, bAssess12, bAssess13, bAssess14, bAssess15,
	bSubmit1, bSubmit2, bSubmit3, bSubmit4, bSubmit5, bSubmit6, bSubmit7, bSubmit8, bSubmit9, bSubmit10, bSubmit11, bSubmit12, bSubmit13, bSubmit14, bSubmit15,
	bTotal;
	private JTree tTopics;
	private JRadioButton rdbtnQ1aA, rdbtnQ1aB, rdbtnQ1aC, rdbtnQ1aD, rdbtnQ1bA, rdbtnQ1bB, rdbtnQ1bC, rdbtnQ1bD,
	rdbtnQ1cA, rdbtnQ1cB, rdbtnQ1cC, rdbtnQ1cD, rdbtnQ1dA, rdbtnQ1dB, rdbtnQ1dC, rdbtnQ1dD,
	rdbtnQ1eA, rdbtnQ1eB, rdbtnQ1eC, rdbtnQ1eD, rdbtnQ1fA, rdbtnQ1fB, rdbtnQ1fC, rdbtnQ1fD,
	rdbtnQ1gA, rdbtnQ1gB, rdbtnQ1gC, rdbtnQ1gD, rdbtnQ1hA, rdbtnQ1hB, rdbtnQ1hC, rdbtnQ1hD,
	rdbtnQ1iA, rdbtnQ1iB, rdbtnQ1iC, rdbtnQ1iD, rdbtnQ1jA, rdbtnQ1jB, rdbtnQ1jC, rdbtnQ1jD,
	rdbtnQ2aA, rdbtnQ2aB, rdbtnQ2aC, rdbtnQ2aD, rdbtnQ2bA, rdbtnQ2bB, rdbtnQ2bC, rdbtnQ2bD,
	rdbtnQ2cA, rdbtnQ2cB, rdbtnQ2cC, rdbtnQ2cD, rdbtnQ2dA, rdbtnQ2dB, rdbtnQ2dC, rdbtnQ2dD,
	rdbtnQ2eA, rdbtnQ2eB, rdbtnQ2eC, rdbtnQ2eD, rdbtnQ2fA, rdbtnQ2fB, rdbtnQ2fC, rdbtnQ2fD,
	rdbtnQ2gA, rdbtnQ2gB, rdbtnQ2gC, rdbtnQ2gD, rdbtnQ2hA, rdbtnQ2hB, rdbtnQ2hC, rdbtnQ2hD,
	rdbtnQ2iA, rdbtnQ2iB, rdbtnQ2iC, rdbtnQ2iD, rdbtnQ2jA, rdbtnQ2jB, rdbtnQ2jC, rdbtnQ2jD,
	rdbtnQ3aA, rdbtnQ3aB, rdbtnQ3aC, rdbtnQ3aD, rdbtnQ3bA, rdbtnQ3bB, rdbtnQ3bC, rdbtnQ3bD,
	rdbtnQ3cA, rdbtnQ3cB, rdbtnQ3cC, rdbtnQ3cD, rdbtnQ3dA, rdbtnQ3dB, rdbtnQ3dC, rdbtnQ3dD,
	rdbtnQ3eA, rdbtnQ3eB, rdbtnQ3eC, rdbtnQ3eD, rdbtnQ3fA, rdbtnQ3fB, rdbtnQ3fC, rdbtnQ3fD,
	rdbtnQ3gA, rdbtnQ3gB, rdbtnQ3gC, rdbtnQ3gD, rdbtnQ3hA, rdbtnQ3hB, rdbtnQ3hC, rdbtnQ3hD,
	rdbtnQ3iA, rdbtnQ3iB, rdbtnQ3iC, rdbtnQ3iD, rdbtnQ3jA, rdbtnQ3jB, rdbtnQ3jC, rdbtnQ3jD,
	rdbtnQ4aA, rdbtnQ4aB, rdbtnQ4aC, rdbtnQ4aD, rdbtnQ4bA, rdbtnQ4bB, rdbtnQ4bC, rdbtnQ4bD,
	rdbtnQ4cA, rdbtnQ4cB, rdbtnQ4cC, rdbtnQ4cD, rdbtnQ4dA, rdbtnQ4dB, rdbtnQ4dC, rdbtnQ4dD,
	rdbtnQ4eA, rdbtnQ4eB, rdbtnQ4eC, rdbtnQ4eD, rdbtnQ4fA, rdbtnQ4fB, rdbtnQ4fC, rdbtnQ4fD,
	rdbtnQ4gA, rdbtnQ4gB, rdbtnQ4gC, rdbtnQ4gD, rdbtnQ4hA, rdbtnQ4hB, rdbtnQ4hC, rdbtnQ4hD,
	rdbtnQ4iA, rdbtnQ4iB, rdbtnQ4iC, rdbtnQ4iD, rdbtnQ4jA, rdbtnQ4jB, rdbtnQ4jC, rdbtnQ4jD,
	rdbtnQ5aA, rdbtnQ5aB, rdbtnQ5aC, rdbtnQ5aD, rdbtnQ5bA, rdbtnQ5bB, rdbtnQ5bC, rdbtnQ5bD,
	rdbtnQ5cA, rdbtnQ5cB, rdbtnQ5cC, rdbtnQ5cD, rdbtnQ5dA, rdbtnQ5dB, rdbtnQ5dC, rdbtnQ5dD,
	rdbtnQ5eA, rdbtnQ5eB, rdbtnQ5eC, rdbtnQ5eD, rdbtnQ5fA, rdbtnQ5fB, rdbtnQ5fC, rdbtnQ5fD,
	rdbtnQ5gA, rdbtnQ5gB, rdbtnQ5gC, rdbtnQ5gD, rdbtnQ5hA, rdbtnQ5hB, rdbtnQ5hC, rdbtnQ5hD,
	rdbtnQ5iA, rdbtnQ5iB, rdbtnQ5iC, rdbtnQ5iD, rdbtnQ5jA, rdbtnQ5jB, rdbtnQ5jC, rdbtnQ5jD,
	rdbtnQ6aA, rdbtnQ6aB, rdbtnQ6aC, rdbtnQ6aD, rdbtnQ6bA, rdbtnQ6bB, rdbtnQ6bC, rdbtnQ6bD,
	rdbtnQ6cA, rdbtnQ6cB, rdbtnQ6cC, rdbtnQ6cD, rdbtnQ6dA, rdbtnQ6dB, rdbtnQ6dC, rdbtnQ6dD,
	rdbtnQ6eA, rdbtnQ6eB, rdbtnQ6eC, rdbtnQ6eD, rdbtnQ6fA, rdbtnQ6fB, rdbtnQ6fC, rdbtnQ6fD,
	rdbtnQ6gA, rdbtnQ6gB, rdbtnQ6gC, rdbtnQ6gD, rdbtnQ6hA, rdbtnQ6hB, rdbtnQ6hC, rdbtnQ6hD,
	rdbtnQ6iA, rdbtnQ6iB, rdbtnQ6iC, rdbtnQ6iD, rdbtnQ6jA, rdbtnQ6jB, rdbtnQ6jC, rdbtnQ6jD,
	rdbtnQ7aA, rdbtnQ7aB, rdbtnQ7aC, rdbtnQ7aD, rdbtnQ7bA, rdbtnQ7bB, rdbtnQ7bC, rdbtnQ7bD,
	rdbtnQ7cA, rdbtnQ7cB, rdbtnQ7cC, rdbtnQ7cD, rdbtnQ7dA, rdbtnQ7dB, rdbtnQ7dC, rdbtnQ7dD,
	rdbtnQ7eA, rdbtnQ7eB, rdbtnQ7eC, rdbtnQ7eD, rdbtnQ7fA, rdbtnQ7fB, rdbtnQ7fC, rdbtnQ7fD,
	rdbtnQ7gA, rdbtnQ7gB, rdbtnQ7gC, rdbtnQ7gD, rdbtnQ7hA, rdbtnQ7hB, rdbtnQ7hC, rdbtnQ7hD,
	rdbtnQ7iA, rdbtnQ7iB, rdbtnQ7iC, rdbtnQ7iD, rdbtnQ7jA, rdbtnQ7jB, rdbtnQ7jC, rdbtnQ7jD,
	rdbtnQ8aA, rdbtnQ8aB, rdbtnQ8aC, rdbtnQ8aD, rdbtnQ8bA, rdbtnQ8bB, rdbtnQ8bC, rdbtnQ8bD,
	rdbtnQ8cA, rdbtnQ8cB, rdbtnQ8cC, rdbtnQ8cD, rdbtnQ8dA, rdbtnQ8dB, rdbtnQ8dC, rdbtnQ8dD,
	rdbtnQ8eA, rdbtnQ8eB, rdbtnQ8eC, rdbtnQ8eD, rdbtnQ8fA, rdbtnQ8fB, rdbtnQ8fC, rdbtnQ8fD,
	rdbtnQ8gA, rdbtnQ8gB, rdbtnQ8gC, rdbtnQ8gD, rdbtnQ8hA, rdbtnQ8hB, rdbtnQ8hC, rdbtnQ8hD,
	rdbtnQ8iA, rdbtnQ8iB, rdbtnQ8iC, rdbtnQ8iD, rdbtnQ8jA, rdbtnQ8jB, rdbtnQ8jC, rdbtnQ8jD,
	rdbtnQ9aA, rdbtnQ9aB, rdbtnQ9aC, rdbtnQ9aD, rdbtnQ9bA, rdbtnQ9bB, rdbtnQ9bC, rdbtnQ9bD,
	rdbtnQ9cA, rdbtnQ9cB, rdbtnQ9cC, rdbtnQ9cD, rdbtnQ9dA, rdbtnQ9dB, rdbtnQ9dC, rdbtnQ9dD,
	rdbtnQ9eA, rdbtnQ9eB, rdbtnQ9eC, rdbtnQ9eD, rdbtnQ9fA, rdbtnQ9fB, rdbtnQ9fC, rdbtnQ9fD,
	rdbtnQ9gA, rdbtnQ9gB, rdbtnQ9gC, rdbtnQ9gD, rdbtnQ9hA, rdbtnQ9hB, rdbtnQ9hC, rdbtnQ9hD,
	rdbtnQ9iA, rdbtnQ9iB, rdbtnQ9iC, rdbtnQ9iD, rdbtnQ9jA, rdbtnQ9jB, rdbtnQ9jC, rdbtnQ9jD,
	rdbtnQ10aA, rdbtnQ10aB, rdbtnQ10aC, rdbtnQ10aD, rdbtnQ10bA, rdbtnQ10bB, rdbtnQ10bC, rdbtnQ10bD,
	rdbtnQ10cA, rdbtnQ10cB, rdbtnQ10cC, rdbtnQ10cD, rdbtnQ10dA, rdbtnQ10dB, rdbtnQ10dC, rdbtnQ10dD,
	rdbtnQ10eA, rdbtnQ10eB, rdbtnQ10eC, rdbtnQ10eD, rdbtnQ10fA, rdbtnQ10fB, rdbtnQ10fC, rdbtnQ10fD,
	rdbtnQ10gA, rdbtnQ10gB, rdbtnQ10gC, rdbtnQ10gD, rdbtnQ10hA, rdbtnQ10hB, rdbtnQ10hC, rdbtnQ10hD,
	rdbtnQ10iA, rdbtnQ10iB, rdbtnQ10iC, rdbtnQ10iD, rdbtnQ10jA, rdbtnQ10jB, rdbtnQ10jC, rdbtnQ10jD,
	rdbtnQ11aA, rdbtnQ11aB, rdbtnQ11aC, rdbtnQ11aD, rdbtnQ11bA, rdbtnQ11bB, rdbtnQ11bC, rdbtnQ11bD,
	rdbtnQ11cA, rdbtnQ11cB, rdbtnQ11cC, rdbtnQ11cD, rdbtnQ11dA, rdbtnQ11dB, rdbtnQ11dC, rdbtnQ11dD,
	rdbtnQ11eA, rdbtnQ11eB, rdbtnQ11eC, rdbtnQ11eD, rdbtnQ11fA, rdbtnQ11fB, rdbtnQ11fC, rdbtnQ11fD,
	rdbtnQ11gA, rdbtnQ11gB, rdbtnQ11gC, rdbtnQ11gD, rdbtnQ11hA, rdbtnQ11hB, rdbtnQ11hC, rdbtnQ11hD,
	rdbtnQ11iA, rdbtnQ11iB, rdbtnQ11iC, rdbtnQ11iD, rdbtnQ11jA, rdbtnQ11jB, rdbtnQ11jC, rdbtnQ11jD,
	rdbtnQ12aA, rdbtnQ12aB, rdbtnQ12aC, rdbtnQ12aD, rdbtnQ12bA, rdbtnQ12bB, rdbtnQ12bC, rdbtnQ12bD,
	rdbtnQ12cA, rdbtnQ12cB, rdbtnQ12cC, rdbtnQ12cD, rdbtnQ12dA, rdbtnQ12dB, rdbtnQ12dC, rdbtnQ12dD,
	rdbtnQ12eA, rdbtnQ12eB, rdbtnQ12eC, rdbtnQ12eD, rdbtnQ12fA, rdbtnQ12fB, rdbtnQ12fC, rdbtnQ12fD,
	rdbtnQ12gA, rdbtnQ12gB, rdbtnQ12gC, rdbtnQ12gD, rdbtnQ12hA, rdbtnQ12hB, rdbtnQ12hC, rdbtnQ12hD,
	rdbtnQ12iA, rdbtnQ12iB, rdbtnQ12iC, rdbtnQ12iD, rdbtnQ12jA, rdbtnQ12jB, rdbtnQ12jC, rdbtnQ12jD,
	rdbtnQ13aA, rdbtnQ13aB, rdbtnQ13aC, rdbtnQ13aD, rdbtnQ13bA, rdbtnQ13bB, rdbtnQ13bC, rdbtnQ13bD,
	rdbtnQ13cA, rdbtnQ13cB, rdbtnQ13cC, rdbtnQ13cD, rdbtnQ13dA, rdbtnQ13dB, rdbtnQ13dC, rdbtnQ13dD,
	rdbtnQ13eA, rdbtnQ13eB, rdbtnQ13eC, rdbtnQ13eD, rdbtnQ13fA, rdbtnQ13fB, rdbtnQ13fC, rdbtnQ13fD,
	rdbtnQ13gA, rdbtnQ13gB, rdbtnQ13gC, rdbtnQ13gD, rdbtnQ13hA, rdbtnQ13hB, rdbtnQ13hC, rdbtnQ13hD,
	rdbtnQ13iA, rdbtnQ13iB, rdbtnQ13iC, rdbtnQ13iD, rdbtnQ13jA, rdbtnQ13jB, rdbtnQ13jC, rdbtnQ13jD,
	rdbtnQ14aA, rdbtnQ14aB, rdbtnQ14aC, rdbtnQ14aD, rdbtnQ14bA, rdbtnQ14bB, rdbtnQ14bC, rdbtnQ14bD,
	rdbtnQ14cA, rdbtnQ14cB, rdbtnQ14cC, rdbtnQ14cD, rdbtnQ14dA, rdbtnQ14dB, rdbtnQ14dC, rdbtnQ14dD,
	rdbtnQ14eA, rdbtnQ14eB, rdbtnQ14eC, rdbtnQ14eD, rdbtnQ14fA, rdbtnQ14fB, rdbtnQ14fC, rdbtnQ14fD,
	rdbtnQ14gA, rdbtnQ14gB, rdbtnQ14gC, rdbtnQ14gD, rdbtnQ14hA, rdbtnQ14hB, rdbtnQ14hC, rdbtnQ14hD,
	rdbtnQ14iA, rdbtnQ14iB, rdbtnQ14iC, rdbtnQ14iD, rdbtnQ14jA, rdbtnQ14jB, rdbtnQ14jC, rdbtnQ14jD,
	rdbtnQ15aA, rdbtnQ15aB, rdbtnQ15aC, rdbtnQ15aD, rdbtnQ15bA, rdbtnQ15bB, rdbtnQ15bC, rdbtnQ15bD,
	rdbtnQ15cA, rdbtnQ15cB, rdbtnQ15cC, rdbtnQ15cD, rdbtnQ15dA, rdbtnQ15dB, rdbtnQ15dC, rdbtnQ15dD,
	rdbtnQ15eA, rdbtnQ15eB, rdbtnQ15eC, rdbtnQ15eD, rdbtnQ15fA, rdbtnQ15fB, rdbtnQ15fC, rdbtnQ15fD,
	rdbtnQ15gA, rdbtnQ15gB, rdbtnQ15gC, rdbtnQ15gD, rdbtnQ15hA, rdbtnQ15hB, rdbtnQ15hC, rdbtnQ15hD,
	rdbtnQ15iA, rdbtnQ15iB, rdbtnQ15iC, rdbtnQ15iD, rdbtnQ15jA, rdbtnQ15jB, rdbtnQ15jC, rdbtnQ15jD;
private ButtonGroup bgQ1a, bgQ1b, bgQ1c, bgQ1d, bgQ1e, bgQ1f, bgQ1g, bgQ1h, bgQ1i, bgQ1j,
	bgQ2a, bgQ2b, bgQ2c, bgQ2d, bgQ2e, bgQ2f, bgQ2g, bgQ2h, bgQ2i, bgQ2j,
	bgQ3a, bgQ3b, bgQ3c, bgQ3d, bgQ3e, bgQ3f, bgQ3g, bgQ3h, bgQ3i, bgQ3j,
	bgQ4a, bgQ4b, bgQ4c, bgQ4d, bgQ4e, bgQ4f, bgQ4g, bgQ4h, bgQ4i, bgQ4j,
	bgQ5a, bgQ5b, bgQ5c, bgQ5d, bgQ5e, bgQ5f, bgQ5g, bgQ5h, bgQ5i, bgQ5j,
	bgQ6a, bgQ6b, bgQ6c, bgQ6d, bgQ6e, bgQ6f, bgQ6g, bgQ6h, bgQ6i, bgQ6j,
	bgQ7a, bgQ7b, bgQ7c, bgQ7d, bgQ7e, bgQ7f, bgQ7g, bgQ7h, bgQ7i, bgQ7j,
	bgQ8a, bgQ8b, bgQ8c, bgQ8d, bgQ8e, bgQ8f, bgQ8g, bgQ8h, bgQ8i, bgQ8j,
	bgQ9a, bgQ9b, bgQ9c, bgQ9d, bgQ9e, bgQ9f, bgQ9g, bgQ9h, bgQ9i, bgQ9j,
	bgQ10a, bgQ10b, bgQ10c, bgQ10d, bgQ10e, bgQ10f, bgQ10g, bgQ10h, bgQ10i, bgQ10j,
	bgQ11a, bgQ11b, bgQ11c, bgQ11d, bgQ11e, bgQ11f, bgQ11g, bgQ11h, bgQ11i, bgQ11j,
	bgQ12a, bgQ12b, bgQ12c, bgQ12d, bgQ12e, bgQ12f, bgQ12g, bgQ12h, bgQ12i, bgQ12j,
	bgQ13a, bgQ13b, bgQ13c, bgQ13d, bgQ13e, bgQ13f, bgQ13g, bgQ13h, bgQ13i, bgQ13j,
	bgQ14a, bgQ14b, bgQ14c, bgQ14d, bgQ14e, bgQ14f, bgQ14g, bgQ14h, bgQ14i, bgQ14j,
	bgQ15a, bgQ15b, bgQ15c, bgQ15d, bgQ15e, bgQ15f, bgQ15g, bgQ15h, bgQ15i, bgQ15j;
	private JPanel pMain;
	private Panel panel1, panel2;
	private double score1a, score1b, score1c, score1d, score1e, score1f, score1g, score1h, score1i, score1j,
	score2a, score2b, score2c, score2d, score2e, score2f, score2g, score2h, score2i, score2j,
	score3a, score3b, score3c, score3d, score3e, score3f, score3g, score3h, score3i, score3j,
	score4a, score4b, score4c, score4d, score4e, score4f, score4g, score4h, score4i, score4j,
	score5a, score5b, score5c, score5d, score5e, score5f, score5g, score5h, score5i, score5j,
	score6a, score6b, score6c, score6d, score6e, score6f, score6g, score6h, score6i, score6j,
	score7a, score7b, score7c, score7d, score7e, score7f, score7g, score7h, score7i, score7j,
	score8a, score8b, score8c, score8d, score8e, score8f, score8g, score8h, score8i, score8j,
	score9a, score9b, score9c, score9d, score9e, score9f, score9g, score9h, score9i, score9j,
	score10a, score10b, score10c, score10d, score10e, score10f, score10g, score10h, score10i, score10j,
	score11a, score11b, score11c, score11d, score11e, score11f, score11g, score11h, score11i, score11j,
	score12a, score12b, score12c, score12d, score12e, score12f, score12g, score12h, score12i, score12j,
	score13a, score13b, score13c, score13d, score13e, score13f, score13g, score13h, score13i, score13j,
	score14a, score14b, score14c, score14d, score14e, score14f, score14g, score14h, score14i, score14j,
	score15a, score15b, score15c, score15d, score15e, score15f, score15g, score15h, score15i, score15j,
	lesson1g, lesson2g, lesson3g, lesson4g, lesson5g, lesson6g, lesson7g, lesson8g, lesson9g, lesson10g, lesson11g, lesson12g, lesson13g, lesson14g, lesson15g, total, ave;
	public ELearningIntro(String title, ELearningDAO elp, ELearningDesignGUIPhotoshop IF, ELearningSystemModel els) {
		super(title);
		initialize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0, 0);
		setSize(1360, 730);
		setResizable(false);
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
	}
	private void initialize() {
		pMain = new JPanel();
		login = new LoginPanel(this.elp, this.IF);
		signup = new SignupPanel();
		signup.getBSignup().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				els.signup(signup);
			}
		});
		pMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pMain);
		pMain.setLayout(null);
		
		mbCourses = new JMenuBar();
		setJMenuBar(mbCourses);
		
		mOffice = new JMenu("Office");
		mbCourses.add(mOffice);
		
		mWord = new JMenuItem("Word");
		mOffice.add(mWord);
		
		mExcel = new JMenuItem("Excel");
		mOffice.add(mExcel);
		
		mPowerpoint = new JMenuItem("Powerpoint");
		mOffice.add(mPowerpoint);
		
		mProg = new JMenu("Programming");
		mbCourses.add(mProg);
		
		mJava1 = new JMenuItem("Java1");
		mProg.add(mJava1);
		
		mJava2 = new JMenuItem("Java2");
		mProg.add(mJava2);
		
		mWeb = new JMenu("Web Development");
		mbCourses.add(mWeb);
		
		mHtml = new JMenuItem("HTML/CSS");
		mWeb.add(mHtml);
		
		mJs = new JMenuItem("JavaScript");
		mWeb.add(mJs);
		
		mPhp = new JMenuItem("PHP");
		mWeb.add(mPhp);
		
		mPs = new JMenuItem("Photoshop");
		mWeb.add(mPs);
		
		mDreamweaver = new JMenuItem("Dreamweaver");
		mWeb.add(mDreamweaver);
		
    	panel1 = new Panel();
    	panel1.setBackground(Color.WHITE);
    	panel1.setBounds(10, 10, 145, 660);
    	pMain.setVisible(true);
    	pMain.add(panel1);

    	tTopics = new JTree();
    	tTopics.setCellRenderer(new DefaultTreeCellRenderer() {
    		private static final long serialVersionUID = 1L;
    		private Icon loadIcon = UIManager.getIcon("OptionPane.errorIcon");
    		private Icon saveIcon = UIManager.getIcon("OptionPane.informationIcon");
    		@Override
    		public Component getTreeCellRendererComponent(JTree tree,
                Object value, boolean selected, boolean expanded,
                boolean isLeaf, int row, boolean focused) {
    				Component c = super.getTreeCellRendererComponent(tree, value,
    						selected, expanded, isLeaf, row, focused);
    				if (selected) {
    					setIcon(loadIcon);
    				} else {
    					setIcon(saveIcon);
    				}
    				return c;
    			}
    	});
    	tTopics.setBounds(42, 5, 61, 16);
    	tTopics.setBackground(Color.WHITE);
    	tTopics.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Options") {
    		private static final long serialVersionUID = 1L;
    			{
    				DefaultMutableTreeNode topic;
    				topic = new DefaultMutableTreeNode("Login");
    				add(topic);
    				topic = new DefaultMutableTreeNode("Signup");
    				add(topic);
    			}
    		}
    	));
    	panel1.add(tTopics);

    	panel2 = new Panel();
    	panel2.setBounds(180, 10, 1155, 660);
    	pMain.add(panel2);
    	panel2.setLayout(null);
    	
    	tTopics.addTreeSelectionListener(new TreeSelectionListener() 
    	{
    		public void valueChanged(TreeSelectionEvent tse) {
    			tTopics.getSelectionModel().setSelectionMode (TreeSelectionModel.SINGLE_TREE_SELECTION);
    				String node = tse.getNewLeadSelectionPath().getLastPathComponent().toString();
    				/* React to the node selection. */
    				if(node.equals("Login")) {
    					panel2.removeAll();
    					panel2.repaint();
    					LUsername = new JLabel("Username");
    					LUsername.setBounds(21, 13, 65, 14);
    					
    					tfUsername = new JTextField(10);
    					tfUsername.setBounds(96, 10, 150, 20);
    					
    					LLPassword = new JLabel("Password");
    					LLPassword.setBounds(21, 43, 65, 14);
    					
    					ltfPassword = new JPasswordField(10);
    					ltfPassword.setBounds(96, 40, 150, 20);
    					
    					bLogin = new JButton("Login");
    					bLogin.setBounds(96, 82, 70, 23);
    					setLayout(null);
    					bLogin.addActionListener(new ActionListener() 
    					{
    						public void actionPerformed(ActionEvent e) {
    							if(login.validateLogin()) {
    								IF.setVisible(true);
    								IF.setUsn(Integer.parseInt(gettfUsername().getText()));
    							} else {
    								JOptionPane.showMessageDialog(null, "Access Denied.");
    							}
    						}
    					});
    					
    					panel2.add(LUsername);
    					panel2.add(tfUsername);
    					panel2.add(LLPassword);
    					panel2.add(ltfPassword);
    					panel2.add(bLogin);
    				
    				} else if(node.equals("Signup")) {
    					signup.getBSignup().addActionListener(new ActionListener() {
    						public void actionPerformed(ActionEvent arg0) {
    							els.signup(signup);
    						}
    					});
    					getContentPane().add(getSignupPanel());
    				}
    		}
    	});
		mPowerpoint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				panel1 = new Panel();
		    	panel1.setBackground(Color.WHITE);
		    	panel1.setBounds(10, 10, 145, 660);

		    	tTopics = new JTree();
		    	tTopics.setCellRenderer(new DefaultTreeCellRenderer() {
		    		private static final long serialVersionUID = 1L;
		    		private Icon loadIcon = UIManager.getIcon("OptionPane.errorIcon");
		    		private Icon saveIcon = UIManager.getIcon("OptionPane.informationIcon");
		    		@Override
		    		public Component getTreeCellRendererComponent(JTree tree,
		                Object value, boolean selected, boolean expanded,
		                boolean isLeaf, int row, boolean focused) {
		    				Component c = super.getTreeCellRendererComponent(tree, value,
		    						selected, expanded, isLeaf, row, focused);
		    				if (selected) {
		    					setIcon(loadIcon);
		    				} else {
		    					setIcon(saveIcon);
		    				}
		    				return c;
		    			}
		    	});
		    	tTopics.setBounds(42, 5, 61, 16);
		    	tTopics.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Lessons") {
		    		private static final long serialVersionUID = 1L;
		    			{
		    				DefaultMutableTreeNode topic;
		    				topic = new DefaultMutableTreeNode("Lesson 1");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 2");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 3");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 4");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 5");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 6");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 7");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 8");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 9");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 10");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 11");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 12");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 13");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 14");
		    				add(topic);
		    				topic = new DefaultMutableTreeNode("Lesson 15");
		    				add(topic);
		    			}
		    	}
		    	));
		    	panel1.add(tTopics);

		    	bTotal = new JButton("SEE SCORES");
		    	bTotal.setBounds(240, 500, 150, 100);
		    	bTotal.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						total = lesson1g+lesson2g+lesson3g+lesson4g+lesson5g+lesson6g+lesson7g+lesson8g+lesson9g;
						ave = Math.ceil(total/9);
						JOptionPane.showMessageDialog(null, "Your scores are:\nQuiz#1: "+lesson1g+"\nQuiz#2: "+lesson2g+"\nQuiz#3: "+lesson3g+"\nQuiz#4: "+lesson4g+"\nQuiz#5: "+lesson5g+"\nQuiz#6: "+lesson6g+"\nQuiz#7: "+lesson7g+"\nQuiz#8: "+lesson8g+"\nQuiz#9: "+lesson9g+"\nQuiz#10: "+lesson10g+"\nQuiz#11: "+lesson11g+"\nQuiz#12: "+lesson12g+"\nQuiz#13: "+lesson13g+"\nQuiz#14: "+lesson14g+"\nQuiz#15: "+lesson15g+"\n\nTotal: "+total+"\nAverage: "+ave);
					}
		    	});
		    	panel1.add(bTotal);
		    	pMain.add(panel1);

		    	panel2 = new Panel();
		    	panel2.setBounds(180, 10, 1155, 660);
		    	pMain.add(panel2);
		    	panel2.setLayout(null);
		    	
		    	tTopics.addTreeSelectionListener(new TreeSelectionListener() {
		    		public void valueChanged(TreeSelectionEvent tse) {
		    			tTopics.getSelectionModel().setSelectionMode (TreeSelectionModel.SINGLE_TREE_SELECTION);
		    				String node = tse.getNewLeadSelectionPath().getLastPathComponent().toString();
		    				/* React to the node selection. */
		    				if(node.equals("Lesson 1")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson1 = new JLabel("Lesson 1: GETTING STARTED WITH POWERPOINT");
		    					lblLesson1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson1.setBounds(50, 11, 500, 32);
		    					bOpenVid1 = new JButton("Play Video");
		    					bOpenVid1.setBounds(50, 500, 150, 100);
		    					bOpenVid1.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 1 combined.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt1 = new JButton("Play Presentation");
		    					bOpenPpt1.setBounds(240, 500, 150, 100);
		    					bOpenPpt1.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("1.) Getting Started with PowerPoint.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess1 = new JButton("Assessment Task");
		    					bAssess1.setBounds(430, 500, 150, 100);
		    					bAssess1.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent ae) {
										panel2.removeAll();
										panel2.repaint();
										lblAssess1 = new JLabel("Assessment Task #1: GETTING STARTED WITH POWERPOINT");
			        					lblAssess1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			        					lblAssess1.setBounds(50, 11, 700, 32);
			        					lblQ1a= new JLabel("1. PowerPoint uses slides to build a ___________?");
			        					lblQ1a.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1a.setBounds(50, 41, 1000, 32);
			        					rdbtnQ1aA = new JRadioButton("a. Presentation");
			        					rdbtnQ1aA.setBounds(50, 71, 250, 25);
			        					rdbtnQ1aA.setBackground(Color.WHITE);
			        					rdbtnQ1aB = new JRadioButton("b. Letters");
			        					rdbtnQ1aB.setBounds(300, 71, 250, 25);
			        					rdbtnQ1aB.setBackground(Color.WHITE);
			        					rdbtnQ1aC = new JRadioButton("c. Buildings");
			        					rdbtnQ1aC.setBounds(550, 71, 250, 25);
			        					rdbtnQ1aC.setBackground(Color.WHITE);
			        					rdbtnQ1aD = new JRadioButton("d. Animation");
			        					rdbtnQ1aD.setBounds(800, 71, 250, 25);
			        					rdbtnQ1aD.setBackground(Color.WHITE);
			        					bgQ1a = new ButtonGroup();
			        					bgQ1a.add(rdbtnQ1aA);
			        					bgQ1a.add(rdbtnQ1aB);
			        					bgQ1a.add(rdbtnQ1aC);
			        					bgQ1a.add(rdbtnQ1aD);
			        					lblQ1b= new JLabel("2. The Ribbon contains ___________?");
			        					lblQ1b.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1b.setBounds(50, 91, 1000, 32);
			        					rdbtnQ1bA = new JRadioButton("a. Presentation");
			        					rdbtnQ1bA.setBounds(50, 121, 250, 25);
			        					rdbtnQ1bA.setBackground(Color.WHITE);
			        					rdbtnQ1bB = new JRadioButton("b. Letters");
			        					rdbtnQ1bB.setBounds(300, 121, 250, 25);
			        					rdbtnQ1bB.setBackground(Color.WHITE);
			        					rdbtnQ1bC = new JRadioButton("c. Multiple tabs");
			        					rdbtnQ1bC.setBounds(550, 121, 250, 25);
			        					rdbtnQ1bC.setBackground(Color.WHITE);
			        					rdbtnQ1bD = new JRadioButton("d. Double tabs");
			        					rdbtnQ1bD.setBounds(800, 121, 250, 25);
			        					rdbtnQ1bD.setBackground(Color.WHITE);
			        					bgQ1b = new ButtonGroup();
			        					bgQ1b.add(rdbtnQ1bA);
			        					bgQ1b.add(rdbtnQ1bB);
			        					bgQ1b.add(rdbtnQ1bC);
			        					bgQ1b.add(rdbtnQ1bD);
			        					lblQ1c= new JLabel("3. If you do not see the command you want, click on the Choose Commands drop-down box and select _____________.");
			        					lblQ1c.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1c.setBounds(50, 141, 1000, 32);
			        					rdbtnQ1cA = new JRadioButton("a. Multiple tabs");
			        					rdbtnQ1cA.setBounds(50, 171, 250, 25);
			        					rdbtnQ1cA.setBackground(Color.WHITE);
			        					rdbtnQ1cB = new JRadioButton("b. All Commands");
			        					rdbtnQ1cB.setBounds(300, 171, 250, 25);
			        					rdbtnQ1cB.setBackground(Color.WHITE);
			        					rdbtnQ1cC = new JRadioButton("c. Tool tabs");
			        					rdbtnQ1cC.setBounds(550, 171, 250, 25);
			        					rdbtnQ1cC.setBackground(Color.WHITE);
			        					rdbtnQ1cD = new JRadioButton("d. File tabs");
			        					rdbtnQ1cD.setBounds(800, 171, 250, 25);
			        					rdbtnQ1cD.setBackground(Color.WHITE);
			        					bgQ1c = new ButtonGroup();
			        					bgQ1c.add(rdbtnQ1cA);
			        					bgQ1c.add(rdbtnQ1cB);
			        					bgQ1c.add(rdbtnQ1cC);
			        					bgQ1c.add(rdbtnQ1cD);
			        					lblQ1d1= new JLabel("4.	The ______________, located above the Ribbon, lets you access common commands no matter which tab you are on. By default, it shows the Save, Undo,");
			        					lblQ1d1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1d1.setBounds(50, 191, 1500, 32);
			        					lblQ1d2 = new JLabel(" and Repeat commands. You can add other commands to make it more convenient.");
			        					lblQ1d2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1d2.setBounds(50, 211, 1000, 32);
			        					rdbtnQ1dA = new JRadioButton("a. All Commands");
			        					rdbtnQ1dA.setBounds(50, 241, 250, 25);
			        					rdbtnQ1dA.setBackground(Color.WHITE);
			        					rdbtnQ1dB = new JRadioButton("b. Tool tabs");
			        					rdbtnQ1dB.setBounds(300, 241, 250, 25);
			        					rdbtnQ1dB.setBackground(Color.WHITE);
			        					rdbtnQ1dC = new JRadioButton("c. Backstage view");
			        					rdbtnQ1dC.setBounds(550, 241, 250, 25);
			        					rdbtnQ1dC.setBackground(Color.WHITE);
			        					rdbtnQ1dD = new JRadioButton("d. Quick Access toolbar");
			        					rdbtnQ1dD.setBounds(800, 241, 250, 25);
			        					rdbtnQ1dD.setBackground(Color.WHITE);
			        					bgQ1d = new ButtonGroup();
			        					bgQ1d.add(rdbtnQ1dA);
			        					bgQ1d.add(rdbtnQ1dB);
			        					bgQ1d.add(rdbtnQ1dC);
			        					bgQ1d.add(rdbtnQ1dD);
			        					lblQ1e1= new JLabel("5.	______________ gives you various options for saving, opening, printing, and sharing your presentation. It is similar to the Microsoft Office button menu from");
			        					lblQ1e1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1e1.setBounds(50, 261, 1500, 32);
			        					lblQ1e2= new JLabel(" PowerPoint 2007 and the File Menu from earlier versions of PowerPoint.");
			        					lblQ1e2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1e2.setBounds(50, 281, 1000, 32);
			        					rdbtnQ1eA = new JRadioButton("a. Backstage view");
			        					rdbtnQ1eA.setBounds(50, 311, 250, 25);
			        					rdbtnQ1eA.setBackground(Color.WHITE);
			        					rdbtnQ1eB = new JRadioButton("b. Insert");
			        					rdbtnQ1eB.setBounds(300, 311, 250, 25);
			        					rdbtnQ1eB.setBackground(Color.WHITE);
			        					rdbtnQ1eC = new JRadioButton("c. Design");
			        					rdbtnQ1eC.setBounds(550, 311, 250, 25);
			        					rdbtnQ1eC.setBackground(Color.WHITE);
			        					rdbtnQ1eD = new JRadioButton("d. Help");
			        					rdbtnQ1eD.setBounds(800, 311, 250, 25);
			        					rdbtnQ1eD.setBackground(Color.WHITE);
			        					bgQ1e = new ButtonGroup();
			        					bgQ1e.add(rdbtnQ1eA);
			        					bgQ1e.add(rdbtnQ1eB);
			        					bgQ1e.add(rdbtnQ1eC);
			        					bgQ1e.add(rdbtnQ1eD);
			        					lblQ1f= new JLabel("6.	Clicking the_____ tab takes you to Backstage view.");
			        					lblQ1f.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1f.setBounds(50, 331, 1000, 32);
			        					rdbtnQ1fA = new JRadioButton("a. File");
			        					rdbtnQ1fA.setBounds(50, 361, 250, 25);
			        					rdbtnQ1fA.setBackground(Color.WHITE);
			        					rdbtnQ1fB = new JRadioButton("b. Insert");
			        					rdbtnQ1fB.setBounds(300, 361, 250, 25);
			        					rdbtnQ1fB.setBackground(Color.WHITE);
			        					rdbtnQ1fC = new JRadioButton("c. Design");
			        					rdbtnQ1fC.setBounds(550, 361, 250, 25);
			        					rdbtnQ1fC.setBackground(Color.WHITE);
			        					rdbtnQ1fD = new JRadioButton("d. Create");
			        					rdbtnQ1fD.setBounds(800, 361, 250, 25);
			        					rdbtnQ1fD.setBackground(Color.WHITE);
			        					bgQ1f = new ButtonGroup();
			        					bgQ1f.add(rdbtnQ1fA);
			        					bgQ1f.add(rdbtnQ1fB);
			        					bgQ1f.add(rdbtnQ1fC);
			        					bgQ1f.add(rdbtnQ1fD);
			        					lblQ1g= new JLabel("7.	By selecting _____, the Open dialog box appears.");
			        					lblQ1g.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1g.setBounds(50, 381, 1000, 32);
			        					rdbtnQ1gA = new JRadioButton("a. New");
			        					rdbtnQ1gA.setBounds(50, 411, 250, 25);
			        					rdbtnQ1gA.setBackground(Color.WHITE);
			        					rdbtnQ1gB = new JRadioButton("b. File");
			        					rdbtnQ1gB.setBounds(300, 411, 250, 25);
			        					rdbtnQ1gB.setBackground(Color.WHITE);
			        					rdbtnQ1gC = new JRadioButton("c. Open");
			        					rdbtnQ1gC.setBounds(550, 411, 250, 25);
			        					rdbtnQ1gC.setBackground(Color.WHITE);
			        					rdbtnQ1gD = new JRadioButton("d. Create");
			        					rdbtnQ1gD.setBounds(800, 411, 250, 25);
			        					rdbtnQ1gD.setBackground(Color.WHITE);
			        					bgQ1g = new ButtonGroup();
			        					bgQ1g.add(rdbtnQ1gA);
			        					bgQ1g.add(rdbtnQ1gB);
			        					bgQ1g.add(rdbtnQ1gC);
			        					bgQ1g.add(rdbtnQ1gD);
			        					lblQ1h= new JLabel("8.	By clicking ______, a new blank presentation appears in the PowerPoint window.");
			        					lblQ1h.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1h.setBounds(50, 431, 1000, 32);
			        					rdbtnQ1hA = new JRadioButton("a. New");
			        					rdbtnQ1hA.setBounds(50, 461, 250, 25);
			        					rdbtnQ1hA.setBackground(Color.WHITE);
			        					rdbtnQ1hB = new JRadioButton("b. File");
			        					rdbtnQ1hB.setBounds(300, 461, 250, 25);
			        					rdbtnQ1hB.setBackground(Color.WHITE);
			        					rdbtnQ1hC = new JRadioButton("c. Open");
			        					rdbtnQ1hC.setBounds(550, 461, 250, 25);
			        					rdbtnQ1hC.setBackground(Color.WHITE);
			        					rdbtnQ1hD = new JRadioButton("d. Create");
			        					rdbtnQ1hD.setBounds(800, 461, 250, 25);
			        					rdbtnQ1hD.setBackground(Color.WHITE);
			        					bgQ1h = new ButtonGroup();
			        					bgQ1h.add(rdbtnQ1hA);
			        					bgQ1h.add(rdbtnQ1hB);
			        					bgQ1h.add(rdbtnQ1hC);
			        					bgQ1h.add(rdbtnQ1hD);
			        					lblQ1i= new JLabel("9.	Locate and select the ______ command.");
			        					lblQ1i.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1i.setBounds(50, 481, 1000, 32);
			        					rdbtnQ1iA = new JRadioButton("a. Location");
			        					rdbtnQ1iA.setBounds(50, 511, 250, 25);
			        					rdbtnQ1iA.setBackground(Color.WHITE);
			        					rdbtnQ1iB = new JRadioButton("b. Convert");
			        					rdbtnQ1iB.setBounds(300, 511, 250, 25);
			        					rdbtnQ1iB.setBackground(Color.WHITE);
			        					rdbtnQ1iC = new JRadioButton("c. New");
			        					rdbtnQ1iC.setBounds(550, 511, 250, 25);
			        					rdbtnQ1iC.setBackground(Color.WHITE);
			        					rdbtnQ1iD = new JRadioButton("d. Create");
			        					rdbtnQ1iD.setBounds(800, 511, 250, 25);
			        					rdbtnQ1iD.setBackground(Color.WHITE);
			        					bgQ1i = new ButtonGroup();
			        					bgQ1i.add(rdbtnQ1iA);
			        					bgQ1i.add(rdbtnQ1iB);
			        					bgQ1i.add(rdbtnQ1iC);
			        					bgQ1i.add(rdbtnQ1iD);
			        					lblQ1j= new JLabel("10.	The _____ dialog box will appear. Select the location where you want to save the workbook, enter a file name for the presentation, and click Save.");
			        					lblQ1j.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ1j.setBounds(50, 531, 1500, 32);
			        					rdbtnQ1jA = new JRadioButton("a. Save As");
			        					rdbtnQ1jA.setBounds(50, 561, 250, 25);
			        					rdbtnQ1jA.setBackground(Color.WHITE);
			        					rdbtnQ1jB = new JRadioButton("b. Open");
			        					rdbtnQ1jB.setBounds(300, 561, 250, 25);
			        					rdbtnQ1jB.setBackground(Color.WHITE);
			        					rdbtnQ1jC = new JRadioButton("c. New");
			        					rdbtnQ1jC.setBounds(550, 561, 250, 25);
			        					rdbtnQ1jC.setBackground(Color.WHITE);
			        					rdbtnQ1jD = new JRadioButton("d. Close");
			        					rdbtnQ1jD.setBounds(800, 561, 250, 25);
			        					rdbtnQ1jD.setBackground(Color.WHITE);
			        					bgQ1j = new ButtonGroup();
			        					bgQ1j.add(rdbtnQ1jA);
			        					bgQ1j.add(rdbtnQ1jB);
			        					bgQ1j.add(rdbtnQ1jC);
			        					bgQ1j.add(rdbtnQ1jD);
										bSubmit1 = new JButton("Submit");
			        					bSubmit1.setBounds(50, 616, 150, 25);
			        					bSubmit1.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent arg0) {
					        					if (rdbtnQ1aA.isSelected()) {
					        						score1a=1;
					        					}
					        					if (rdbtnQ1bC.isSelected()) {
					        						score1b=1;
					        					}
					        					if (rdbtnQ1cB.isSelected()) {
					        						score1c=1;
					        					}
					        					if (rdbtnQ1dD.isSelected()) {
					        						score1d=1;
					        					}
					        					if (rdbtnQ1eA.isSelected()) {
					        						score1e=1;
					        					}
					        					if (rdbtnQ1fA.isSelected()) {
					        						score1f=1;
					        					}
					        					if (rdbtnQ1gC.isSelected()) {
					        						score1g=1;
					        					}
					        					if (rdbtnQ1hD.isSelected()) {
					        						score1h=1;
					        					}
					        					if (rdbtnQ1iB.isSelected()) {
					        						score1i=1;
					        					}
					        					if (rdbtnQ1jA.isSelected()) {
					        						score1j=1;
					        					}
					        					lesson1g=score1a+score1b+score1c+score1d+score1e+score1f+score1g+score1h+score1i+score1j;
					        					JOptionPane.showMessageDialog(null, "Your score is "+lesson1g);
											}
			        					});
										panel2.add(lblAssess1);
										panel2.add(lblQ1a);
			        					panel2.add(rdbtnQ1aA);
			        					panel2.add(rdbtnQ1aB);
			        					panel2.add(rdbtnQ1aC);
			        					panel2.add(rdbtnQ1aD);
										panel2.add(lblQ1b);
			        					panel2.add(rdbtnQ1bA);
			        					panel2.add(rdbtnQ1bB);
			        					panel2.add(rdbtnQ1bC);
			        					panel2.add(rdbtnQ1bD);
										panel2.add(lblQ1c);
			        					panel2.add(rdbtnQ1cA);
			        					panel2.add(rdbtnQ1cB);
			        					panel2.add(rdbtnQ1cC);
			        					panel2.add(rdbtnQ1cD);
										panel2.add(lblQ1d1);
										panel2.add(lblQ1d2);
			        					panel2.add(rdbtnQ1dA);
			        					panel2.add(rdbtnQ1dB);
			        					panel2.add(rdbtnQ1dC);
			        					panel2.add(rdbtnQ1dD);
										panel2.add(lblQ1e1);
										panel2.add(lblQ1e2);
			        					panel2.add(rdbtnQ1eA);
			        					panel2.add(rdbtnQ1eB);
			        					panel2.add(rdbtnQ1eC);
			        					panel2.add(rdbtnQ1eD);
										panel2.add(lblQ1f);
			        					panel2.add(rdbtnQ1fA);
			        					panel2.add(rdbtnQ1fB);
			        					panel2.add(rdbtnQ1fC);
			        					panel2.add(rdbtnQ1fD);
										panel2.add(lblQ1g);
			        					panel2.add(rdbtnQ1gA);
			        					panel2.add(rdbtnQ1gB);
			        					panel2.add(rdbtnQ1gC);
			        					panel2.add(rdbtnQ1gD);
										panel2.add(lblQ1h);
			        					panel2.add(rdbtnQ1hA);
			        					panel2.add(rdbtnQ1hB);
			        					panel2.add(rdbtnQ1hC);
			        					panel2.add(rdbtnQ1hD);
										panel2.add(lblQ1i);
			        					panel2.add(rdbtnQ1iA);
			        					panel2.add(rdbtnQ1iB);
			        					panel2.add(rdbtnQ1iC);
			        					panel2.add(rdbtnQ1iD);
										panel2.add(lblQ1j);
			        					panel2.add(rdbtnQ1jA);
			        					panel2.add(rdbtnQ1jB);
			        					panel2.add(rdbtnQ1jC);
			        					panel2.add(rdbtnQ1jD);
			        					panel2.add(bSubmit1);
									}
		    					});
		    					panel2.add(lblLesson1);
		    					panel2.add(bOpenVid1);
		    					panel2.add(bOpenPpt1);
		    					panel2.add(bAssess1);
		    				} else if (node.equals("Lesson 2")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson2 = new JLabel("Lesson 2: SLIDE BASICS");
		    					lblLesson2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson2.setBounds(50, 11, 500, 32);
		    					bOpenVid2 = new JButton("Play Video");
		    					bOpenVid2.setBounds(50, 500, 150, 100);
		    					bOpenVid2.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 2.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt2 = new JButton("Play Presentation");
		    					bOpenPpt2.setBounds(240, 500, 150, 100);
		    					bOpenPpt2.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("2.) Slide basics.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess2 = new JButton("Assessment Task");
		    					bAssess2.setBounds(430, 500, 150, 100);
		    					bAssess2.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent ae) {
										panel2.removeAll();
										panel2.repaint();
										lblAssess2 = new JLabel("Assessment Task #2: SLIDE BASICS");
			        					lblAssess2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			        					lblAssess2.setBounds(50, 11, 700, 32);
			        					lblQ2a= new JLabel("1.	Every PowerPoint presentation is composed of a series of _______.");
			        					lblQ2a.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2a.setBounds(50, 41, 1000, 32);
			        					rdbtnQ2aA = new JRadioButton("a. Lines");
			        					rdbtnQ2aA.setBounds(50, 71, 250, 25);
			        					rdbtnQ2aA.setBackground(Color.WHITE);
			        					rdbtnQ2aB = new JRadioButton("b. Colors");
			        					rdbtnQ2aB.setBounds(300, 71, 250, 25);
			        					rdbtnQ2aB.setBackground(Color.WHITE);
			        					rdbtnQ2aC = new JRadioButton("c. Slides");
			        					rdbtnQ2aC.setBounds(550, 71, 250, 25);
			        					rdbtnQ2aC.setBackground(Color.WHITE);
			        					rdbtnQ2aD = new JRadioButton("d. Letters");
			        					rdbtnQ2aD.setBounds(800, 71, 250, 25);
			        					rdbtnQ2aD.setBackground(Color.WHITE);
			        					bgQ2a = new ButtonGroup();
			        					bgQ2a.add(rdbtnQ2aA);
			        					bgQ2a.add(rdbtnQ2aB);
			        					bgQ2a.add(rdbtnQ2aC);
			        					bgQ2a.add(rdbtnQ2aD);
			        					lblQ2b= new JLabel("2.	Slides contain ________.");
			        					lblQ2b.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2b.setBounds(50, 91, 1000, 32);
			        					rdbtnQ2bA = new JRadioButton("a. Placeholders");
			        					rdbtnQ2bA.setBounds(50, 121, 250, 25);
			        					rdbtnQ2bA.setBackground(Color.WHITE);
			        					rdbtnQ2bB = new JRadioButton("b. Boxes");
			        					rdbtnQ2bB.setBounds(300, 121, 250, 25);
			        					rdbtnQ2bB.setBackground(Color.WHITE);
			        					rdbtnQ2bC = new JRadioButton("c. Text");
			        					rdbtnQ2bC.setBounds(550, 121, 250, 25);
			        					rdbtnQ2bC.setBackground(Color.WHITE);
			        					rdbtnQ2bD = new JRadioButton("d. Pictures");
			        					rdbtnQ2bD.setBounds(800, 121, 250, 25);
			        					rdbtnQ2bD.setBackground(Color.WHITE);
			        					bgQ2b = new ButtonGroup();
			        					bgQ2b.add(rdbtnQ2bA);
			        					bgQ2b.add(rdbtnQ2bB);
			        					bgQ2b.add(rdbtnQ2bC);
			        					bgQ2b.add(rdbtnQ2bD);
			        					lblQ2c= new JLabel("3.	Placeholders are arranged in different layouts that can be applied to existing slides or chosen when you insert a ________.");
			        					lblQ2c.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2c.setBounds(50, 141, 1000, 32);
			        					rdbtnQ2cA = new JRadioButton("a. Placeholders");
			        					rdbtnQ2cA.setBounds(50, 171, 250, 25);
			        					rdbtnQ2cA.setBackground(Color.WHITE);
			        					rdbtnQ2cB = new JRadioButton("b. Text");
			        					rdbtnQ2cB.setBounds(300, 171, 250, 25);
			        					rdbtnQ2cB.setBackground(Color.WHITE);
			        					rdbtnQ2cC = new JRadioButton("c. Picture");
			        					rdbtnQ2cC.setBounds(550, 171, 250, 25);
			        					rdbtnQ2cC.setBackground(Color.WHITE);
			        					rdbtnQ2cD = new JRadioButton("d. New Slide");
			        					rdbtnQ2cD.setBounds(800, 171, 250, 25);
			        					rdbtnQ2cD.setBackground(Color.WHITE);
			        					bgQ2c = new ButtonGroup();
			        					bgQ2c.add(rdbtnQ2cA);
			        					bgQ2c.add(rdbtnQ2cB);
			        					bgQ2c.add(rdbtnQ2cC);
			        					bgQ2c.add(rdbtnQ2cD);
			        					lblQ2d1= new JLabel("4.	By clicking the ______ command in the Slides group on the Home tab, a menu will appear with your options and you can choose a layout from the menu.");
			        					lblQ2d1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2d1.setBounds(50, 191, 1500, 32);
			        					lblQ2d2 = new JLabel(" The slide will change in the presentation.");
			        					lblQ2d2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2d2.setBounds(50, 211, 1000, 32);
			        					rdbtnQ2dA = new JRadioButton("a. New slide");
			        					rdbtnQ2dA.setBounds(50, 241, 250, 25);
			        					rdbtnQ2dA.setBackground(Color.WHITE);
			        					rdbtnQ2dB = new JRadioButton("b. Section");
			        					rdbtnQ2dB.setBounds(300, 241, 250, 25);
			        					rdbtnQ2dB.setBackground(Color.WHITE);
			        					rdbtnQ2dC = new JRadioButton("c. Reset");
			        					rdbtnQ2dC.setBounds(550, 241, 250, 25);
			        					rdbtnQ2dC.setBackground(Color.WHITE);
			        					rdbtnQ2dD = new JRadioButton("d. Layout");
			        					rdbtnQ2dD.setBounds(800, 241, 250, 25);
			        					rdbtnQ2dD.setBackground(Color.WHITE);
			        					bgQ2d = new ButtonGroup();
			        					bgQ2d.add(rdbtnQ2dA);
			        					bgQ2d.add(rdbtnQ2dB);
			        					bgQ2d.add(rdbtnQ2dC);
			        					bgQ2d.add(rdbtnQ2dD);
			        					lblQ2e= new JLabel("5.	Allows you to add to your current layout, so you can place text wherever you want on your slide.");
			        					lblQ2e.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2e.setBounds(50, 261, 1000, 32);
			        					rdbtnQ2eA = new JRadioButton("a. Layout");
			        					rdbtnQ2eA.setBounds(50, 291, 250, 25);
			        					rdbtnQ2eA.setBackground(Color.WHITE);
			        					rdbtnQ2eB = new JRadioButton("b. Text boxes");
			        					rdbtnQ2eB.setBounds(300, 291, 250, 25);
			        					rdbtnQ2eB.setBackground(Color.WHITE);
			        					rdbtnQ2eC = new JRadioButton("c. Header and Footer");
			        					rdbtnQ2eC.setBounds(550, 291, 250, 25);
			        					rdbtnQ2eC.setBackground(Color.WHITE);
			        					rdbtnQ2eD = new JRadioButton("d. WordArt");
			        					rdbtnQ2eD.setBounds(800, 291, 250, 25);
			        					rdbtnQ2eD.setBackground(Color.WHITE);
			        					bgQ2e = new ButtonGroup();
			        					bgQ2e.add(rdbtnQ2eA);
			        					bgQ2e.add(rdbtnQ2eB);
			        					bgQ2e.add(rdbtnQ2eC);
			        					bgQ2e.add(rdbtnQ2eD);
			        					lblQ2f= new JLabel("6.	From the _______ tab, click the bottom half of the New Slide command to open the menu of slide layout options.");
			        					lblQ2f.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2f.setBounds(50, 311, 1000, 32);
			        					rdbtnQ2fA = new JRadioButton("a. Home");
			        					rdbtnQ2fA.setBounds(50, 341, 250, 25);
			        					rdbtnQ2fA.setBackground(Color.WHITE);
			        					rdbtnQ2fB = new JRadioButton("b. Design");
			        					rdbtnQ2fB.setBounds(300, 341, 250, 25);
			        					rdbtnQ2fB.setBackground(Color.WHITE);
			        					rdbtnQ2fC = new JRadioButton("c. Insert");
			        					rdbtnQ2fC.setBounds(550, 341, 250, 25);
			        					rdbtnQ2fC.setBackground(Color.WHITE);
			        					rdbtnQ2fD = new JRadioButton("d. Slide Show");
			        					rdbtnQ2fD.setBounds(800, 341, 250, 25);
			        					rdbtnQ2fD.setBackground(Color.WHITE);
			        					bgQ2f = new ButtonGroup();
			        					bgQ2f.add(rdbtnQ2fA);
			        					bgQ2f.add(rdbtnQ2fB);
			        					bgQ2f.add(rdbtnQ2fC);
			        					bgQ2f.add(rdbtnQ2fD);
			        					lblQ2g= new JLabel("7.	To select multiple slides, press and hold ____ on your keyboard and click the slides you want to select.");
			        					lblQ2g.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2g.setBounds(50, 361, 1000, 32);
			        					rdbtnQ2gA = new JRadioButton("a. TAB");
			        					rdbtnQ2gA.setBounds(50, 391, 250, 25);
			        					rdbtnQ2gA.setBackground(Color.WHITE);
			        					rdbtnQ2gB = new JRadioButton("b. Shift");
			        					rdbtnQ2gB.setBounds(300, 391, 250, 25);
			        					rdbtnQ2gB.setBackground(Color.WHITE);
			        					rdbtnQ2gC = new JRadioButton("c. CTRL");
			        					rdbtnQ2gC.setBounds(550, 391, 250, 25);
			        					rdbtnQ2gC.setBackground(Color.WHITE);
			        					rdbtnQ2gD = new JRadioButton("d. ALT");
			        					rdbtnQ2gD.setBounds(800, 391, 250, 25);
			        					rdbtnQ2gD.setBackground(Color.WHITE);
			        					bgQ2g = new ButtonGroup();
			        					bgQ2g.add(rdbtnQ2gA);
			        					bgQ2g.add(rdbtnQ2gB);
			        					bgQ2g.add(rdbtnQ2gC);
			        					bgQ2g.add(rdbtnQ2gD);
			        					lblQ2h1= new JLabel("8.	From the Home tab, click the bottom half of the _______ command to open the menu of slide layout options and select the slide you want to insert. A new");
			        					lblQ2h1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2h1.setBounds(50, 411, 1500, 32);
			        					lblQ2h2= new JLabel(" slide will be added to your presentation.");
			        					lblQ2h2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2h2.setBounds(50, 431, 1000, 32);
			        					rdbtnQ2hA = new JRadioButton("a. Section");
			        					rdbtnQ2hA.setBounds(50, 461, 250, 25);
			        					rdbtnQ2hA.setBackground(Color.WHITE);
			        					rdbtnQ2hB = new JRadioButton("b. New Slide");
			        					rdbtnQ2hB.setBounds(300, 461, 250, 25);
			        					rdbtnQ2hB.setBackground(Color.WHITE);
			        					rdbtnQ2hC = new JRadioButton("c. Reset");
			        					rdbtnQ2hC.setBounds(550, 461, 250, 25);
			        					rdbtnQ2hC.setBackground(Color.WHITE);
			        					rdbtnQ2hD = new JRadioButton("d. Layout");
			        					rdbtnQ2hD.setBounds(800, 461, 250, 25);
			        					rdbtnQ2hD.setBackground(Color.WHITE);
			        					bgQ2h = new ButtonGroup();
			        					bgQ2h.add(rdbtnQ2hA);
			        					bgQ2h.add(rdbtnQ2hB);
			        					bgQ2h.add(rdbtnQ2hC);
			        					bgQ2h.add(rdbtnQ2hD);
			        					lblQ2i= new JLabel("9.	To delete a Slide, press the _____ or Backspace key on your keyboard.");
			        					lblQ2i.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2i.setBounds(50, 481, 1000, 32);
			        					rdbtnQ2iA = new JRadioButton("a. CTRL");
			        					rdbtnQ2iA.setBounds(50, 511, 250, 25);
			        					rdbtnQ2iA.setBackground(Color.WHITE);
			        					rdbtnQ2iB = new JRadioButton("b. Enter");
			        					rdbtnQ2iB.setBounds(300, 511, 250, 25);
			        					rdbtnQ2iB.setBackground(Color.WHITE);
			        					rdbtnQ2iC = new JRadioButton("c. ALT");
			        					rdbtnQ2iC.setBounds(550, 511, 250, 25);
			        					rdbtnQ2iC.setBackground(Color.WHITE);
			        					rdbtnQ2iD = new JRadioButton("d. Delete");
			        					rdbtnQ2iD.setBounds(800, 511, 250, 25);
			        					rdbtnQ2iD.setBackground(Color.WHITE);
			        					bgQ2i = new ButtonGroup();
			        					bgQ2i.add(rdbtnQ2iA);
			        					bgQ2i.add(rdbtnQ2iB);
			        					bgQ2i.add(rdbtnQ2iC);
			        					bgQ2i.add(rdbtnQ2iD);
			        					lblQ2j= new JLabel("10.	The _______ tab shows your slide text in outline form. This allows you to quickly edit your slide text and view the contents of multiple slides at once.");
			        					lblQ2j.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ2j.setBounds(50, 531, 1000, 32);
			        					rdbtnQ2jA = new JRadioButton("a. Home");
			        					rdbtnQ2jA.setBounds(50, 561, 250, 25);
			        					rdbtnQ2jA.setBackground(Color.WHITE);
			        					rdbtnQ2jB = new JRadioButton("b. Outline");
			        					rdbtnQ2jB.setBounds(300, 561, 250, 25);
			        					rdbtnQ2jB.setBackground(Color.WHITE);
			        					rdbtnQ2jC = new JRadioButton("c. Slides");
			        					rdbtnQ2jC.setBounds(550, 561, 250, 25);
			        					rdbtnQ2jC.setBackground(Color.WHITE);
			        					rdbtnQ2jD = new JRadioButton("d. Layout");
			        					rdbtnQ2jD.setBounds(800, 561, 250, 25);
			        					rdbtnQ2jD.setBackground(Color.WHITE);
			        					bgQ2j = new ButtonGroup();
			        					bgQ2j.add(rdbtnQ2jA);
			        					bgQ2j.add(rdbtnQ2jB);
			        					bgQ2j.add(rdbtnQ2jC);
			        					bgQ2j.add(rdbtnQ2jD);
										bSubmit2 = new JButton("Submit");
			        					bSubmit2.setBounds(50, 616, 150, 25);
			        					bSubmit2.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent arg0) {
					        					if (rdbtnQ2aC.isSelected()) {
					        						score2a=1;
					        					}
					        					if (rdbtnQ2bA.isSelected()) {
					        						score2b=1;
					        					}
					        					if (rdbtnQ2cD.isSelected()) {
					        						score2c=1;
					        					}
					        					if (rdbtnQ2dD.isSelected()) {
					        						score2d=1;
					        					}
					        					if (rdbtnQ2eB.isSelected()) {
					        						score2e=1;
					        					}
					        					if (rdbtnQ2fA.isSelected()) {
					        						score2f=1;
					        					}
					        					if (rdbtnQ2gC.isSelected()) {
					        						score2g=1;
					        					}
					        					if (rdbtnQ2hB.isSelected()) {
					        						score2h=1;
					        					}
					        					if (rdbtnQ2iD.isSelected()) {
					        						score2i=1;
					        					}
					        					if (rdbtnQ2jC.isSelected()) {
					        						score2j=1;
					        					}
					        					lesson2g=score2a+score2b+score2c+score2d+score2e+score2f+score2g+score2h+score2i+score2j;
					        					JOptionPane.showMessageDialog(null, "Your score is "+lesson2g);
											}
			        					});
										panel2.add(lblAssess2);
										panel2.add(lblQ2a);
			        					panel2.add(rdbtnQ2aA);
			        					panel2.add(rdbtnQ2aB);
			        					panel2.add(rdbtnQ2aC);
			        					panel2.add(rdbtnQ2aD);
										panel2.add(lblQ2b);
			        					panel2.add(rdbtnQ2bA);
			        					panel2.add(rdbtnQ2bB);
			        					panel2.add(rdbtnQ2bC);
			        					panel2.add(rdbtnQ2bD);
										panel2.add(lblQ2c);
			        					panel2.add(rdbtnQ2cA);
			        					panel2.add(rdbtnQ2cB);
			        					panel2.add(rdbtnQ2cC);
			        					panel2.add(rdbtnQ2cD);
										panel2.add(lblQ2d1);
										panel2.add(lblQ2d2);
			        					panel2.add(rdbtnQ2dA);
			        					panel2.add(rdbtnQ2dB);
			        					panel2.add(rdbtnQ2dC);
			        					panel2.add(rdbtnQ2dD);
										panel2.add(lblQ2e);
			        					panel2.add(rdbtnQ2eA);
			        					panel2.add(rdbtnQ2eB);
			        					panel2.add(rdbtnQ2eC);
			        					panel2.add(rdbtnQ2eD);
										panel2.add(lblQ2f);
			        					panel2.add(rdbtnQ2fA);
			        					panel2.add(rdbtnQ2fB);
			        					panel2.add(rdbtnQ2fC);
			        					panel2.add(rdbtnQ2fD);
										panel2.add(lblQ2g);
			        					panel2.add(rdbtnQ2gA);
			        					panel2.add(rdbtnQ2gB);
			        					panel2.add(rdbtnQ2gC);
			        					panel2.add(rdbtnQ2gD);
										panel2.add(lblQ2h1);
										panel2.add(lblQ2h2);
			        					panel2.add(rdbtnQ2hA);
			        					panel2.add(rdbtnQ2hB);
			        					panel2.add(rdbtnQ2hC);
			        					panel2.add(rdbtnQ2hD);
										panel2.add(lblQ2i);
			        					panel2.add(rdbtnQ2iA);
			        					panel2.add(rdbtnQ2iB);
			        					panel2.add(rdbtnQ2iC);
			        					panel2.add(rdbtnQ2iD);
										panel2.add(lblQ2j);
			        					panel2.add(rdbtnQ2jA);
			        					panel2.add(rdbtnQ2jB);
			        					panel2.add(rdbtnQ2jC);
			        					panel2.add(rdbtnQ2jD);
			        					panel2.add(bSubmit2);
									}
		    					});
		    					panel2.add(lblLesson2);
		    					panel2.add(bOpenVid2);
		    					panel2.add(bOpenPpt2);
		    					panel2.add(bAssess2);
		    				} else if (node.equals("Lesson 3")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson3 = new JLabel("Lesson 3: TEXT BASICS");
		    					lblLesson3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson3.setBounds(50, 11, 500, 32);
		    					bOpenVid3 = new JButton("Play Video");
		    					bOpenVid3.setBounds(50, 500, 150, 100);
		    					bOpenVid3.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 3.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt3 = new JButton("Play Presentation");
		    					bOpenPpt3.setBounds(240, 500, 150, 100);
		    					bOpenPpt3.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("3.) Text Basics.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess3 = new JButton("Assessment Task");
		    					bAssess3.setBounds(430, 500, 150, 100);
		    					bAssess3.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent ae) {
										panel2.removeAll();
										panel2.repaint();
										lblAssess3 = new JLabel("Assessment Task #3: TEXT BASICS");
			        					lblAssess3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			        					lblAssess3.setBounds(50, 11, 700, 32);
			        					lblQ3a= new JLabel("1.	If you're new to PowerPoint, you'll need to learn the _________________ so you can add and arrange text on your slides. ");
			        					lblQ3a.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3a.setBounds(50, 41, 1500, 32);
			        					rdbtnQ3aA = new JRadioButton("a. Basics of working with text");
			        					rdbtnQ3aA.setBounds(50, 71, 250, 25);
			        					rdbtnQ3aA.setBackground(Color.WHITE);
			        					rdbtnQ3aB = new JRadioButton("b. Basics of Slide Show");
			        					rdbtnQ3aB.setBounds(300, 71, 250, 25);
			        					rdbtnQ3aB.setBackground(Color.WHITE);
			        					rdbtnQ3aC = new JRadioButton("c. Basics of Inserting Images");
			        					rdbtnQ3aC.setBounds(550, 71, 250, 25);
			        					rdbtnQ3aC.setBackground(Color.WHITE);
			        					rdbtnQ3aD = new JRadioButton("d. Modifying Themes");
			        					rdbtnQ3aD.setBounds(800, 71, 250, 25);
			        					rdbtnQ3aD.setBackground(Color.WHITE);
			        					bgQ3a = new ButtonGroup();
			        					bgQ3a.add(rdbtnQ3aA);
			        					bgQ3a.add(rdbtnQ3aB);
			        					bgQ3a.add(rdbtnQ3aC);
			        					bgQ3a.add(rdbtnQ3aD);
			        					lblQ3b= new JLabel("2.	Click the placeholder or text box where you want to insert text and the _____________ appears.");
			        					lblQ3b.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3b.setBounds(50, 91, 1000, 32);
			        					rdbtnQ3bA = new JRadioButton("a. Insert layout");
			        					rdbtnQ3bA.setBounds(50, 121, 250, 25);
			        					rdbtnQ3bA.setBackground(Color.WHITE);
			        					rdbtnQ3bB = new JRadioButton("b. Insertion point");
			        					rdbtnQ3bB.setBounds(300, 121, 250, 25);
			        					rdbtnQ3bB.setBackground(Color.WHITE);
			        					rdbtnQ3bC = new JRadioButton("c. Design");
			        					rdbtnQ3bC.setBounds(550, 121, 250, 25);
			        					rdbtnQ3bC.setBackground(Color.WHITE);
			        					rdbtnQ3bD = new JRadioButton("d. Quick Access toolbar");
			        					rdbtnQ3bD.setBounds(800, 121, 250, 25);
			        					rdbtnQ3bD.setBackground(Color.WHITE);
			        					bgQ3b = new ButtonGroup();
			        					bgQ3b.add(rdbtnQ3bA);
			        					bgQ3b.add(rdbtnQ3bB);
			        					bgQ3b.add(rdbtnQ3bC);
			        					bgQ3b.add(rdbtnQ3bD);
			        					lblQ3c1= new JLabel("3.	Click the mouse button. While holding it down, drag the mouse over the text then release the mouse. The text will be selected, and a _______________ will");
			        					lblQ3c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3c1.setBounds(50, 141, 1500, 32);
			        					lblQ3c2= new JLabel(" appear over the selected text.");
			        					lblQ3c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3c2.setBounds(50, 161, 1000, 32);
			        					rdbtnQ3cA = new JRadioButton("a. Layout");
			        					rdbtnQ3cA.setBounds(50, 191, 250, 25);
			        					rdbtnQ3cA.setBackground(Color.WHITE);
			        					rdbtnQ3cB = new JRadioButton("b. Hover toolbar");
			        					rdbtnQ3cB.setBounds(300, 191, 250, 25);
			        					rdbtnQ3cB.setBackground(Color.WHITE);
			        					rdbtnQ3cC = new JRadioButton("c. Highlighted box");
			        					rdbtnQ3cC.setBounds(550, 191, 250, 25);
			        					rdbtnQ3cC.setBackground(Color.WHITE);
			        					rdbtnQ3cD = new JRadioButton("d. Design");
			        					rdbtnQ3cD.setBounds(800, 191, 250, 25);
			        					rdbtnQ3cD.setBackground(Color.WHITE);
			        					bgQ3c = new ButtonGroup();
			        					bgQ3c.add(rdbtnQ3cA);
			        					bgQ3c.add(rdbtnQ3cB);
			        					bgQ3c.add(rdbtnQ3cC);
			        					bgQ3c.add(rdbtnQ3cD);
			        					lblQ3d= new JLabel("4.	When you select text in PowerPoint, a ___________ with formatting options appears. This makes formatting commands easily accessible, which can save you time.");
			        					lblQ3d.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3d.setBounds(50, 211, 1500, 32);
			        					rdbtnQ3dA = new JRadioButton("a. Layout");
			        					rdbtnQ3dA.setBounds(50, 241, 250, 25);
			        					rdbtnQ3dA.setBackground(Color.WHITE);
			        					rdbtnQ3dB = new JRadioButton("b. Highlighted box");
			        					rdbtnQ3dB.setBounds(300, 241, 250, 25);
			        					rdbtnQ3dB.setBackground(Color.WHITE);
			        					rdbtnQ3dC = new JRadioButton("c. Design");
			        					rdbtnQ3dC.setBounds(550, 241, 250, 25);
			        					rdbtnQ3dC.setBackground(Color.WHITE);
			        					rdbtnQ3dD = new JRadioButton("d. Hover toolbar");
			        					rdbtnQ3dD.setBounds(800, 241, 250, 25);
			        					rdbtnQ3dD.setBackground(Color.WHITE);
			        					bgQ3d = new ButtonGroup();
			        					bgQ3d.add(rdbtnQ3dA);
			        					bgQ3d.add(rdbtnQ3dB);
			        					bgQ3d.add(rdbtnQ3dC);
			        					bgQ3d.add(rdbtnQ3dD);
			        					lblQ3e= new JLabel("5.	If text does not appear in the exact location you want, you can press the ______ key on your keyboard to move the text to a new line.");
			        					lblQ3e.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3e.setBounds(50, 261, 1500, 32);
			        					rdbtnQ3eA = new JRadioButton("a. CTRL");
			        					rdbtnQ3eA.setBounds(50, 291, 250, 25);
			        					rdbtnQ3eA.setBackground(Color.WHITE);
			        					rdbtnQ3eB = new JRadioButton("b. ALT");
			        					rdbtnQ3eB.setBounds(300, 291, 250, 25);
			        					rdbtnQ3eB.setBackground(Color.WHITE);
			        					rdbtnQ3eC = new JRadioButton("c. Enter");
			        					rdbtnQ3eC.setBounds(550, 291, 250, 25);
			        					rdbtnQ3eC.setBackground(Color.WHITE);
			        					rdbtnQ3eD = new JRadioButton("d. Delete");
			        					rdbtnQ3eD.setBounds(800, 291, 250, 25);
			        					rdbtnQ3eD.setBackground(Color.WHITE);
			        					bgQ3e = new ButtonGroup();
			        					bgQ3e.add(rdbtnQ3eA);
			        					bgQ3e.add(rdbtnQ3eB);
			        					bgQ3e.add(rdbtnQ3eC);
			        					bgQ3e.add(rdbtnQ3eD);
			        					lblQ3f= new JLabel("6.	_______________ is another technique that can be used to edit text and allows you to search all of your slides for a specific word or phrase.");
			        					lblQ3f.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3f.setBounds(50, 311, 1500, 32);
			        					rdbtnQ3fA = new JRadioButton("a. Find and Replace");
			        					rdbtnQ3fA.setBounds(50, 341, 250, 25);
			        					rdbtnQ3fA.setBackground(Color.WHITE);
			        					rdbtnQ3fB = new JRadioButton("b. Drag");
			        					rdbtnQ3fB.setBounds(300, 341, 250, 25);
			        					rdbtnQ3fB.setBackground(Color.WHITE);
			        					rdbtnQ3fC = new JRadioButton("c. Text boxes");
			        					rdbtnQ3fC.setBounds(550, 341, 250, 25);
			        					rdbtnQ3fC.setBackground(Color.WHITE);
			        					rdbtnQ3fD = new JRadioButton("d. Design");
			        					rdbtnQ3fD.setBounds(800, 341, 250, 25);
			        					rdbtnQ3fD.setBackground(Color.WHITE);
			        					bgQ3f = new ButtonGroup();
			        					bgQ3f.add(rdbtnQ3fA);
			        					bgQ3f.add(rdbtnQ3fB);
			        					bgQ3f.add(rdbtnQ3fC);
			        					bgQ3f.add(rdbtnQ3fD);
			        					lblQ3g= new JLabel("7.	As you create your presentation, you can add ___________ to help organize your slides. You'll also need to know how to _______ text to create the look you need.");
			        					lblQ3g.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3g.setBounds(50, 361, 1500, 32);
			        					rdbtnQ3gA = new JRadioButton("a. Find and Replace");
			        					rdbtnQ3gA.setBounds(50, 391, 250, 25);
			        					rdbtnQ3gA.setBackground(Color.WHITE);
			        					rdbtnQ3gB = new JRadioButton("b. Text boxes and format");
			        					rdbtnQ3gB.setBounds(300, 391, 250, 25);
			        					rdbtnQ3gB.setBackground(Color.WHITE);
			        					rdbtnQ3gC = new JRadioButton("c. Design and format");
			        					rdbtnQ3gC.setBounds(550, 391, 250, 25);
			        					rdbtnQ3gC.setBackground(Color.WHITE);
			        					rdbtnQ3gD = new JRadioButton("d. Drag and Design");
			        					rdbtnQ3gD.setBounds(800, 391, 250, 25);
			        					rdbtnQ3gD.setBackground(Color.WHITE);
			        					bgQ3g = new ButtonGroup();
			        					bgQ3g.add(rdbtnQ3gA);
			        					bgQ3g.add(rdbtnQ3gB);
			        					bgQ3g.add(rdbtnQ3gC);
			        					bgQ3g.add(rdbtnQ3gD);
			        					lblQ3h= new JLabel("8.	Text can be inserted into both ___________and __________.");
			        					lblQ3h.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3h.setBounds(50, 411, 1500, 32);
			        					rdbtnQ3hA = new JRadioButton("a. Placeholders and text boxes");
			        					rdbtnQ3hA.setBounds(50, 441, 250, 25);
			        					rdbtnQ3hA.setBackground(Color.WHITE);
			        					rdbtnQ3hB = new JRadioButton("b. Text boxes and format");
			        					rdbtnQ3hB.setBounds(300, 441, 250, 25);
			        					rdbtnQ3hB.setBackground(Color.WHITE);
			        					rdbtnQ3hC = new JRadioButton("c. Design and format");
			        					rdbtnQ3hC.setBounds(550, 441, 250, 25);
			        					rdbtnQ3hC.setBackground(Color.WHITE);
			        					rdbtnQ3hD = new JRadioButton("d. Text box and slide layout");
			        					rdbtnQ3hD.setBounds(800, 441, 250, 25);
			        					rdbtnQ3hD.setBackground(Color.WHITE);
			        					bgQ3h = new ButtonGroup();
			        					bgQ3h.add(rdbtnQ3hA);
			        					bgQ3h.add(rdbtnQ3hB);
			        					bgQ3h.add(rdbtnQ3hC);
			        					bgQ3h.add(rdbtnQ3hD);
			        					lblQ3i= new JLabel("9.	Inserting an extra ________ allows you to add to the slide layout so you can include as much text as you want.");
			        					lblQ3i.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3i.setBounds(50, 461, 1500, 32);
			        					rdbtnQ3iA = new JRadioButton("a. Text box");
			        					rdbtnQ3iA.setBounds(50, 491, 250, 25);
			        					rdbtnQ3iA.setBackground(Color.WHITE);
			        					rdbtnQ3iB = new JRadioButton("b. Slide layout");
			        					rdbtnQ3iB.setBounds(300, 491, 250, 25);
			        					rdbtnQ3iB.setBackground(Color.WHITE);
			        					rdbtnQ3iC = new JRadioButton("c. Format");
			        					rdbtnQ3iC.setBounds(550, 491, 250, 25);
			        					rdbtnQ3iC.setBackground(Color.WHITE);
			        					rdbtnQ3iD = new JRadioButton("d. Design");
			        					rdbtnQ3iD.setBounds(800, 491, 250, 25);
			        					rdbtnQ3iD.setBackground(Color.WHITE);
			        					bgQ3i = new ButtonGroup();
			        					bgQ3i.add(rdbtnQ3iA);
			        					bgQ3i.add(rdbtnQ3iB);
			        					bgQ3i.add(rdbtnQ3iC);
			        					bgQ3i.add(rdbtnQ3iD);
			        					lblQ3j= new JLabel("10.	You can help your text stand out on the slide by changing its _________, including font size, color, and style.");
			        					lblQ3j.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ3j.setBounds(50, 511, 1500, 32);
			        					rdbtnQ3jA = new JRadioButton("a. Design");
			        					rdbtnQ3jA.setBounds(50, 541, 250, 25);
			        					rdbtnQ3jA.setBackground(Color.WHITE);
			        					rdbtnQ3jB = new JRadioButton("b. Text box");
			        					rdbtnQ3jB.setBounds(300, 541, 250, 25);
			        					rdbtnQ3jB.setBackground(Color.WHITE);
			        					rdbtnQ3jC = new JRadioButton("c. Text");
			        					rdbtnQ3jC.setBounds(550, 541, 250, 25);
			        					rdbtnQ3jC.setBackground(Color.WHITE);
			        					rdbtnQ3jD = new JRadioButton("d. Formatting");
			        					rdbtnQ3jD.setBounds(800, 541, 250, 25);
			        					rdbtnQ3jD.setBackground(Color.WHITE);
			        					bgQ3j = new ButtonGroup();
			        					bgQ3j.add(rdbtnQ3jA);
			        					bgQ3j.add(rdbtnQ3jB);
			        					bgQ3j.add(rdbtnQ3jC);
			        					bgQ3j.add(rdbtnQ3jD);
										bSubmit3 = new JButton("Submit");
			        					bSubmit3.setBounds(50, 616, 150, 25);
			        					bSubmit3.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent arg0) {
					        					if (rdbtnQ3aA.isSelected()) {
					        						score3a=1;
					        					}
					        					if (rdbtnQ3bB.isSelected()) {
					        						score3b=1;
					        					}
					        					if (rdbtnQ3cC.isSelected()) {
					        						score3c=1;
					        					}
					        					if (rdbtnQ3dD.isSelected()) {
					        						score3d=1;
					        					}
					        					if (rdbtnQ3eC.isSelected()) {
					        						score3e=1;
					        					}
					        					if (rdbtnQ3fA.isSelected()) {
					        						score3f=1;
					        					}
					        					if (rdbtnQ3gB.isSelected()) {
					        						score3g=1;
					        					}
					        					if (rdbtnQ3hA.isSelected()) {
					        						score3h=1;
					        					}
					        					if (rdbtnQ3iA.isSelected()) {
					        						score3i=1;
					        					}
					        					if (rdbtnQ3jD.isSelected()) {
					        						score3j=1;
					        					}
					        					lesson3g=score3a+score3b+score3c+score3d+score3e+score3f+score3g+score3h+score3i+score3j;
					        					JOptionPane.showMessageDialog(null, "Your score is "+lesson3g);
											}
			        					});
										panel2.add(lblAssess3);
										panel2.add(lblQ3a);
			        					panel2.add(rdbtnQ3aA);
			        					panel2.add(rdbtnQ3aB);
			        					panel2.add(rdbtnQ3aC);
			        					panel2.add(rdbtnQ3aD);
										panel2.add(lblQ3b);
			        					panel2.add(rdbtnQ3bA);
			        					panel2.add(rdbtnQ3bB);
			        					panel2.add(rdbtnQ3bC);
			        					panel2.add(rdbtnQ3bD);
										panel2.add(lblQ3c1);
										panel2.add(lblQ3c2);
			        					panel2.add(rdbtnQ3cA);
			        					panel2.add(rdbtnQ3cB);
			        					panel2.add(rdbtnQ3cC);
			        					panel2.add(rdbtnQ3cD);
										panel2.add(lblQ3d);
			        					panel2.add(rdbtnQ3dA);
			        					panel2.add(rdbtnQ3dB);
			        					panel2.add(rdbtnQ3dC);
			        					panel2.add(rdbtnQ3dD);
										panel2.add(lblQ3e);
			        					panel2.add(rdbtnQ3eA);
			        					panel2.add(rdbtnQ3eB);
			        					panel2.add(rdbtnQ3eC);
			        					panel2.add(rdbtnQ3eD);
										panel2.add(lblQ3f);
			        					panel2.add(rdbtnQ3fA);
			        					panel2.add(rdbtnQ3fB);
			        					panel2.add(rdbtnQ3fC);
			        					panel2.add(rdbtnQ3fD);
										panel2.add(lblQ3g);
			        					panel2.add(rdbtnQ3gA);
			        					panel2.add(rdbtnQ3gB);
			        					panel2.add(rdbtnQ3gC);
			        					panel2.add(rdbtnQ3gD);
										panel2.add(lblQ3h);
			        					panel2.add(rdbtnQ3hA);
			        					panel2.add(rdbtnQ3hB);
			        					panel2.add(rdbtnQ3hC);
			        					panel2.add(rdbtnQ3hD);
										panel2.add(lblQ3i);
			        					panel2.add(rdbtnQ3iA);
			        					panel2.add(rdbtnQ3iB);
			        					panel2.add(rdbtnQ3iC);
			        					panel2.add(rdbtnQ3iD);
										panel2.add(lblQ3j);
			        					panel2.add(rdbtnQ3jA);
			        					panel2.add(rdbtnQ3jB);
			        					panel2.add(rdbtnQ3jC);
			        					panel2.add(rdbtnQ3jD);
			        					panel2.add(bSubmit3);
									}
		    					});
		    					panel2.add(lblLesson3);
		    					panel2.add(bOpenVid3);
		    					panel2.add(bOpenPpt3);
		    					panel2.add(bAssess3);
		    				} else if (node.equals("Lesson 4")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson4 = new JLabel("Lesson 4: APPLYING A THEME");
		    					lblLesson4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson4.setBounds(50, 11, 500, 32);
		    					bOpenVid4 = new JButton("Play Video");
		    					bOpenVid4.setBounds(50, 500, 150, 100);
		    					bOpenVid4.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 4.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt4 = new JButton("Play Presentation");
		    					bOpenPpt4.setBounds(240, 500, 150, 100);
		    					bOpenPpt4.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("4.) Applying a theme.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess4 = new JButton("Assessment Task");
		    					bAssess4.setBounds(430, 500, 150, 100);
		    					bAssess4.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent ae) {
										panel2.removeAll();
										panel2.repaint();
										lblAssess4 = new JLabel("Assessment Task #4: APPLYING A THEME");
			        					lblAssess4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			        					lblAssess4.setBounds(50, 11, 700, 32);
			        					lblQ4a= new JLabel("1.	A _____ is a set of colors, fonts, effects, and more that can be applied to your entire presentation to give it a consistent, professional look.");
			        					lblQ4a.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4a.setBounds(50, 41, 1500, 32);
			        					rdbtnQ4aA = new JRadioButton("a. Picture");
			        					rdbtnQ4aA.setBounds(50, 71, 250, 25);
			        					rdbtnQ4aA.setBackground(Color.WHITE);
			        					rdbtnQ4aB = new JRadioButton("b. Design");
			        					rdbtnQ4aB.setBounds(300, 71, 250, 25);
			        					rdbtnQ4aB.setBackground(Color.WHITE);
			        					rdbtnQ4aC = new JRadioButton("c. Theme");
			        					rdbtnQ4aC.setBounds(550, 71, 250, 25);
			        					rdbtnQ4aC.setBackground(Color.WHITE);
			        					rdbtnQ4aD = new JRadioButton("d. Text");
			        					rdbtnQ4aD.setBounds(800, 71, 250, 25);
			        					rdbtnQ4aD.setBackground(Color.WHITE);
			        					bgQ4a = new ButtonGroup();
			        					bgQ4a.add(rdbtnQ4aA);
			        					bgQ4a.add(rdbtnQ4aB);
			        					bgQ4a.add(rdbtnQ4aC);
			        					bgQ4a.add(rdbtnQ4aD);
			        					lblQ4b= new JLabel("2.	Available from the font menu.");
			        					lblQ4b.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4b.setBounds(50, 91, 1000, 32);
			        					rdbtnQ4bA = new JRadioButton("a. Theme Fonts");
			        					rdbtnQ4bA.setBounds(50, 121, 250, 25);
			        					rdbtnQ4bA.setBackground(Color.WHITE);
			        					rdbtnQ4bB = new JRadioButton("b. Theme Colors");
			        					rdbtnQ4bB.setBounds(300, 121, 250, 25);
			        					rdbtnQ4bB.setBackground(Color.WHITE);
			        					rdbtnQ4bC = new JRadioButton("c. Shape Styles");
			        					rdbtnQ4bC.setBounds(550, 121, 250, 25);
			        					rdbtnQ4bC.setBackground(Color.WHITE);
			        					rdbtnQ4bD = new JRadioButton("d. Theme Text");
			        					rdbtnQ4bD.setBounds(800, 121, 250, 25);
			        					rdbtnQ4bD.setBackground(Color.WHITE);
			        					bgQ4b = new ButtonGroup();
			        					bgQ4b.add(rdbtnQ4bA);
			        					bgQ4b.add(rdbtnQ4bB);
			        					bgQ4b.add(rdbtnQ4bC);
			        					bgQ4b.add(rdbtnQ4bD);
			        					lblQ4c= new JLabel("3.	Available in the format tab when you click a shape.");
			        					lblQ4c.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4c.setBounds(50, 141, 1500, 32);
			        					rdbtnQ4cA = new JRadioButton("a. Theme Fonts");
			        					rdbtnQ4cA.setBounds(50, 171, 250, 25);
			        					rdbtnQ4cA.setBackground(Color.WHITE);
			        					rdbtnQ4cB = new JRadioButton("b. Theme Colors");
			        					rdbtnQ4cB.setBounds(300, 171, 250, 25);
			        					rdbtnQ4cB.setBackground(Color.WHITE);
			        					rdbtnQ4cC = new JRadioButton("c. Shape Styles");
			        					rdbtnQ4cC.setBounds(550, 171, 250, 25);
			        					rdbtnQ4cC.setBackground(Color.WHITE);
			        					rdbtnQ4cD = new JRadioButton("d. Theme Text");
			        					rdbtnQ4cD.setBounds(800, 171, 250, 25);
			        					rdbtnQ4cD.setBackground(Color.WHITE);
			        					bgQ4c = new ButtonGroup();
			        					bgQ4c.add(rdbtnQ4cA);
			        					bgQ4c.add(rdbtnQ4cB);
			        					bgQ4c.add(rdbtnQ4cC);
			        					bgQ4c.add(rdbtnQ4cD);
			        					lblQ4d= new JLabel("4.	Available from every color menu.");
			        					lblQ4d.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4d.setBounds(50, 191, 1500, 32);
			        					rdbtnQ4dA = new JRadioButton("a. Theme Fonts");
			        					rdbtnQ4dA.setBounds(50, 221, 250, 25);
			        					rdbtnQ4dA.setBackground(Color.WHITE);
			        					rdbtnQ4dB = new JRadioButton("b. Theme Colors");
			        					rdbtnQ4dB.setBounds(300, 221, 250, 25);
			        					rdbtnQ4dB.setBackground(Color.WHITE);
			        					rdbtnQ4dC = new JRadioButton("c. Shape Styles");
			        					rdbtnQ4dC.setBounds(550, 221, 250, 25);
			        					rdbtnQ4dC.setBackground(Color.WHITE);
			        					rdbtnQ4dD = new JRadioButton("d. Theme Text");
			        					rdbtnQ4dD.setBounds(800, 221, 250, 25);
			        					rdbtnQ4dD.setBackground(Color.WHITE);
			        					bgQ4d = new ButtonGroup();
			        					bgQ4d.add(rdbtnQ4dA);
			        					bgQ4d.add(rdbtnQ4dB);
			        					bgQ4d.add(rdbtnQ4dC);
			        					bgQ4d.add(rdbtnQ4dD);
			        					lblQ4e= new JLabel("5.	How to apply Theme?");
			        					lblQ4e.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4e.setBounds(50, 241, 1500, 32);
			        					rdbtnQ4eA = new JRadioButton("a. Go to the Transitions");
			        					rdbtnQ4eA.setBounds(50, 271, 250, 25);
			        					rdbtnQ4eA.setBackground(Color.WHITE);
			        					rdbtnQ4eB = new JRadioButton("b. Go to the Animations");
			        					rdbtnQ4eB.setBounds(300, 271, 250, 25);
			        					rdbtnQ4eB.setBackground(Color.WHITE);
			        					rdbtnQ4eC = new JRadioButton("c. Go to the Design");
			        					rdbtnQ4eC.setBounds(550, 271, 250, 25);
			        					rdbtnQ4eC.setBackground(Color.WHITE);
			        					rdbtnQ4eD = new JRadioButton("d. Go to the Insert");
			        					rdbtnQ4eD.setBounds(800, 271, 250, 25);
			        					rdbtnQ4eD.setBackground(Color.WHITE);
			        					bgQ4e = new ButtonGroup();
			        					bgQ4e.add(rdbtnQ4eA);
			        					bgQ4e.add(rdbtnQ4eB);
			        					bgQ4e.add(rdbtnQ4eC);
			        					bgQ4e.add(rdbtnQ4eD);
			        					lblQ4f= new JLabel("6.	Which of the following is TRUE in applying Theme?");
			        					lblQ4f.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4f.setBounds(50, 291, 1500, 32);
			        					rdbtnQ4fA = new JRadioButton("a. Click the Effects arrow to access more themes.");
			        					rdbtnQ4fA.setBounds(50, 321, 350, 25);
			        					rdbtnQ4fA.setBackground(Color.WHITE);
			        					rdbtnQ4fB = new JRadioButton("b. Click the Drop-down arrow to access more themes.");
			        					rdbtnQ4fB.setBounds(550, 321, 350, 25);
			        					rdbtnQ4fB.setBackground(Color.WHITE);
			        					rdbtnQ4fC = new JRadioButton("c. Click the Fonts arrow to access more themes.");
			        					rdbtnQ4fC.setBounds(50, 341, 350, 25);
			        					rdbtnQ4fC.setBackground(Color.WHITE);
			        					rdbtnQ4fD = new JRadioButton("d. Click the Colors arrow to access more themes.");
			        					rdbtnQ4fD.setBounds(550, 341, 350, 25);
			        					rdbtnQ4fD.setBackground(Color.WHITE);
			        					bgQ4f = new ButtonGroup();
			        					bgQ4f.add(rdbtnQ4fA);
			        					bgQ4f.add(rdbtnQ4fB);
			        					bgQ4f.add(rdbtnQ4fC);
			        					bgQ4f.add(rdbtnQ4fD);
			        					lblQ4g= new JLabel("7.	Hover over a theme to see a/an ___________ of it in the presentation. The name of the theme will appear as you hover over it.");
			        					lblQ4g.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4g.setBounds(50, 361, 1500, 32);
			        					rdbtnQ4gA = new JRadioButton("a. Effects");
			        					rdbtnQ4gA.setBounds(50, 391, 250, 25);
			        					rdbtnQ4gA.setBackground(Color.WHITE);
			        					rdbtnQ4gB = new JRadioButton("b. Design");
			        					rdbtnQ4gB.setBounds(300, 391, 250, 25);
			        					rdbtnQ4gB.setBackground(Color.WHITE);
			        					rdbtnQ4gC = new JRadioButton("c. Colors");
			        					rdbtnQ4gC.setBounds(550, 391, 250, 25);
			        					rdbtnQ4gC.setBackground(Color.WHITE);
			        					rdbtnQ4gD = new JRadioButton("d. Live preview");
			        					rdbtnQ4gD.setBounds(800, 391, 250, 25);
			        					rdbtnQ4gD.setBackground(Color.WHITE);
			        					bgQ4g = new ButtonGroup();
			        					bgQ4g.add(rdbtnQ4gA);
			        					bgQ4g.add(rdbtnQ4gB);
			        					bgQ4g.add(rdbtnQ4gC);
			        					bgQ4g.add(rdbtnQ4gD);
			        					lblQ4h= new JLabel("8.	A theme is a __________________ of colors, fonts, and effects that can be "
			        							+ "applied to your presentation.");
			        					lblQ4h.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4h.setBounds(50, 411, 1500, 32);
			        					rdbtnQ4hA = new JRadioButton("a. Predefined Combination");
			        					rdbtnQ4hA.setBounds(50, 441, 250, 25);
			        					rdbtnQ4hA.setBackground(Color.WHITE);
			        					rdbtnQ4hB = new JRadioButton("b. Presentation Combination");
			        					rdbtnQ4hB.setBounds(300, 441, 250, 25);
			        					rdbtnQ4hB.setBackground(Color.WHITE);
			        					rdbtnQ4hC = new JRadioButton("c. Office Combination");
			        					rdbtnQ4hC.setBounds(550, 441, 250, 25);
			        					rdbtnQ4hC.setBackground(Color.WHITE);
			        					rdbtnQ4hD = new JRadioButton("d. Design Combination");
			        					rdbtnQ4hD.setBounds(800, 441, 250, 25);
			        					rdbtnQ4hD.setBackground(Color.WHITE);
			        					bgQ4h = new ButtonGroup();
			        					bgQ4h.add(rdbtnQ4hA);
			        					bgQ4h.add(rdbtnQ4hB);
			        					bgQ4h.add(rdbtnQ4hC);
			        					bgQ4h.add(rdbtnQ4hD);
			        					lblQ4i= new JLabel("9.	Which of the following is TRUE applying theme to your Slides?");
			        					lblQ4i.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4i.setBounds(50, 461, 1500, 32);
			        					rdbtnQ4iA = new JRadioButton("a. Click Fonts to apply to your slides");
			        					rdbtnQ4iA.setBounds(50, 491, 250, 25);
			        					rdbtnQ4iA.setBackground(Color.WHITE);
			        					rdbtnQ4iB = new JRadioButton("b. Select Background Styles to apply to your slides.");
			        					rdbtnQ4iB.setBounds(550, 491, 350, 25);
			        					rdbtnQ4iB.setBackground(Color.WHITE);
			        					rdbtnQ4iC = new JRadioButton("c. Select Shapes to apply to your slides.");
			        					rdbtnQ4iC.setBounds(50, 511, 250, 25);
			        					rdbtnQ4iC.setBackground(Color.WHITE);
			        					rdbtnQ4iD = new JRadioButton("d. Click a theme to apply to your slides.");
			        					rdbtnQ4iD.setBounds(550, 511, 250, 25);
			        					rdbtnQ4iD.setBackground(Color.WHITE);
			        					bgQ4i = new ButtonGroup();
			        					bgQ4i.add(rdbtnQ4iA);
			        					bgQ4i.add(rdbtnQ4iB);
			        					bgQ4i.add(rdbtnQ4iC);
			        					bgQ4i.add(rdbtnQ4iD);
			        					lblQ4j= new JLabel("10.	The colors and fonts will only update if you're using ______________ or ______________.");
			        					lblQ4j.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ4j.setBounds(50, 531, 1500, 32);
			        					rdbtnQ4jA = new JRadioButton("a. Shape styles or theme colors");
			        					rdbtnQ4jA.setBounds(50, 561, 250, 25);
			        					rdbtnQ4jA.setBackground(Color.WHITE);
			        					rdbtnQ4jB = new JRadioButton("b. Theme colors or standard colors");
			        					rdbtnQ4jB.setBounds(300, 561, 250, 25);
			        					rdbtnQ4jB.setBackground(Color.WHITE);
			        					rdbtnQ4jC = new JRadioButton("c. Theme fonts or standard colors");
			        					rdbtnQ4jC.setBounds(550, 561, 250, 25);
			        					rdbtnQ4jC.setBackground(Color.WHITE);
			        					rdbtnQ4jD = new JRadioButton("d. Theme fonts or theme colors ");
			        					rdbtnQ4jD.setBounds(800, 561, 250, 25);
			        					rdbtnQ4jD.setBackground(Color.WHITE);
			        					bgQ4j = new ButtonGroup();
			        					bgQ4j.add(rdbtnQ4jA);
			        					bgQ4j.add(rdbtnQ4jB);
			        					bgQ4j.add(rdbtnQ4jC);
			        					bgQ4j.add(rdbtnQ4jD);
										bSubmit4 = new JButton("Submit");
			        					bSubmit4.setBounds(50, 616, 150, 25);
			        					bSubmit4.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent arg0) {
					        					if (rdbtnQ4aC.isSelected()) {
					        						score4a=1;
					        					}
					        					if (rdbtnQ4bA.isSelected()) {
					        						score4b=1;
					        					}
					        					if (rdbtnQ4cC.isSelected()) {
					        						score4c=1;
					        					}
					        					if (rdbtnQ4dB.isSelected()) {
					        						score4d=1;
					        					}
					        					if (rdbtnQ4eC.isSelected()) {
					        						score4e=1;
					        					}
					        					if (rdbtnQ4fB.isSelected()) {
					        						score4f=1;
					        					}
					        					if (rdbtnQ4gD.isSelected()) {
					        						score4g=1;
					        					}
					        					if (rdbtnQ4hA.isSelected()) {
					        						score4h=1;
					        					}
					        					if (rdbtnQ4iD.isSelected()) {
					        						score4i=1;
					        					}
					        					if (rdbtnQ4jD.isSelected()) {
					        						score4j=1;
					        					}
					        					lesson4g=score4a+score4b+score4c+score4d+score4e+score4f+score4g+score4h+score4i+score4j;
					        					JOptionPane.showMessageDialog(null, "Your score is "+lesson4g);
											}
			        					});
										panel2.add(lblAssess4);
										panel2.add(lblQ4a);
			        					panel2.add(rdbtnQ4aA);
			        					panel2.add(rdbtnQ4aB);
			        					panel2.add(rdbtnQ4aC);
			        					panel2.add(rdbtnQ4aD);
										panel2.add(lblQ4b);
			        					panel2.add(rdbtnQ4bA);
			        					panel2.add(rdbtnQ4bB);
			        					panel2.add(rdbtnQ4bC);
			        					panel2.add(rdbtnQ4bD);
										panel2.add(lblQ4c);
			        					panel2.add(rdbtnQ4cA);
			        					panel2.add(rdbtnQ4cB);
			        					panel2.add(rdbtnQ4cC);
			        					panel2.add(rdbtnQ4cD);
										panel2.add(lblQ4d);
			        					panel2.add(rdbtnQ4dA);
			        					panel2.add(rdbtnQ4dB);
			        					panel2.add(rdbtnQ4dC);
			        					panel2.add(rdbtnQ4dD);
										panel2.add(lblQ4e);
			        					panel2.add(rdbtnQ4eA);
			        					panel2.add(rdbtnQ4eB);
			        					panel2.add(rdbtnQ4eC);
			        					panel2.add(rdbtnQ4eD);
										panel2.add(lblQ4f);
			        					panel2.add(rdbtnQ4fA);
			        					panel2.add(rdbtnQ4fB);
			        					panel2.add(rdbtnQ4fC);
			        					panel2.add(rdbtnQ4fD);
										panel2.add(lblQ4g);
			        					panel2.add(rdbtnQ4gA);
			        					panel2.add(rdbtnQ4gB);
			        					panel2.add(rdbtnQ4gC);
			        					panel2.add(rdbtnQ4gD);
										panel2.add(lblQ4h);
			        					panel2.add(rdbtnQ4hA);
			        					panel2.add(rdbtnQ4hB);
			        					panel2.add(rdbtnQ4hC);
			        					panel2.add(rdbtnQ4hD);
										panel2.add(lblQ4i);
			        					panel2.add(rdbtnQ4iA);
			        					panel2.add(rdbtnQ4iB);
			        					panel2.add(rdbtnQ4iC);
			        					panel2.add(rdbtnQ4iD);
										panel2.add(lblQ4j);
			        					panel2.add(rdbtnQ4jA);
			        					panel2.add(rdbtnQ4jB);
			        					panel2.add(rdbtnQ4jC);
			        					panel2.add(rdbtnQ4jD);
			        					panel2.add(bSubmit4);
									}
		    					});
		    					panel2.add(lblLesson4);
		    					panel2.add(bOpenVid4);
		    					panel2.add(bOpenPpt4);
		    					panel2.add(bAssess4);
		    				} else if (node.equals("Lesson 5")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson5 = new JLabel("Lesson 5: INSERTING IMAGES");
		    					lblLesson5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson5.setBounds(50, 11, 500, 32);
		    					bOpenVid5 = new JButton("Play Video");
		    					bOpenVid5.setBounds(50, 500, 150, 100);
		    					bOpenVid5.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 5.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt5 = new JButton("Play Presentation");
		    					bOpenPpt5.setBounds(240, 500, 150, 100);
		    					bOpenPpt5.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("5.) Inserting Images.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess5 = new JButton("Assessment Task");
		    					bAssess5.setBounds(430, 500, 150, 100);
		    					bAssess5.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent ae) {
										panel2.removeAll();
										panel2.repaint();
										lblAssess5 = new JLabel("Assessment Task #5: INSERTING IMAGES");
			        					lblAssess5.setFont(new Font("Tahoma", Font.PLAIN, 20));
			        					lblAssess5.setBounds(50, 11, 700, 32);
			        					lblQ5a= new JLabel("1.	Adding ______ and ________ to your presentation can be a great way to illustrate important information or add decorative accents to existing text.");
			        					lblQ5a.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5a.setBounds(50, 41, 1500, 32);
			        					rdbtnQ5aA = new JRadioButton("a. Colors and text");
			        					rdbtnQ5aA.setBounds(50, 71, 250, 25);
			        					rdbtnQ5aA.setBackground(Color.WHITE);
			        					rdbtnQ5aB = new JRadioButton("b. Clip art and pictures");
			        					rdbtnQ5aB.setBounds(300, 71, 250, 25);
			        					rdbtnQ5aB.setBackground(Color.WHITE);
			        					rdbtnQ5aC = new JRadioButton("c. Theme and text");
			        					rdbtnQ5aC.setBounds(550, 71, 250, 25);
			        					rdbtnQ5aC.setBackground(Color.WHITE);
			        					rdbtnQ5aD = new JRadioButton("d. Video and colors");
			        					rdbtnQ5aD.setBounds(800, 71, 250, 25);
			        					rdbtnQ5aD.setBackground(Color.WHITE);
			        					bgQ5a = new ButtonGroup();
			        					bgQ5a.add(rdbtnQ5aA);
			        					bgQ5a.add(rdbtnQ5aB);
			        					bgQ5a.add(rdbtnQ5aC);
			        					bgQ5a.add(rdbtnQ5aD);
			        					lblQ5b= new JLabel("2.	Select the Insert tab and click the _________ command in the Images group. The Insert picture dialog box appears.");
			        					lblQ5b.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5b.setBounds(50, 91, 1000, 32);
			        					rdbtnQ5bA = new JRadioButton("a. Clip art");
			        					rdbtnQ5bA.setBounds(50, 121, 250, 25);
			        					rdbtnQ5bA.setBackground(Color.WHITE);
			        					rdbtnQ5bB = new JRadioButton("b. Picture");
			        					rdbtnQ5bB.setBounds(300, 121, 250, 25);
			        					rdbtnQ5bB.setBackground(Color.WHITE);
			        					rdbtnQ5bC = new JRadioButton("c. Table");
			        					rdbtnQ5bC.setBounds(550, 121, 250, 25);
			        					rdbtnQ5bC.setBackground(Color.WHITE);
			        					rdbtnQ5bD = new JRadioButton("d. Shapes");
			        					rdbtnQ5bD.setBounds(800, 121, 250, 25);
			        					rdbtnQ5bD.setBackground(Color.WHITE);
			        					bgQ5b = new ButtonGroup();
			        					bgQ5b.add(rdbtnQ5bA);
			        					bgQ5b.add(rdbtnQ5bB);
			        					bgQ5b.add(rdbtnQ5bC);
			        					bgQ5b.add(rdbtnQ5bD);
			        					lblQ5c= new JLabel("3.	You can also select the __________________ command in a placeholder to insert images.");
			        					lblQ5c.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5c.setBounds(50, 141, 1500, 32);
			        					rdbtnQ5cA = new JRadioButton("a. Insert Chart");
			        					rdbtnQ5cA.setBounds(50, 171, 250, 25);
			        					rdbtnQ5cA.setBackground(Color.WHITE);
			        					rdbtnQ5cB = new JRadioButton("b. Insert Video");
			        					rdbtnQ5cB.setBounds(300, 171, 250, 25);
			        					rdbtnQ5cB.setBackground(Color.WHITE);
			        					rdbtnQ5cC = new JRadioButton("c. Insert table");
			        					rdbtnQ5cC.setBounds(550, 171, 250, 25);
			        					rdbtnQ5cC.setBackground(Color.WHITE);
			        					rdbtnQ5cD = new JRadioButton("d. Insert Picture from File ");
			        					rdbtnQ5cD.setBounds(800, 171, 250, 25);
			        					rdbtnQ5cD.setBackground(Color.WHITE);
			        					bgQ5c = new ButtonGroup();
			        					bgQ5c.add(rdbtnQ5cA);
			        					bgQ5c.add(rdbtnQ5cB);
			        					bgQ5c.add(rdbtnQ5cC);
			        					bgQ5c.add(rdbtnQ5cD);
			        					lblQ5d= new JLabel("4.	To select the Insert tab, click the _______ command in the Images group.");
			        					lblQ5d.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5d.setBounds(50, 191, 1500, 32);
			        					rdbtnQ5dA = new JRadioButton("a. Clip Art");
			        					rdbtnQ5dA.setBounds(50, 221, 250, 25);
			        					rdbtnQ5dA.setBackground(Color.WHITE);
			        					rdbtnQ5dB = new JRadioButton("b. Picture");
			        					rdbtnQ5dB.setBounds(300, 221, 250, 25);
			        					rdbtnQ5dB.setBackground(Color.WHITE);
			        					rdbtnQ5dC = new JRadioButton("c. Table");
			        					rdbtnQ5dC.setBounds(550, 221, 250, 25);
			        					rdbtnQ5dC.setBackground(Color.WHITE);
			        					rdbtnQ5dD = new JRadioButton("d. Shapes");
			        					rdbtnQ5dD.setBounds(800, 221, 250, 25);
			        					rdbtnQ5dD.setBackground(Color.WHITE);
			        					bgQ5d = new ButtonGroup();
			        					bgQ5d.add(rdbtnQ5dA);
			        					bgQ5d.add(rdbtnQ5dB);
			        					bgQ5d.add(rdbtnQ5dC);
			        					bgQ5d.add(rdbtnQ5dD);
			        					lblQ5e1= new JLabel("5.	You can insert ______ from your computer, search Microsoft's large selection of clip art to find the image you need, or add a screenshot of your own.");
			        					lblQ5e1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5e1.setBounds(50, 241, 1500, 32);
			        					lblQ5e2= new JLabel(" Once an image has been inserted, you can resize and move it to the location you want.");
			        					lblQ5e2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5e2.setBounds(50, 261, 1500, 32);
			        					rdbtnQ5eA = new JRadioButton("a. Design");
			        					rdbtnQ5eA.setBounds(50, 291, 250, 25);
			        					rdbtnQ5eA.setBackground(Color.WHITE);
			        					rdbtnQ5eB = new JRadioButton("b. Text box");
			        					rdbtnQ5eB.setBounds(300, 291, 250, 25);
			        					rdbtnQ5eB.setBackground(Color.WHITE);
			        					rdbtnQ5eC = new JRadioButton("c. Layout ");
			        					rdbtnQ5eC.setBounds(550, 291, 250, 25);
			        					rdbtnQ5eC.setBackground(Color.WHITE);
			        					rdbtnQ5eD = new JRadioButton("d. Images");
			        					rdbtnQ5eD.setBounds(800, 291, 250, 25);
			        					rdbtnQ5eD.setBackground(Color.WHITE);
			        					bgQ5e = new ButtonGroup();
			        					bgQ5e.add(rdbtnQ5eA);
			        					bgQ5e.add(rdbtnQ5eB);
			        					bgQ5e.add(rdbtnQ5eC);
			        					bgQ5e.add(rdbtnQ5eD);
			        					lblQ5f= new JLabel("6.	You can select the ______________ command in a placeholder to insert clip art.");
			        					lblQ5f.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5f.setBounds(50, 311, 1500, 32);
			        					rdbtnQ5fA = new JRadioButton("a. Insert Picture from file");
			        					rdbtnQ5fA.setBounds(50, 341, 250, 25);
			        					rdbtnQ5fA.setBackground(Color.WHITE);
			        					rdbtnQ5fB = new JRadioButton("b. Insert Clip Art from File ");
			        					rdbtnQ5fB.setBounds(300, 341, 250, 25);
			        					rdbtnQ5fB.setBackground(Color.WHITE);
			        					rdbtnQ5fC = new JRadioButton("c. Insert Video from file");
			        					rdbtnQ5fC.setBounds(550, 341, 250, 25);
			        					rdbtnQ5fC.setBackground(Color.WHITE);
			        					rdbtnQ5fD = new JRadioButton("d. Insert table");
			        					rdbtnQ5fD.setBounds(800, 341, 250, 25);
			        					rdbtnQ5fD.setBackground(Color.WHITE);
			        					bgQ5f = new ButtonGroup();
			        					bgQ5f.add(rdbtnQ5fA);
			        					bgQ5f.add(rdbtnQ5fB);
			        					bgQ5f.add(rdbtnQ5fC);
			        					bgQ5f.add(rdbtnQ5fD);
			        					lblQ5g= new JLabel("7.	___________ are pictures that capture the visible windows and items displayed on your computer screen.");
			        					lblQ5g.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5g.setBounds(50, 361, 1500, 32);
			        					rdbtnQ5gA = new JRadioButton("a. Clip art");
			        					rdbtnQ5gA.setBounds(50, 391, 250, 25);
			        					rdbtnQ5gA.setBackground(Color.WHITE);
			        					rdbtnQ5gB = new JRadioButton("b. Screenshots");
			        					rdbtnQ5gB.setBounds(300, 391, 250, 25);
			        					rdbtnQ5gB.setBackground(Color.WHITE);
			        					rdbtnQ5gC = new JRadioButton("c. Video");
			        					rdbtnQ5gC.setBounds(550, 391, 250, 25);
			        					rdbtnQ5gC.setBackground(Color.WHITE);
			        					rdbtnQ5gD = new JRadioButton("d. Chart");
			        					rdbtnQ5gD.setBounds(800, 391, 250, 25);
			        					rdbtnQ5gD.setBackground(Color.WHITE);
			        					bgQ5g = new ButtonGroup();
			        					bgQ5g.add(rdbtnQ5gA);
			        					bgQ5g.add(rdbtnQ5gB);
			        					bgQ5g.add(rdbtnQ5gC);
			        					bgQ5g.add(rdbtnQ5gD);
			        					lblQ5h1= new JLabel("8.	Select the Insert tab. Click the Screenshot commands in the Images group. The _______________ from your desktop will appear. Select the window you want to ");
			        					lblQ5h1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5h1.setBounds(50, 411, 1500, 32);
			        					lblQ5h2= new JLabel(" capture as a screenshot. The Screenshot will appear in your slide.");
			        					lblQ5h2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5h2.setBounds(50, 431, 1500, 32);
			        					rdbtnQ5hA = new JRadioButton("a. Clip Art");
			        					rdbtnQ5hA.setBounds(50, 461, 250, 25);
			        					rdbtnQ5hA.setBackground(Color.WHITE);
			        					rdbtnQ5hB = new JRadioButton("b. Table ");
			        					rdbtnQ5hB.setBounds(300, 461, 250, 25);
			        					rdbtnQ5hB.setBackground(Color.WHITE);
			        					rdbtnQ5hC = new JRadioButton("c. Available Windows");
			        					rdbtnQ5hC.setBounds(550, 461, 250, 25);
			        					rdbtnQ5hC.setBackground(Color.WHITE);
			        					rdbtnQ5hD = new JRadioButton("d. Shapes");
			        					rdbtnQ5hD.setBounds(800, 461, 250, 25);
			        					rdbtnQ5hD.setBackground(Color.WHITE);
			        					bgQ5h = new ButtonGroup();
			        					bgQ5h.add(rdbtnQ5hA);
			        					bgQ5h.add(rdbtnQ5hB);
			        					bgQ5h.add(rdbtnQ5hC);
			        					bgQ5h.add(rdbtnQ5hD);
			        					lblQ5i1= new JLabel("9.	Click the image. The cursor will turn into a cross with arrows and while holding down the mouse button, drag the ________________ to the desired");
			        					lblQ5i1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5i1.setBounds(50, 481, 1500, 32);
			        					lblQ5i2= new JLabel(" location. Release the mouse button. The box will be moved.");
			        					lblQ5i2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5i2.setBounds(50, 501, 1500, 32);
			        					rdbtnQ5iA = new JRadioButton("a. Image");
			        					rdbtnQ5iA.setBounds(50, 531, 250, 25);
			        					rdbtnQ5iA.setBackground(Color.WHITE);
			        					rdbtnQ5iB = new JRadioButton("b. Video");
			        					rdbtnQ5iB.setBounds(300, 531, 250, 25);
			        					rdbtnQ5iB.setBackground(Color.WHITE);
			        					rdbtnQ5iC = new JRadioButton("c. Table");
			        					rdbtnQ5iC.setBounds(550, 531, 250, 25);
			        					rdbtnQ5iC.setBackground(Color.WHITE);
			        					rdbtnQ5iD = new JRadioButton("d. Shapes");
			        					rdbtnQ5iD.setBounds(800, 531, 250, 25);
			        					rdbtnQ5iD.setBackground(Color.WHITE);
			        					bgQ5i = new ButtonGroup();
			        					bgQ5i.add(rdbtnQ5iA);
			        					bgQ5i.add(rdbtnQ5iB);
			        					bgQ5i.add(rdbtnQ5iC);
			        					bgQ5i.add(rdbtnQ5iD);
			        					lblQ5j= new JLabel("10.	The side sizing handles change the image's size but do not keep the same ________. If you want to keep the image's proportions, always use the corner handles.");
			        					lblQ5j.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ5j.setBounds(50, 551, 1500, 32);
			        					rdbtnQ5jA = new JRadioButton("a. Design");
			        					rdbtnQ5jA.setBounds(50, 581, 250, 25);
			        					rdbtnQ5jA.setBackground(Color.WHITE);
			        					rdbtnQ5jB = new JRadioButton("b. Text");
			        					rdbtnQ5jB.setBounds(300, 581, 250, 25);
			        					rdbtnQ5jB.setBackground(Color.WHITE);
			        					rdbtnQ5jC = new JRadioButton("c. Proportions");
			        					rdbtnQ5jC.setBounds(550, 581, 250, 25);
			        					rdbtnQ5jC.setBackground(Color.WHITE);
			        					rdbtnQ5jD = new JRadioButton("d. Layout");
			        					rdbtnQ5jD.setBounds(800, 581, 250, 25);
			        					rdbtnQ5jD.setBackground(Color.WHITE);
			        					bgQ5j = new ButtonGroup();
			        					bgQ5j.add(rdbtnQ5jA);
			        					bgQ5j.add(rdbtnQ5jB);
			        					bgQ5j.add(rdbtnQ5jC);
			        					bgQ5j.add(rdbtnQ5jD);
										bSubmit5 = new JButton("Submit");
			        					bSubmit5.setBounds(50, 616, 150, 25);
			        					bSubmit5.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent arg0) {
					        					if (rdbtnQ5aB.isSelected()) {
					        						score5a=1;
					        					}
					        					if (rdbtnQ5bC.isSelected()) {
					        						score5b=1;
					        					}
					        					if (rdbtnQ5cD.isSelected()) {
					        						score5c=1;
					        					}
					        					if (rdbtnQ5dA.isSelected()) {
					        						score5d=1;
					        					}
					        					if (rdbtnQ5eB.isSelected()) {
					        						score5e=1;
					        					}
					        					if (rdbtnQ5fB.isSelected()) {
					        						score5f=1;
					        					}
					        					if (rdbtnQ5gC.isSelected()) {
					        						score5g=1;
					        					}
					        					if (rdbtnQ5hA.isSelected()) {
					        						score5h=1;
					        					}
					        					if (rdbtnQ5iD.isSelected()) {
					        						score5i=1;
					        					}
					        					if (rdbtnQ5jC.isSelected()) {
					        						score5j=1;
					        					}
					        					lesson5g=score5a+score5b+score5c+score5d+score5e+score5f+score5g+score5h+score5i+score5j;
					        					JOptionPane.showMessageDialog(null, "Your score is "+lesson5g);
											}
			        					});
										panel2.add(lblAssess5);
										panel2.add(lblQ5a);
			        					panel2.add(rdbtnQ5aA);
			        					panel2.add(rdbtnQ5aB);
			        					panel2.add(rdbtnQ5aC);
			        					panel2.add(rdbtnQ5aD);
										panel2.add(lblQ5b);
			        					panel2.add(rdbtnQ5bA);
			        					panel2.add(rdbtnQ5bB);
			        					panel2.add(rdbtnQ5bC);
			        					panel2.add(rdbtnQ5bD);
										panel2.add(lblQ5c);
			        					panel2.add(rdbtnQ5cA);
			        					panel2.add(rdbtnQ5cB);
			        					panel2.add(rdbtnQ5cC);
			        					panel2.add(rdbtnQ5cD);
										panel2.add(lblQ5d);
			        					panel2.add(rdbtnQ5dA);
			        					panel2.add(rdbtnQ5dB);
			        					panel2.add(rdbtnQ5dC);
			        					panel2.add(rdbtnQ5dD);
										panel2.add(lblQ5e1);
										panel2.add(lblQ5e2);
			        					panel2.add(rdbtnQ5eA);
			        					panel2.add(rdbtnQ5eB);
			        					panel2.add(rdbtnQ5eC);
			        					panel2.add(rdbtnQ5eD);
										panel2.add(lblQ5f);
			        					panel2.add(rdbtnQ5fA);
			        					panel2.add(rdbtnQ5fB);
			        					panel2.add(rdbtnQ5fC);
			        					panel2.add(rdbtnQ5fD);
										panel2.add(lblQ5g);
			        					panel2.add(rdbtnQ5gA);
			        					panel2.add(rdbtnQ5gB);
			        					panel2.add(rdbtnQ5gC);
			        					panel2.add(rdbtnQ5gD);
										panel2.add(lblQ5h1);
										panel2.add(lblQ5h2);
			        					panel2.add(rdbtnQ5hA);
			        					panel2.add(rdbtnQ5hB);
			        					panel2.add(rdbtnQ5hC);
			        					panel2.add(rdbtnQ5hD);
										panel2.add(lblQ5i1);
										panel2.add(lblQ5i2);
			        					panel2.add(rdbtnQ5iA);
			        					panel2.add(rdbtnQ5iB);
			        					panel2.add(rdbtnQ5iC);
			        					panel2.add(rdbtnQ5iD);
										panel2.add(lblQ5j);
			        					panel2.add(rdbtnQ5jA);
			        					panel2.add(rdbtnQ5jB);
			        					panel2.add(rdbtnQ5jC);
			        					panel2.add(rdbtnQ5jD);
			        					panel2.add(bSubmit5);
									}
		    					});
		    					panel2.add(lblLesson5);
		    					panel2.add(bOpenVid5);
		    					panel2.add(bOpenPpt5);
		    					panel2.add(bAssess5);
		    				} else if (node.equals("Lesson 6")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson6 = new JLabel("Lesson 6: APPLYING TRANSITIONS");
		    					lblLesson6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson6.setBounds(50, 11, 500, 32);
		    					bOpenVid6 = new JButton("Play Video");
		    					bOpenVid6.setBounds(50, 500, 150, 100);
		    					bOpenVid6.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 6.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt6 = new JButton("Play Presentation");
		    					bOpenPpt6.setBounds(240, 500, 150, 100);
		    					bOpenPpt6.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("6.) Applying Transitions.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess6 = new JButton("Assessment Task");
		    					bAssess6.setBounds(430, 500, 150, 100);
		    					bAssess6.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent ae) {
										panel2.removeAll();
										panel2.repaint();
										lblAssess6 = new JLabel("Assessment Task #6: APPLYING TRANSITIONS");
			        					lblAssess6.setFont(new Font("Tahoma", Font.PLAIN, 20));
			        					lblAssess6.setBounds(50, 11, 700, 32);
			        					lblQ6a= new JLabel("1.	___________ are motion effects that when in Slide Show view add movement to your slides as you advance from one slide to another.");
			        					lblQ6a.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6a.setBounds(50, 41, 1500, 32);
			        					rdbtnQ6aA = new JRadioButton("a. Transitions");
			        					rdbtnQ6aA.setBounds(50, 71, 250, 25);
			        					rdbtnQ6aA.setBackground(Color.WHITE);
			        					rdbtnQ6aB = new JRadioButton("b. Customize");
			        					rdbtnQ6aB.setBounds(300, 71, 250, 25);
			        					rdbtnQ6aB.setBackground(Color.WHITE);
			        					rdbtnQ6aC = new JRadioButton("c. Effects");
			        					rdbtnQ6aC.setBounds(550, 71, 250, 25);
			        					rdbtnQ6aC.setBackground(Color.WHITE);
			        					rdbtnQ6aD = new JRadioButton("d. Preview");
			        					rdbtnQ6aD.setBounds(800, 71, 250, 25);
			        					rdbtnQ6aD.setBackground(Color.WHITE);
			        					bgQ6a = new ButtonGroup();
			        					bgQ6a.add(rdbtnQ6aA);
			        					bgQ6a.add(rdbtnQ6aB);
			        					bgQ6a.add(rdbtnQ6aC);
			        					bgQ6a.add(rdbtnQ6aD);
			        					lblQ6b= new JLabel("2.	Which of the following is FALSE about transition?");
			        					lblQ6b.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6b.setBounds(50, 91, 1000, 32);
			        					rdbtnQ6bA = new JRadioButton("a. Subtle ");
			        					rdbtnQ6bA.setBounds(50, 121, 250, 25);
			        					rdbtnQ6bA.setBackground(Color.WHITE);
			        					rdbtnQ6bB = new JRadioButton("b. Video");
			        					rdbtnQ6bB.setBounds(300, 121, 250, 25);
			        					rdbtnQ6bB.setBackground(Color.WHITE);
			        					rdbtnQ6bC = new JRadioButton("c. Exciting");
			        					rdbtnQ6bC.setBounds(550, 121, 250, 25);
			        					rdbtnQ6bC.setBackground(Color.WHITE);
			        					rdbtnQ6bD = new JRadioButton("d. Dynamic content");
			        					rdbtnQ6bD.setBounds(800, 121, 250, 25);
			        					rdbtnQ6bD.setBackground(Color.WHITE);
			        					bgQ6b = new ButtonGroup();
			        					bgQ6b.add(rdbtnQ6bA);
			        					bgQ6b.add(rdbtnQ6bB);
			        					bgQ6b.add(rdbtnQ6bC);
			        					bgQ6b.add(rdbtnQ6bD);
			        					lblQ6c1= new JLabel("3.	When working with transitions, the Apply to All command in the ______ group can be used at any time to make your presentation uniform. Use this command with");
			        					lblQ6c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6c1.setBounds(50, 141, 1500, 32);
			        					lblQ6c2= new JLabel(" caution.");
			        					lblQ6c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6c2.setBounds(50, 161, 1500, 32);
			        					rdbtnQ6cA = new JRadioButton("a. Transitions");
			        					rdbtnQ6cA.setBounds(50, 191, 250, 25);
			        					rdbtnQ6cA.setBackground(Color.WHITE);
			        					rdbtnQ6cB = new JRadioButton("b. Preview");
			        					rdbtnQ6cB.setBounds(300, 191, 250, 25);
			        					rdbtnQ6cB.setBackground(Color.WHITE);
			        					rdbtnQ6cC = new JRadioButton("c. Effects");
			        					rdbtnQ6cC.setBounds(550, 191, 250, 25);
			        					rdbtnQ6cC.setBackground(Color.WHITE);
			        					rdbtnQ6cD = new JRadioButton("d. Timing");
			        					rdbtnQ6cD.setBounds(800, 191, 250, 25);
			        					rdbtnQ6cD.setBackground(Color.WHITE);
			        					bgQ6c = new ButtonGroup();
			        					bgQ6c.add(rdbtnQ6cA);
			        					bgQ6c.add(rdbtnQ6cB);
			        					bgQ6c.add(rdbtnQ6cC);
			        					bgQ6c.add(rdbtnQ6cD);
			        					lblQ6d1 = new JLabel("4.	Click the Preview command on the Transitions tab. Click the star ___________ icon. The icon appears on the Slides tab in the left pane beside any slide that includes");
			        					lblQ6d1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6d1.setBounds(50, 211, 1500, 32);
			        					lblQ6d2 = new JLabel(" a transition.");
			        					lblQ6d2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6d2.setBounds(50, 231, 1500, 32);
			        					rdbtnQ6dA = new JRadioButton("a. Effects");
			        					rdbtnQ6dA.setBounds(50, 261, 250, 25);
			        					rdbtnQ6dA.setBackground(Color.WHITE);
			        					rdbtnQ6dB = new JRadioButton("b. Timing");
			        					rdbtnQ6dB.setBounds(300, 261, 250, 25);
			        					rdbtnQ6dB.setBackground(Color.WHITE);
			        					rdbtnQ6dC = new JRadioButton("c. Play Animations ");
			        					rdbtnQ6dC.setBounds(550, 261, 250, 25);
			        					rdbtnQ6dC.setBackground(Color.WHITE);
			        					rdbtnQ6dD = new JRadioButton("d. Video");
			        					rdbtnQ6dD.setBounds(800, 261, 250, 25);
			        					rdbtnQ6dD.setBackground(Color.WHITE);
			        					bgQ6d = new ButtonGroup();
			        					bgQ6d.add(rdbtnQ6dA);
			        					bgQ6d.add(rdbtnQ6dB);
			        					bgQ6d.add(rdbtnQ6dC);
			        					bgQ6d.add(rdbtnQ6dD);
			        					lblQ6e= new JLabel("5.	Select the slide you want to modify. Choose ______ from the gallery in the Transition to this slide group.");
			        					lblQ6e.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6e.setBounds(50, 281, 1500, 32);
			        					rdbtnQ6eA = new JRadioButton("a. None");
			        					rdbtnQ6eA.setBounds(50, 311, 250, 25);
			        					rdbtnQ6eA.setBackground(Color.WHITE);
			        					rdbtnQ6eB = new JRadioButton("b. Cut");
			        					rdbtnQ6eB.setBounds(300, 311, 250, 25);
			        					rdbtnQ6eB.setBackground(Color.WHITE);
			        					rdbtnQ6eC = new JRadioButton("c. Fade");
			        					rdbtnQ6eC.setBounds(550, 311, 250, 25);
			        					rdbtnQ6eC.setBackground(Color.WHITE);
			        					rdbtnQ6eD = new JRadioButton("d. Push");
			        					rdbtnQ6eD.setBounds(800, 311, 250, 25);
			        					rdbtnQ6eD.setBackground(Color.WHITE);
			        					bgQ6e = new ButtonGroup();
			        					bgQ6e.add(rdbtnQ6eA);
			        					bgQ6e.add(rdbtnQ6eB);
			        					bgQ6e.add(rdbtnQ6eC);
			        					bgQ6e.add(rdbtnQ6eD);
			        					lblQ6f= new JLabel("6.	In Slide Show view, you would typically advance to the next slide by clicking your mouse or pressing _____ on your keyboard.");
			        					lblQ6f.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6f.setBounds(50, 331, 1500, 32);
			        					rdbtnQ6fA = new JRadioButton("a. CTRL + TAB");
			        					rdbtnQ6fA.setBounds(50, 361, 250, 25);
			        					rdbtnQ6fA.setBackground(Color.WHITE);
			        					rdbtnQ6fB = new JRadioButton("b. F9");
			        					rdbtnQ6fB.setBounds(300, 361, 250, 25);
			        					rdbtnQ6fB.setBackground(Color.WHITE);
			        					rdbtnQ6fC = new JRadioButton("c. CTRL");
			        					rdbtnQ6fC.setBounds(550, 361, 250, 25);
			        					rdbtnQ6fC.setBackground(Color.WHITE);
			        					rdbtnQ6fD = new JRadioButton("d. Enter");
			        					rdbtnQ6fD.setBounds(800, 361, 250, 25);
			        					rdbtnQ6fD.setBackground(Color.WHITE);
			        					bgQ6f = new ButtonGroup();
			        					bgQ6f.add(rdbtnQ6fA);
			        					bgQ6f.add(rdbtnQ6fB);
			        					bgQ6f.add(rdbtnQ6fC);
			        					bgQ6f.add(rdbtnQ6fD);
			        					lblQ6g1= new JLabel("7.	Using the __________ settings in the Timing group, you can set your presentation to advance on its own instead and display each slide for a specific amount of time.");
			        					lblQ6g1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6g1.setBounds(50, 381, 1500, 32);
			        					lblQ6g2= new JLabel(" This is useful for unattended presentations, such as at a tradeshow booth.");
			        					lblQ6g2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6g2.setBounds(50, 401, 1500, 32);
			        					rdbtnQ6gA = new JRadioButton("a. Effects");
			        					rdbtnQ6gA.setBounds(50, 431, 250, 25);
			        					rdbtnQ6gA.setBackground(Color.WHITE);
			        					rdbtnQ6gB = new JRadioButton("b. Timing");
			        					rdbtnQ6gB.setBounds(300, 431, 250, 25);
			        					rdbtnQ6gB.setBackground(Color.WHITE);
			        					rdbtnQ6gC = new JRadioButton("c. Advance slides");
			        					rdbtnQ6gC.setBounds(550, 431, 250, 25);
			        					rdbtnQ6gC.setBackground(Color.WHITE);
			        					rdbtnQ6gD = new JRadioButton("d. Transition");
			        					rdbtnQ6gD.setBounds(800, 431, 250, 25);
			        					rdbtnQ6gD.setBackground(Color.WHITE);
			        					bgQ6g = new ButtonGroup();
			        					bgQ6g.add(rdbtnQ6gA);
			        					bgQ6g.add(rdbtnQ6gB);
			        					bgQ6g.add(rdbtnQ6gC);
			        					bgQ6g.add(rdbtnQ6gD);
			        					lblQ6h= new JLabel("8.	Select the slide you want to modify then locate the ______ group on the transitions tab.");
			        					lblQ6h.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6h.setBounds(50, 451, 1500, 32);
			        					rdbtnQ6hA = new JRadioButton("a. Effects");
			        					rdbtnQ6hA.setBounds(50, 481, 250, 25);
			        					rdbtnQ6hA.setBackground(Color.WHITE);
			        					rdbtnQ6hB = new JRadioButton("b. Timing");
			        					rdbtnQ6hB.setBounds(300, 481, 250, 25);
			        					rdbtnQ6hB.setBackground(Color.WHITE);
			        					rdbtnQ6hC = new JRadioButton("c. Advance slides");
			        					rdbtnQ6hC.setBounds(550, 481, 250, 25);
			        					rdbtnQ6hC.setBackground(Color.WHITE);
			        					rdbtnQ6hD = new JRadioButton("d. Transition");
			        					rdbtnQ6hD.setBounds(800, 481, 250, 25);
			        					rdbtnQ6hD.setBackground(Color.WHITE);
			        					bgQ6h = new ButtonGroup();
			        					bgQ6h.add(rdbtnQ6hA);
			        					bgQ6h.add(rdbtnQ6hB);
			        					bgQ6h.add(rdbtnQ6hC);
			        					bgQ6h.add(rdbtnQ6hD);
			        					lblQ6i1= new JLabel("9.	Under Advance slide, uncheck the Next to ___________. In the After field, enter the amount of time you want to display the slide. Select another slide, and repeat");
			        					lblQ6i1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6i1.setBounds(50, 501, 1500, 32);
			        					lblQ6i2= new JLabel(" the process until all the desired slides have the appropriate timing.");
			        					lblQ6i2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6i2.setBounds(50, 521, 1500, 32);
			        					rdbtnQ6iA = new JRadioButton("a. On Mouse Click");
			        					rdbtnQ6iA.setBounds(50, 551, 250, 25);
			        					rdbtnQ6iA.setBackground(Color.WHITE);
			        					rdbtnQ6iB = new JRadioButton("b. Duration");
			        					rdbtnQ6iB.setBounds(300, 551, 250, 25);
			        					rdbtnQ6iB.setBackground(Color.WHITE);
			        					rdbtnQ6iC = new JRadioButton("c. Timing");
			        					rdbtnQ6iC.setBounds(550, 551, 250, 25);
			        					rdbtnQ6iC.setBackground(Color.WHITE);
			        					rdbtnQ6iD = new JRadioButton("d. Sound");
			        					rdbtnQ6iD.setBounds(800, 551, 250, 25);
			        					rdbtnQ6iD.setBackground(Color.WHITE);
			        					bgQ6i = new ButtonGroup();
			        					bgQ6i.add(rdbtnQ6iA);
			        					bgQ6i.add(rdbtnQ6iB);
			        					bgQ6i.add(rdbtnQ6iC);
			        					bgQ6i.add(rdbtnQ6iD);
			        					lblQ6j= new JLabel("10.	You can _________ the transition for a selected slide at any time, using either of these two methods.");
			        					lblQ6j.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ6j.setBounds(50, 571, 1500, 32);
			        					rdbtnQ6jA = new JRadioButton("a. Advance slides");
			        					rdbtnQ6jA.setBounds(50, 601, 250, 25);
			        					rdbtnQ6jA.setBackground(Color.WHITE);
			        					rdbtnQ6jB = new JRadioButton("b. Effects");
			        					rdbtnQ6jB.setBounds(300, 601, 250, 25);
			        					rdbtnQ6jB.setBackground(Color.WHITE);
			        					rdbtnQ6jC = new JRadioButton("c. Timing");
			        					rdbtnQ6jC.setBounds(550, 601, 250, 25);
			        					rdbtnQ6jC.setBackground(Color.WHITE);
			        					rdbtnQ6jD = new JRadioButton("d. Preview");
			        					rdbtnQ6jD.setBounds(800, 601, 250, 25);
			        					rdbtnQ6jD.setBackground(Color.WHITE);
			        					bgQ6j = new ButtonGroup();
			        					bgQ6j.add(rdbtnQ6jA);
			        					bgQ6j.add(rdbtnQ6jB);
			        					bgQ6j.add(rdbtnQ6jC);
			        					bgQ6j.add(rdbtnQ6jD);
										bSubmit6 = new JButton("Submit");
			        					bSubmit6.setBounds(50, 626, 150, 25);
			        					bSubmit6.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent arg0) {
					        					if (rdbtnQ6aA.isSelected()) {
					        						score6a=1;
					        					}
					        					if (rdbtnQ6bB.isSelected()) {
					        						score6b=1;
					        					}
					        					if (rdbtnQ6cD.isSelected()) {
					        						score6c=1;
					        					}
					        					if (rdbtnQ6dC.isSelected()) {
					        						score6d=1;
					        					}
					        					if (rdbtnQ6eA.isSelected()) {
					        						score6e=1;
					        					}
					        					if (rdbtnQ6fD.isSelected()) {
					        						score6f=1;
					        					}
					        					if (rdbtnQ6gC.isSelected()) {
					        						score6g=1;
					        					}
					        					if (rdbtnQ6hB.isSelected()) {
					        						score6h=1;
					        					}
					        					if (rdbtnQ6iA.isSelected()) {
					        						score6i=1;
					        					}
					        					if (rdbtnQ6jD.isSelected()) {
					        						score6j=1;
					        					}
					        					lesson6g=score6a+score6b+score6c+score6d+score6e+score6f+score6g+score6h+score6i+score6j;
					        					JOptionPane.showMessageDialog(null, "Your score is "+lesson6g);
											}
			        					});
										panel2.add(lblAssess6);
										panel2.add(lblQ6a);
			        					panel2.add(rdbtnQ6aA);
			        					panel2.add(rdbtnQ6aB);
			        					panel2.add(rdbtnQ6aC);
			        					panel2.add(rdbtnQ6aD);
										panel2.add(lblQ6b);
			        					panel2.add(rdbtnQ6bA);
			        					panel2.add(rdbtnQ6bB);
			        					panel2.add(rdbtnQ6bC);
			        					panel2.add(rdbtnQ6bD);
										panel2.add(lblQ6c1);
										panel2.add(lblQ6c2);
			        					panel2.add(rdbtnQ6cA);
			        					panel2.add(rdbtnQ6cB);
			        					panel2.add(rdbtnQ6cC);
			        					panel2.add(rdbtnQ6cD);
										panel2.add(lblQ6d1);
										panel2.add(lblQ6d2);
			        					panel2.add(rdbtnQ6dA);
			        					panel2.add(rdbtnQ6dB);
			        					panel2.add(rdbtnQ6dC);
			        					panel2.add(rdbtnQ6dD);
										panel2.add(lblQ6e);
			        					panel2.add(rdbtnQ6eA);
			        					panel2.add(rdbtnQ6eB);
			        					panel2.add(rdbtnQ6eC);
			        					panel2.add(rdbtnQ6eD);
										panel2.add(lblQ6f);
			        					panel2.add(rdbtnQ6fA);
			        					panel2.add(rdbtnQ6fB);
			        					panel2.add(rdbtnQ6fC);
			        					panel2.add(rdbtnQ6fD);
										panel2.add(lblQ6g1);
										panel2.add(lblQ6g2);
			        					panel2.add(rdbtnQ6gA);
			        					panel2.add(rdbtnQ6gB);
			        					panel2.add(rdbtnQ6gC);
			        					panel2.add(rdbtnQ6gD);
										panel2.add(lblQ6h);
			        					panel2.add(rdbtnQ6hA);
			        					panel2.add(rdbtnQ6hB);
			        					panel2.add(rdbtnQ6hC);
			        					panel2.add(rdbtnQ6hD);
										panel2.add(lblQ6i1);
										panel2.add(lblQ6i2);
			        					panel2.add(rdbtnQ6iA);
			        					panel2.add(rdbtnQ6iB);
			        					panel2.add(rdbtnQ6iC);
			        					panel2.add(rdbtnQ6iD);
										panel2.add(lblQ6j);
			        					panel2.add(rdbtnQ6jA);
			        					panel2.add(rdbtnQ6jB);
			        					panel2.add(rdbtnQ6jC);
			        					panel2.add(rdbtnQ6jD);
			        					panel2.add(bSubmit6);
									}
		    					});
		    					panel2.add(lblLesson6);
		    					panel2.add(bOpenVid6);
		    					panel2.add(bOpenPpt6);
		    					panel2.add(bAssess6);
		    				} else if (node.equals("Lesson 7")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson7 = new JLabel("Lesson 7: CHECKING SPELLING");
		    					lblLesson7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson7.setBounds(50, 11, 500, 32);
		    					bOpenVid7 = new JButton("Play Video");
		    					bOpenVid7.setBounds(50, 500, 150, 100);
		    					bOpenVid7.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 7.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt7 = new JButton("Play Presentation");
		    					bOpenPpt7.setBounds(240, 500, 150, 100);
		    					bOpenPpt7.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("7.) Check Spelling.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess7 = new JButton("Assessment Task");
		    					bAssess7.setBounds(430, 500, 150, 100);
		    					bAssess7.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent ae) {
										panel2.removeAll();
										panel2.repaint();
										lblAssess7 = new JLabel("Assessment Task #7: CHECKING SPELLING");
			        					lblAssess7.setFont(new Font("Tahoma", Font.PLAIN, 20));
			        					lblAssess7.setBounds(50, 11, 700, 32);
			        					lblQ7a= new JLabel("1.	PowerPoint provides you with several _____________ that will help you produce professional, error-free presentations.");
			        					lblQ7a.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7a.setBounds(50, 41, 1500, 32);
			        					rdbtnQ7aA = new JRadioButton("a. Proofing features");
			        					rdbtnQ7aA.setBounds(50, 71, 250, 25);
			        					rdbtnQ7aA.setBackground(Color.WHITE);
			        					rdbtnQ7aB = new JRadioButton("b. Review");
			        					rdbtnQ7aB.setBounds(300, 71, 250, 25);
			        					rdbtnQ7aB.setBackground(Color.WHITE);
			        					rdbtnQ7aC = new JRadioButton("c. Change");
			        					rdbtnQ7aC.setBounds(550, 71, 250, 25);
			        					rdbtnQ7aC.setBackground(Color.WHITE);
			        					rdbtnQ7aD = new JRadioButton("d. Suggestions");
			        					rdbtnQ7aD.setBounds(800, 71, 250, 25);
			        					rdbtnQ7aD.setBackground(Color.WHITE);
			        					bgQ7a = new ButtonGroup();
			        					bgQ7a.add(rdbtnQ7aA);
			        					bgQ7a.add(rdbtnQ7aB);
			        					bgQ7a.add(rdbtnQ7aC);
			        					bgQ7a.add(rdbtnQ7aD);
			        					lblQ7b= new JLabel("2.	To make your slide show appear professional, you'll want to make sure it is free from _______ errors.");
			        					lblQ7b.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7b.setBounds(50, 91, 1000, 32);
			        					rdbtnQ7bA = new JRadioButton("a. Letter");
			        					rdbtnQ7bA.setBounds(50, 121, 250, 25);
			        					rdbtnQ7bA.setBackground(Color.WHITE);
			        					rdbtnQ7bB = new JRadioButton("b. Spelling");
			        					rdbtnQ7bB.setBounds(300, 121, 250, 25);
			        					rdbtnQ7bB.setBackground(Color.WHITE);
			        					rdbtnQ7bC = new JRadioButton("c. Picture");
			        					rdbtnQ7bC.setBounds(550, 121, 250, 25);
			        					rdbtnQ7bC.setBackground(Color.WHITE);
			        					rdbtnQ7bD = new JRadioButton("d. Design");
			        					rdbtnQ7bD.setBounds(800, 121, 250, 25);
			        					rdbtnQ7bD.setBackground(Color.WHITE);
			        					bgQ7b = new ButtonGroup();
			        					bgQ7b.add(rdbtnQ7bA);
			        					bgQ7b.add(rdbtnQ7bB);
			        					bgQ7b.add(rdbtnQ7bC);
			        					bgQ7b.add(rdbtnQ7bD);
			        					lblQ7c1= new JLabel("3.	Go to the Review tab. Click the Spelling command. The Spelling dialog box will open. For each error in your presentation, PowerPoint will try to offer one or more");
			        					lblQ7c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7c1.setBounds(50, 141, 1500, 32);
			        					lblQ7c2= new JLabel(" suggestions. You can select a suggestion and then click ______ to correct the error.");
			        					lblQ7c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7c2.setBounds(50, 161, 1500, 32);
			        					rdbtnQ7cA = new JRadioButton("a. Add");
			        					rdbtnQ7cA.setBounds(50, 191, 250, 25);
			        					rdbtnQ7cA.setBackground(Color.WHITE);
			        					rdbtnQ7cB = new JRadioButton("b. Suggest");
			        					rdbtnQ7cB.setBounds(300, 191, 250, 25);
			        					rdbtnQ7cB.setBackground(Color.WHITE);
			        					rdbtnQ7cC = new JRadioButton("c. Ignore");
			        					rdbtnQ7cC.setBounds(550, 191, 250, 25);
			        					rdbtnQ7cC.setBackground(Color.WHITE);
			        					rdbtnQ7cD = new JRadioButton("d. Change");
			        					rdbtnQ7cD.setBounds(800, 191, 250, 25);
			        					rdbtnQ7cD.setBackground(Color.WHITE);
			        					bgQ7c = new ButtonGroup();
			        					bgQ7c.add(rdbtnQ7cA);
			        					bgQ7c.add(rdbtnQ7cB);
			        					bgQ7c.add(rdbtnQ7cC);
			        					bgQ7c.add(rdbtnQ7cD);
			        					lblQ7d = new JLabel("4.	This will skip the word without changing it.");
			        					lblQ7d.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7d.setBounds(50, 211, 1500, 32);
			        					rdbtnQ7dA = new JRadioButton("a. Add");
			        					rdbtnQ7dA.setBounds(50, 241, 250, 25);
			        					rdbtnQ7dA.setBackground(Color.WHITE);
			        					rdbtnQ7dB = new JRadioButton("b. Ignore All");
			        					rdbtnQ7dB.setBounds(300, 241, 250, 25);
			        					rdbtnQ7dB.setBackground(Color.WHITE);
			        					rdbtnQ7dC = new JRadioButton("c. Ignore once");
			        					rdbtnQ7dC.setBounds(550, 241, 250, 25);
			        					rdbtnQ7dC.setBackground(Color.WHITE);
			        					rdbtnQ7dD = new JRadioButton("d. Change");
			        					rdbtnQ7dD.setBounds(800, 241, 250, 25);
			        					rdbtnQ7dD.setBackground(Color.WHITE);
			        					bgQ7d = new ButtonGroup();
			        					bgQ7d.add(rdbtnQ7dA);
			        					bgQ7d.add(rdbtnQ7dB);
			        					bgQ7d.add(rdbtnQ7dC);
			        					bgQ7d.add(rdbtnQ7dD);
			        					lblQ7e= new JLabel("5.	This will skip the word without changing it, and it will also skip all other instances of the word in your presentation.");
			        					lblQ7e.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7e.setBounds(50, 261, 1500, 32);
			        					rdbtnQ7eA = new JRadioButton("a. Add");
			        					rdbtnQ7eA.setBounds(50, 291, 250, 25);
			        					rdbtnQ7eA.setBackground(Color.WHITE);
			        					rdbtnQ7eB = new JRadioButton("b. Ignore all");
			        					rdbtnQ7eB.setBounds(300, 291, 250, 25);
			        					rdbtnQ7eB.setBackground(Color.WHITE);
			        					rdbtnQ7eC = new JRadioButton("c. Ignore once");
			        					rdbtnQ7eC.setBounds(550, 291, 250, 25);
			        					rdbtnQ7eC.setBackground(Color.WHITE);
			        					rdbtnQ7eD = new JRadioButton("d. Change");
			        					rdbtnQ7eD.setBounds(800, 291, 250, 25);
			        					rdbtnQ7eD.setBackground(Color.WHITE);
			        					bgQ7e = new ButtonGroup();
			        					bgQ7e.add(rdbtnQ7eA);
			        					bgQ7e.add(rdbtnQ7eB);
			        					bgQ7e.add(rdbtnQ7eC);
			        					bgQ7e.add(rdbtnQ7eD);
			        					lblQ7f= new JLabel("6.	This adds the word to the dictionary so it will never come up as an error again. Make sure the word is spelled correctly before choosing this option.");
			        					lblQ7f.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7f.setBounds(50, 311, 1500, 32);
			        					rdbtnQ7fA = new JRadioButton("a. Add");
			        					rdbtnQ7fA.setBounds(50, 341, 250, 25);
			        					rdbtnQ7fA.setBackground(Color.WHITE);
			        					rdbtnQ7fB = new JRadioButton("b. Ignore all");
			        					rdbtnQ7fB.setBounds(300, 341, 250, 25);
			        					rdbtnQ7fB.setBackground(Color.WHITE);
			        					rdbtnQ7fC = new JRadioButton("c. Ignore once");
			        					rdbtnQ7fC.setBounds(550, 341, 250, 25);
			        					rdbtnQ7fC.setBackground(Color.WHITE);
			        					rdbtnQ7fD = new JRadioButton("d. Change");
			        					rdbtnQ7fD.setBounds(800, 341, 250, 25);
			        					rdbtnQ7fD.setBackground(Color.WHITE);
			        					bgQ7f = new ButtonGroup();
			        					bgQ7f.add(rdbtnQ7fA);
			        					bgQ7f.add(rdbtnQ7fB);
			        					bgQ7f.add(rdbtnQ7fC);
			        					bgQ7f.add(rdbtnQ7fD);
			        					lblQ7g= new JLabel("7.	PowerPoint __________ checks your presentation for spelling errors.");
			        					lblQ7g.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7g.setBounds(50, 361, 1500, 32);
			        					rdbtnQ7gA = new JRadioButton("a. Automatically");
			        					rdbtnQ7gA.setBounds(50, 391, 250, 25);
			        					rdbtnQ7gA.setBackground(Color.WHITE);
			        					rdbtnQ7gB = new JRadioButton("b. Dramatically");
			        					rdbtnQ7gB.setBounds(300, 391, 250, 25);
			        					rdbtnQ7gB.setBackground(Color.WHITE);
			        					rdbtnQ7gC = new JRadioButton("c. Alphabetically");
			        					rdbtnQ7gC.setBounds(550, 391, 250, 25);
			        					rdbtnQ7gC.setBackground(Color.WHITE);
			        					rdbtnQ7gD = new JRadioButton("d. Categorically");
			        					rdbtnQ7gD.setBounds(800, 391, 250, 25);
			        					rdbtnQ7gD.setBackground(Color.WHITE);
			        					bgQ7g = new ButtonGroup();
			        					bgQ7g.add(rdbtnQ7gA);
			        					bgQ7g.add(rdbtnQ7gB);
			        					bgQ7g.add(rdbtnQ7gC);
			        					bgQ7g.add(rdbtnQ7gD);
			        					lblQ7h= new JLabel("8.	Uncheck this box if you don't want PowerPoint to check for spelling errors automatically.");
			        					lblQ7h.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7h.setBounds(50, 411, 1500, 32);
			        					rdbtnQ7hA = new JRadioButton("a. Use contextual spelling");
			        					rdbtnQ7hA.setBounds(50, 441, 250, 25);
			        					rdbtnQ7hA.setBackground(Color.WHITE);
			        					rdbtnQ7hB = new JRadioButton("b. Check spelling as you type");
			        					rdbtnQ7hB.setBounds(300, 441, 250, 25);
			        					rdbtnQ7hB.setBackground(Color.WHITE);
			        					rdbtnQ7hC = new JRadioButton("c. Hide spelling errors");
			        					rdbtnQ7hC.setBounds(550, 441, 250, 25);
			        					rdbtnQ7hC.setBackground(Color.WHITE);
			        					rdbtnQ7hD = new JRadioButton("d. Ignore words in UPPERCASE");
			        					rdbtnQ7hD.setBounds(800, 441, 250, 25);
			        					rdbtnQ7hD.setBackground(Color.WHITE);
			        					bgQ7h = new ButtonGroup();
			        					bgQ7h.add(rdbtnQ7hA);
			        					bgQ7h.add(rdbtnQ7hB);
			        					bgQ7h.add(rdbtnQ7hC);
			        					bgQ7h.add(rdbtnQ7hD);
			        					lblQ7i= new JLabel("9.	Check this box if you want PowerPoint to check for contextual spelling mistakes, like the use of your vs. you're.");
			        					lblQ7i.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7i.setBounds(50, 461, 1500, 32);
			        					rdbtnQ7iA = new JRadioButton("a. Use contextual spelling");
			        					rdbtnQ7iA.setBounds(50, 491, 250, 25);
			        					rdbtnQ7iA.setBackground(Color.WHITE);
			        					rdbtnQ7iB = new JRadioButton("b. Check spelling as you type");
			        					rdbtnQ7iB.setBounds(300, 491, 250, 25);
			        					rdbtnQ7iB.setBackground(Color.WHITE);
			        					rdbtnQ7iC = new JRadioButton("c. Hide spelling errors");
			        					rdbtnQ7iC.setBounds(550, 491, 250, 25);
			        					rdbtnQ7iC.setBackground(Color.WHITE);
			        					rdbtnQ7iD = new JRadioButton("d. Ignore words in UPPERCASE");
			        					rdbtnQ7iD.setBounds(800, 491, 250, 25);
			        					rdbtnQ7iD.setBackground(Color.WHITE);
			        					bgQ7i = new ButtonGroup();
			        					bgQ7i.add(rdbtnQ7iA);
			        					bgQ7i.add(rdbtnQ7iB);
			        					bgQ7i.add(rdbtnQ7iC);
			        					bgQ7i.add(rdbtnQ7iD);
			        					lblQ7j= new JLabel("10.	Check this box if you want to hide the red wavy lines that mark spelling errors.");
			        					lblQ7j.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ7j.setBounds(50, 511, 1500, 32);
			        					rdbtnQ7jA = new JRadioButton("a. Use contextual spelling");
			        					rdbtnQ7jA.setBounds(50, 541, 250, 25);
			        					rdbtnQ7jA.setBackground(Color.WHITE);
			        					rdbtnQ7jB = new JRadioButton("b. Check spelling as you type");
			        					rdbtnQ7jB.setBounds(300, 541, 250, 25);
			        					rdbtnQ7jB.setBackground(Color.WHITE);
			        					rdbtnQ7jC = new JRadioButton("c. Hide spelling errors");
			        					rdbtnQ7jC.setBounds(550, 541, 250, 25);
			        					rdbtnQ7jC.setBackground(Color.WHITE);
			        					rdbtnQ7jD = new JRadioButton("d. Ignore words in UPPERCASE");
			        					rdbtnQ7jD.setBounds(800, 541, 250, 25);
			        					rdbtnQ7jD.setBackground(Color.WHITE);
			        					bgQ7j = new ButtonGroup();
			        					bgQ7j.add(rdbtnQ7jA);
			        					bgQ7j.add(rdbtnQ7jB);
			        					bgQ7j.add(rdbtnQ7jC);
			        					bgQ7j.add(rdbtnQ7jD);
										bSubmit7 = new JButton("Submit");
			        					bSubmit7.setBounds(50, 616, 150, 25);
			        					bSubmit7.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent arg0) {
					        					if (rdbtnQ7aA.isSelected()) {
					        						score7a=1;
					        					}
					        					if (rdbtnQ7bB.isSelected()) {
					        						score7b=1;
					        					}
					        					if (rdbtnQ7cD.isSelected()) {
					        						score7c=1;
					        					}
					        					if (rdbtnQ7dC.isSelected()) {
					        						score7d=1;
					        					}
					        					if (rdbtnQ7eB.isSelected()) {
					        						score7e=1;
					        					}
					        					if (rdbtnQ7fA.isSelected()) {
					        						score7f=1;
					        					}
					        					if (rdbtnQ7gA.isSelected()) {
					        						score7g=1;
					        					}
					        					if (rdbtnQ7hB.isSelected()) {
					        						score7h=1;
					        					}
					        					if (rdbtnQ7iA.isSelected()) {
					        						score7i=1;
					        					}
					        					if (rdbtnQ7jC.isSelected()) {
					        						score7j=1;
					        					}
					        					lesson7g=score7a+score7b+score7c+score7d+score7e+score7f+score7g+score7h+score7i+score7j;
					        					JOptionPane.showMessageDialog(null, "Your score is "+lesson7g);
											}
			        					});
										panel2.add(lblAssess7);
										panel2.add(lblQ7a);
			        					panel2.add(rdbtnQ7aA);
			        					panel2.add(rdbtnQ7aB);
			        					panel2.add(rdbtnQ7aC);
			        					panel2.add(rdbtnQ7aD);
										panel2.add(lblQ7b);
			        					panel2.add(rdbtnQ7bA);
			        					panel2.add(rdbtnQ7bB);
			        					panel2.add(rdbtnQ7bC);
			        					panel2.add(rdbtnQ7bD);
										panel2.add(lblQ7c1);
										panel2.add(lblQ7c2);
			        					panel2.add(rdbtnQ7cA);
			        					panel2.add(rdbtnQ7cB);
			        					panel2.add(rdbtnQ7cC);
			        					panel2.add(rdbtnQ7cD);
										panel2.add(lblQ7d);
			        					panel2.add(rdbtnQ7dA);
			        					panel2.add(rdbtnQ7dB);
			        					panel2.add(rdbtnQ7dC);
			        					panel2.add(rdbtnQ7dD);
										panel2.add(lblQ7e);
			        					panel2.add(rdbtnQ7eA);
			        					panel2.add(rdbtnQ7eB);
			        					panel2.add(rdbtnQ7eC);
			        					panel2.add(rdbtnQ7eD);
										panel2.add(lblQ7f);
			        					panel2.add(rdbtnQ7fA);
			        					panel2.add(rdbtnQ7fB);
			        					panel2.add(rdbtnQ7fC);
			        					panel2.add(rdbtnQ7fD);
										panel2.add(lblQ7g);
			        					panel2.add(rdbtnQ7gA);
			        					panel2.add(rdbtnQ7gB);
			        					panel2.add(rdbtnQ7gC);
			        					panel2.add(rdbtnQ7gD);
										panel2.add(lblQ7h);
			        					panel2.add(rdbtnQ7hA);
			        					panel2.add(rdbtnQ7hB);
			        					panel2.add(rdbtnQ7hC);
			        					panel2.add(rdbtnQ7hD);
										panel2.add(lblQ7i);
			        					panel2.add(rdbtnQ7iA);
			        					panel2.add(rdbtnQ7iB);
			        					panel2.add(rdbtnQ7iC);
			        					panel2.add(rdbtnQ7iD);
										panel2.add(lblQ7j);
			        					panel2.add(rdbtnQ7jA);
			        					panel2.add(rdbtnQ7jB);
			        					panel2.add(rdbtnQ7jC);
			        					panel2.add(rdbtnQ7jD);
			        					panel2.add(bSubmit7);
									}
		    					});
		    					panel2.add(lblLesson7);
		    					panel2.add(bOpenVid7);
		    					panel2.add(bOpenPpt7);
		    					panel2.add(bAssess7);
		    				} else if (node.equals("Lesson 8")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson8 = new JLabel("Lesson 8: PRESENTING SLIDESHOWS");
		    					lblLesson8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson8.setBounds(50, 11, 500, 32);
		    					bOpenVid8 = new JButton("Play Video");
		    					bOpenVid8.setBounds(50, 500, 150, 100);
		    					bOpenVid8.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 8.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt8 = new JButton("Play Presentation");
		    					bOpenPpt8.setBounds(240, 500, 150, 100);
		    					bOpenPpt8.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("8.) Presenting a slide show.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess8 = new JButton("Assessment Task");
		    					bAssess8.setBounds(430, 500, 150, 100);
		    					bAssess8.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent ae) {
										panel2.removeAll();
										panel2.repaint();
										lblAssess8 = new JLabel("Assessment Task #8: PRESENTING SLIDE SHOW");
			        					lblAssess8.setFont(new Font("Tahoma", Font.PLAIN, 20));
			        					lblAssess8.setBounds(50, 11, 700, 32);
			        					lblQ8a= new JLabel("1.	PowerPoint offers several tools and features that can help make your presentation smooth, _________, and _________.");
			        					lblQ8a.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8a.setBounds(50, 41, 1500, 32);
			        					rdbtnQ8aA = new JRadioButton("a. Bigger and Colorful");
			        					rdbtnQ8aA.setBounds(50, 71, 250, 25);
			        					rdbtnQ8aA.setBackground(Color.WHITE);
			        					rdbtnQ8aB = new JRadioButton("b. Engaging and Professional");
			        					rdbtnQ8aB.setBounds(300, 71, 250, 25);
			        					rdbtnQ8aB.setBackground(Color.WHITE);
			        					rdbtnQ8aC = new JRadioButton("c. Small and Professional");
			        					rdbtnQ8aC.setBounds(550, 71, 250, 25);
			        					rdbtnQ8aC.setBackground(Color.WHITE);
			        					rdbtnQ8aD = new JRadioButton("d. Stoning and Cute");
			        					rdbtnQ8aD.setBounds(800, 71, 250, 25);
			        					rdbtnQ8aD.setBackground(Color.WHITE);
			        					bgQ8a = new ButtonGroup();
			        					bgQ8a.add(rdbtnQ8aA);
			        					bgQ8a.add(rdbtnQ8aB);
			        					bgQ8a.add(rdbtnQ8aC);
			        					bgQ8a.add(rdbtnQ8aD);
			        					lblQ8b= new JLabel("2.	Select the Slide show tab. Click the form _____________ command in the Start Slide Show group to start the slide show with the first slide.");
			        					lblQ8b.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8b.setBounds(50, 91, 1000, 32);
			        					rdbtnQ8bA = new JRadioButton("a. From current slide");
			        					rdbtnQ8bA.setBounds(50, 121, 250, 25);
			        					rdbtnQ8bA.setBackground(Color.WHITE);
			        					rdbtnQ8bB = new JRadioButton("b. From beginning");
			        					rdbtnQ8bB.setBounds(300, 121, 250, 25);
			        					rdbtnQ8bB.setBackground(Color.WHITE);
			        					rdbtnQ8bC = new JRadioButton("c. Custom slide show");
			        					rdbtnQ8bC.setBounds(550, 121, 250, 25);
			        					rdbtnQ8bC.setBackground(Color.WHITE);
			        					rdbtnQ8bD = new JRadioButton("d. Broadcast slide show");
			        					rdbtnQ8bD.setBounds(800, 121, 250, 25);
			        					rdbtnQ8bD.setBackground(Color.WHITE);
			        					bgQ8b = new ButtonGroup();
			        					bgQ8b.add(rdbtnQ8bA);
			        					bgQ8b.add(rdbtnQ8bB);
			        					bgQ8b.add(rdbtnQ8bC);
			        					bgQ8b.add(rdbtnQ8bD);
			        					lblQ8c= new JLabel("3.	Another option for starting the slide show is to select _________ view at the bottom of the window.");
			        					lblQ8c.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8c.setBounds(50, 141, 1500, 32);
			        					rdbtnQ8cA = new JRadioButton("a. Slide show");
			        					rdbtnQ8cA.setBounds(50, 171, 250, 25);
			        					rdbtnQ8cA.setBackground(Color.WHITE);
			        					rdbtnQ8cB = new JRadioButton("b. Slide sorter");
			        					rdbtnQ8cB.setBounds(300, 171, 250, 25);
			        					rdbtnQ8cB.setBackground(Color.WHITE);
			        					rdbtnQ8cC = new JRadioButton("c. Normal");
			        					rdbtnQ8cC.setBounds(550, 171, 250, 25);
			        					rdbtnQ8cC.setBackground(Color.WHITE);
			        					rdbtnQ8cD = new JRadioButton("d. Zoom");
			        					rdbtnQ8cD.setBounds(800, 171, 250, 25);
			        					rdbtnQ8cD.setBackground(Color.WHITE);
			        					bgQ8c = new ButtonGroup();
			        					bgQ8c.add(rdbtnQ8cA);
			        					bgQ8c.add(rdbtnQ8cB);
			        					bgQ8c.add(rdbtnQ8cC);
			        					bgQ8c.add(rdbtnQ8cD);
			        					lblQ8d = new JLabel("4.	You can use the ___________ on your keyboard to advance and reverse slides.");
			        					lblQ8d.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8d.setBounds(50, 191, 1500, 32);
			        					rdbtnQ8dA = new JRadioButton("a. Delete");
			        					rdbtnQ8dA.setBounds(50, 221, 250, 25);
			        					rdbtnQ8dA.setBackground(Color.WHITE);
			        					rdbtnQ8dB = new JRadioButton("b. CTRL");
			        					rdbtnQ8dB.setBounds(300, 221, 250, 25);
			        					rdbtnQ8dB.setBackground(Color.WHITE);
			        					rdbtnQ8dC = new JRadioButton("c. Arrow keys");
			        					rdbtnQ8dC.setBounds(550, 221, 250, 25);
			        					rdbtnQ8dC.setBackground(Color.WHITE);
			        					rdbtnQ8dD = new JRadioButton("d. Caps Lock");
			        					rdbtnQ8dD.setBounds(800, 221, 250, 25);
			        					rdbtnQ8dD.setBackground(Color.WHITE);
			        					bgQ8d = new ButtonGroup();
			        					bgQ8d.add(rdbtnQ8dA);
			        					bgQ8d.add(rdbtnQ8dB);
			        					bgQ8d.add(rdbtnQ8dC);
			        					bgQ8d.add(rdbtnQ8dD);
			        					lblQ8e1= new JLabel("5.	To end a slide show, hover and select the menu box options command and click End Show. You can also press the __________ key at the top left of your keyboard");
			        					lblQ8e1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8e1.setBounds(50, 241, 1500, 32);
			        					lblQ8e2= new JLabel(" to end the show.");
			        					lblQ8e2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8e2.setBounds(50, 261, 1500, 32);
			        					rdbtnQ8eA = new JRadioButton("a. Esc");
			        					rdbtnQ8eA.setBounds(50, 291, 250, 25);
			        					rdbtnQ8eA.setBackground(Color.WHITE);
			        					rdbtnQ8eB = new JRadioButton("b. CTRL");
			        					rdbtnQ8eB.setBounds(300, 291, 250, 25);
			        					rdbtnQ8eB.setBackground(Color.WHITE);
			        					rdbtnQ8eC = new JRadioButton("c. F9");
			        					rdbtnQ8eC.setBounds(550, 291, 250, 25);
			        					rdbtnQ8eC.setBackground(Color.WHITE);
			        					rdbtnQ8eD = new JRadioButton("d. Arrow keys");
			        					rdbtnQ8eD.setBounds(800, 291, 250, 25);
			        					rdbtnQ8eD.setBackground(Color.WHITE);
			        					bgQ8e = new ButtonGroup();
			        					bgQ8e.add(rdbtnQ8eA);
			        					bgQ8e.add(rdbtnQ8eB);
			        					bgQ8e.add(rdbtnQ8eC);
			        					bgQ8e.add(rdbtnQ8eD);
			        					lblQ8f= new JLabel("6.	From the same menu, you can _______________of the pen or highlighter. Keep in mind that light color choices are best for the highlighter.");
			        					lblQ8f.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8f.setBounds(50, 311, 1500, 32);
			        					rdbtnQ8fA = new JRadioButton("a. Change the color");
			        					rdbtnQ8fA.setBounds(50, 341, 250, 25);
			        					rdbtnQ8fA.setBackground(Color.WHITE);
			        					rdbtnQ8fB = new JRadioButton("b. Change the text size");
			        					rdbtnQ8fB.setBounds(300, 341, 250, 25);
			        					rdbtnQ8fB.setBackground(Color.WHITE);
			        					rdbtnQ8fC = new JRadioButton("c. Change the design");
			        					rdbtnQ8fC.setBounds(550, 341, 250, 25);
			        					rdbtnQ8fC.setBackground(Color.WHITE);
			        					rdbtnQ8fD = new JRadioButton("d. Change the layout");
			        					rdbtnQ8fD.setBounds(800, 341, 250, 25);
			        					rdbtnQ8fD.setBackground(Color.WHITE);
			        					bgQ8f = new ButtonGroup();
			        					bgQ8f.add(rdbtnQ8fA);
			        					bgQ8f.add(rdbtnQ8fB);
			        					bgQ8f.add(rdbtnQ8fC);
			        					bgQ8f.add(rdbtnQ8fD);
			        					lblQ8g= new JLabel("7.	You may switch between pen pointers by pressing ______?");
			        					lblQ8g.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8g.setBounds(50, 361, 1500, 32);
			        					rdbtnQ8gA = new JRadioButton("a. CTRL");
			        					rdbtnQ8gA.setBounds(50, 391, 250, 25);
			        					rdbtnQ8gA.setBackground(Color.WHITE);
			        					rdbtnQ8gB = new JRadioButton("b. CTRL + P");
			        					rdbtnQ8gB.setBounds(300, 391, 250, 25);
			        					rdbtnQ8gB.setBackground(Color.WHITE);
			        					rdbtnQ8gC = new JRadioButton("c. CTRL + M");
			        					rdbtnQ8gC.setBounds(550, 391, 250, 25);
			        					rdbtnQ8gC.setBackground(Color.WHITE);
			        					rdbtnQ8gD = new JRadioButton("d. CTRL + Shift");
			        					rdbtnQ8gD.setBounds(800, 391, 250, 25);
			        					rdbtnQ8gD.setBackground(Color.WHITE);
			        					bgQ8g = new ButtonGroup();
			        					bgQ8g.add(rdbtnQ8gA);
			        					bgQ8g.add(rdbtnQ8gB);
			        					bgQ8g.add(rdbtnQ8gC);
			        					bgQ8g.add(rdbtnQ8gD);
			        					lblQ8h= new JLabel("8.	You may switch between mouse pointers by pressing ______?");
			        					lblQ8h.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8h.setBounds(50, 411, 1500, 32);
			        					rdbtnQ8hA = new JRadioButton("a. CTRL");
			        					rdbtnQ8hA.setBounds(50, 441, 250, 25);
			        					rdbtnQ8hA.setBackground(Color.WHITE);
			        					rdbtnQ8hB = new JRadioButton("b. CTRL + P");
			        					rdbtnQ8hB.setBounds(300, 441, 250, 25);
			        					rdbtnQ8hB.setBackground(Color.WHITE);
			        					rdbtnQ8hC = new JRadioButton("c. CTRL + M");
			        					rdbtnQ8hC.setBounds(550, 441, 250, 25);
			        					rdbtnQ8hC.setBackground(Color.WHITE);
			        					rdbtnQ8hD = new JRadioButton("d. CTRL + Shift ");
			        					rdbtnQ8hD.setBounds(800, 441, 250, 25);
			        					rdbtnQ8hD.setBackground(Color.WHITE);
			        					bgQ8h = new ButtonGroup();
			        					bgQ8h.add(rdbtnQ8hA);
			        					bgQ8h.add(rdbtnQ8hB);
			        					bgQ8h.add(rdbtnQ8hC);
			        					bgQ8h.add(rdbtnQ8hD);
			        					lblQ8i= new JLabel("9.	Press ____ on the keyboard to erase any ink markings while using the pen or highlighter.");
			        					lblQ8i.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8i.setBounds(50, 461, 1500, 32);
			        					rdbtnQ8iA = new JRadioButton("a. E");
			        					rdbtnQ8iA.setBounds(50, 491, 250, 25);
			        					rdbtnQ8iA.setBackground(Color.WHITE);
			        					rdbtnQ8iB = new JRadioButton("b. Shift + E");
			        					rdbtnQ8iB.setBounds(300, 491, 250, 25);
			        					rdbtnQ8iB.setBackground(Color.WHITE);
			        					rdbtnQ8iC = new JRadioButton("c. CTRL + M");
			        					rdbtnQ8iC.setBounds(550, 491, 250, 25);
			        					rdbtnQ8iC.setBackground(Color.WHITE);
			        					rdbtnQ8iD = new JRadioButton("d. M");
			        					rdbtnQ8iD.setBounds(800, 491, 250, 25);
			        					rdbtnQ8iD.setBackground(Color.WHITE);
			        					bgQ8i = new ButtonGroup();
			        					bgQ8i.add(rdbtnQ8iA);
			        					bgQ8i.add(rdbtnQ8iB);
			        					bgQ8i.add(rdbtnQ8iC);
			        					bgQ8i.add(rdbtnQ8iD);
			        					lblQ8j1= new JLabel("10.	Select the slide show tab. Click the Set Up Show command. The Set Up Show dialog box will appear. Click the buttons in the Interactive below to learn about the");
			        					lblQ8j1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8j1.setBounds(50, 511, 1500, 32);
			        					lblQ8j2= new JLabel(" various options available for setting up and playing a slide show. Click ____ to apply the settings to the slide show.");
			        					lblQ8j2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ8j2.setBounds(50, 531, 1500, 32);
			        					rdbtnQ8jA = new JRadioButton("a. Help");
			        					rdbtnQ8jA.setBounds(50, 561, 250, 25);
			        					rdbtnQ8jA.setBackground(Color.WHITE);
			        					rdbtnQ8jB = new JRadioButton("b. Close");
			        					rdbtnQ8jB.setBounds(300, 561, 250, 25);
			        					rdbtnQ8jB.setBackground(Color.WHITE);
			        					rdbtnQ8jC = new JRadioButton("c. Okay");
			        					rdbtnQ8jC.setBounds(550, 561, 250, 25);
			        					rdbtnQ8jC.setBackground(Color.WHITE);
			        					rdbtnQ8jD = new JRadioButton("d. Cancel");
			        					rdbtnQ8jD.setBounds(800, 561, 250, 25);
			        					rdbtnQ8jD.setBackground(Color.WHITE);
			        					bgQ8j = new ButtonGroup();
			        					bgQ8j.add(rdbtnQ8jA);
			        					bgQ8j.add(rdbtnQ8jB);
			        					bgQ8j.add(rdbtnQ8jC);
			        					bgQ8j.add(rdbtnQ8jD);
										bSubmit8 = new JButton("Submit");
			        					bSubmit8.setBounds(50, 616, 150, 25);
			        					bSubmit8.addActionListener(new ActionListener() {
			        						/*
			        						 */
											@Override
											public void actionPerformed(ActionEvent arg0) {
					        					if (rdbtnQ8aB.isSelected()) {
					        						score8a=1;
					        					}
					        					if (rdbtnQ8bB.isSelected()) {
					        						score8b=1;
					        					}
					        					if (rdbtnQ8cA.isSelected()) {
					        						score8c=1;
					        					}
					        					if (rdbtnQ8dC.isSelected()) {
					        						score8d=1;
					        					}
					        					if (rdbtnQ8eA.isSelected()) {
					        						score8e=1;
					        					}
					        					if (rdbtnQ8fA.isSelected()) {
					        						score8f=1;
					        					}
					        					if (rdbtnQ8gB.isSelected()) {
					        						score8g=1;
					        					}
					        					if (rdbtnQ8hC.isSelected()) {
					        						score8h=1;
					        					}
					        					if (rdbtnQ8iA.isSelected()) {
					        						score8i=1;
					        					}
					        					if (rdbtnQ8jC.isSelected()) {
					        						score8j=1;
					        					}
					        					lesson8g=score8a+score8b+score8c+score8d+score8e+score8f+score8g+score8h+score8i+score8j;
					        					JOptionPane.showMessageDialog(null, "Your score is "+lesson8g);
											}
			        					});
										panel2.add(lblAssess8);
										panel2.add(lblQ8a);
			        					panel2.add(rdbtnQ8aA);
			        					panel2.add(rdbtnQ8aB);
			        					panel2.add(rdbtnQ8aC);
			        					panel2.add(rdbtnQ8aD);
										panel2.add(lblQ8b);
			        					panel2.add(rdbtnQ8bA);
			        					panel2.add(rdbtnQ8bB);
			        					panel2.add(rdbtnQ8bC);
			        					panel2.add(rdbtnQ8bD);
										panel2.add(lblQ8c);
			        					panel2.add(rdbtnQ8cA);
			        					panel2.add(rdbtnQ8cB);
			        					panel2.add(rdbtnQ8cC);
			        					panel2.add(rdbtnQ8cD);
										panel2.add(lblQ8d);
			        					panel2.add(rdbtnQ8dA);
			        					panel2.add(rdbtnQ8dB);
			        					panel2.add(rdbtnQ8dC);
			        					panel2.add(rdbtnQ8dD);
										panel2.add(lblQ8e1);
										panel2.add(lblQ8e2);
			        					panel2.add(rdbtnQ8eA);
			        					panel2.add(rdbtnQ8eB);
			        					panel2.add(rdbtnQ8eC);
			        					panel2.add(rdbtnQ8eD);
										panel2.add(lblQ8f);
			        					panel2.add(rdbtnQ8fA);
			        					panel2.add(rdbtnQ8fB);
			        					panel2.add(rdbtnQ8fC);
			        					panel2.add(rdbtnQ8fD);
										panel2.add(lblQ8g);
			        					panel2.add(rdbtnQ8gA);
			        					panel2.add(rdbtnQ8gB);
			        					panel2.add(rdbtnQ8gC);
			        					panel2.add(rdbtnQ8gD);
										panel2.add(lblQ8h);
			        					panel2.add(rdbtnQ8hA);
			        					panel2.add(rdbtnQ8hB);
			        					panel2.add(rdbtnQ8hC);
			        					panel2.add(rdbtnQ8hD);
										panel2.add(lblQ8i);
			        					panel2.add(rdbtnQ8iA);
			        					panel2.add(rdbtnQ8iB);
			        					panel2.add(rdbtnQ8iC);
			        					panel2.add(rdbtnQ8iD);
										panel2.add(lblQ8j1);
										panel2.add(lblQ8j2);
			        					panel2.add(rdbtnQ8jA);
			        					panel2.add(rdbtnQ8jB);
			        					panel2.add(rdbtnQ8jC);
			        					panel2.add(rdbtnQ8jD);
			        					panel2.add(bSubmit8);
									}
		    					});
		    					panel2.add(lblLesson8);
		    					panel2.add(bOpenVid8);
		    					panel2.add(bOpenPpt8);
		    					panel2.add(bAssess8);
		    				} else if (node.equals("Lesson 9")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson9 = new JLabel("Lesson 9: SAVING AND PRINTING");
		    					lblLesson9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson9.setBounds(50, 11, 500, 32);
		    					bOpenVid9 = new JButton("Play Video");
		    					bOpenVid9.setBounds(50, 500, 150, 100);
		    					bOpenVid9.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 9.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt9 = new JButton("Play Presentation");
		    					bOpenPpt9.setBounds(240, 500, 150, 100);
		    					bOpenPpt9.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("9.) Saving and Printing.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess9 = new JButton("Assessment Task");
		    					bAssess9.setBounds(430, 500, 150, 100);
		    					bAssess9.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent ae) {
										panel2.removeAll();
										panel2.repaint();
										lblAssess9 = new JLabel("Assessment Task #9: SAVING AND PRINTING");
			        					lblAssess9.setFont(new Font("Tahoma", Font.PLAIN, 20));
			        					lblAssess9.setBounds(50, 11, 700, 32);
			        					lblQ9a= new JLabel("1.	What have you learned in this Lesson?");
			        					lblQ9a.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9a.setBounds(50, 41, 1500, 32);
			        					rdbtnQ9aA = new JRadioButton("a. Presenting Slide show ");
			        					rdbtnQ9aA.setBounds(50, 71, 250, 25);
			        					rdbtnQ9aA.setBackground(Color.WHITE);
			        					rdbtnQ9aB = new JRadioButton("b. Save, Save As and Print");
			        					rdbtnQ9aB.setBounds(300, 71, 250, 25);
			        					rdbtnQ9aB.setBackground(Color.WHITE);
			        					rdbtnQ9aC = new JRadioButton("c. Delete and Create design");
			        					rdbtnQ9aC.setBounds(550, 71, 250, 25);
			        					rdbtnQ9aC.setBackground(Color.WHITE);
			        					rdbtnQ9aD = new JRadioButton("d. None of the above");
			        					rdbtnQ9aD.setBounds(800, 71, 250, 25);
			        					rdbtnQ9aD.setBackground(Color.WHITE);
			        					bgQ9a = new ButtonGroup();
			        					bgQ9a.add(rdbtnQ9aA);
			        					bgQ9a.add(rdbtnQ9aB);
			        					bgQ9a.add(rdbtnQ9aC);
			        					bgQ9a.add(rdbtnQ9aD);
			        					lblQ9b1= new JLabel("2.	 Allows you to choose a name and location for your presentation. It's useful if you've first created a presentation or if you want to save a different version of a");
			        					lblQ9b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9b1.setBounds(50, 91, 1500, 32);
			        					lblQ9b2= new JLabel(" presentation while keeping the original.");
			        					lblQ9b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9b2.setBounds(50, 111, 1500, 32);
			        					rdbtnQ9bA = new JRadioButton("a. Print");
			        					rdbtnQ9bA.setBounds(50, 141, 250, 25);
			        					rdbtnQ9bA.setBackground(Color.WHITE);
			        					rdbtnQ9bB = new JRadioButton("b. Save As");
			        					rdbtnQ9bB.setBounds(300, 141, 250, 25);
			        					rdbtnQ9bB.setBackground(Color.WHITE);
			        					rdbtnQ9bC = new JRadioButton("c. Close");
			        					rdbtnQ9bC.setBounds(550, 141, 250, 25);
			        					rdbtnQ9bC.setBackground(Color.WHITE);
			        					rdbtnQ9bD = new JRadioButton("d. Open");
			        					rdbtnQ9bD.setBounds(800, 141, 250, 25);
			        					rdbtnQ9bD.setBackground(Color.WHITE);
			        					bgQ9b = new ButtonGroup();
			        					bgQ9b.add(rdbtnQ9bA);
			        					bgQ9b.add(rdbtnQ9bB);
			        					bgQ9b.add(rdbtnQ9bC);
			        					bgQ9b.add(rdbtnQ9bD);
			        					lblQ9c1= new JLabel("3.	Click the _____ tab. Select Save As. The Save As dialog box will appear. Select the location where you want to save the presentation. Enter a name for the");
			        					lblQ9c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9c1.setBounds(50, 161, 1500, 32);
			        					lblQ9c2= new JLabel(" presentation, then click Save.");
			        					lblQ9c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9c2.setBounds(50, 181, 1500, 32);
			        					rdbtnQ9cA = new JRadioButton("a. File");
			        					rdbtnQ9cA.setBounds(50, 211, 250, 25);
			        					rdbtnQ9cA.setBackground(Color.WHITE);
			        					rdbtnQ9cB = new JRadioButton("b. Home");
			        					rdbtnQ9cB.setBounds(300, 211, 250, 25);
			        					rdbtnQ9cB.setBackground(Color.WHITE);
			        					rdbtnQ9cC = new JRadioButton("c. Insert");
			        					rdbtnQ9cC.setBounds(550, 211, 250, 25);
			        					rdbtnQ9cC.setBackground(Color.WHITE);
			        					rdbtnQ9cD = new JRadioButton("d. Design");
			        					rdbtnQ9cD.setBounds(800, 211, 250, 25);
			        					rdbtnQ9cD.setBackground(Color.WHITE);
			        					bgQ9c = new ButtonGroup();
			        					bgQ9c.add(rdbtnQ9cA);
			        					bgQ9c.add(rdbtnQ9cB);
			        					bgQ9c.add(rdbtnQ9cC);
			        					bgQ9c.add(rdbtnQ9cD);
			        					lblQ9d = new JLabel("4.	Click the ______ command on the Quick Access toolbar. The presentation will be saved in its current location with the same file name.");
			        					lblQ9d.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9d.setBounds(50, 231, 1500, 32);
			        					rdbtnQ9dA = new JRadioButton("a. Save");
			        					rdbtnQ9dA.setBounds(50, 261, 250, 25);
			        					rdbtnQ9dA.setBackground(Color.WHITE);
			        					rdbtnQ9dB = new JRadioButton("b. Print");
			        					rdbtnQ9dB.setBounds(300, 261, 250, 25);
			        					rdbtnQ9dB.setBackground(Color.WHITE);
			        					rdbtnQ9dC = new JRadioButton("c. Close");
			        					rdbtnQ9dC.setBounds(550, 261, 250, 25);
			        					rdbtnQ9dC.setBackground(Color.WHITE);
			        					rdbtnQ9dD = new JRadioButton("d. Open");
			        					rdbtnQ9dD.setBounds(800, 261, 250, 25);
			        					rdbtnQ9dD.setBackground(Color.WHITE);
			        					bgQ9d = new ButtonGroup();
			        					bgQ9d.add(rdbtnQ9dA);
			        					bgQ9d.add(rdbtnQ9dB);
			        					bgQ9d.add(rdbtnQ9dC);
			        					bgQ9d.add(rdbtnQ9dD);
			        					lblQ9e= new JLabel("5.	This saves the contents of your slide show as a document instead of a PowerPoint file.");
			        					lblQ9e.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9e.setBounds(50, 281, 1500, 32);
			        					rdbtnQ9eA = new JRadioButton("a. Create PDF/XPS Document");
			        					rdbtnQ9eA.setBounds(50, 311, 250, 25);
			        					rdbtnQ9eA.setBackground(Color.WHITE);
			        					rdbtnQ9eB = new JRadioButton("b. Create a Video");
			        					rdbtnQ9eB.setBounds(300, 311, 250, 25);
			        					rdbtnQ9eB.setBackground(Color.WHITE);
			        					rdbtnQ9eC = new JRadioButton("c. Package Presentation for CD");
			        					rdbtnQ9eC.setBounds(550, 311, 250, 25);
			        					rdbtnQ9eC.setBackground(Color.WHITE);
			        					rdbtnQ9eD = new JRadioButton("d. Print Preview");
			        					rdbtnQ9eD.setBounds(800, 311, 250, 25);
			        					rdbtnQ9eD.setBackground(Color.WHITE);
			        					bgQ9e = new ButtonGroup();
			        					bgQ9e.add(rdbtnQ9eA);
			        					bgQ9e.add(rdbtnQ9eB);
			        					bgQ9e.add(rdbtnQ9eC);
			        					bgQ9e.add(rdbtnQ9eD);
			        					lblQ9f= new JLabel("6.	This saves your presentation in a folder along with the Microsoft PowerPoint Viewer, a special slide show player that anyone can download and use.");
			        					lblQ9f.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9f.setBounds(50, 331, 1500, 32);
			        					rdbtnQ9fA = new JRadioButton("a. Create PDF/XPS Document");
			        					rdbtnQ9fA.setBounds(50, 361, 250, 25);
			        					rdbtnQ9fA.setBackground(Color.WHITE);
			        					rdbtnQ9fB = new JRadioButton("b. Create a Video");
			        					rdbtnQ9fB.setBounds(300, 361, 250, 25);
			        					rdbtnQ9fB.setBackground(Color.WHITE);
			        					rdbtnQ9fC = new JRadioButton("c. Package Presentation for CD");
			        					rdbtnQ9fC.setBounds(550, 361, 250, 25);
			        					rdbtnQ9fC.setBackground(Color.WHITE);
			        					rdbtnQ9fD = new JRadioButton("d. Print Preview");
			        					rdbtnQ9fD.setBounds(800, 361, 250, 25);
			        					rdbtnQ9fD.setBackground(Color.WHITE);
			        					bgQ9f = new ButtonGroup();
			        					bgQ9f.add(rdbtnQ9fA);
			        					bgQ9f.add(rdbtnQ9fB);
			        					bgQ9f.add(rdbtnQ9fC);
			        					bgQ9f.add(rdbtnQ9fD);
			        					lblQ9g= new JLabel("7.	This saves your presentation as a video that can be shared online, in an email, or on a disc.");
			        					lblQ9g.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9g.setBounds(50, 381, 1500, 32);
			        					rdbtnQ9gA = new JRadioButton("a. Create PDF/XPS Document");
			        					rdbtnQ9gA.setBounds(50, 411, 250, 25);
			        					rdbtnQ9gA.setBackground(Color.WHITE);
			        					rdbtnQ9gB = new JRadioButton("b. Create a Video");
			        					rdbtnQ9gB.setBounds(300, 411, 250, 25);
			        					rdbtnQ9gB.setBackground(Color.WHITE);
			        					rdbtnQ9gC = new JRadioButton("c. Package Presentation for CD");
			        					rdbtnQ9gC.setBounds(550, 411, 250, 25);
			        					rdbtnQ9gC.setBackground(Color.WHITE);
			        					rdbtnQ9gD = new JRadioButton("d. Print Preview");
			        					rdbtnQ9gD.setBounds(800, 411, 250, 25);
			        					rdbtnQ9gD.setBackground(Color.WHITE);
			        					bgQ9g = new ButtonGroup();
			        					bgQ9g.add(rdbtnQ9gA);
			        					bgQ9g.add(rdbtnQ9gB);
			        					bgQ9g.add(rdbtnQ9gC);
			        					bgQ9g.add(rdbtnQ9gD);
			        					lblQ9h= new JLabel("8.	Click the drop-down arrow on the right side of the Quick Access toolbar. Select Quick Print if it is not already checked. To print, click the ____________ command.");
			        					lblQ9h.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9h.setBounds(50, 431, 1500, 32);
			        					rdbtnQ9hA = new JRadioButton("a. Save");
			        					rdbtnQ9hA.setBounds(50, 461, 250, 25);
			        					rdbtnQ9hA.setBackground(Color.WHITE);
			        					rdbtnQ9hB = new JRadioButton("b. E-mail");
			        					rdbtnQ9hB.setBounds(300, 461, 250, 25);
			        					rdbtnQ9hB.setBackground(Color.WHITE);
			        					rdbtnQ9hC = new JRadioButton("c. Quick Print");
			        					rdbtnQ9hC.setBounds(550, 461, 250, 25);
			        					rdbtnQ9hC.setBackground(Color.WHITE);
			        					rdbtnQ9hD = new JRadioButton("d. New");
			        					rdbtnQ9hD.setBounds(800, 461, 250, 25);
			        					rdbtnQ9hD.setBackground(Color.WHITE);
			        					bgQ9h = new ButtonGroup();
			        					bgQ9h.add(rdbtnQ9hA);
			        					bgQ9h.add(rdbtnQ9hB);
			        					bgQ9h.add(rdbtnQ9hC);
			        					bgQ9h.add(rdbtnQ9hD);
			        					lblQ9i= new JLabel("9.	Click the File tab to go to Backstage view. Select Print. The Print pane appears, with the print settings on the left and the ________ on the right.");
			        					lblQ9i.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9i.setBounds(50, 481, 1500, 32);
			        					rdbtnQ9iA = new JRadioButton("a. Preview");
			        					rdbtnQ9iA.setBounds(50, 511, 250, 25);
			        					rdbtnQ9iA.setBackground(Color.WHITE);
			        					rdbtnQ9iB = new JRadioButton("b. View Video");
			        					rdbtnQ9iB.setBounds(300, 511, 250, 25);
			        					rdbtnQ9iB.setBackground(Color.WHITE);
			        					rdbtnQ9iC = new JRadioButton("c. View Picture");
			        					rdbtnQ9iC.setBounds(550, 511, 250, 25);
			        					rdbtnQ9iC.setBackground(Color.WHITE);
			        					rdbtnQ9iD = new JRadioButton("d. None of the above");
			        					rdbtnQ9iD.setBounds(800, 511, 250, 25);
			        					rdbtnQ9iD.setBackground(Color.WHITE);
			        					bgQ9i = new ButtonGroup();
			        					bgQ9i.add(rdbtnQ9iA);
			        					bgQ9i.add(rdbtnQ9iB);
			        					bgQ9i.add(rdbtnQ9iC);
			        					bgQ9i.add(rdbtnQ9iD);
			        					lblQ9j= new JLabel("10.	_________ is a process for reproducing text and images using a master form or template.");
			        					lblQ9j.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        					lblQ9j.setBounds(50, 531, 1500, 32);
			        					rdbtnQ9jA = new JRadioButton("a. Save");
			        					rdbtnQ9jA.setBounds(50, 561, 250, 25);
			        					rdbtnQ9jA.setBackground(Color.WHITE);
			        					rdbtnQ9jB = new JRadioButton("b. Screenshot");
			        					rdbtnQ9jB.setBounds(300, 561, 250, 25);
			        					rdbtnQ9jB.setBackground(Color.WHITE);
			        					rdbtnQ9jC = new JRadioButton("c. Theme");
			        					rdbtnQ9jC.setBounds(550, 561, 250, 25);
			        					rdbtnQ9jC.setBackground(Color.WHITE);
			        					rdbtnQ9jD = new JRadioButton("d. Printing");
			        					rdbtnQ9jD.setBounds(800, 561, 250, 25);
			        					rdbtnQ9jD.setBackground(Color.WHITE);
			        					bgQ9j = new ButtonGroup();
			        					bgQ9j.add(rdbtnQ9jA);
			        					bgQ9j.add(rdbtnQ9jB);
			        					bgQ9j.add(rdbtnQ9jC);
			        					bgQ9j.add(rdbtnQ9jD);
										bSubmit9 = new JButton("Submit");
			        					bSubmit9.setBounds(50, 616, 150, 25);
			        					bSubmit9.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent arg0) {
					        					if (rdbtnQ9aB.isSelected()) {
					        						score9a=1;
					        					}
					        					if (rdbtnQ9bB.isSelected()) {
					        						score9b=1;
					        					}
					        					if (rdbtnQ9cA.isSelected()) {
					        						score9c=1;
					        					}
					        					if (rdbtnQ9dA.isSelected()) {
					        						score9d=1;
					        					}
					        					if (rdbtnQ9eA.isSelected()) {
					        						score9e=1;
					        					}
					        					if (rdbtnQ9fC.isSelected()) {
					        						score9f=1;
					        					}
					        					if (rdbtnQ9gB.isSelected()) {
					        						score9g=1;
					        					}
					        					if (rdbtnQ9hC.isSelected()) {
					        						score9h=1;
					        					}
					        					if (rdbtnQ9iA.isSelected()) {
					        						score9i=1;
					        					}
					        					if (rdbtnQ9jD.isSelected()) {
					        						score9j=1;
					        					}
					        					lesson9g=score9a+score9b+score9c+score9d+score9e+score9f+score9g+score9h+score9i+score9j;
					        					JOptionPane.showMessageDialog(null, "Your score is "+lesson9g);
											}
			        					});
										panel2.add(lblAssess9);
										panel2.add(lblQ9a);
			        					panel2.add(rdbtnQ9aA);
			        					panel2.add(rdbtnQ9aB);
			        					panel2.add(rdbtnQ9aC);
			        					panel2.add(rdbtnQ9aD);
										panel2.add(lblQ9b1);
										panel2.add(lblQ9b2);
			        					panel2.add(rdbtnQ9bA);
			        					panel2.add(rdbtnQ9bB);
			        					panel2.add(rdbtnQ9bC);
			        					panel2.add(rdbtnQ9bD);
										panel2.add(lblQ9c1);
										panel2.add(lblQ9c2);
			        					panel2.add(rdbtnQ9cA);
			        					panel2.add(rdbtnQ9cB);
			        					panel2.add(rdbtnQ9cC);
			        					panel2.add(rdbtnQ9cD);
										panel2.add(lblQ9d);
			        					panel2.add(rdbtnQ9dA);
			        					panel2.add(rdbtnQ9dB);
			        					panel2.add(rdbtnQ9dC);
			        					panel2.add(rdbtnQ9dD);
										panel2.add(lblQ9e);
			        					panel2.add(rdbtnQ9eA);
			        					panel2.add(rdbtnQ9eB);
			        					panel2.add(rdbtnQ9eC);
			        					panel2.add(rdbtnQ9eD);
										panel2.add(lblQ9f);
			        					panel2.add(rdbtnQ9fA);
			        					panel2.add(rdbtnQ9fB);
			        					panel2.add(rdbtnQ9fC);
			        					panel2.add(rdbtnQ9fD);
										panel2.add(lblQ9g);
			        					panel2.add(rdbtnQ9gA);
			        					panel2.add(rdbtnQ9gB);
			        					panel2.add(rdbtnQ9gC);
			        					panel2.add(rdbtnQ9gD);
										panel2.add(lblQ9h);
			        					panel2.add(rdbtnQ9hA);
			        					panel2.add(rdbtnQ9hB);
			        					panel2.add(rdbtnQ9hC);
			        					panel2.add(rdbtnQ9hD);
										panel2.add(lblQ9i);
			        					panel2.add(rdbtnQ9iA);
			        					panel2.add(rdbtnQ9iB);
			        					panel2.add(rdbtnQ9iC);
			        					panel2.add(rdbtnQ9iD);
										panel2.add(lblQ9j);
			        					panel2.add(rdbtnQ9jA);
			        					panel2.add(rdbtnQ9jB);
			        					panel2.add(rdbtnQ9jC);
			        					panel2.add(rdbtnQ9jD);
			        					panel2.add(bSubmit9);
									}
		    					});
		    					panel2.add(lblLesson9);
		    					panel2.add(bOpenVid9);
		    					panel2.add(bOpenPpt9);
		    					panel2.add(bAssess9);
		    				} else if (node.equals("Lesson 10")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson10 = new JLabel("Lesson 10: MODIFYING THEMES");
		    					lblLesson10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson10.setBounds(50, 11, 500, 32);
		    					bOpenVid10 = new JButton("Play Video");
		    					bOpenVid10.setBounds(50, 500, 150, 100);
		    					bOpenVid10.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 13.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt10 = new JButton("Play Presentation");
		    					bOpenPpt10.setBounds(240, 500, 150, 100);
		    					bOpenPpt10.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("New Microsoft PowerPoint Presentation.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess10 = new JButton("Assessment Task");
		    					bAssess10.setBounds(430, 500, 150, 100);
		    					bAssess10.addActionListener(new ActionListener() {
		    						@Override
		    						public void actionPerformed(ActionEvent ae) {
		    							panel2.removeAll();
		    							panel2.repaint();
		    							lblAssess10 = new JLabel("Assessment Task #10: Modifying Themes");
		    	    					lblAssess10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    	    					lblAssess10.setBounds(50, 11, 700, 32);
		    	    					lblQ10a= new JLabel("1. A _______ is a predefined combination of colors, fonts, and effects that can be applied to your presentation. PowerPoint includes built-in themes that allow you.");
		    	    					lblQ10a.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10a.setBounds(50, 41, 1500, 35);
		    	    					lblQ10b= new JLabel("to easily create professional-looking presentations without spending a lot of time formatting.");
		    	    					lblQ10b.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10b.setBounds(50, 61, 1500, 35);
		    	    					rdbtnQ10aA = new JRadioButton("a. Chart ");
		    	    					rdbtnQ10aA.setBounds(50, 91, 250, 25);
		    	    					rdbtnQ10aA.setBackground(Color.WHITE);
		    	    					rdbtnQ10aB = new JRadioButton("b. Table");
		    	    					rdbtnQ10aB.setBounds(300, 91, 250, 25);
		    	    					rdbtnQ10aB.setBackground(Color.WHITE);
		    	    					rdbtnQ10aC = new JRadioButton("c. Theme");
		    	    					rdbtnQ10aC.setBounds(550, 91, 250, 25);
		    	    					rdbtnQ10aC.setBackground(Color.WHITE);
		    	    					rdbtnQ10aD = new JRadioButton("d. Shape");
		    	    					rdbtnQ10aD.setBounds(800, 91, 250, 25);
		    	    					rdbtnQ10aD.setBackground(Color.WHITE);
		    	    					bgQ10a = new ButtonGroup();
		    	    					bgQ10a.add(rdbtnQ10aA);
		    	    					bgQ10a.add(rdbtnQ10aB);
		    	    					bgQ10a.add(rdbtnQ10aC);
		    	    					bgQ10a.add(rdbtnQ10aD);
		    	    					lblQ10b1= new JLabel("2.You can modify themes by combining the colors, fonts, and effects from different themes, and you can customize them even further by creating your own.");
		    	    					lblQ10b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10b1.setBounds(50, 111, 1500, 32);
		    	    					lblQ10b2= new JLabel("sets of _______ and_______.");
		    	    					lblQ10b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10b2.setBounds(50, 131, 1500, 32);
		    	    					rdbtnQ10bA = new JRadioButton("a. Colors & fonts");
		    	    					rdbtnQ10bA.setBounds(50, 161, 250, 25);
		    	    					rdbtnQ10bA.setBackground(Color.WHITE);
		    	    					rdbtnQ10bB = new JRadioButton("b. Chart & fonts");
		    	    					rdbtnQ10bB.setBounds(300, 161, 250, 25);
		    	    					rdbtnQ10bB.setBackground(Color.WHITE);
		    	    					rdbtnQ10bC = new JRadioButton("c. Fonts & size");
		    	    					rdbtnQ10bC.setBounds(550, 161, 250, 25);
		    	    					rdbtnQ10bC.setBackground(Color.WHITE);
		    	    					rdbtnQ10bD = new JRadioButton("d. Colors & size");
		    	    					rdbtnQ10bD.setBounds(800, 161, 250, 25);
		    	    					rdbtnQ10bD.setBackground(Color.WHITE);
		    	    					bgQ10b = new ButtonGroup();
		    	    					bgQ10b.add(rdbtnQ10bA);
		    	    					bgQ10b.add(rdbtnQ10bB);
		    	    					bgQ10b.add(rdbtnQ10bC);
		    	    					bgQ10b.add(rdbtnQ10bD);
		    	    					lblQ10c1= new JLabel("3. If it still doesn't look exactly right, you can customize the theme colors and _________.");
		    	    					lblQ10c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10c1.setBounds(50, 181, 1500, 32);
		    	    					rdbtnQ10cA = new JRadioButton("a. Theme fonts");
		    	    					rdbtnQ10cA.setBounds(50, 211, 250, 25);
		    	    					rdbtnQ10cA.setBackground(Color.WHITE);
		    	    					rdbtnQ10cB = new JRadioButton("b. Theme colors");
		    	    					rdbtnQ10cB.setBounds(300, 211, 250, 25);
		    	    					rdbtnQ10cB.setBackground(Color.WHITE);
		    	    					rdbtnQ10cC = new JRadioButton("c. Theme tables");
		    	    					rdbtnQ10cC.setBounds(550, 211, 250, 25);
		    	    					rdbtnQ10cC.setBackground(Color.WHITE);
		    	    					rdbtnQ10cD = new JRadioButton("d. Theme charts");
		    	    					rdbtnQ10cD.setBounds(800, 211, 250, 25);
		    	    					rdbtnQ10cD.setBackground(Color.WHITE);
		    	    					bgQ10c = new ButtonGroup();
		    	    					bgQ10c.add(rdbtnQ10cA);
		    	    					bgQ10c.add(rdbtnQ10cB);
		    	    					bgQ10c.add(rdbtnQ10cC);
		    	    					bgQ10c.add(rdbtnQ10cD);
		    	    					lblQ10d = new JLabel("4. From the Design tab, click the __________ command. A drop-down menu will appear. Hover the mouse over the different sets of theme colors to see a live"); 
		    	    					lblQ10d.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10d.setBounds(50, 231, 1500, 32);
		    	    					lblQ10d1 = new JLabel("preview. Select the set of theme colors you want, or select Create New Theme Colors to customize each color individually");
		    	    					lblQ10d1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10d1.setBounds(50, 251, 1500, 32);
		    	    					rdbtnQ10dA = new JRadioButton("a. Theme Charts");
		    	    					rdbtnQ10dA.setBounds(50, 281, 250, 25);
		    	    					rdbtnQ10dA.setBackground(Color.WHITE);
		    	    					rdbtnQ10dB = new JRadioButton("b. Theme Tables");
		    	    					rdbtnQ10dB.setBounds(300, 281, 250, 25);
		    	    					rdbtnQ10dB.setBackground(Color.WHITE);
		    	    					rdbtnQ10dC = new JRadioButton("c. Theme Fonts");
		    	    					rdbtnQ10dC.setBounds(550, 281, 250, 25);
		    	    					rdbtnQ10dC.setBackground(Color.WHITE);
		    	    					rdbtnQ10dD = new JRadioButton("d. Theme Colors");
		    	    					rdbtnQ10dD.setBounds(800, 281, 250, 25);
		    	    					rdbtnQ10dD.setBackground(Color.WHITE);
		    	    					bgQ10d = new ButtonGroup();
		    	    					bgQ10d.add(rdbtnQ10dA);
		    	    					bgQ10d.add(rdbtnQ10dB);
		    	    					bgQ10d.add(rdbtnQ10dC);
		    	    					bgQ10d.add(rdbtnQ10dD);
		    	    					lblQ10e= new JLabel("5.	To further customize your slides, you can change the background's color and texture by choosing a different _______________.");
		    	    					lblQ10e.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10e.setBounds(50, 301, 1500, 32);
		    	    					rdbtnQ10eA = new JRadioButton("a. Format Background");
		    	    					rdbtnQ10eA.setBounds(50, 331, 250, 25);
		    	    					rdbtnQ10eA.setBackground(Color.WHITE);
		    	    					rdbtnQ10eB = new JRadioButton("b. Background Style");
		    	    					rdbtnQ10eB.setBounds(300, 331, 250, 25);
		    	    					rdbtnQ10eB.setBackground(Color.WHITE);
		    	    					rdbtnQ10eC = new JRadioButton("c. Font Style");
		    	    					rdbtnQ10eC.setBounds(550, 331, 250, 25);
		    	    					rdbtnQ10eC.setBackground(Color.WHITE);
		    	    					rdbtnQ10eD = new JRadioButton("d. Color Style");
		    	    					rdbtnQ10eD.setBounds(800, 331, 250, 25);
		    	    					rdbtnQ10eD.setBackground(Color.WHITE);
		    	    					bgQ10e = new ButtonGroup();
		    	    					bgQ10e.add(rdbtnQ10eA);
		    	    					bgQ10e.add(rdbtnQ10eB);
		    	    					bgQ10e.add(rdbtnQ10eC);
		    	    					bgQ10e.add(rdbtnQ10eD);
		    	    					lblQ10f= new JLabel("6.	If you want even more control over the background, you can select _________________ from the menu.");
		    	    					lblQ10f.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10f.setBounds(50, 351, 1500, 32);
		    	    					rdbtnQ10fA = new JRadioButton("a. Design");
		    	    					rdbtnQ10fA.setBounds(50, 381, 250, 25);
		    	    					rdbtnQ10fA.setBackground(Color.WHITE);
		    	    					rdbtnQ10fB = new JRadioButton("b. Background Style");
		    	    					rdbtnQ10fB.setBounds(300, 381, 250, 25);
		    	    					rdbtnQ10fB.setBackground(Color.WHITE);
		    	    					rdbtnQ10fC = new JRadioButton("c. Format Background");
		    	    					rdbtnQ10fC.setBounds(550, 381, 250, 25);
		    	    					rdbtnQ10fC.setBackground(Color.WHITE);
		    	    					rdbtnQ10fD = new JRadioButton("d. Theme Effects");
		    	    					rdbtnQ10fD.setBounds(800, 381, 250, 25);
		    	    					rdbtnQ10fD.setBackground(Color.WHITE);
		    	    					bgQ10f = new ButtonGroup();
		    	    					bgQ10f.add(rdbtnQ10fA);
		    	    					bgQ10f.add(rdbtnQ10fB);
		    	    					bgQ10f.add(rdbtnQ10fC);
		    	    					bgQ10f.add(rdbtnQ10fD);
		    	    					lblQ10g= new JLabel("7.	Select the set of ___________ you want, or select Create New Theme Fonts to customize each font individually.");
		    	    					lblQ10g.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10g.setBounds(50, 401, 1500, 32);
		    	    					rdbtnQ10gA = new JRadioButton("a. Theme Charts");
		    	    					rdbtnQ10gA.setBounds(50, 431, 250, 25);
		    	    					rdbtnQ10gA.setBackground(Color.WHITE);
		    	    					rdbtnQ10gB = new JRadioButton("b. Theme Tables");
		    	    					rdbtnQ10gB.setBounds(300, 431, 250, 25);
		    	    					rdbtnQ10gB.setBackground(Color.WHITE);
		    	    					rdbtnQ10gC = new JRadioButton("c. Theme Fonts");
		    	    					rdbtnQ10gC.setBounds(550, 431, 250, 25);
		    	    					rdbtnQ10gC.setBackground(Color.WHITE);
		    	    					rdbtnQ10gD = new JRadioButton("d. Theme Colors");
		    	    					rdbtnQ10gD.setBounds(800, 431, 250, 25);
		    	    					rdbtnQ10gD.setBackground(Color.WHITE);
		    	    					bgQ10g = new ButtonGroup();
		    	    					bgQ10g.add(rdbtnQ10gA);
		    	    					bgQ10g.add(rdbtnQ10gB);
		    	    					bgQ10g.add(rdbtnQ10gC);
		    	    					bgQ10g.add(rdbtnQ10gD);
		    	    					lblQ10h= new JLabel("8. To change theme effects: From the Design tab, click the _________ command. A drop-down menu will appear. Hover the mouse over the different sets of");
		    	    					lblQ10h.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10h.setBounds(50, 451, 1500, 32);
		    	    					lblQ10h1= new JLabel(" theme effects to see a live preview.");
		    	    					lblQ10h1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10h1.setBounds(50, 471, 1500, 32);
		    	    					rdbtnQ10hA = new JRadioButton("a. Design");
		    	    					rdbtnQ10hA.setBounds(50, 501, 250, 25);
		    	    					rdbtnQ10hA.setBackground(Color.WHITE);
		    	    					rdbtnQ10hB = new JRadioButton("b. Background Style");
		    	    					rdbtnQ10hB.setBounds(300, 501, 250, 25);
		    	    					rdbtnQ10hB.setBackground(Color.WHITE);
		    	    					rdbtnQ10hC = new JRadioButton("c. Format Background ");
		    	    					rdbtnQ10hC.setBounds(550, 501, 250, 25);
		    	    					rdbtnQ10hC.setBackground(Color.WHITE);
		    	    					rdbtnQ10hD = new JRadioButton("d. Theme Effects");
		    	    					rdbtnQ10hD.setBounds(800, 501, 250, 25);
		    	    					rdbtnQ10hD.setBackground(Color.WHITE);
		    	    					bgQ10h = new ButtonGroup();
		    	    					bgQ10h.add(rdbtnQ10hA);
		    	    					bgQ10h.add(rdbtnQ10hB);
		    	    					bgQ10h.add(rdbtnQ10hC);
		    	    					bgQ10h.add(rdbtnQ10hD);
		    	    					lblQ10i= new JLabel("9.	To apply a background style: From the Design tab, click the _________________ command. Select the desired style. The new background will");
		    	    					lblQ10i.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10i.setBounds(50, 521, 1500, 32);
		    	    					rdbtnQ10iA = new JRadioButton("a. Theme Effects");
		    	    					rdbtnQ10iA.setBounds(50, 551, 250, 25);
		    	    					rdbtnQ10iA.setBackground(Color.WHITE);
		    	    					rdbtnQ10iB = new JRadioButton("b. Theme Colors");
		    	    					rdbtnQ10iB.setBounds(300, 551, 250, 25);
		    	    					rdbtnQ10iB.setBackground(Color.WHITE);
		    	    					rdbtnQ10iC = new JRadioButton("c. Format Background");
		    	    					rdbtnQ10iC.setBounds(550, 551, 250, 25);
		    	    					rdbtnQ10iC.setBackground(Color.WHITE);
		    	    					rdbtnQ10iD = new JRadioButton("d. Background Style");
		    	    					rdbtnQ10iD.setBounds(800, 551, 250, 25);
		    	    					rdbtnQ10iD.setBackground(Color.WHITE);
		    	    					bgQ10i = new ButtonGroup();
		    	    					bgQ10i.add(rdbtnQ10iA);
		    	    					bgQ10i.add(rdbtnQ10iB);
		    	    					bgQ10i.add(rdbtnQ10iC);
		    	    					bgQ10i.add(rdbtnQ10iD);
		    	    					lblQ10j= new JLabel("10.  What have you learned in this lesson?");
		    	    					lblQ10j.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ10j.setBounds(50, 571, 1500, 32);
		    	    					rdbtnQ10jA = new JRadioButton("a. Designing Picture & videos");
		    	    					rdbtnQ10jA.setBounds(50, 601, 250, 25);
		    	    					rdbtnQ10jA.setBackground(Color.WHITE);
		    	    					rdbtnQ10jB = new JRadioButton("b. Modifying chart & table");
		    	    					rdbtnQ10jB.setBounds(300, 601, 250, 25);
		    	    					rdbtnQ10jB.setBackground(Color.WHITE);
		    	    					rdbtnQ10jC = new JRadioButton("c. Modifying theme colors, fonts & effects");
		    	    					rdbtnQ10jC.setBounds(550, 601, 250, 25);
		    	    					rdbtnQ10jC.setBackground(Color.WHITE);
		    	    					rdbtnQ10jD = new JRadioButton("d. Designing text & inserting charts");
		    	    					rdbtnQ10jD.setBounds(800, 601, 250, 25);
		    	    					rdbtnQ10jD.setBackground(Color.WHITE);
		    	    					bgQ10j = new ButtonGroup();
		    	    					bgQ10j.add(rdbtnQ10jA);
		    	    					bgQ10j.add(rdbtnQ10jB);
		    	    					bgQ10j.add(rdbtnQ10jC);
		    	    					bgQ10j.add(rdbtnQ10jD);
		    							bSubmit10 = new JButton("Submit");
		    	    					bSubmit10.setBounds(50, 630, 150, 25);
		    	    					bSubmit10.addActionListener(new ActionListener() {
		    								@Override
		    								public void actionPerformed(ActionEvent arg0) {
		    		        					if (rdbtnQ10aC.isSelected()) {
		    		        						score10a=1;
		    		        					}
		    		        					if (rdbtnQ10bA.isSelected()) {
		    		        						score10b=1;
		    		        					}
		    		        					if (rdbtnQ10cA.isSelected()) {
		    		        						score10c=1;
		    		        					}
		    		        					if (rdbtnQ10dD.isSelected()) {
		    		        						score10d=1;
		    		        					}
		    		        					if (rdbtnQ10eB.isSelected()) {
		    		        						score10e=1;
		    		        					}
		    		        					if (rdbtnQ10fC.isSelected()) {
		    		        						score10f=1;
		    		        					}
		    		        					if (rdbtnQ10gB.isSelected()) {
		    		        						score10g=1;
		    		        					}
		    		        					if (rdbtnQ10hC.isSelected()) {
		    		        						score10h=1;
		    		        					}
		    		        					if (rdbtnQ10iA.isSelected()) {
		    		        						score10i=1;
		    		        					}
		    		        					if (rdbtnQ10jD.isSelected()) {
		    		        						score10j=1;
		    		        					}
		    		        					lesson10g=score10a+score10b+score10c+score10d+score10e+score10f+score10g+score10h+score10i+score10j;
		    		        					JOptionPane.showMessageDialog(null, "Your score is "+lesson10g);
		    								}
		    	    					});
		    							panel2.add(lblAssess10);
		    							panel2.add(lblQ10a);
		    							panel2.add(lblQ10b);
		    	    					panel2.add(rdbtnQ10aA);
		    	    					panel2.add(rdbtnQ10aB);
		    	    					panel2.add(rdbtnQ10aC);
		    	    					panel2.add(rdbtnQ10aD);
		    							panel2.add(lblQ10b1);
		    							panel2.add(lblQ10b2);
		    	    					panel2.add(rdbtnQ10bA);
		    	    					panel2.add(rdbtnQ10bB);
		    	    					panel2.add(rdbtnQ10bC);
		    	    					panel2.add(rdbtnQ10bD);
		    							panel2.add(lblQ10c1);
		    	    					panel2.add(rdbtnQ10cA);
		    	    					panel2.add(rdbtnQ10cB);
		    	    					panel2.add(rdbtnQ10cC);
		    	    					panel2.add(rdbtnQ10cD);
		    							panel2.add(lblQ10d);
		    							panel2.add(lblQ10d1);
		    	    					panel2.add(rdbtnQ10dA);
		    	    					panel2.add(rdbtnQ10dB);
		    	    					panel2.add(rdbtnQ10dC);
		    	    					panel2.add(rdbtnQ10dD);
		    							panel2.add(lblQ10e);
		    	    					panel2.add(rdbtnQ10eA);
		    	    					panel2.add(rdbtnQ10eB);
		    	    					panel2.add(rdbtnQ10eC);
		    	    					panel2.add(rdbtnQ10eD);
		    							panel2.add(lblQ10f);
		    	    					panel2.add(rdbtnQ10fA);
		    	    					panel2.add(rdbtnQ10fB);
		    	    					panel2.add(rdbtnQ10fC);
		    	    					panel2.add(rdbtnQ10fD);
		    							panel2.add(lblQ10g);
		    	    					panel2.add(rdbtnQ10gA);
		    	    					panel2.add(rdbtnQ10gB);
		    	    					panel2.add(rdbtnQ10gC);
		    	    					panel2.add(rdbtnQ10gD);
		    							panel2.add(lblQ10h);
		    							panel2.add(lblQ10h1);
		    	    					panel2.add(rdbtnQ10hA);
		    	    					panel2.add(rdbtnQ10hB);
		    	    					panel2.add(rdbtnQ10hC);
		    	    					panel2.add(rdbtnQ10hD);
		    							panel2.add(lblQ10i);
		    	    					panel2.add(rdbtnQ10iA);
		    	    					panel2.add(rdbtnQ10iB);
		    	    					panel2.add(rdbtnQ10iC);
		    	    					panel2.add(rdbtnQ10iD);
		    							panel2.add(lblQ10j);
		    	    					panel2.add(rdbtnQ10jA);
		    	    					panel2.add(rdbtnQ10jB);
		    	    					panel2.add(rdbtnQ10jC);
		    	    					panel2.add(rdbtnQ10jD);
		    	    					panel2.add(bSubmit10);
		    						}
		    					});
		    					panel2.add(lblLesson10);
		    					panel2.add(bOpenVid10);
		    					panel2.add(bOpenPpt10);
		    					panel2.add(bAssess10);
		    				} else if (node.equals("Lesson 11")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson11 = new JLabel("Lesson 11: FORMATTING PICTURES");
		    					lblLesson11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson11.setBounds(50, 11, 500, 32);
		    					bOpenVid11 = new JButton("Play Video");
		    					bOpenVid11.setBounds(50, 500, 150, 100);
		    					bOpenVid11.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 14.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt11 = new JButton("Play Presentation");
		    					bOpenPpt11.setBounds(240, 500, 150, 100);
		    					bOpenPpt11.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("14.) Formatting Pictures.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess11 = new JButton("Assessment Task");
		    					bAssess11.setBounds(430, 500, 150, 100);
		    					bAssess11.addActionListener(new ActionListener() {
		    						@Override
		    						public void actionPerformed(ActionEvent ae) {
		    							panel2.removeAll();
		    							panel2.repaint();
		    							lblAssess11 = new JLabel("Assessment Task #11: FORMATTING PICTURES");
		    	    					lblAssess11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    	    					lblAssess11.setBounds(50, 11, 700, 32);
		    	    					lblQ11a= new JLabel("1.	The _______ tools in PowerPoint 2010 make it easy to incorporate images into your presentations and modify these images to make them look even better.");
		    	    					lblQ11a.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11a.setBounds(50, 41, 1500, 32);
		    	    					rdbtnQ11aA = new JRadioButton("a. Theme");
		    	    					rdbtnQ11aA.setBounds(50, 61, 250, 25);
		    	    					rdbtnQ11aA.setBackground(Color.WHITE);
		    	    					rdbtnQ11aB = new JRadioButton("b. Picture");
		    	    					rdbtnQ11aB.setBounds(300, 61, 250, 25);
		    	    					rdbtnQ11aB.setBackground(Color.WHITE);
		    	    					rdbtnQ11aC = new JRadioButton("c. Chart");
		    	    					rdbtnQ11aC.setBounds(550, 61, 250, 25);
		    	    					rdbtnQ11aC.setBackground(Color.WHITE);
		    	    					rdbtnQ11aD = new JRadioButton("d. Table");
		    	    					rdbtnQ11aD.setBounds(800, 61, 250, 25);
		    	    					rdbtnQ11aD.setBackground(Color.WHITE);
		    	    					bgQ11a = new ButtonGroup();
		    	    					bgQ11a.add(rdbtnQ11aA);
		    	    					bgQ11a.add(rdbtnQ11aB);
		    	    					bgQ11a.add(rdbtnQ11aC);
		    	    					bgQ11a.add(rdbtnQ11aD);
		    	    					lblQ11b1= new JLabel("2. To crop an image: Select an image. The _______ tab will appear. Select the Format tab. Click the Crop command. The black cropping handles appear.");
		    	    					lblQ11b1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11b1.setBounds(50, 81, 1500, 32);
		    	    					lblQ11b2= new JLabel("Click and drag a handle to crop an image. Click the Crop command to deselect the crop tool.");
		    	    					lblQ11b2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11b2.setBounds(50, 101, 1500, 32);
		    	    					rdbtnQ11bA = new JRadioButton("a. Theme");
		    	    					rdbtnQ11bA.setBounds(50, 121, 250, 25);
		    	    					rdbtnQ11bA.setBackground(Color.WHITE);
		    	    					rdbtnQ11bB = new JRadioButton("b. Picture");
		    	    					rdbtnQ11bB.setBounds(300, 121, 250, 25);
		    	    					rdbtnQ11bB.setBackground(Color.WHITE);
		    	    					rdbtnQ11bC = new JRadioButton("c. Format");
		    	    					rdbtnQ11bC.setBounds(550, 121, 250, 25);
		    	    					rdbtnQ11bC.setBackground(Color.WHITE);
		    	    					rdbtnQ11bD = new JRadioButton("d. Chart");
		    	    					rdbtnQ11bD.setBounds(800, 121, 250, 25);
		    	    					rdbtnQ11bD.setBackground(Color.WHITE);
		    	    					bgQ11b = new ButtonGroup();
		    	    					bgQ11b.add(rdbtnQ11bA);
		    	    					bgQ11b.add(rdbtnQ11bB);
		    	    					bgQ11b.add(rdbtnQ11bC);
		    	    					bgQ11b.add(rdbtnQ11bD);
		    	    					lblQ11c1= new JLabel("3. _____________ controls how vivid the colors are in the image.");
		    	    					lblQ11c1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11c1.setBounds(50, 141, 1500, 32);
		    	    					lblQ11c2= new JLabel(" presentation, then click Save.");
		    	    					lblQ11c2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11c2.setBounds(50, 161, 1500, 32);
		    	    					rdbtnQ11cA = new JRadioButton("a. Design");
		    	    					rdbtnQ11cA.setBounds(50, 191, 250, 25);
		    	    					rdbtnQ11cA.setBackground(Color.WHITE);
		    	    					rdbtnQ11cB = new JRadioButton("b. Color Tone");
		    	    					rdbtnQ11cB.setBounds(300, 191, 250, 25);
		    	    					rdbtnQ11cB.setBackground(Color.WHITE);
		    	    					rdbtnQ11cC = new JRadioButton("c. Recolor");
		    	    					rdbtnQ11cC.setBounds(550, 191, 250, 25);
		    	    					rdbtnQ11cC.setBackground(Color.WHITE);
		    	    					rdbtnQ11cD = new JRadioButton("d. Color Saturation");
		    	    					rdbtnQ11cD.setBounds(800, 191, 250, 25);
		    	    					rdbtnQ11cD.setBackground(Color.WHITE);
		    	    					bgQ11c = new ButtonGroup();
		    	    					bgQ11c.add(rdbtnQ11cA);
		    	    					bgQ11c.add(rdbtnQ11cB);
		    	    					bgQ11c.add(rdbtnQ11cC);
		    	    					bgQ11c.add(rdbtnQ11cD);
		    	    					lblQ11d = new JLabel("4. ___________ controls the temperature of the color, from cool to warm.");
		    	    					lblQ11d.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11d.setBounds(50, 211, 1500, 32);
		    	    					rdbtnQ11dA = new JRadioButton("a. Design");
		    	    					rdbtnQ11dA.setBounds(50, 231, 250, 25);
		    	    					rdbtnQ11dA.setBackground(Color.WHITE);
		    	    					rdbtnQ11dB = new JRadioButton("b. Color Tone");
		    	    					rdbtnQ11dB.setBounds(300, 231, 250, 25);
		    	    					rdbtnQ11dB.setBackground(Color.WHITE);
		    	    					rdbtnQ11dC = new JRadioButton("c. Recolor");
		    	    					rdbtnQ11dC.setBounds(550, 231, 250, 25);
		    	    					rdbtnQ11dC.setBackground(Color.WHITE);
		    	    					rdbtnQ11dD = new JRadioButton("d. Color Saturation");
		    	    					rdbtnQ11dD.setBounds(800, 231, 250, 25);
		    	    					rdbtnQ11dD.setBackground(Color.WHITE);
		    	    					bgQ11d = new ButtonGroup();
		    	    					bgQ11d.add(rdbtnQ11dA);
		    	    					bgQ11d.add(rdbtnQ11dB);
		    	    					bgQ11d.add(rdbtnQ11dC);
		    	    					bgQ11d.add(rdbtnQ11dD);
		    	    					lblQ11e= new JLabel("5.	___________ controls the overall color of the image. Use this option to make the image black and white, grayscale, or to colorize it with a different color.");
		    	    					lblQ11e.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11e.setBounds(50, 251, 1500, 32);
		    	    					lblQ11e1= new JLabel("a different color.");
		    	    					lblQ11e1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11e1.setBounds(50, 271, 1500, 32);
		    	    					rdbtnQ11eA = new JRadioButton("a. Design");
		    	    					rdbtnQ11eA.setBounds(50, 291, 250, 25);
		    	    					rdbtnQ11eA.setBackground(Color.WHITE);
		    	    					rdbtnQ11eB = new JRadioButton("b. Color Tone");
		    	    					rdbtnQ11eB.setBounds(300, 291, 250, 25);
		    	    					rdbtnQ11eB.setBackground(Color.WHITE);
		    	    					rdbtnQ11eC = new JRadioButton("c. Recolor");
		    	    					rdbtnQ11eC.setBounds(550, 291, 250, 25);
		    	    					rdbtnQ11eC.setBackground(Color.WHITE);
		    	    					rdbtnQ11eD = new JRadioButton("d. Color Saturation");
		    	    					rdbtnQ11eD.setBounds(800, 291, 250, 25);
		    	    					rdbtnQ11eD.setBackground(Color.WHITE);
		    	    					bgQ11e = new ButtonGroup();
		    	    					bgQ11e.add(rdbtnQ11eA);
		    	    					bgQ11e.add(rdbtnQ11eB);
		    	    					bgQ11e.add(rdbtnQ11eC);
		    	    					bgQ11e.add(rdbtnQ11eD);
		    	    					lblQ11f= new JLabel("6.	With _________________, PowerPoint uses special algorithms to determine which parts of the image are the background and then removes these areas from the image.");
		    	    					lblQ11f.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11f.setBounds(50, 311, 1500, 32);
		    	    					lblQ11f1= new JLabel("from the image.");
		    	    					lblQ11f1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11f1.setBounds(50, 331, 1500, 32);
		    	    					rdbtnQ11fA = new JRadioButton("a. Background Removal");
		    	    					rdbtnQ11fA.setBounds(50, 351, 250, 25);
		    	    					rdbtnQ11fA.setBackground(Color.WHITE);
		    	    					rdbtnQ11fB = new JRadioButton("b. Format Background ");
		    	    					rdbtnQ11fB.setBounds(300, 351, 250, 25);
		    	    					rdbtnQ11fB.setBackground(Color.WHITE);
		    	    					rdbtnQ11fC = new JRadioButton("c. Background Style");
		    	    					rdbtnQ11fC.setBounds(550, 351, 250, 25);
		    	    					rdbtnQ11fC.setBackground(Color.WHITE);
		    	    					rdbtnQ11fD = new JRadioButton("d. Background Designing");
		    	    					rdbtnQ11fD.setBounds(800, 351, 250, 25);
		    	    					rdbtnQ11fD.setBackground(Color.WHITE);
		    	    					bgQ11f = new ButtonGroup();
		    	    					bgQ11f.add(rdbtnQ11fA);
		    	    					bgQ11f.add(rdbtnQ11fB);
		    	    					bgQ11f.add(rdbtnQ11fC);
		    	    					bgQ11f.add(rdbtnQ11fD);
		    	    					lblQ11g= new JLabel("7.	To remove the background from an image: Click the image. The ________ tab will appear.");
		    	    					lblQ11g.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11g.setBounds(50, 371, 1500, 32);
		    	    					rdbtnQ11gA = new JRadioButton("a. Format");
		    	    					rdbtnQ11gA.setBounds(50, 391, 250, 25);
		    	    					rdbtnQ11gA.setBackground(Color.WHITE);
		    	    					rdbtnQ11gB = new JRadioButton("b. Remove Background");
		    	    					rdbtnQ11gB.setBounds(300, 391, 250, 25);
		    	    					rdbtnQ11gB.setBackground(Color.WHITE);
		    	    					rdbtnQ11gC = new JRadioButton("c. Target output");
		    	    					rdbtnQ11gC.setBounds(550, 391, 250, 25);
		    	    					rdbtnQ11gC.setBackground(Color.WHITE);
		    	    					rdbtnQ11gD = new JRadioButton("d. Picture Effects");
		    	    					rdbtnQ11gD.setBounds(800, 391, 250, 25);
		    	    					rdbtnQ11gD.setBackground(Color.WHITE);
		    	    					bgQ11g = new ButtonGroup();
		    	    					bgQ11g.add(rdbtnQ11gA);
		    	    					bgQ11g.add(rdbtnQ11gB);
		    	    					bgQ11g.add(rdbtnQ11gC);
		    	    					bgQ11g.add(rdbtnQ11gD);
		    	    					lblQ11h= new JLabel("8.	To remove the background from an image: Click the ______________ command. PowerPoint will try to guess which part of the image is the background,");
		    	    					lblQ11h.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11h.setBounds(50, 411, 1500, 32);
		    	    					lblQ11h1= new JLabel("and it will mark that area with a magenta fill. It will also place a box around the image with selection handles.");
		    	    					lblQ11h1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11h1.setBounds(50, 431, 1500, 32);
		    	    					rdbtnQ11hA = new JRadioButton("a. Format");
		    	    					rdbtnQ11hA.setBounds(50, 451, 250, 25);
		    	    					rdbtnQ11hA.setBackground(Color.WHITE);
		    	    					rdbtnQ11hB = new JRadioButton("b. Remove Background");
		    	    					rdbtnQ11hB.setBounds(300, 421, 250, 25);
		    	    					rdbtnQ11hB.setBackground(Color.WHITE);
		    	    					rdbtnQ11hC = new JRadioButton("c. Target output");
		    	    					rdbtnQ11hC.setBounds(550, 421, 250, 25);
		    	    					rdbtnQ11hC.setBackground(Color.WHITE);
		    	    					rdbtnQ11hD = new JRadioButton("d. Picture Effects");
		    	    					rdbtnQ11hD.setBounds(800, 421, 250, 25);
		    	    					rdbtnQ11hD.setBackground(Color.WHITE);
		    	    					bgQ11h = new ButtonGroup();
		    	    					bgQ11h.add(rdbtnQ11hA);
		    	    					bgQ11h.add(rdbtnQ11hB);
		    	    					bgQ11h.add(rdbtnQ11hC);
		    	    					bgQ11h.add(rdbtnQ11hD);
		    	    					lblQ11i= new JLabel("9.	To compress a picture: Choose a __________. If you are emailing your presentation, you may want to select Email, which produces the smallest file size.");
		    	    					lblQ11i.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11i.setBounds(50, 441, 1500, 32);
		    	    					rdbtnQ11iA = new JRadioButton("a. Format");
		    	    					rdbtnQ11iA.setBounds(50, 461, 250, 25);
		    	    					rdbtnQ11iA.setBackground(Color.WHITE);
		    	    					rdbtnQ11iB = new JRadioButton("b. Target output");
		    	    					rdbtnQ11iB.setBounds(300, 461, 250, 25);
		    	    					rdbtnQ11iB.setBackground(Color.WHITE);
		    	    					rdbtnQ11iC = new JRadioButton("c. Remove Background");
		    	    					rdbtnQ11iC.setBounds(550, 461, 250, 25);
		    	    					rdbtnQ11iC.setBackground(Color.WHITE);
		    	    					rdbtnQ11iD = new JRadioButton("d. Picture Effects");
		    	    					rdbtnQ11iD.setBounds(800, 461, 250, 25);
		    	    					rdbtnQ11iD.setBackground(Color.WHITE);
		    	    					bgQ11i = new ButtonGroup();
		    	    					bgQ11i.add(rdbtnQ11iA);
		    	    					bgQ11i.add(rdbtnQ11iB);
		    	    					bgQ11i.add(rdbtnQ11iC);
		    	    					bgQ11i.add(rdbtnQ11iD);
		    	    					lblQ11j= new JLabel("10. To apply a picture style: Select the picture. The Format tab will appear. Select the Format tab. Click the More drop-down arrow to display all picture styles.");
		    	    					lblQ11j.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11j.setBounds(50, 481, 1500, 32);
		    	    					lblQ11j1= new JLabel("Hover over a picture style to display a live preview of the style in the slide. Select the desired style. To refine the picture style, click the ____________ command to see the Effects drop-down menu.");
		    	    					lblQ11j1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		    	    					lblQ11j1.setBounds(50, 501, 1500, 32);
		    	    					rdbtnQ11jA = new JRadioButton("a. Format");
		    	    					rdbtnQ11jA.setBounds(50, 521, 250, 25);
		    	    					rdbtnQ11jA.setBackground(Color.WHITE);
		    	    					rdbtnQ11jB = new JRadioButton("b. Target output");
		    	    					rdbtnQ11jB.setBounds(300, 521, 250, 25);
		    	    					rdbtnQ11jB.setBackground(Color.WHITE);
		    	    					rdbtnQ11jC = new JRadioButton("c. Remove Background");
		    	    					rdbtnQ11jC.setBounds(550, 521, 250, 25);
		    	    					rdbtnQ11jC.setBackground(Color.WHITE);
		    	    					rdbtnQ11jD = new JRadioButton("d. Picture Effects");
		    	    					rdbtnQ11jD.setBounds(800, 521, 250, 25);
		    	    					rdbtnQ11jD.setBackground(Color.WHITE);
		    	    					bgQ11j = new ButtonGroup();
		    	    					bgQ11j.add(rdbtnQ11jA);
		    	    					bgQ11j.add(rdbtnQ11jB);
		    	    					bgQ11j.add(rdbtnQ11jC);
		    	    					bgQ11j.add(rdbtnQ11jD);
		    							bSubmit11 = new JButton("Submit");
		    	    					bSubmit11.setBounds(50, 616, 150, 25);
		    	    					bSubmit11.addActionListener(new ActionListener() {
		    								@Override
		    								public void actionPerformed(ActionEvent arg0) {
		    		        					if (rdbtnQ11aB.isSelected()) {
		    		        						score11a=1;
		    		        					}
		    		        					if (rdbtnQ11bB.isSelected()) {
		    		        						score11b=1;
		    		        					}
		    		        					if (rdbtnQ11cA.isSelected()) {
		    		        						score11c=1;
		    		        					}
		    		        					if (rdbtnQ11dA.isSelected()) {
		    		        						score11d=1;
		    		        					}
		    		        					if (rdbtnQ11eA.isSelected()) {
		    		        						score11e=1;
		    		        					}
		    		        					if (rdbtnQ11fC.isSelected()) {
		    		        						score11f=1;
		    		        					}
		    		        					if (rdbtnQ11gB.isSelected()) {
		    		        						score11g=1;
		    		        					}
		    		        					if (rdbtnQ11hC.isSelected()) {
		    		        						score11h=1;
		    		        					}
		    		        					if (rdbtnQ11iA.isSelected()) {
		    		        						score11i=1;
		    		        					}
		    		        					if (rdbtnQ11jD.isSelected()) {
		    		        						score11j=1;
		    		        					}
		    		        					lesson11g=score11a+score11b+score11c+score11d+score11e+score11f+score11g+score11h+score11i+score11j;
		    		        					JOptionPane.showMessageDialog(null, "Your score is "+lesson11g);
		    								}
		    	    					});
		    							panel2.add(lblAssess11);
		    							panel2.add(lblQ11a);
		    	    					panel2.add(rdbtnQ11aA);
		    	    					panel2.add(rdbtnQ11aB);
		    	    					panel2.add(rdbtnQ11aC);
		    	    					panel2.add(rdbtnQ11aD);
		    							panel2.add(lblQ11b1);
		    							panel2.add(lblQ11b2);
		    	    					panel2.add(rdbtnQ11bA);
		    	    					panel2.add(rdbtnQ11bB);
		    	    					panel2.add(rdbtnQ11bC);
		    	    					panel2.add(rdbtnQ11bD);
		    							panel2.add(lblQ11c1);
		    							panel2.add(lblQ11c2);
		    	    					panel2.add(rdbtnQ11cA);
		    	    					panel2.add(rdbtnQ11cB);
		    	    					panel2.add(rdbtnQ11cC);
		    	    					panel2.add(rdbtnQ11cD);
		    							panel2.add(lblQ11d);
		    	    					panel2.add(rdbtnQ11dA);
		    	    					panel2.add(rdbtnQ11dB);
		    	    					panel2.add(rdbtnQ11dC);
		    	    					panel2.add(rdbtnQ11dD);
		    							panel2.add(lblQ11e);
		    							panel2.add(lblQ11e1);
		    	    					panel2.add(rdbtnQ11eA);
		    	    					panel2.add(rdbtnQ11eB);
		    	    					panel2.add(rdbtnQ11eC);
		    	    					panel2.add(rdbtnQ11eD);
		    							panel2.add(lblQ11f);
		    							panel2.add(lblQ11f1);
		    	    					panel2.add(rdbtnQ11fA);
		    	    					panel2.add(rdbtnQ11fB);
		    	    					panel2.add(rdbtnQ11fC);
		    	    					panel2.add(rdbtnQ11fD);
		    							panel2.add(lblQ11g);
		    	    					panel2.add(rdbtnQ11gA);
		    	    					panel2.add(rdbtnQ11gB);
		    	    					panel2.add(rdbtnQ11gC);
		    	    					panel2.add(rdbtnQ11gD);
		    							panel2.add(lblQ11h);
		    							panel2.add(lblQ11h1);
		    	    					panel2.add(rdbtnQ11hA);
		    	    					panel2.add(rdbtnQ11hB);
		    	    					panel2.add(rdbtnQ11hC);
		    	    					panel2.add(rdbtnQ11hD);
		    							panel2.add(lblQ11i);
		    	    					panel2.add(rdbtnQ11iA);
		    	    					panel2.add(rdbtnQ11iB);
		    	    					panel2.add(rdbtnQ11iC);
		    	    					panel2.add(rdbtnQ11iD);
		    	    					panel2.add(lblQ11j);
		    							panel2.add(lblQ11j1);
		    	    					panel2.add(rdbtnQ11jA);
		    	    					panel2.add(rdbtnQ11jB);
		    	    					panel2.add(rdbtnQ11jC);
		    	    					panel2.add(rdbtnQ11jD);
		    	    					panel2.add(bSubmit11);
		    						}
		    					});
		    					panel2.add(lblLesson11);
		    					panel2.add(bOpenVid11);
		    					panel2.add(bOpenPpt11);
		    					panel2.add(bAssess11);
		    				} else if (node.equals("Lesson 12")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson12 = new JLabel("Lesson 12: ANIMATING TEXT AND OBJECTS");
		    					lblLesson12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson12.setBounds(50, 11, 500, 32);
		    					bOpenVid12 = new JButton("Play Video");
		    					bOpenVid12.setBounds(50, 500, 150, 100);
		    					bOpenVid12.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 16.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt12 = new JButton("Play Presentation");
		    					bOpenPpt12.setBounds(240, 500, 150, 100);
		    					bOpenPpt12.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("New Microsoft PowerPoint Presentation.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess12 = new JButton("Assessment Task");
		    					bAssess12.setBounds(430, 500, 150, 100);
		    					bAssess12.addActionListener(new ActionListener() {
		    						@Override
		    						public void actionPerformed(ActionEvent ae) {
		    							panel2.removeAll();
		    							panel2.repaint();
		    							lblAssess12 = new JLabel("Assessment Task #12: ANIMATING TEXT AND OBJECTS");
		    	    					lblAssess12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    	    					lblAssess12.setBounds(50, 11, 700, 32);
		    	    					lblQ12a= new JLabel("1.	In PowerPoint you can ______ text and objects such as clip art, shapes, and pictures.");
		    	    					lblQ12a.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12a.setBounds(50, 41, 1500, 32);
		    	    					rdbtnQ12aA = new JRadioButton("a. Design ");
		    	    					rdbtnQ12aA.setBounds(50, 71, 250, 25);
		    	    					rdbtnQ12aA.setBackground(Color.WHITE);
		    	    					rdbtnQ12aB = new JRadioButton("b. Move");
		    	    					rdbtnQ12aB.setBounds(300, 71, 250, 25);
		    	    					rdbtnQ12aB.setBackground(Color.WHITE);
		    	    					rdbtnQ12aC = new JRadioButton("c. Animate");
		    	    					rdbtnQ12aC.setBounds(550, 71, 250, 25);
		    	    					rdbtnQ12aC.setBackground(Color.WHITE);
		    	    					rdbtnQ12aD = new JRadioButton("d. Edit");
		    	    					rdbtnQ12aD.setBounds(800, 71, 250, 25);
		    	    					rdbtnQ12aD.setBackground(Color.WHITE);
		    	    					bgQ12a = new ButtonGroup();
		    	    					bgQ12a.add(rdbtnQ12aA);
		    	    					bgQ12a.add(rdbtnQ12aB);
		    	    					bgQ12a.add(rdbtnQ12aC);
		    	    					bgQ12a.add(rdbtnQ12aD);
		    	    					lblQ12b1= new JLabel("2. _________can be used to make text or objects appear on a slide, exit a slide, or emphasize the text or objects already on a slide.");
		    	    					lblQ12b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12b1.setBounds(50, 91, 1500, 32);
		    	    					rdbtnQ12bA = new JRadioButton("a. Design");
		    	    					rdbtnQ12bA.setBounds(50, 121, 250, 25);
		    	    					rdbtnQ12bA.setBackground(Color.WHITE);
		    	    					rdbtnQ12bB = new JRadioButton("b. Animations");
		    	    					rdbtnQ12bB.setBounds(300, 121, 250, 25);
		    	    					rdbtnQ12bB.setBackground(Color.WHITE);
		    	    					rdbtnQ12bC = new JRadioButton("c. Theme");
		    	    					rdbtnQ12bC.setBounds(550, 121, 250, 25);
		    	    					rdbtnQ12bC.setBackground(Color.WHITE);
		    	    					rdbtnQ12bD = new JRadioButton("d. None of the above");
		    	    					rdbtnQ12bD.setBounds(800, 121, 250, 25);
		    	    					rdbtnQ12bD.setBackground(Color.WHITE);
		    	    					bgQ12b = new ButtonGroup();
		    	    					bgQ12b.add(rdbtnQ12bA);
		    	    					bgQ12b.add(rdbtnQ12bB);
		    	    					bgQ12b.add(rdbtnQ12bC);
		    	    					bgQ12b.add(rdbtnQ12bD);
		    	    					lblQ12c1= new JLabel("3. _________ control how the object enters the slide. For example, with the Bounce animation, the object will drop onto the slide and then bounce");
		    	    					lblQ12c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12c1.setBounds(50, 141, 1500, 32);
		    	    					lblQ12c2= new JLabel(" several times.");
		    	    					lblQ12c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12c2.setBounds(50, 161, 1500, 32);
		    	    					rdbtnQ12cA = new JRadioButton("a. Entrance");
		    	    					rdbtnQ12cA.setBounds(50, 191, 250, 25);
		    	    					rdbtnQ12cA.setBackground(Color.WHITE);
		    	    					rdbtnQ12cB = new JRadioButton("b. Emphasis");
		    	    					rdbtnQ12cB.setBounds(300, 191, 250, 25);
		    	    					rdbtnQ12cB.setBackground(Color.WHITE);
		    	    					rdbtnQ12cC = new JRadioButton("c. Exit");
		    	    					rdbtnQ12cC.setBounds(550, 191, 250, 25);
		    	    					rdbtnQ12cC.setBackground(Color.WHITE);
		    	    					rdbtnQ12cD = new JRadioButton("d. Motion Paths");
		    	    					rdbtnQ12cD.setBounds(800, 191, 250, 25);
		    	    					rdbtnQ12cD.setBackground(Color.WHITE);
		    	    					bgQ12c = new ButtonGroup();
		    	    					bgQ12c.add(rdbtnQ12cA);
		    	    					bgQ12c.add(rdbtnQ12cB);
		    	    					bgQ12c.add(rdbtnQ12cC);
		    	    					bgQ12c.add(rdbtnQ12cD);
		    	    					lblQ12d = new JLabel("4. These control how the object exits the slide. For example, with the Fade animation, the object will simply fade away.");
		    	    					lblQ12d.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12d.setBounds(50, 211, 1500, 32);
		    	    					rdbtnQ12dA = new JRadioButton("a. Entrance");
		    	    					rdbtnQ12dA.setBounds(50, 241, 250, 25);
		    	    					rdbtnQ12dA.setBackground(Color.WHITE);
		    	    					rdbtnQ12dB = new JRadioButton("b. Emphasis");
		    	    					rdbtnQ12dB.setBounds(300, 241, 250, 25);
		    	    					rdbtnQ12dB.setBackground(Color.WHITE);
		    	    					rdbtnQ12dC = new JRadioButton("c. Exit");
		    	    					rdbtnQ12dC.setBounds(550, 241, 250, 25);
		    	    					rdbtnQ12dC.setBackground(Color.WHITE);
		    	    					rdbtnQ12dD = new JRadioButton("d. Motion Paths");
		    	    					rdbtnQ12dD.setBounds(800, 241, 250, 25);
		    	    					rdbtnQ12dD.setBackground(Color.WHITE);
		    	    					bgQ12d = new ButtonGroup();
		    	    					bgQ12d.add(rdbtnQ12dA);
		    	    					bgQ12d.add(rdbtnQ12dB);
		    	    					bgQ12d.add(rdbtnQ12dC);
		    	    					bgQ12d.add(rdbtnQ12dD);
		    	    					lblQ12e= new JLabel("5.	These animations occur while the object is on the slide and are often triggered by a mouse click. For example, you can set an object to Spin when you");
		    	    					lblQ12e.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12e.setBounds(50, 261, 1500, 32);
		    	    					lblQ12e1= new JLabel("click the mouse.");
		    	    					lblQ12e1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12e1.setBounds(50, 281, 1500, 32);
		    	    					rdbtnQ12eA = new JRadioButton("a. Entrance");
		    	    					rdbtnQ12eA.setBounds(50, 311, 250, 25);
		    	    					rdbtnQ12eA.setBackground(Color.WHITE);
		    	    					rdbtnQ12eB = new JRadioButton("b. Emphasis");
		    	    					rdbtnQ12eB.setBounds(300, 311, 250, 25);
		    	    					rdbtnQ12eB.setBackground(Color.WHITE);
		    	    					rdbtnQ12eC = new JRadioButton("c. Exit");
		    	    					rdbtnQ12eC.setBounds(550, 311, 250, 25);
		    	    					rdbtnQ12eC.setBackground(Color.WHITE);
		    	    					rdbtnQ12eD = new JRadioButton("d. Motion Paths");
		    	    					rdbtnQ12eD.setBounds(800, 311, 250, 25);
		    	    					rdbtnQ12eD.setBackground(Color.WHITE);
		    	    					bgQ12e = new ButtonGroup();
		    	    					bgQ12e.add(rdbtnQ12eA);
		    	    					bgQ12e.add(rdbtnQ12eB);
		    	    					bgQ12e.add(rdbtnQ12eC);
		    	    					bgQ12e.add(rdbtnQ12eD);
		    	    					lblQ12f= new JLabel("6.	These are similar to Emphasis effects, except the object moves within the slide along a predetermined path, like a circle.");
		    	    					lblQ12f.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12f.setBounds(50, 331, 1500, 32);
		    	    					rdbtnQ12fA = new JRadioButton("a. Entrance");
		    	    					rdbtnQ12fA.setBounds(50, 361, 250, 25);
		    	    					rdbtnQ12fA.setBackground(Color.WHITE);
		    	    					rdbtnQ12fB = new JRadioButton("b. Emphasis");
		    	    					rdbtnQ12fB.setBounds(300, 361, 250, 25);
		    	    					rdbtnQ12fB.setBackground(Color.WHITE);
		    	    					rdbtnQ12fC = new JRadioButton("c. Exit");
		    	    					rdbtnQ12fC.setBounds(550, 361, 250, 25);
		    	    					rdbtnQ12fC.setBackground(Color.WHITE);
		    	    					rdbtnQ12fD = new JRadioButton("d. Motion Paths");
		    	    					rdbtnQ12fD.setBounds(800, 361, 250, 25);
		    	    					rdbtnQ12fD.setBackground(Color.WHITE);
		    	    					bgQ12f = new ButtonGroup();
		    	    					bgQ12f.add(rdbtnQ12fA);
		    	    					bgQ12f.add(rdbtnQ12fB);
		    	    					bgQ12f.add(rdbtnQ12fC);
		    	    					bgQ12f.add(rdbtnQ12fD);
		    	    					lblQ12g= new JLabel("7.	To apply an animation to an object: Select an object you want. Click the __________ tab. In the Animation group, click the More drop-down arrow to view.");
		    	    					lblQ12g.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12g.setBounds(50, 381, 1500, 32);
		    	    					lblQ12g1= new JLabel("the available animations. Select the desired animation effect.");
		    	    					lblQ12g1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12g1.setBounds(50, 401, 1500, 32);
		    	    					rdbtnQ12gA = new JRadioButton("a. Animations");
		    	    					rdbtnQ12gA.setBounds(50, 431, 250, 25);
		    	    					rdbtnQ12gA.setBackground(Color.WHITE);
		    	    					rdbtnQ12gB = new JRadioButton("b. Insert");
		    	    					rdbtnQ12gB.setBounds(300, 431, 250, 25);
		    	    					rdbtnQ12gB.setBackground(Color.WHITE);
		    	    					rdbtnQ12gC = new JRadioButton("c. Design");
		    	    					rdbtnQ12gC.setBounds(550, 431, 250, 25);
		    	    					rdbtnQ12gC.setBackground(Color.WHITE);
		    	    					rdbtnQ12gD = new JRadioButton("d. Slide Show");
		    	    					rdbtnQ12gD.setBounds(800, 431, 250, 25);
		    	    					rdbtnQ12gD.setBackground(Color.WHITE);
		    	    					bgQ12g = new ButtonGroup();
		    	    					bgQ12g.add(rdbtnQ12gA);
		    	    					bgQ12g.add(rdbtnQ12gB);
		    	    					bgQ12g.add(rdbtnQ12gC);
		    	    					bgQ12g.add(rdbtnQ12gD);
		    	    					lblQ12h= new JLabel("8.	The ___________ allows you to view and manage all of the effects that are on the current slide.");
		    	    					lblQ12h.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12h.setBounds(50, 461, 1500, 32);
		    	    					rdbtnQ12hA = new JRadioButton("a. Animation Pane");
		    	    					rdbtnQ12hA.setBounds(50, 491, 250, 25);
		    	    					rdbtnQ12hA.setBackground(Color.WHITE);
		    	    					rdbtnQ12hB = new JRadioButton("b. Advanced Animation");
		    	    					rdbtnQ12hB.setBounds(300, 491, 250, 25);
		    	    					rdbtnQ12hB.setBackground(Color.WHITE);
		    	    					rdbtnQ12hC = new JRadioButton("c. Animation Painter");
		    	    					rdbtnQ12hC.setBounds(550, 491, 250, 25);
		    	    					rdbtnQ12hC.setBackground(Color.WHITE);
		    	    					rdbtnQ12hD = new JRadioButton("d. Advanced Designing");
		    	    					rdbtnQ12hD.setBounds(800, 491, 250, 25);
		    	    					rdbtnQ12hD.setBackground(Color.WHITE);
		    	    					bgQ12h = new ButtonGroup();
		    	    					bgQ12h.add(rdbtnQ12hA);
		    	    					bgQ12h.add(rdbtnQ12hB);
		    	    					bgQ12h.add(rdbtnQ12hC);
		    	    					bgQ12h.add(rdbtnQ12hD);
		    	    					lblQ12i= new JLabel("9.	______________ will start the effect when the mouse is clicked.");
		    	    					lblQ12i.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12i.setBounds(50, 521, 1500, 32);
		    	    					rdbtnQ12iA = new JRadioButton("a. Start on Click");
		    	    					rdbtnQ12iA.setBounds(50, 551, 250, 25);
		    	    					rdbtnQ12iA.setBackground(Color.WHITE);
		    	    					rdbtnQ12iB = new JRadioButton("b. Start With Previous");
		    	    					rdbtnQ12iB.setBounds(300, 551, 250, 25);
		    	    					rdbtnQ12iB.setBackground(Color.WHITE);
		    	    					rdbtnQ12iC = new JRadioButton("c. Start After Previous");
		    	    					rdbtnQ12iC.setBounds(550, 551, 250, 25);
		    	    					rdbtnQ12iC.setBackground(Color.WHITE);
		    	    					rdbtnQ12iD = new JRadioButton("d. After animation");
		    	    					rdbtnQ12iD.setBounds(800, 551, 250, 25);
		    	    					rdbtnQ12iD.setBackground(Color.WHITE);
		    	    					bgQ12i = new ButtonGroup();
		    	    					bgQ12i.add(rdbtnQ12iA);
		    	    					bgQ12i.add(rdbtnQ12iB);
		    	    					bgQ12i.add(rdbtnQ12iC);
		    	    					bgQ12i.add(rdbtnQ12iD);
		    	    					lblQ12j= new JLabel("10. What have you learned in this lesson?");
		    	    					lblQ12j.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ12j.setBounds(50, 571, 1500, 32);
		    	    					rdbtnQ12jA = new JRadioButton("a. Adding animation effects");
		    	    					rdbtnQ12jA.setBounds(50, 601, 250, 25);
		    	    					rdbtnQ12jA.setBackground(Color.WHITE);
		    	    					rdbtnQ12jB = new JRadioButton("b. Designing");
		    	    					rdbtnQ12jB.setBounds(300, 601, 250, 25);
		    	    					rdbtnQ12jB.setBackground(Color.WHITE);
		    	    					rdbtnQ12jC = new JRadioButton("c. Creating Tables");
		    	    					rdbtnQ12jC.setBounds(550, 601, 250, 25);
		    	    					rdbtnQ12jC.setBackground(Color.WHITE);
		    	    					rdbtnQ12jD = new JRadioButton("d. Adding Photos");
		    	    					rdbtnQ12jD.setBounds(800, 601, 250, 25);
		    	    					rdbtnQ12jD.setBackground(Color.WHITE);
		    	    					bgQ12j = new ButtonGroup();
		    	    					bgQ12j.add(rdbtnQ12jA);
		    	    					bgQ12j.add(rdbtnQ12jB);
		    	    					bgQ12j.add(rdbtnQ12jC);
		    	    					bgQ12j.add(rdbtnQ12jD);
		    							bSubmit12 = new JButton("Submit");
		    	    					bSubmit12.setBounds(50, 630, 150, 25);
		    	    					bSubmit12.addActionListener(new ActionListener() {
		    								@Override
		    								public void actionPerformed(ActionEvent arg0) {
		    		        					if (rdbtnQ12aB.isSelected()) {
		    		        						score12a=1;
		    		        					}
		    		        					if (rdbtnQ12bB.isSelected()) {
		    		        						score12b=1;
		    		        					}
		    		        					if (rdbtnQ12cA.isSelected()) {
		    		        						score12c=1;
		    		        					}
		    		        					if (rdbtnQ12dA.isSelected()) {
		    		        						score12d=1;
		    		        					}
		    		        					if (rdbtnQ12eA.isSelected()) {
		    		        						score12e=1;
		    		        					}
		    		        					if (rdbtnQ12fC.isSelected()) {
		    		        						score12f=1;
		    		        					}
		    		        					if (rdbtnQ12gB.isSelected()) {
		    		        						score12g=1;
		    		        					}
		    		        					if (rdbtnQ12hC.isSelected()) {
		    		        						score12h=1;
		    		        					}
		    		        					if (rdbtnQ12iA.isSelected()) {
		    		        						score12i=1;
		    		        					}
		    		        					if (rdbtnQ12jD.isSelected()) {
		    		        						score12j=1;
		    		        					}
		    		        					lesson12g=score12a+score12b+score12c+score12d+score12e+score12f+score12g+score12h+score12i+score12j;
		    		        					JOptionPane.showMessageDialog(null, "Your score is "+lesson12g);
		    								}
		    	    					});
		    							panel2.add(lblAssess12);
		    							panel2.add(lblQ12a);
		    	    					panel2.add(rdbtnQ12aA);
		    	    					panel2.add(rdbtnQ12aB);
		    	    					panel2.add(rdbtnQ12aC);
		    	    					panel2.add(rdbtnQ12aD);
		    							panel2.add(lblQ12b1);
		    	    					panel2.add(rdbtnQ12bA);
		    	    					panel2.add(rdbtnQ12bB);
		    	    					panel2.add(rdbtnQ12bC);
		    	    					panel2.add(rdbtnQ12bD);
		    							panel2.add(lblQ12c1);
		    							panel2.add(lblQ12c2);
		    	    					panel2.add(rdbtnQ12cA);
		    	    					panel2.add(rdbtnQ12cB);
		    	    					panel2.add(rdbtnQ12cC);
		    	    					panel2.add(rdbtnQ12cD);
		    							panel2.add(lblQ12d);
		    	    					panel2.add(rdbtnQ12dA);
		    	    					panel2.add(rdbtnQ12dB);
		    	    					panel2.add(rdbtnQ12dC);
		    	    					panel2.add(rdbtnQ12dD);
		    							panel2.add(lblQ12e);
		    							panel2.add(lblQ12e1);
		    	    					panel2.add(rdbtnQ12eA);
		    	    					panel2.add(rdbtnQ12eB);
		    	    					panel2.add(rdbtnQ12eC);
		    	    					panel2.add(rdbtnQ12eD);
		    							panel2.add(lblQ12f);
		    	    					panel2.add(rdbtnQ12fA);
		    	    					panel2.add(rdbtnQ12fB);
		    	    					panel2.add(rdbtnQ12fC);
		    	    					panel2.add(rdbtnQ12fD);
		    							panel2.add(lblQ12g);
		    							panel2.add(lblQ12g1);
		    	    					panel2.add(rdbtnQ12gA);
		    	    					panel2.add(rdbtnQ12gB);
		    	    					panel2.add(rdbtnQ12gC);
		    	    					panel2.add(rdbtnQ12gD);
		    							panel2.add(lblQ12h);
		    	    					panel2.add(rdbtnQ12hA);
		    	    					panel2.add(rdbtnQ12hB);
		    	    					panel2.add(rdbtnQ12hC);
		    	    					panel2.add(rdbtnQ12hD);
		    							panel2.add(lblQ12i);
		    	    					panel2.add(rdbtnQ12iA);
		    	    					panel2.add(rdbtnQ12iB);
		    	    					panel2.add(rdbtnQ12iC);
		    	    					panel2.add(rdbtnQ12iD);
		    							panel2.add(lblQ12j);
		    	    					panel2.add(rdbtnQ12jA);
		    	    					panel2.add(rdbtnQ12jB);
		    	    					panel2.add(rdbtnQ12jC);
		    	    					panel2.add(rdbtnQ12jD);
		    	    					panel2.add(bSubmit12);
		    						}
		    					});
		    					panel2.add(lblLesson12);
		    					panel2.add(bOpenVid12);
		    					panel2.add(bOpenPpt12);
		    					panel2.add(bAssess12);
		    				} else if (node.equals("Lesson 13")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson13 = new JLabel("Lesson 13: HYPERLINKS AND ACTION BUTTONS");
		    					lblLesson13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson13.setBounds(50, 11, 500, 32);
		    					bOpenVid13 = new JButton("Play Video");
		    					bOpenVid13.setBounds(50, 500, 150, 100);
		    					bOpenVid13.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("Lesson 20.wmv");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt13 = new JButton("Play Presentation");
		    					bOpenPpt13.setBounds(240, 500, 150, 100);
		    					bOpenPpt13.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("20.) Hyperlinks and Action Buttons.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess13 = new JButton("Assessment Task");
		    					bAssess13.setBounds(430, 500, 150, 100);
		    					bAssess13.addActionListener(new ActionListener() {
		    						@Override
		    						public void actionPerformed(ActionEvent ae) {
		    							panel2.removeAll();
		    							panel2.repaint();
		    							lblAssess13 = new JLabel("Assessment Task #13: HYPERLINKS AND ACTION BUTTONS");
		    	    					lblAssess13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    	    					lblAssess13.setBounds(50, 11, 700, 32);
		    	    					lblQ13a= new JLabel("1.	Adding ________ to your presentation can help readers quickly access contact information or information from the Internet. ");
		    	    					lblQ13a.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13a.setBounds(50, 41, 1500, 32);
		    	    					rdbtnQ13aA = new JRadioButton("a. Table ");
		    	    					rdbtnQ13aA.setBounds(50, 71, 250, 25);
		    	    					rdbtnQ13aA.setBackground(Color.WHITE);
		    	    					rdbtnQ13aB = new JRadioButton("b. Video");
		    	    					rdbtnQ13aB.setBounds(300, 71, 250, 25);
		    	    					rdbtnQ13aB.setBackground(Color.WHITE);
		    	    					rdbtnQ13aC = new JRadioButton("c. Picture");
		    	    					rdbtnQ13aC.setBounds(550, 71, 250, 25);
		    	    					rdbtnQ13aC.setBackground(Color.WHITE);
		    	    					rdbtnQ13aD = new JRadioButton("d. Hyperlinks");
		    	    					rdbtnQ13aD.setBounds(800, 71, 250, 25);
		    	    					rdbtnQ13aD.setBackground(Color.WHITE);
		    	    					bgQ13a = new ButtonGroup();
		    	    					bgQ13a.add(rdbtnQ13aA);
		    	    					bgQ13a.add(rdbtnQ13aB);
		    	    					bgQ13a.add(rdbtnQ13aC);
		    	    					bgQ13a.add(rdbtnQ13aD);
		    	    					lblQ13b1= new JLabel("2. What are the 2 basic parts of Hyperlinks?");
		    	    					lblQ13b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13b1.setBounds(50, 91, 1500, 32);
		    	    					rdbtnQ13bA = new JRadioButton("a. Address & Display Text");
		    	    					rdbtnQ13bA.setBounds(50, 121, 250, 25);
		    	    					rdbtnQ13bA.setBackground(Color.WHITE);
		    	    					rdbtnQ13bB = new JRadioButton("b. Theme & Display text");
		    	    					rdbtnQ13bB.setBounds(300, 121, 250, 25);
		    	    					rdbtnQ13bB.setBackground(Color.WHITE);
		    	    					rdbtnQ13bC = new JRadioButton("c. Address & links");
		    	    					rdbtnQ13bC.setBounds(550, 121, 250, 25);
		    	    					rdbtnQ13bC.setBackground(Color.WHITE);
		    	    					rdbtnQ13bD = new JRadioButton("d. Theme & links");
		    	    					rdbtnQ13bD.setBounds(800, 121, 250, 25);
		    	    					rdbtnQ13bD.setBackground(Color.WHITE);
		    	    					bgQ13b = new ButtonGroup();
		    	    					bgQ13b.add(rdbtnQ13bA);
		    	    					bgQ13b.add(rdbtnQ13bB);
		    	    					bgQ13b.add(rdbtnQ13bC);
		    	    					bgQ13b.add(rdbtnQ13bD);
		    	    					lblQ13c1= new JLabel("3. To edit, move, or delete an action button inserted this way, click the _____ tab, then Slide Master. Click Close Master View after making the desired changes.");
		    	    					lblQ13c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13c1.setBounds(50, 141, 1500, 32);
		    	    					rdbtnQ13cA = new JRadioButton("a. Design");
		    	    					rdbtnQ13cA.setBounds(50, 171, 250, 25);
		    	    					rdbtnQ13cA.setBackground(Color.WHITE);
		    	    					rdbtnQ13cB = new JRadioButton("b. Review");
		    	    					rdbtnQ13cB.setBounds(300, 171, 250, 25);
		    	    					rdbtnQ13cB.setBackground(Color.WHITE);
		    	    					rdbtnQ13cC = new JRadioButton("c. View");
		    	    					rdbtnQ13cC.setBounds(550, 171, 250, 25);
		    	    					rdbtnQ13cC.setBackground(Color.WHITE);
		    	    					rdbtnQ13cD = new JRadioButton("d. Slide Master");
		    	    					rdbtnQ13cD.setBounds(800, 171, 250, 25);
		    	    					rdbtnQ13cD.setBackground(Color.WHITE);
		    	    					bgQ13c = new ButtonGroup();
		    	    					bgQ13c.add(rdbtnQ13cA);
		    	    					bgQ13c.add(rdbtnQ13cB);
		    	    					bgQ13c.add(rdbtnQ13cC);
		    	    					bgQ13c.add(rdbtnQ13cD);
		    	    					lblQ13d = new JLabel("4. To test an action button: Click the Slide Show tab In the Start Slide Show group, click ______________. Click your action button.");
		    	    					lblQ13d.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13d.setBounds(50, 191, 1500, 32);
		    	    					rdbtnQ13dA = new JRadioButton("a. From Current Slide");
		    	    					rdbtnQ13dA.setBounds(50, 211, 250, 25);
		    	    					rdbtnQ13dA.setBackground(Color.WHITE);
		    	    					rdbtnQ13dB = new JRadioButton("b. From the Beginning");
		    	    					rdbtnQ13dB.setBounds(300, 211, 250, 25);
		    	    					rdbtnQ13dB.setBackground(Color.WHITE);
		    	    					rdbtnQ13dC = new JRadioButton("c. Broadcast Slide Show");
		    	    					rdbtnQ13dC.setBounds(550, 211, 250, 25);
		    	    					rdbtnQ13dC.setBackground(Color.WHITE);
		    	    					rdbtnQ13dD = new JRadioButton("d. Custom Slide Show");
		    	    					rdbtnQ13dD.setBounds(800, 211, 250, 25);
		    	    					rdbtnQ13dD.setBackground(Color.WHITE);
		    	    					bgQ13d = new ButtonGroup();
		    	    					bgQ13d.add(rdbtnQ13dA);
		    	    					bgQ13d.add(rdbtnQ13dB);
		    	    					bgQ13d.add(rdbtnQ13dC);
		    	    					bgQ13d.add(rdbtnQ13dD);
		    	    					lblQ13e= new JLabel("5.	To edit an action button: Select the action button. Click the Insert tab. In the Links group, click the ________ command. The Actions Settings dialog.");
		    	    					lblQ13e.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13e.setBounds(50, 231, 1500, 32);
		    	    					lblQ13e1= new JLabel("box will appear.");
		    	    					lblQ13e1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13e1.setBounds(50, 251, 1500, 32);
		    	    					rdbtnQ13eA = new JRadioButton("a. Hyperlinks");
		    	    					rdbtnQ13eA.setBounds(50, 281, 250, 25);
		    	    					rdbtnQ13eA.setBackground(Color.WHITE);
		    	    					rdbtnQ13eB = new JRadioButton("b. Action");
		    	    					rdbtnQ13eB.setBounds(300, 281, 250, 25);
		    	    					rdbtnQ13eB.setBackground(Color.WHITE);
		    	    					rdbtnQ13eC = new JRadioButton("c. Text Box");
		    	    					rdbtnQ13eC.setBounds(550, 281, 250, 25);
		    	    					rdbtnQ13eC.setBackground(Color.WHITE);
		    	    					rdbtnQ13eD = new JRadioButton("d. None of the above");
		    	    					rdbtnQ13eD.setBounds(800, 281, 250, 25);
		    	    					rdbtnQ13eD.setBackground(Color.WHITE);
		    	    					bgQ13e = new ButtonGroup();
		    	    					bgQ13e.add(rdbtnQ13eA);
		    	    					bgQ13e.add(rdbtnQ13eB);
		    	    					bgQ13e.add(rdbtnQ13eC);
		    	    					bgQ13e.add(rdbtnQ13eD);
		    	    					lblQ13f= new JLabel("6.	_________are built-in button shapes you can add to a presentation and set to link to another slide, play a sound, or perform another action.");
		    	    					lblQ13f.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13f.setBounds(50, 301, 1500, 32);
		    	    					rdbtnQ13fA = new JRadioButton("a. Hyperlinks");
		    	    					rdbtnQ13fA.setBounds(50, 321, 250, 25);
		    	    					rdbtnQ13fA.setBackground(Color.WHITE);
		    	    					rdbtnQ13fB = new JRadioButton("b. Action Button");
		    	    					rdbtnQ13fB.setBounds(300, 321, 250, 25);
		    	    					rdbtnQ13fB.setBackground(Color.WHITE);
		    	    					rdbtnQ13fC = new JRadioButton("c. Text box");
		    	    					rdbtnQ13fC.setBounds(550, 321, 250, 25);
		    	    					rdbtnQ13fC.setBackground(Color.WHITE);
		    	    					rdbtnQ13fD = new JRadioButton("d. None of the above");
		    	    					rdbtnQ13fD.setBounds(800, 321, 250, 25);
		    	    					rdbtnQ13fD.setBackground(Color.WHITE);
		    	    					bgQ13f = new ButtonGroup();
		    	    					bgQ13f.add(rdbtnQ13fA);
		    	    					bgQ13f.add(rdbtnQ13fB);
		    	    					bgQ13f.add(rdbtnQ13fC);
		    	    					bgQ13f.add(rdbtnQ13fD);
		    	    					lblQ13g= new JLabel("7.	To insert a hyperlink to an email address: Right-click the selected text or image, then click __________. The Insert Hyperlink dialog box will open.");
		    	    					lblQ13g.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13g.setBounds(50, 341, 1500, 32);
		    	    					lblQ13g1= new JLabel("On the left side of the dialog box, click Email Address. Type the email address you want to connect to in the Email Address box, then click OK.");
		    	    					lblQ13g1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13g1.setBounds(50, 371, 1500, 32);
		    	    					rdbtnQ13gA = new JRadioButton("a. Action");
		    	    					rdbtnQ13gA.setBounds(50, 371, 250, 25);
		    	    					rdbtnQ13gA.setBackground(Color.WHITE);
		    	    					rdbtnQ13gB = new JRadioButton("b. Hyperlink");
		    	    					rdbtnQ13gB.setBounds(300, 371, 250, 25);
		    	    					rdbtnQ13gB.setBackground(Color.WHITE);
		    	    					rdbtnQ13gC = new JRadioButton("c. Slide");
		    	    					rdbtnQ13gC.setBounds(550, 371, 250, 25);
		    	    					rdbtnQ13gC.setBackground(Color.WHITE);
		    	    					rdbtnQ13gD = new JRadioButton("d. Button");
		    	    					rdbtnQ13gD.setBounds(800, 371, 250, 25);
		    	    					rdbtnQ13gD.setBackground(Color.WHITE);
		    	    					bgQ13g = new ButtonGroup();
		    	    					bgQ13g.add(rdbtnQ13gA);
		    	    					bgQ13g.add(rdbtnQ13gB);
		    	    					bgQ13g.add(rdbtnQ13gC);
		    	    					bgQ13g.add(rdbtnQ13gD);
		    	    					lblQ13h= new JLabel("8.	To insert a hyperlink to another file: Right-click the selected text or image, then click Hyperlink. The Insert Hyperlink dialog box will open. On the left side of the dialog");
		    	    					lblQ13h.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13h.setBounds(50, 391, 1500, 32);
		    	    					lblQ13h1= new JLabel("box, click ________________. Click the drop-down arrow to browse for your file. Click OK. The text or image will now be a hyperlink to the file you selected.");
		    	    					lblQ13h1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    	    			lblQ13h1.setBounds(50, 411, 1500, 32);
		    	    					rdbtnQ13hA = new JRadioButton("a. Existing File or Web Page");
		    	    					rdbtnQ13hA.setBounds(50, 441, 250, 25);
		    	    					rdbtnQ13hA.setBackground(Color.WHITE);
		    	    					rdbtnQ13hB = new JRadioButton("b. Email Address box");
		    	    					rdbtnQ13hB.setBounds(300, 441, 250, 25);
		    	    					rdbtnQ13hB.setBackground(Color.WHITE);
		    	    					rdbtnQ13hC = new JRadioButton("c. Create new Document");
		    	    					rdbtnQ13hC.setBounds(550, 441, 250, 25);
		    	    					rdbtnQ13hC.setBackground(Color.WHITE);
		    	    					rdbtnQ13hD = new JRadioButton("d. Place in the Document");
		    	    					rdbtnQ13hD.setBounds(800, 441, 250, 25);
		    	    					rdbtnQ13hD.setBackground(Color.WHITE);
		    	    					bgQ13h = new ButtonGroup();
		    	    					bgQ13h.add(rdbtnQ13hA);
		    	    					bgQ13h.add(rdbtnQ13hB);
		    	    					bgQ13h.add(rdbtnQ13hC);
		    	    					bgQ13h.add(rdbtnQ13hD);
		    	    					lblQ13i= new JLabel("9.	To insert a hyperlink to another slide: Right-click the selected text or image, then click Hyperlink. The Insert Hyperlink dialog box will open. On the left side of the dialog box,");
		    	    					lblQ13i.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13i.setBounds(50, 461, 1500, 32);
		    	    					lblQ13i= new JLabel("click ______________________.");
		    	    					lblQ13i.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13i.setBounds(50, 481, 1500, 32);
		    	    					rdbtnQ13iA = new JRadioButton("a. Existing File or Web Page");
		    	    					rdbtnQ13iA.setBounds(50, 511, 250, 25);
		    	    					rdbtnQ13iA.setBackground(Color.WHITE);
		    	    					rdbtnQ13iB = new JRadioButton("b. Email Address box");
		    	    					rdbtnQ13iB.setBounds(300, 511, 250, 25);
		    	    					rdbtnQ13iB.setBackground(Color.WHITE);
		    	    					rdbtnQ13iC = new JRadioButton("c. Create new Document");
		    	    					rdbtnQ13iC.setBounds(550, 511, 250, 25);
		    	    					rdbtnQ13iC.setBackground(Color.WHITE);
		    	    					rdbtnQ13iD = new JRadioButton("d. Place in this Document");
		    	    					rdbtnQ13iD.setBounds(800, 511, 250, 25);
		    	    					rdbtnQ13iD.setBackground(Color.WHITE);
		    	    					bgQ13i = new ButtonGroup();
		    	    					bgQ13i.add(rdbtnQ13iA);
		    	    					bgQ13i.add(rdbtnQ13iB);
		    	    					bgQ13i.add(rdbtnQ13iC);
		    	    					bgQ13i.add(rdbtnQ13iD);
		    	    					lblQ13j= new JLabel("10. What have you learned in this lesson?");
		    	    					lblQ13j.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ13j.setBounds(50, 531, 1500, 32);
		    	    					rdbtnQ13jA = new JRadioButton("a. Inserting Hyperlink");
		    	    					rdbtnQ13jA.setBounds(50, 561, 250, 25);
		    	    					rdbtnQ13jA.setBackground(Color.WHITE);
		    	    					rdbtnQ13jB = new JRadioButton("b. Inserting Table");
		    	    					rdbtnQ13jB.setBounds(300, 561, 250, 25);
		    	    					rdbtnQ13jB.setBackground(Color.WHITE);
		    	    					rdbtnQ13jC = new JRadioButton("c. Inserting Chart");
		    	    					rdbtnQ13jC.setBounds(550, 561, 250, 25);
		    	    					rdbtnQ13jC.setBackground(Color.WHITE);
		    	    					rdbtnQ13jD = new JRadioButton("d. None of the above");
		    	    					rdbtnQ13jD.setBounds(800, 561, 250, 25);
		    	    					rdbtnQ13jD.setBackground(Color.WHITE);
		    	    					bgQ13j = new ButtonGroup();
		    	    					bgQ13j.add(rdbtnQ13jA);
		    	    					bgQ13j.add(rdbtnQ13jB);
		    	    					bgQ13j.add(rdbtnQ13jC);
		    	    					bgQ13j.add(rdbtnQ13jD);
		    							bSubmit13 = new JButton("Submit");
		    	    					bSubmit13.setBounds(50, 616, 150, 25);
		    	    					bSubmit13.addActionListener(new ActionListener() {
		    								@Override
		    								public void actionPerformed(ActionEvent arg0) {
		    		        					if (rdbtnQ13aB.isSelected()) {
		    		        						score13a=1;
		    		        					}
		    		        					if (rdbtnQ13bB.isSelected()) {
		    		        						score13b=1;
		    		        					}
		    		        					if (rdbtnQ13cA.isSelected()) {
		    		        						score13c=1;
		    		        					}
		    		        					if (rdbtnQ13dA.isSelected()) {
		    		        						score13d=1;
		    		        					}
		    		        					if (rdbtnQ13eA.isSelected()) {
		    		        						score13e=1;
		    		        					}
		    		        					if (rdbtnQ13fC.isSelected()) {
		    		        						score13f=1;
		    		        					}
		    		        					if (rdbtnQ13gB.isSelected()) {
		    		        						score13g=1;
		    		        					}
		    		        					if (rdbtnQ13hC.isSelected()) {
		    		        						score13h=1;
		    		        					}
		    		        					if (rdbtnQ13iA.isSelected()) {
		    		        						score13i=1;
		    		        					}
		    		        					if (rdbtnQ13jD.isSelected()) {
		    		        						score13j=1;
		    		        					}
		    		        					lesson13g=score13a+score13b+score13c+score13d+score13e+score13f+score13g+score13h+score13i+score13j;
		    		        					JOptionPane.showMessageDialog(null, "Your score is "+lesson13g);
		    								}
		    	    					});
		    							panel2.add(lblAssess13);
		    							panel2.add(lblQ13a);
		    	    					panel2.add(rdbtnQ13aA);
		    	    					panel2.add(rdbtnQ13aB);
		    	    					panel2.add(rdbtnQ13aC);
		    	    					panel2.add(rdbtnQ13aD);
		    							panel2.add(lblQ13b1);
		    	    					panel2.add(rdbtnQ13bA);
		    	    					panel2.add(rdbtnQ13bB);
		    	    					panel2.add(rdbtnQ13bC);
		    	    					panel2.add(rdbtnQ13bD);
		    							panel2.add(lblQ13c1);
		    	    					panel2.add(rdbtnQ13cA);
		    	    					panel2.add(rdbtnQ13cB);
		    	    					panel2.add(rdbtnQ13cC);
		    	    					panel2.add(rdbtnQ13cD);
		    							panel2.add(lblQ13d);
		    	    					panel2.add(rdbtnQ13dA);
		    	    					panel2.add(rdbtnQ13dB);
		    	    					panel2.add(rdbtnQ13dC);
		    	    					panel2.add(rdbtnQ13dD);
		    							panel2.add(lblQ13e);
		    							panel2.add(lblQ13e1);
		    	    					panel2.add(rdbtnQ13eA);
		    	    					panel2.add(rdbtnQ13eB);
		    	    					panel2.add(rdbtnQ13eC);
		    	    					panel2.add(rdbtnQ13eD);
		    							panel2.add(lblQ13f);
		    	    					panel2.add(rdbtnQ13fA);
		    	    					panel2.add(rdbtnQ13fB);
		    	    					panel2.add(rdbtnQ13fC);
		    	    					panel2.add(rdbtnQ13fD);
		    							panel2.add(lblQ13g);
		    							panel2.add(lblQ13g1);
		    	    					panel2.add(rdbtnQ13gA);
		    	    					panel2.add(rdbtnQ13gB);
		    	    					panel2.add(rdbtnQ13gC);
		    	    					panel2.add(rdbtnQ13gD);
		    							panel2.add(lblQ13h);
		    							panel2.add(lblQ13h1);
		    	    					panel2.add(rdbtnQ13hA);
		    	    					panel2.add(rdbtnQ13hB);
		    	    					panel2.add(rdbtnQ13hC);
		    	    					panel2.add(rdbtnQ13hD);
		    							panel2.add(lblQ13i);
		    	    					panel2.add(rdbtnQ13iA);
		    	    					panel2.add(rdbtnQ13iB);
		    	    					panel2.add(rdbtnQ13iC);
		    	    					panel2.add(rdbtnQ13iD);
		    							panel2.add(lblQ13j);
		    	    					panel2.add(rdbtnQ13jA);
		    	    					panel2.add(rdbtnQ13jB);
		    	    					panel2.add(rdbtnQ13jC);
		    	    					panel2.add(rdbtnQ13jD);
		    	    					panel2.add(bSubmit13);
		    						}
		    					});
		    					panel2.add(lblLesson13);
		    					panel2.add(bOpenVid13);
		    					panel2.add(bOpenPpt13);
		    					panel2.add(bAssess13);
		    				} else if (node.equals("Lesson 14")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson14 = new JLabel("Lesson 14: WORKING WITH TABLES");
		    					lblLesson14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson14.setBounds(50, 11, 500, 32);
		    					bOpenVid14 = new JButton("Play Video");
		    					bOpenVid14.setBounds(50, 500, 150, 100);
		    					bOpenVid14.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("New Microsoft PowerPoint Presentation.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt14 = new JButton("Play Presentation");
		    					bOpenPpt14.setBounds(240, 500, 150, 100);
		    					bOpenPpt14.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("New Microsoft PowerPoint Presentation.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess14 = new JButton("Assessment Task");
		    					bAssess14.setBounds(430, 500, 150, 100);
		    					bAssess14.addActionListener(new ActionListener() {
		    						@Override
		    						public void actionPerformed(ActionEvent ae) {
		    							panel2.removeAll();
		    							panel2.repaint();
		    							lblAssess14 = new JLabel("Assessment Task #14: WORKING WITH TABLES");
		    	    					lblAssess14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    	    					lblAssess14.setBounds(50, 11, 700, 32);
		    	    					lblQ14a= new JLabel("1.	A _________ is a grid of cells arranged in rows and columns.");
		    	    					lblQ14a.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14a.setBounds(50, 41, 1500, 32);
		    	    					rdbtnQ14aA = new JRadioButton("a. Table");
		    	    					rdbtnQ14aA.setBounds(50, 71, 250, 25);
		    	    					rdbtnQ14aA.setBackground(Color.WHITE);
		    	    					rdbtnQ14aB = new JRadioButton("b. Chart");
		    	    					rdbtnQ14aB.setBounds(300, 71, 250, 25);
		    	    					rdbtnQ14aB.setBackground(Color.WHITE);
		    	    					rdbtnQ14aC = new JRadioButton("c. Theme");
		    	    					rdbtnQ14aC.setBounds(550, 71, 250, 25);
		    	    					rdbtnQ14aC.setBackground(Color.WHITE);
		    	    					rdbtnQ14aD = new JRadioButton("d. Picture");
		    	    					rdbtnQ14aD.setBounds(800, 71, 250, 25);
		    	    					rdbtnQ14aD.setBackground(Color.WHITE);
		    	    					bgQ14a = new ButtonGroup();
		    	    					bgQ14a.add(rdbtnQ14aA);
		    	    					bgQ14a.add(rdbtnQ14aB);
		    	    					bgQ14a.add(rdbtnQ14aC);
		    	    					bgQ14a.add(rdbtnQ14aD);
		    	    					lblQ14b1= new JLabel("2. To insert a blank table: On the ______ tab, click the Table command. Hover your mouse over the diagram squares to select the number of");
		    	    					lblQ14b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14b1.setBounds(50, 91, 1500, 32);
		    	    					lblQ14b2= new JLabel("columns and rows in the table. Click your mouse. The table will appear on the slide.");
		    	    					lblQ14b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14b2.setBounds(50, 111, 1500, 32);
		    	    					rdbtnQ14bA = new JRadioButton("a. Insert");
		    	    					rdbtnQ14bA.setBounds(50, 141, 250, 25);
		    	    					rdbtnQ14bA.setBackground(Color.WHITE);
		    	    					rdbtnQ14bB = new JRadioButton("b. Home");
		    	    					rdbtnQ14bB.setBounds(300, 141, 250, 25);
		    	    					rdbtnQ14bB.setBackground(Color.WHITE);
		    	    					rdbtnQ14bC = new JRadioButton("c. Design");
		    	    					rdbtnQ14bC.setBounds(550, 141, 250, 25);
		    	    					rdbtnQ14bC.setBackground(Color.WHITE);
		    	    					rdbtnQ14bD = new JRadioButton("d. Slide");
		    	    					rdbtnQ14bD.setBounds(800, 141, 250, 25);
		    	    					rdbtnQ14bD.setBackground(Color.WHITE);
		    	    					bgQ14b = new ButtonGroup();
		    	    					bgQ14b.add(rdbtnQ14bA);
		    	    					bgQ14b.add(rdbtnQ14bB);
		    	    					bgQ14b.add(rdbtnQ14bC);
		    	    					bgQ14b.add(rdbtnQ14bD);
		    	    					lblQ14c1= new JLabel("3. To make sure your table looks good with the slide layout, you can also insert a table using the placeholder. Click the _________ icon in");
		    	    					lblQ14c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14c1.setBounds(50, 161, 1500, 32);
		    	    					lblQ14c2= new JLabel("the placeholder, then enter the desired number of rows and columns.");
		    	    					lblQ14c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14c2.setBounds(50, 181, 1500, 32);
		    	    					rdbtnQ14cA = new JRadioButton("a. Insert Video");
		    	    					rdbtnQ14cA.setBounds(50, 211, 250, 25);
		    	    					rdbtnQ14cA.setBackground(Color.WHITE);
		    	    					rdbtnQ14cB = new JRadioButton("b. Insert Picture");
		    	    					rdbtnQ14cB.setBounds(300, 211, 250, 25);
		    	    					rdbtnQ14cB.setBackground(Color.WHITE);
		    	    					rdbtnQ14cC = new JRadioButton("c. Insert Table");
		    	    					rdbtnQ14cC.setBounds(550, 211, 250, 25);
		    	    					rdbtnQ14cC.setBackground(Color.WHITE);
		    	    					rdbtnQ14cD = new JRadioButton("d. Insert Chart");
		    	    					rdbtnQ14cD.setBounds(800, 211, 250, 25);
		    	    					rdbtnQ14cD.setBackground(Color.WHITE);
		    	    					bgQ14c = new ButtonGroup();
		    	    					bgQ14c.add(rdbtnQ14cA);
		    	    					bgQ14c.add(rdbtnQ14cB);
		    	    					bgQ14c.add(rdbtnQ14cC);
		    	    					bgQ14c.add(rdbtnQ14cD);
		    	    					lblQ14d = new JLabel("4. To delete a row or column: Select the row or column by placing the insertion point in any cell in that row or column. Select the ____________ tab. In the Rows");
		    	    					lblQ14d.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14d.setBounds(50, 231, 1500, 32);
		    	    					lblQ14d1 = new JLabel("& Columns group, click Delete. A drop-down menu appears. Select Delete Rows or Delete Columns.");
		    	    					lblQ14d1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14d1.setBounds(50, 251, 1500, 32);
		    	    					rdbtnQ14dA = new JRadioButton("a. Table Tools Layout");
		    	    					rdbtnQ14dA.setBounds(50, 281, 250, 25);
		    	    					rdbtnQ14dA.setBackground(Color.WHITE);
		    	    					rdbtnQ14dB = new JRadioButton("b. Chart Tools Layout");
		    	    					rdbtnQ14dB.setBounds(300, 281, 250, 25);
		    	    					rdbtnQ14dB.setBackground(Color.WHITE);
		    	    					rdbtnQ14dC = new JRadioButton("c. Insert Tools Layout");
		    	    					rdbtnQ14dC.setBounds(550, 281, 250, 25);
		    	    					rdbtnQ14dC.setBackground(Color.WHITE);
		    	    					rdbtnQ14dD = new JRadioButton("d. None of the above");
		    	    					rdbtnQ14dD.setBounds(800, 281, 250, 25);
		    	    					rdbtnQ14dD.setBackground(Color.WHITE);
		    	    					bgQ14d = new ButtonGroup();
		    	    					bgQ14d.add(rdbtnQ14dA);
		    	    					bgQ14d.add(rdbtnQ14dB);
		    	    					bgQ14d.add(rdbtnQ14dC);
		    	    					bgQ14d.add(rdbtnQ14dD);
		    	    					lblQ14e= new JLabel("5.	Depending on the __________ you're using, certain table style options may have somewhat different effects. You may need to experiment to get the exact look you want.");
		    	    					lblQ14e.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14e.setBounds(50, 301, 1500, 32);
		    	    					rdbtnQ14eA = new JRadioButton("a. Theme style");
		    	    					rdbtnQ14eA.setBounds(50, 331, 250, 25);
		    	    					rdbtnQ14eA.setBackground(Color.WHITE);
		    	    					rdbtnQ14eB = new JRadioButton("b. Chart style");
		    	    					rdbtnQ14eB.setBounds(300, 331, 250, 25);
		    	    					rdbtnQ14eB.setBackground(Color.WHITE);
		    	    					rdbtnQ14eC = new JRadioButton("c. Picture layout");
		    	    					rdbtnQ14eC.setBounds(550, 331, 250, 25);
		    	    					rdbtnQ14eC.setBackground(Color.WHITE);
		    	    					rdbtnQ14eD = new JRadioButton("d. Table style");
		    	    					rdbtnQ14eD.setBounds(800, 331, 250, 25);
		    	    					rdbtnQ14eD.setBackground(Color.WHITE);
		    	    					bgQ14e = new ButtonGroup();
		    	    					bgQ14e.add(rdbtnQ14eA);
		    	    					bgQ14e.add(rdbtnQ14eB);
		    	    					bgQ14e.add(rdbtnQ14eC);
		    	    					bgQ14e.add(rdbtnQ14eD);
		    	    					lblQ14f= new JLabel("6.	To resize a table: Position the mouse over one of the ________ located around the edge of the table. The cursor will become a pair of directional arrows.");
		    	    					lblQ14f.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14f.setBounds(50, 351, 1500, 32);
		    	    					rdbtnQ14fA = new JRadioButton("a. Delete");
		    	    					rdbtnQ14fA.setBounds(50, 381, 250, 25);
		    	    					rdbtnQ14fA.setBackground(Color.WHITE);
		    	    					rdbtnQ14fB = new JRadioButton("b. Remove handles");
		    	    					rdbtnQ14fB.setBounds(300, 381, 250, 25);
		    	    					rdbtnQ14fB.setBackground(Color.WHITE);
		    	    					rdbtnQ14fC = new JRadioButton("c. Slide handles");
		    	    					rdbtnQ14fC.setBounds(550, 381, 250, 25);
		    	    					rdbtnQ14fC.setBackground(Color.WHITE);
		    	    					rdbtnQ14fD = new JRadioButton("d. Sizing handles");
		    	    					rdbtnQ14fD.setBounds(800, 381, 250, 25);
		    	    					rdbtnQ14fD.setBackground(Color.WHITE);
		    	    					bgQ14f = new ButtonGroup();
		    	    					bgQ14f.add(rdbtnQ14fA);
		    	    					bgQ14f.add(rdbtnQ14fB);
		    	    					bgQ14f.add(rdbtnQ14fC);
		    	    					bgQ14f.add(rdbtnQ14fD);
		    	    					lblQ14g= new JLabel("7.	To move a table: Place the cursor over the _____ of the table. The cursor will turn into a cross with arrows. Click and drag the table to the desired location.");
		    	    					lblQ14g.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14g.setBounds(50, 401, 1500, 32);
		    	    					lblQ14g= new JLabel("Release the mouse button to drop the table in the new location.");
		    	    					lblQ14g.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14g.setBounds(50, 421, 1500, 32);
		    	    					rdbtnQ14gA = new JRadioButton("a. Text");
		    	    					rdbtnQ14gA.setBounds(50, 451, 250, 25);
		    	    					rdbtnQ14gA.setBackground(Color.WHITE);
		    	    					rdbtnQ14gB = new JRadioButton("b. Edge");
		    	    					rdbtnQ14gB.setBounds(300, 451, 250, 25);
		    	    					rdbtnQ14gB.setBackground(Color.WHITE);
		    	    					rdbtnQ14gC = new JRadioButton("c. Sizing handles");
		    	    					rdbtnQ14gC.setBounds(550, 451, 250, 25);
		    	    					rdbtnQ14gC.setBackground(Color.WHITE);
		    	    					rdbtnQ14gD = new JRadioButton("d. None of the above");
		    	    					rdbtnQ14gD.setBounds(800, 451, 250, 25);
		    	    					rdbtnQ14gD.setBackground(Color.WHITE);
		    	    					bgQ14g = new ButtonGroup();
		    	    					bgQ14g.add(rdbtnQ14gA);
		    	    					bgQ14g.add(rdbtnQ14gB);
		    	    					bgQ14g.add(rdbtnQ14gC);
		    	    					bgQ14g.add(rdbtnQ14gD);
		    	    					lblQ14h= new JLabel("8. If you want to insert a new ________, select either Insert Above or Insert Below. If you want to insert a new column, select either Insert Left or Insert Right.");
		    	    					lblQ14h.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14h.setBounds(50, 471, 1500, 32);
		    	    					rdbtnQ14hA = new JRadioButton("a. Row");
		    	    					rdbtnQ14hA.setBounds(50, 501, 250, 25);
		    	    					rdbtnQ14hA.setBackground(Color.WHITE);
		    	    					rdbtnQ14hB = new JRadioButton("b. Column");
		    	    					rdbtnQ14hB.setBounds(300, 501, 250, 25);
		    	    					rdbtnQ14hB.setBackground(Color.WHITE);
		    	    					rdbtnQ14hC = new JRadioButton("c. Edge");
		    	    					rdbtnQ14hC.setBounds(550, 501, 250, 25);
		    	    					rdbtnQ14hC.setBackground(Color.WHITE);
		    	    					rdbtnQ14hD = new JRadioButton("d. None of the above");
		    	    					rdbtnQ14hD.setBounds(800, 501, 250, 25);
		    	    					rdbtnQ14hD.setBackground(Color.WHITE);
		    	    					bgQ14h = new ButtonGroup();
		    	    					bgQ14h.add(rdbtnQ14hA);
		    	    					bgQ14h.add(rdbtnQ14hB);
		    	    					bgQ14h.add(rdbtnQ14hC);
		    	    					bgQ14h.add(rdbtnQ14hD);
		    	    					lblQ14i= new JLabel("9.	To add borders to a table: Select the cells you want to add a border to. From the Table Tools Design tab, select the desired Line Style, Line Weight, and Pen Color. Click the ______ drop-down arrow.");
		    	    					lblQ14i.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14i.setBounds(50, 521, 1500, 32);
		    	    					rdbtnQ14iA = new JRadioButton("a. Sizing handles");
		    	    					rdbtnQ14iA.setBounds(50, 551, 250, 25);
		    	    					rdbtnQ14iA.setBackground(Color.WHITE);
		    	    					rdbtnQ14iB = new JRadioButton("b. Column");
		    	    					rdbtnQ14iB.setBounds(300, 551, 250, 25);
		    	    					rdbtnQ14iB.setBackground(Color.WHITE);
		    	    					rdbtnQ14iC = new JRadioButton("c. Row");
		    	    					rdbtnQ14iC.setBounds(550, 551, 250, 25);
		    	    					rdbtnQ14iC.setBackground(Color.WHITE);
		    	    					rdbtnQ14iD = new JRadioButton("d. Borders");
		    	    					rdbtnQ14iD.setBounds(800, 551, 250, 25);
		    	    					rdbtnQ14iD.setBackground(Color.WHITE);
		    	    					bgQ14i = new ButtonGroup();
		    	    					bgQ14i.add(rdbtnQ14iA);
		    	    					bgQ14i.add(rdbtnQ14iB);
		    	    					bgQ14i.add(rdbtnQ14iC);
		    	    					bgQ14i.add(rdbtnQ14iD);
		    	    					lblQ14j= new JLabel("10. What have you learned in this lesson?");
		    	    					lblQ14j.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ14j.setBounds(50, 571, 1500, 32);
		    	    					rdbtnQ14jA = new JRadioButton("a. Inserting tables");
		    	    					rdbtnQ14jA.setBounds(50, 601, 250, 25);
		    	    					rdbtnQ14jA.setBackground(Color.WHITE);
		    	    					rdbtnQ14jB = new JRadioButton("b. Inserting charts");
		    	    					rdbtnQ14jB.setBounds(300, 601, 250, 25);
		    	    					rdbtnQ14jB.setBackground(Color.WHITE);
		    	    					rdbtnQ14jC = new JRadioButton("c. Inserting themes");
		    	    					rdbtnQ14jC.setBounds(550, 601, 250, 25);
		    	    					rdbtnQ14jC.setBackground(Color.WHITE);
		    	    					rdbtnQ14jD = new JRadioButton("d. Inserting pictures");
		    	    					rdbtnQ14jD.setBounds(800, 601, 250, 25);
		    	    					rdbtnQ14jD.setBackground(Color.WHITE);
		    	    					bgQ14j = new ButtonGroup();
		    	    					bgQ14j.add(rdbtnQ14jA);
		    	    					bgQ14j.add(rdbtnQ14jB);
		    	    					bgQ14j.add(rdbtnQ14jC);
		    	    					bgQ14j.add(rdbtnQ14jD);
		    							bSubmit14 = new JButton("Submit");
		    	    					bSubmit14.setBounds(50, 630, 150, 25);
		    	    					bSubmit14.addActionListener(new ActionListener() {
		    								@Override
		    								public void actionPerformed(ActionEvent arg0) {
		    		        					if (rdbtnQ14aB.isSelected()) {
		    		        						score14a=1;
		    		        					}
		    		        					if (rdbtnQ14bB.isSelected()) {
		    		        						score14b=1;
		    		        					}
		    		        					if (rdbtnQ14cA.isSelected()) {
		    		        						score14c=1;
		    		        					}
		    		        					if (rdbtnQ14dA.isSelected()) {
		    		        						score14d=1;
		    		        					}
		    		        					if (rdbtnQ14eA.isSelected()) {
		    		        						score14e=1;
		    		        					}
		    		        					if (rdbtnQ14fC.isSelected()) {
		    		        						score14f=1;
		    		        					}
		    		        					if (rdbtnQ14gB.isSelected()) {
		    		        						score14g=1;
		    		        					}
		    		        					if (rdbtnQ14hC.isSelected()) {
		    		        						score14h=1;
		    		        					}
		    		        					if (rdbtnQ14iA.isSelected()) {
		    		        						score14i=1;
		    		        					}
		    		        					if (rdbtnQ14jD.isSelected()) {
		    		        						score14j=1;
		    		        					}
		    		        					lesson14g=score14a+score14b+score14c+score14d+score14e+score14f+score14g+score14h+score14i+score14j;
		    		        					JOptionPane.showMessageDialog(null, "Your score is "+lesson14g);
		    								}
		    	    					});
		    							panel2.add(lblAssess14);
		    							panel2.add(lblQ14a);
		    	    					panel2.add(rdbtnQ14aA);
		    	    					panel2.add(rdbtnQ14aB);
		    	    					panel2.add(rdbtnQ14aC);
		    	    					panel2.add(rdbtnQ14aD);
		    							panel2.add(lblQ14b1);
		    							panel2.add(lblQ14b2);
		    	    					panel2.add(rdbtnQ14bA);
		    	    					panel2.add(rdbtnQ14bB);
		    	    					panel2.add(rdbtnQ14bC);
		    	    					panel2.add(rdbtnQ14bD);
		    							panel2.add(lblQ14c1);
		    							panel2.add(lblQ14c2);
		    	    					panel2.add(rdbtnQ14cA);
		    	    					panel2.add(rdbtnQ14cB);
		    	    					panel2.add(rdbtnQ14cC);
		    	    					panel2.add(rdbtnQ14cD);
		    							panel2.add(lblQ14d);
		    							panel2.add(lblQ14d1);
		    	    					panel2.add(rdbtnQ14dA);
		    	    					panel2.add(rdbtnQ14dB);
		    	    					panel2.add(rdbtnQ14dC);
		    	    					panel2.add(rdbtnQ14dD);
		    							panel2.add(lblQ14e);
		    	    					panel2.add(rdbtnQ14eA);
		    	    					panel2.add(rdbtnQ14eB);
		    	    					panel2.add(rdbtnQ14eC);
		    	    					panel2.add(rdbtnQ14eD);
		    							panel2.add(lblQ14f);
		    	    					panel2.add(rdbtnQ14fA);
		    	    					panel2.add(rdbtnQ14fB);
		    	    					panel2.add(rdbtnQ14fC);
		    	    					panel2.add(rdbtnQ14fD);
		    							panel2.add(lblQ14g);
		    	    					panel2.add(rdbtnQ14gA);
		    	    					panel2.add(rdbtnQ14gB);
		    	    					panel2.add(rdbtnQ14gC);
		    	    					panel2.add(rdbtnQ14gD);
		    							panel2.add(lblQ14h);
		    	    					panel2.add(rdbtnQ14hA);
		    	    					panel2.add(rdbtnQ14hB);
		    	    					panel2.add(rdbtnQ14hC);
		    	    					panel2.add(rdbtnQ14hD);
		    							panel2.add(lblQ14i);
		    	    					panel2.add(rdbtnQ14iA);
		    	    					panel2.add(rdbtnQ14iB);
		    	    					panel2.add(rdbtnQ14iC);
		    	    					panel2.add(rdbtnQ14iD);
		    							panel2.add(lblQ14j);
		    	    					panel2.add(rdbtnQ14jA);
		    	    					panel2.add(rdbtnQ14jB);
		    	    					panel2.add(rdbtnQ14jC);
		    	    					panel2.add(rdbtnQ14jD);
		    	    					panel2.add(bSubmit14);
		    						}
		    					});
		    					panel2.add(lblLesson14);
		    					panel2.add(bOpenVid14);
		    					panel2.add(bOpenPpt14);
		    					panel2.add(bAssess14);
		    				} else if (node.equals("Lesson 15")) {
		    					panel2.removeAll();
		    					panel2.repaint();
		    					panel2.setBackground(Color.WHITE);
		    					lblLesson15 = new JLabel("Lesson 15: WORKING WITH CHARTS");
		    					lblLesson15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    					lblLesson15.setBounds(50, 11, 500, 32);
		    					bOpenVid15 = new JButton("Play Video");
		    					bOpenVid15.setBounds(50, 500, 150, 100);
		    					bOpenVid15.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("New Microsoft PowerPoint Presentation.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bOpenPpt15 = new JButton("Play Presentation");
		    					bOpenPpt15.setBounds(240, 500, 150, 100);
		    					bOpenPpt15.addActionListener(new ActionListener() {
		    						public void actionPerformed(ActionEvent ae) {
		    							try {
		    								File file = new File("New Microsoft PowerPoint Presentation.pptx");
		    								Desktop.getDesktop().open(file);
		    							} catch (Exception e) {
		    								e.getMessage();
		    							}
		    						}
		    					});
		    					bAssess15 = new JButton("Assessment Task");
		    					bAssess15.setBounds(430, 500, 150, 100);
		    					bAssess15.addActionListener(new ActionListener() {
		    						@Override
		    						public void actionPerformed(ActionEvent ae) {
		    							panel2.removeAll();
		    							panel2.repaint();
		    							lblAssess15 = new JLabel("Assessment Task #15: WORKING WITH CHARTS");
		    	    					lblAssess15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    	    					lblAssess15.setBounds(50, 11, 700, 32);
		    	    					lblQ15a= new JLabel("1.	A _____ is a tool you can use to communicate your data graphically.");
		    	    					lblQ15a.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15a.setBounds(50, 41, 1500, 32);
		    	    					rdbtnQ15aA = new JRadioButton("a. Chart");
		    	    					rdbtnQ15aA.setBounds(50, 71, 250, 25);
		    	    					rdbtnQ15aA.setBackground(Color.WHITE);
		    	    					rdbtnQ15aB = new JRadioButton("b. Table");
		    	    					rdbtnQ15aB.setBounds(300, 71, 250, 25);
		    	    					rdbtnQ15aB.setBackground(Color.WHITE);
		    	    					rdbtnQ15aC = new JRadioButton("c. Themes");
		    	    					rdbtnQ15aC.setBounds(550, 71, 250, 25);
		    	    					rdbtnQ15aC.setBackground(Color.WHITE);
		    	    					rdbtnQ15aD = new JRadioButton("d. Shape");
		    	    					rdbtnQ15aD.setBounds(800, 71, 250, 25);
		    	    					rdbtnQ15aD.setBackground(Color.WHITE);
		    	    					bgQ15a = new ButtonGroup();
		    	    					bgQ15a.add(rdbtnQ15aA);
		    	    					bgQ15a.add(rdbtnQ15aB);
		    	    					bgQ15a.add(rdbtnQ15aC);
		    	    					bgQ15a.add(rdbtnQ15aD);
		    	    					lblQ15b1= new JLabel("2. They give you a/an _____________of your data.");
		    	    					lblQ15b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15b1.setBounds(50, 91, 1500, 32);
		    	    					rdbtnQ15bA = new JRadioButton("a. Illustration");
		    	    					rdbtnQ15bA.setBounds(50, 121, 250, 25);
		    	    					rdbtnQ15bA.setBackground(Color.WHITE);
		    	    					rdbtnQ15bB = new JRadioButton("b. Shape");
		    	    					rdbtnQ15bB.setBounds(300, 121, 250, 25);
		    	    					rdbtnQ15bB.setBackground(Color.WHITE);
		    	    					rdbtnQ15bC = new JRadioButton("c. Chart");
		    	    					rdbtnQ15bC.setBounds(550, 121, 250, 25);
		    	    					rdbtnQ15bC.setBackground(Color.WHITE);
		    	    					rdbtnQ15bD = new JRadioButton("d. Theme");
		    	    					rdbtnQ15bD.setBounds(800, 121, 250, 25);
		    	    					rdbtnQ15bD.setBackground(Color.WHITE);
		    	    					bgQ15b = new ButtonGroup();
		    	    					bgQ15b.add(rdbtnQ15bA);
		    	    					bgQ15b.add(rdbtnQ15bB);
		    	    					bgQ15b.add(rdbtnQ15bC);
		    	    					bgQ15b.add(rdbtnQ15bD);
		    	    					lblQ15c1= new JLabel("3. PowerPoint uses a/an ___________ as a placeholder for entering chart data.");
		    	    					lblQ15c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15c1.setBounds(50, 141, 1500, 32);
		    	    					rdbtnQ15cA = new JRadioButton("a. Illustration");
		    	    					rdbtnQ15cA.setBounds(50, 171, 250, 25);
		    	    					rdbtnQ15cA.setBackground(Color.WHITE);
		    	    					rdbtnQ15cB = new JRadioButton("b. Shape");
		    	    					rdbtnQ15cB.setBounds(300, 171, 250, 25);
		    	    					rdbtnQ15cB.setBackground(Color.WHITE);
		    	    					rdbtnQ15cC = new JRadioButton("c. Excel worksheet");
		    	    					rdbtnQ15cC.setBounds(550, 171, 250, 25);
		    	    					rdbtnQ15cC.setBackground(Color.WHITE);
		    	    					rdbtnQ15cD = new JRadioButton("d. MS word");
		    	    					rdbtnQ15cD.setBounds(800, 171, 250, 25);
		    	    					rdbtnQ15cD.setBackground(Color.WHITE);
		    	    					bgQ15c = new ButtonGroup();
		    	    					bgQ15c.add(rdbtnQ15cA);
		    	    					bgQ15c.add(rdbtnQ15cB);
		    	    					bgQ15c.add(rdbtnQ15cC);
		    	    					bgQ15c.add(rdbtnQ15cD);
		    	    					lblQ15d = new JLabel("4. The data that appears in the Excel spreadsheet is _______________ that you will replace with your own information. The Excel source data is used to create.");
		    	    					lblQ15d.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15d.setBounds(50, 191, 1500, 32);
		    	    					lblQ15d1 = new JLabel("the PowerPoint chart.");
		    	    					lblQ15d1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15d1.setBounds(50, 211, 1500, 32);
		    	    					rdbtnQ15dA = new JRadioButton("a. Placeholder source data");
		    	    					rdbtnQ15dA.setBounds(50, 241, 250, 25);
		    	    					rdbtnQ15dA.setBackground(Color.WHITE);
		    	    					rdbtnQ15dB = new JRadioButton("b. Source data");
		    	    					rdbtnQ15dB.setBounds(300, 241, 250, 25);
		    	    					rdbtnQ15dB.setBackground(Color.WHITE);
		    	    					rdbtnQ15dC = new JRadioButton("c. Cell Basics");
		    	    					rdbtnQ15dC.setBounds(550, 241, 250, 25);
		    	    					rdbtnQ15dC.setBackground(Color.WHITE);
		    	    					rdbtnQ15dD = new JRadioButton("d. Excel worksheet");
		    	    					rdbtnQ15dD.setBounds(800, 241, 250, 25);
		    	    					rdbtnQ15dD.setBackground(Color.WHITE);
		    	    					bgQ15d = new ButtonGroup();
		    	    					bgQ15d.add(rdbtnQ15dA);
		    	    					bgQ15d.add(rdbtnQ15dB);
		    	    					bgQ15d.add(rdbtnQ15dC);
		    	    					bgQ15d.add(rdbtnQ15dD);
		    	    					lblQ15e= new JLabel("5.	Enter your data into the Excel spreadsheet. If you are not sure how to enter data into an Excel spreadsheet, review our _________ lesson from our.");
		    	    					lblQ15e.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15e.setBounds(50, 261, 1500, 32);
		    	    					lblQ15e1= new JLabel(" Excel 2010 tutorial.");
		    	    					lblQ15e1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15e1.setBounds(50, 281, 1500, 32);
		    	    					rdbtnQ15eA = new JRadioButton("a. Excel worksheet");
		    	    					rdbtnQ15eA.setBounds(50, 311, 250, 25);
		    	    					rdbtnQ15eA.setBackground(Color.WHITE);
		    	    					rdbtnQ15eB = new JRadioButton("b. Cell Basics");
		    	    					rdbtnQ15eB.setBounds(300, 311, 250, 25);
		    	    					rdbtnQ15eB.setBackground(Color.WHITE);
		    	    					rdbtnQ15eC = new JRadioButton("c. Placeholder source data");
		    	    					rdbtnQ15eC.setBounds(550, 311, 250, 25);
		    	    					rdbtnQ15eC.setBackground(Color.WHITE);
		    	    					rdbtnQ15eD = new JRadioButton("d. Table");
		    	    					rdbtnQ15eD.setBounds(800, 311, 250, 25);
		    	    					rdbtnQ15eD.setBackground(Color.WHITE);
		    	    					bgQ15e = new ButtonGroup();
		    	    					bgQ15e.add(rdbtnQ15eA);
		    	    					bgQ15e.add(rdbtnQ15eB);
		    	    					bgQ15e.add(rdbtnQ15eC);
		    	    					bgQ15e.add(rdbtnQ15eD);
		    	    					lblQ15f= new JLabel("6.	Be sure to drag the __________ to surround all the data you want to include in the chart.");
		    	    					lblQ15f.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15f.setBounds(50, 331, 1500, 32);
		    	    					rdbtnQ15fA = new JRadioButton("a. Blue line");
		    	    					rdbtnQ15fA.setBounds(50, 361, 250, 25);
		    	    					rdbtnQ15fA.setBackground(Color.WHITE);
		    	    					rdbtnQ15fB = new JRadioButton("b. Green line");
		    	    					rdbtnQ15fB.setBounds(300, 361, 250, 25);
		    	    					rdbtnQ15fB.setBackground(Color.WHITE);
		    	    					rdbtnQ15fC = new JRadioButton("c. Yellow line");
		    	    					rdbtnQ15fC.setBounds(550, 361, 250, 25);
		    	    					rdbtnQ15fC.setBackground(Color.WHITE);
		    	    					rdbtnQ15fD = new JRadioButton("d. None of the above");
		    	    					rdbtnQ15fD.setBounds(800, 361, 250, 25);
		    	    					rdbtnQ15fD.setBackground(Color.WHITE);
		    	    					bgQ15f = new ButtonGroup();
		    	    					bgQ15f.add(rdbtnQ15fA);
		    	    					bgQ15f.add(rdbtnQ15fB);
		    	    					bgQ15f.add(rdbtnQ15fC);
		    	    					bgQ15f.add(rdbtnQ15fD);
		    	    					lblQ15g= new JLabel("7.	To _____ an imported chart, double-click it to open the Excel placeholder. After you have finished editing, be sure to save the chart in Excel.");
		    	    					lblQ15g.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15g.setBounds(50, 381, 1500, 32);
		    	    					rdbtnQ15gA = new JRadioButton("a. Create table");
		    	    					rdbtnQ15gA.setBounds(50, 411, 250, 25);
		    	    					rdbtnQ15gA.setBackground(Color.WHITE);
		    	    					rdbtnQ15gB = new JRadioButton("b. Save");
		    	    					rdbtnQ15gB.setBounds(300, 411, 250, 25);
		    	    					rdbtnQ15gB.setBackground(Color.WHITE);
		    	    					rdbtnQ15gC = new JRadioButton("c. Print");
		    	    					rdbtnQ15gC.setBounds(550, 411, 250, 25);
		    	    					rdbtnQ15gC.setBackground(Color.WHITE);
		    	    					rdbtnQ15gD = new JRadioButton("d. Edit");
		    	    					rdbtnQ15gD.setBounds(800, 411, 250, 25);
		    	    					rdbtnQ15gD.setBackground(Color.WHITE);
		    	    					bgQ15g = new ButtonGroup();
		    	    					bgQ15g.add(rdbtnQ15gA);
		    	    					bgQ15g.add(rdbtnQ15gB);
		    	    					bgQ15g.add(rdbtnQ15gC);
		    	    					bgQ15g.add(rdbtnQ15gD);
		    	    					lblQ15h= new JLabel("8.	 Once you insert a chart, a set of ________ will appear on the Ribbon. These are only visible when the chart is selected. You can use the three tabs grouped.");
		    	    					lblQ15h.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15h.setBounds(50, 431, 1500, 32);
		    	    					lblQ15h1= new JLabel("under Chart Tools to modify your chart.");
		    	    					lblQ15h1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15h1.setBounds(50, 451, 1500, 32);
		    	    					rdbtnQ15hA = new JRadioButton("a. Table tools");
		    	    					rdbtnQ15hA.setBounds(50, 481, 250, 25);
		    	    					rdbtnQ15hA.setBackground(Color.WHITE);
		    	    					rdbtnQ15hB = new JRadioButton("b. Chart tools");
		    	    					rdbtnQ15hB.setBounds(300, 481, 250, 25);
		    	    					rdbtnQ15hB.setBackground(Color.WHITE);
		    	    					rdbtnQ15hC = new JRadioButton("c. Print tools");
		    	    					rdbtnQ15hC.setBounds(550, 481, 250, 25);
		    	    					rdbtnQ15hC.setBackground(Color.WHITE);
		    	    					rdbtnQ15hD = new JRadioButton("d. None of the above");
		    	    					rdbtnQ15hD.setBounds(800, 481, 250, 25);
		    	    					rdbtnQ15hD.setBackground(Color.WHITE);
		    	    					bgQ15h = new ButtonGroup();
		    	    					bgQ15h.add(rdbtnQ15hA);
		    	    					bgQ15h.add(rdbtnQ15hB);
		    	    					bgQ15h.add(rdbtnQ15hC);
		    	    					bgQ15h.add(rdbtnQ15hD);
		    	    					lblQ15i= new JLabel("9.	Select the _____. From the Chart Tools Design tab, select the Edit command in the Data group. The Excel placeholder will open. Return to your PowerPoint slide.");
		    	    					lblQ15i.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15i.setBounds(50, 501, 1500, 32);
		    	    					lblQ15i1= new JLabel("Select the Switch Row/Column command in the Data group. The chart will adjust the data.");
		    	    					lblQ15i1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15i1.setBounds(50, 521, 1500, 32);
		    	    					rdbtnQ15iA = new JRadioButton("a. Chart");
		    	    					rdbtnQ15iA.setBounds(50, 551, 250, 25);
		    	    					rdbtnQ15iA.setBackground(Color.WHITE);
		    	    					rdbtnQ15iB = new JRadioButton("b. Save");
		    	    					rdbtnQ15iB.setBounds(300, 551, 250, 25);
		    	    					rdbtnQ15iB.setBackground(Color.WHITE);
		    	    					rdbtnQ15iC = new JRadioButton("c. Edit");
		    	    					rdbtnQ15iC.setBounds(550, 551, 250, 25);
		    	    					rdbtnQ15iC.setBackground(Color.WHITE);
		    	    					rdbtnQ15iD = new JRadioButton("d. Table");
		    	    					rdbtnQ15iD.setBounds(800, 551, 250, 25);
		    	    					rdbtnQ15iD.setBackground(Color.WHITE);
		    	    					bgQ15i = new ButtonGroup();
		    	    					bgQ15i.add(rdbtnQ15iA);
		    	    					bgQ15i.add(rdbtnQ15iB);
		    	    					bgQ15i.add(rdbtnQ15iC);
		    	    					bgQ15i.add(rdbtnQ15iD);
		    	    					lblQ15j= new JLabel("10. Some layouts include things like chart titles and __________. To change them, place the insertion point in the text and begin typing.");
		    	    					lblQ15j.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    	    					lblQ15j.setBounds(50, 571, 1500, 32);
		    	    					rdbtnQ15jA = new JRadioButton("a. Table");
		    	    					rdbtnQ15jA.setBounds(50, 601, 250, 25);
		    	    					rdbtnQ15jA.setBackground(Color.WHITE);
		    	    					rdbtnQ15jB = new JRadioButton("b. Labels");
		    	    					rdbtnQ15jB.setBounds(300, 601, 250, 25);
		    	    					rdbtnQ15jB.setBackground(Color.WHITE);
		    	    					rdbtnQ15jC = new JRadioButton("c. Change labels");
		    	    					rdbtnQ15jC.setBounds(550, 601, 250, 25);
		    	    					rdbtnQ15jC.setBackground(Color.WHITE);
		    	    					rdbtnQ15jD = new JRadioButton("d. Legend labels");
		    	    					rdbtnQ15jD.setBounds(800, 601, 250, 25);
		    	    					rdbtnQ15jD.setBackground(Color.WHITE);
		    	    					bgQ15j = new ButtonGroup();
		    	    					bgQ15j.add(rdbtnQ15jA);
		    	    					bgQ15j.add(rdbtnQ15jB);
		    	    					bgQ15j.add(rdbtnQ15jC);
		    	    					bgQ15j.add(rdbtnQ15jD);
		    							bSubmit15 = new JButton("Submit");
		    	    					bSubmit15.setBounds(50, 625, 150, 25);
		    	    					bSubmit15.addActionListener(new ActionListener() {
		    								@Override
		    								public void actionPerformed(ActionEvent arg0) {
		    		        					if (rdbtnQ15aB.isSelected()) {
		    		        						score15a=1;
		    		        					}
		    		        					if (rdbtnQ15bB.isSelected()) {
		    		        						score15b=1;
		    		        					}
		    		        					if (rdbtnQ15cA.isSelected()) {
		    		        						score15c=1;
		    		        					}
		    		        					if (rdbtnQ15dA.isSelected()) {
		    		        						score15d=1;
		    		        					}
		    		        					if (rdbtnQ15eA.isSelected()) {
		    		        						score15e=1;
		    		        					}
		    		        					if (rdbtnQ15fC.isSelected()) {
		    		        						score15f=1;
		    		        					}
		    		        					if (rdbtnQ15gB.isSelected()) {
		    		        						score15g=1;
		    		        					}
		    		        					if (rdbtnQ15hC.isSelected()) {
		    		        						score15h=1;
		    		        					}
		    		        					if (rdbtnQ15iA.isSelected()) {
		    		        						score15i=1;
		    		        					}
		    		        					if (rdbtnQ15jD.isSelected()) {
		    		        						score15j=1;
		    		        					}
		    		        					lesson15g=score15a+score15b+score15c+score15d+score15e+score15f+score15g+score15h+score15i+score15j;
		    		        					JOptionPane.showMessageDialog(null, "Your score is "+lesson15g);
		    								}
		    	    					});
		    							panel2.add(lblAssess15);
		    							panel2.add(lblQ15a);
		    	    					panel2.add(rdbtnQ15aA);
		    	    					panel2.add(rdbtnQ15aB);
		    	    					panel2.add(rdbtnQ15aC);
		    	    					panel2.add(rdbtnQ15aD);
		    							panel2.add(lblQ15b1);
		    	    					panel2.add(rdbtnQ15bA);
		    	    					panel2.add(rdbtnQ15bB);
		    	    					panel2.add(rdbtnQ15bC);
		    	    					panel2.add(rdbtnQ15bD);
		    							panel2.add(lblQ15c1);
		    	    					panel2.add(rdbtnQ15cA);
		    	    					panel2.add(rdbtnQ15cB);
		    	    					panel2.add(rdbtnQ15cC);
		    	    					panel2.add(rdbtnQ15cD);
		    							panel2.add(lblQ15d);
		    							panel2.add(lblQ15d1);
		    	    					panel2.add(rdbtnQ15dA);
		    	    					panel2.add(rdbtnQ15dB);
		    	    					panel2.add(rdbtnQ15dC);
		    	    					panel2.add(rdbtnQ15dD);
		    							panel2.add(lblQ15e);
		    							panel2.add(lblQ15e1);
		    	    					panel2.add(rdbtnQ15eA);
		    	    					panel2.add(rdbtnQ15eB);
		    	    					panel2.add(rdbtnQ15eC);
		    	    					panel2.add(rdbtnQ15eD);
		    							panel2.add(lblQ15f);
		    	    					panel2.add(rdbtnQ15fA);
		    	    					panel2.add(rdbtnQ15fB);
		    	    					panel2.add(rdbtnQ15fC);
		    	    					panel2.add(rdbtnQ15fD);
		    							panel2.add(lblQ15g);
		    	    					panel2.add(rdbtnQ15gA);
		    	    					panel2.add(rdbtnQ15gB);
		    	    					panel2.add(rdbtnQ15gC);
		    	    					panel2.add(rdbtnQ15gD);
		    							panel2.add(lblQ15h);
		    							panel2.add(lblQ15h1);
		    	    					panel2.add(rdbtnQ15hA);
		    	    					panel2.add(rdbtnQ15hB);
		    	    					panel2.add(rdbtnQ15hC);
		    	    					panel2.add(rdbtnQ15hD);
		    							panel2.add(lblQ15i);
		    							panel2.add(lblQ15i1);
		    	    					panel2.add(rdbtnQ15iA);
		    	    					panel2.add(rdbtnQ15iB);
		    	    					panel2.add(rdbtnQ15iC);
		    	    					panel2.add(rdbtnQ15iD);
		    							panel2.add(lblQ15j);
		    	    					panel2.add(rdbtnQ15jA);
		    	    					panel2.add(rdbtnQ15jB);
		    	    					panel2.add(rdbtnQ15jC);
		    	    					panel2.add(rdbtnQ15jD);
		    	    					panel2.add(bSubmit15);
		    						}
		    					});
		    					panel2.add(lblLesson15);
		    					panel2.add(bOpenVid15);
		    					panel2.add(bOpenPpt15);
		    					panel2.add(bAssess15);
		    				}
		    		}
		    	});    	
			
			}
	    });
		mPs.addActionListener(new ActionListener() {
	        private E_Learning.dao.ELearningDAO ELearningController;
			public void actionPerformed(ActionEvent e) {
				pMain.removeAll();
				pMain.repaint();
				int logusn = getUsn();
				String topic = "Photoshop";
				int checker = 0;
				try {
						checker = ELearningDAO.checkUSN(logusn);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				if (checker == 0) {
					JOptionPane.showMessageDialog(null,"Enrolling USN: "+logusn);
					try {
						ELearningDAO.insertData(logusn, topic);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				if (checker > 0) {
					String[] videos = new String[15];
					videos = ELearningDAO.getData(logusn);
					String lesson1 = videos[0];
					String lesson2 = videos[1];
					String lesson3 = videos[2];
					String lesson4 = videos[3];
					String lesson5 = videos[4];
					String lesson6 = videos[5];
					String lesson7 = videos[6];
					String lesson8 = videos[7];
					String lesson9 = videos[8];
					String lesson10 = videos[9];
					String lesson11 = videos[10];
					String lesson12 = videos[11];
					String lesson13 = videos[12];
					String lesson14 = videos[13];
					String lesson15 = videos[14];
		        	panel1 = new Panel();
		        	panel1.setBackground(Color.WHITE);
		        	panel1.setBounds(10, 10, 170, 660);
		        	pMain.add(panel1);
	
		        	tTopics = new JTree();
		        	tTopics.setCellRenderer(new DefaultTreeCellRenderer() {
		        		private static final long serialVersionUID = 1L;
		        		private Icon loadIcon = UIManager.getIcon("OptionPane.errorIcon");
		        		private Icon saveIcon = UIManager.getIcon("OptionPane.informationIcon");
		        		@Override
		        		public Component getTreeCellRendererComponent(JTree tree,
		                    Object value, boolean selected, boolean expanded,
		                    boolean isLeaf, int row, boolean focused) {
		        				Component c = super.getTreeCellRendererComponent(tree, value,
		        						selected, expanded, isLeaf, row, focused);
		        				if (selected) {
		        					setIcon(loadIcon);
		        				} else {
		        					setIcon(saveIcon);
		        				}
		        				return c;
		        			}
		        	});		
		        	tTopics.setBounds(42, 5, 61, 16);
		        	tTopics.setBackground(Color.WHITE);
		        	tTopics.setModel(new DefaultTreeModel(new DefaultMutableTreeNode(topic) {
		        		private static final long serialVersionUID = 1L;
		        			{
		        				DefaultMutableTreeNode topic;
		        				topic = new DefaultMutableTreeNode(lesson1);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson2);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson3);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson4);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson5);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson6);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson7);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson8);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson9);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson10);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson11);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson12);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson13);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson14);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode(lesson15);
		        				add(topic);
		        				topic = new DefaultMutableTreeNode("View Result");
		        				add(topic);
		        			}
		        	}
		        	));
		        	panel1.add(tTopics);
		        	panel2 = new Panel();
		        	panel2.setBounds(200, 10, 1130, 660);
		        	pMain.add(panel2);
		        	panel2.setLayout(null);
		        	tTopics.addTreeSelectionListener(new TreeSelectionListener() {
		        		public void valueChanged(TreeSelectionEvent tse) {
		        			tTopics.getSelectionModel().setSelectionMode (TreeSelectionModel.SINGLE_TREE_SELECTION);
		        				String node = tse.getNewLeadSelectionPath().getLastPathComponent().toString();
		        				/* React to the node selection. */
		        				String lesson = node;
		        				if ((node.equals(lesson)) && (!node.equals(topic) && (!node.equals("View Result")))) {
									// ELS.openlesson(lesson1);
									panel2.removeAll();
									panel2.repaint();
									panel2.setBackground(Color.WHITE);
									JLabel lblLesson1 = new JLabel("Lesson: " + lesson);
									lblLesson1.setFont(new Font("Tahoma", Font.PLAIN, 20));
									lblLesson1.setBounds(50, 11, 350, 100);
									JTextArea txtInformation = new JTextArea();
									txtInformation.setEditable(false);
									txtInformation.setBackground(SystemColor.control);
									txtInformation.setBounds(50, 120, 500, 300);
									Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
									txtInformation.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
									String ILO = ELearningSystemModel.grabILO(lesson, logusn);
									txtInformation.setText(ILO);
									txtInformation.setLineWrap(true);
									panel2.add(txtInformation);
									txtInformation.setVisible(true);
									JButton bEdit = new JButton("Play Video");
									bEdit.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent ae) {
											String filetype = ELearningSystemModel.grabFileType(lesson, logusn);
											String video = lesson+"."+filetype;
											ELearningSystemModel.openfile(video);
										}
									});
									bEdit.setBounds(50, 500, 150, 100);
									JButton bAT = new JButton("Assessment Task");
									bAT.setBounds(240, 500, 150, 100);
									bAT.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent ae) {
											String[] usrans = new String[10];
											String[] corans = new String[10];
											Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
											String[][] qs = new String[10][2];
											String qtopic = "q"+(topic.toLowerCase());
											qs = ELearningDAO.getQ(lesson, qtopic);
											for (int x = 0; x < corans.length; x++) {
												corans[x] = qs[x][1];
											}
											int count = 0;
											String videos[] = ELearningDAO.getData(logusn);
											do {
												if(lesson.equals(videos[count])) {
													count = count+1;
													break;
												}
												count++;
											} while (count < videos.length);
											panel2.removeAll();
											panel2.repaint();
											JLabel lblHeadline = new JLabel("Assessment Task "+(count)+": " + lesson);
											lblHeadline.setFont(new Font("Tahoma", Font.PLAIN, 20));
											lblHeadline.setBounds(50, 11, 700, 32);
											int x = 0;
											JLabel lblQ1 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ1.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ1.setBounds(50, 41, 1000, 32);
											JTextField txtQ1 = new JTextField();
											txtQ1.setEditable(true);
											txtQ1.setVisible(true);
											txtQ1.setBounds(50, 71, 1000, 25);
											txtQ1.setBorder(border);
											x++;
											JLabel lblQ2 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ2.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ2.setBounds(50, 91, 1000, 32);
											JTextField txtQ2 = new JTextField();
											txtQ2.setEditable(true);
											txtQ2.setVisible(true);
											txtQ2.setBounds(50, 121, 1000, 25);
											txtQ2.setBorder(border);
											x++;
											JLabel lblQ3 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ3.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ3.setBounds(50, 141, 1000, 32);
											JTextField txtQ3 = new JTextField();
											txtQ3.setEditable(true);
											txtQ3.setVisible(true);
											txtQ3.setBounds(50, 171, 1000, 25);
											txtQ3.setBorder(border);
											x++;
											JLabel lblQ4 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ4.setBounds(50, 191, 1500, 32);
											lblQ4.setFont(new Font("Tahoma", Font.PLAIN, 15));
											JTextField txtQ4 = new JTextField();
											txtQ4.setEditable(true);
											txtQ4.setVisible(true);
											txtQ4.setBounds(50, 221, 1000, 25);
											txtQ4.setBorder(border);
											x++;
											JLabel lblQ5 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ5.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ5.setBounds(50, 241, 1500, 32);
											JTextField txtQ5 = new JTextField();
											txtQ5.setEditable(true);
											txtQ5.setVisible(true);
											txtQ5.setBounds(50, 271, 1000, 25);
											txtQ5.setBorder(border);
											x++;
											JLabel lblQ6 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ6.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ6.setBounds(50, 291, 1000, 32);
											JTextField txtQ6 = new JTextField();
											txtQ6.setEditable(true);
											txtQ6.setVisible(true);
											txtQ6.setBounds(50, 321, 1000, 25);
											txtQ6.setBorder(border);
											x++;
											JLabel lblQ7 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ7.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ7.setBounds(50, 341, 1000, 32);
											JTextField txtQ7 = new JTextField();
											txtQ7.setEditable(true);
											txtQ7.setVisible(true);
											txtQ7.setBounds(50, 371, 1000, 25);
											txtQ7.setBorder(border);
											x++;
											JLabel lblQ8 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ8.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ8.setBounds(50, 391, 1000, 32);
											JTextField txtQ8 = new JTextField();
											txtQ8.setEditable(true);
											txtQ8.setVisible(true);
											txtQ8.setBounds(50, 421, 1000, 25);
											txtQ8.setBorder(border);
											x++;
											JLabel lblQ9 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ9.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ9.setBounds(50, 441, 1000, 32);
											JTextField txtQ9 = new JTextField();
											txtQ9.setEditable(true);
											txtQ9.setVisible(true);
											txtQ9.setBounds(50, 471, 1000, 25);
											txtQ9.setBorder(border);
											x++;
											JLabel lblQ10 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ10.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ10.setBounds(50, 491, 1500, 32);
											JTextField txtQ10 = new JTextField();
											txtQ10.setEditable(true);
											txtQ10.setVisible(true);
											txtQ10.setBounds(50, 521, 1000, 25);
											txtQ10.setBorder(border);
											JButton bSubmit = new JButton("Submit");
											bSubmit.setBounds(50, 616, 150, 25);
											String lessons = "lesson"+count+"g";
											bSubmit.addActionListener(new ActionListener() 
											{
												public void actionPerformed(ActionEvent e) {
													int score = 0;
													String lessong = lessons;
													usrans[0] = txtQ1.getText();
													usrans[1] = txtQ2.getText();
													usrans[2] = txtQ3.getText();
													usrans[3] = txtQ4.getText();
													usrans[4] = txtQ5.getText();
													usrans[5] = txtQ6.getText();
													usrans[6] = txtQ7.getText();
													usrans[7] = txtQ8.getText();
													usrans[8] = txtQ9.getText();
													usrans[9] = txtQ10.getText();
													score = checkans(corans, usrans,logusn);
													int confirm = JOptionPane.showConfirmDialog(null,
															"Are you ready to submit your answers?", "Confirmation",
															JOptionPane.YES_NO_OPTION);
													if (confirm == 0) {
														JOptionPane.showMessageDialog(null,
																"You scored: " + score + " out of 10.");
														try {
															ELearningDAO.updateInt(logusn, lessong, score, topic);
														} catch (SQLException e1) {
															e1.printStackTrace();
														}
							        					panel2.removeAll();
							        					panel2.repaint();
							        					panel2.setBackground(Color.WHITE);
														JTextArea txtInformation = new JTextArea();
														txtInformation.setEditable(false);
														txtInformation.setBackground(SystemColor.control);
														txtInformation.setBounds(25, 27, 289, 496);
														Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
														txtInformation.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
														String results = "";
														try {
															results = ELearningAttribute.openlogs();
														} catch (Exception e1) {
															e1.printStackTrace();
														}
														txtInformation.setText(results);
														panel2.add(txtInformation);
														txtInformation.setVisible(true);
														panel2.revalidate();
														panel2.repaint();
													}
												}
											});
											panel2.add(lblHeadline);
											panel2.add(lblQ1);
											panel2.add(txtQ1);
											panel2.add(lblQ2);
											panel2.add(txtQ2);
											panel2.add(lblQ3);
											panel2.add(txtQ3);
											panel2.add(lblQ4);
											panel2.add(txtQ4);
											panel2.add(lblQ5);
											panel2.add(txtQ5);
											panel2.add(lblQ6);
											panel2.add(txtQ6);
											panel2.add(lblQ7);
											panel2.add(txtQ7);
											panel2.add(lblQ8);
											panel2.add(txtQ8);
											panel2.add(lblQ9);
											panel2.add(txtQ9);
											panel2.add(lblQ10);
											panel2.add(txtQ10);
											panel2.add(bSubmit);
										}
									});
									panel2.add(lblLesson1);
									panel2.add(bEdit);
									panel2.add(bAT);
								} else if(node.equals("View Result")) {
		        					panel2.removeAll();
		        					panel2.repaint();
		        					panel2.setBackground(Color.WHITE);
									JTextArea txtInformation = new JTextArea();
									txtInformation.setEditable(false);
									txtInformation.setBackground(SystemColor.control);
									txtInformation.setBounds(25, 27, 289, 496);
									Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
									txtInformation.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		        					JButton bOpenGrade = new JButton("See Grades");
		        					bOpenGrade.addActionListener(new ActionListener() {
		        						@Override
										public void actionPerformed(ActionEvent ae) {
		        							panel2.removeAll();
											panel2.repaint();
											int usn = getUsn();
											ELearningSystemModel.updategrades(logusn,topic);
											String results = ELearningDAO.searchData(usn,topic);
											txtInformation.setText(results);
											txtInformation.setVisible(true);
										    JScrollPane scroll = new JScrollPane(txtInformation);
										    scroll.setBounds(25, 27, 289, 496);
										    scroll.setVisible(true);
										    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
										    panel2.add(scroll);
										    panel2.revalidate();
											panel2.repaint();
		        						}
		        					});	        				        					
		        					bOpenGrade.setBounds(50, 500, 150, 100);
		        					panel2.add(bOpenGrade);	        				        					
		        				} else if(node.equals(topic)) {
		        					panel2.removeAll();
		        					panel2.repaint();
		        					panel2.setBackground(Color.WHITE);
									JTextArea txtInformation = new JTextArea();
									txtInformation.setEditable(false);
									txtInformation.setBackground(SystemColor.control);
									txtInformation.setBounds(400, 50, 500, 496);
									Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
									txtInformation.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
									String Info = ELearningDAO.getEntry(logusn, "Info");
									txtInformation.setText(Info);
									txtInformation.setLineWrap(true);
									panel2.add(txtInformation);
									txtInformation.setVisible(true);
									
									String pic = ELearningDAO.getEntry(logusn, "photo");
							        ImageIcon icon = new ImageIcon(pic);
							        JLabel img = new JLabel(icon);
							        img.setBounds(50, 75, 246, 246);
							        panel2.add(img);
									
		        					JButton bSearchLesson = new JButton("Search Lesson");
		        					bSearchLesson.addActionListener(new ActionListener() {
		        						@Override
										public void actionPerformed(ActionEvent ae) {
											String searchresult = JOptionPane.showInputDialog(null, "Type for any lessons?");
											String results = "";
											String[] lessons = new String[9];
											lessons = ELearningDAO.getData(logusn);
											results = ELearningSystemModel.searchtopic(lessons, searchresult);
											txtInformation.setText(results);
		        						}
		        					});	        				        					
		        					bSearchLesson.setBounds(50, 500, 150, 100);
		        					panel2.add(bSearchLesson);	        				        					
		        				}
		        			}	        			    
		        	});
		        	mJava1.addActionListener(new ActionListener() {
		        		@Override
		        		public void actionPerformed(ActionEvent ae) {
		        			pMain.removeAll();
		        			pMain.repaint();
		        			panel1 = new Panel();
		        			panel1.setBackground(Color.WHITE);
		        			panel1.setBounds(10, 10, 145, 650);
		        			pMain.add(panel1);
		        	
		        			panel2 = new Panel();
		        			panel2.setBackground(Color.WHITE);
		        			panel2.setBounds(180, 10, 1155, 650);
		        			pMain.add(panel2);
		        			panel2.setLayout(null);
		        		}
		        	});
		        	mPowerpoint.addActionListener(new ActionListener() {
		        		@Override
		        		public void actionPerformed(ActionEvent ae) {
		        			pMain.removeAll();
		        			pMain.repaint();
		        		}
		        	});	
				}
			}
			@SuppressWarnings("unused")
			public Panel getPanel2() {
				return panel2;
			}
			@SuppressWarnings("unused")
			public E_Learning.dao.ELearningDAO getELearningController() {
				return ELearningController;
			}
			@SuppressWarnings("unused")
			public void setELearningController(E_Learning.dao.ELearningDAO eLearningController) {
				ELearningController = eLearningController;
			}
		});
		mJava1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				pMain.removeAll();
				pMain.repaint();
				panel1 = new Panel();
	        	panel1.setBackground(Color.WHITE);
	        	panel1.setBounds(10, 10, 145, 650);
	        	pMain.add(panel1);
	        	
	        	panel2 = new Panel();
	        	panel2.setBackground(Color.WHITE);
	        	panel2.setBounds(180, 10, 1155, 650);
	        	pMain.add(panel2);
	        	panel2.setLayout(null);
			}
		});
	}
	public JMenuItem getMPowerpoint() {
		return mPowerpoint;
	}
	public JPanel getpLogin() {
		return pMain;
	}
	public JTree getTTopics() {
		return tTopics;
	}
	public Panel getPanel1() {
		return panel1;
	}
	public Panel getPanel2() {
		return panel2;
	}	
	public SignupPanel getSignupPanel(){
		return signup;
	}
	public LoginPanel getLoginPanel(){
		return login;
	}	
	public JTextField gettfUsername() {
		return tfUsername;
	}
	public int getUsn() {
		return usn;
	}	
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public static int checkans(String[] corans, String[] usrans, int usn) {
		int score = 0;
		String logs = "User: "+usn;
		for(int x = 0; x < corans.length; x++) {
			Pattern p = Pattern.compile(corans[x]);
			Matcher m = p.matcher(usrans[x]);
			if(m.matches()) {
				logs = logs.concat("\n"+(x+1)+".) Correct");
				score++;
			}	
			logs = logs.concat("\n"+(x+1)+".) Incorrect");
		}
		ELearningAttribute ELA = new ELearningAttribute();
		ELA.savelogs(usn,logs); 
		return score;
	}
}