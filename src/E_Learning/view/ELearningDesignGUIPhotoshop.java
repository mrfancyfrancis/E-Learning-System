package E_Learning.view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
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
public class ELearningDesignGUIPhotoshop extends JFrame {
	private static final long serialVersionUID = 1L;
	private int usn;
	protected static final ELearningDAO ELearningController = null;
	private JMenuBar mbCourses;
	private JMenu mOffice, mProg, mWeb;
	private JMenuItem mWord, mExcel, mPowerpoint, mJava1, mJava2, mHtml, mJs, mPhp, mExtra, mLogout, mAdmin;
	JMenuItem mPs;
	private JMenuItem mDreamweaver;
	private JScrollPane scroll;
	private JButton bEdit, bAT, bSubmit, bDelete;
	private JTree tTopics;
	private JPanel pMain;
	private Panel panel1, panel2;
	private JLabel lblLesson1, lblHeadline, lblQ1, lblQ2, lblQ3, lblQ4, lblQ5, lblQ6, lblQ7, lblQ8, lblQ9, lblQ10;
	public ELearningDesignGUIPhotoshop(String title) {
		super(title);
		initialize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0, 0);
		setSize(1360, 730);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		setResizable(false);
	}
	private void initialize() {
		pMain = new JPanel();	
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
		
		mExtra = new JMenu("Others");
		mbCourses.add(mExtra);		
		
		mLogout = new JMenuItem("Logout");
		mExtra.add(mLogout);
		
		mAdmin = new JMenuItem("Admin");
		mExtra.add(mAdmin);		
				
		mLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null,
						"Would you like to logout and close the program?", "Confirmation",
						JOptionPane.YES_NO_OPTION);
				if (confirm == 0) {
					System.exit(1);
				}
			}		
		});
		mAdmin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				pMain.removeAll();
				pMain.repaint();
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
	        	String options = "Options";
				tTopics.setModel(new DefaultTreeModel(new DefaultMutableTreeNode(options) {
	        		private static final long serialVersionUID = 1L;
	        			{
	        				DefaultMutableTreeNode options;
	        				options = new DefaultMutableTreeNode("Course");
	        				add(options);
	        				options = new DefaultMutableTreeNode("Question");
	        				add(options);
	        				options = new DefaultMutableTreeNode("Student");
	        				add(options);
	        			}
	        	}
	        	));
	        	panel1.add(tTopics);
	        	panel2 = new Panel();
	        	panel2.setBounds(200, 10, 1130, 660);
	        	pMain.add(panel2);
	        	panel2.setLayout(null);
	        	tTopics.addTreeSelectionListener(new TreeSelectionListener() 
	        	{
	        		public void valueChanged(TreeSelectionEvent tse) 
	        		{
	        			tTopics.getSelectionModel().setSelectionMode (TreeSelectionModel.SINGLE_TREE_SELECTION);
	        			String node = tse.getNewLeadSelectionPath().getLastPathComponent().toString();
	        			if(node.equals("Course")) {
	        				panel2.removeAll();
	        				panel2.repaint();
	        				String input = JOptionPane.showInputDialog(null, "Enter the course name for it's student table");
	        				int numput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the student number to view"));
	        				String result = ELearningDAO.searchData(numput, input);
							JTextArea txtInformation = new JTextArea();
							txtInformation.setEditable(false);
							txtInformation.setBackground(SystemColor.control);
							txtInformation.setText(result);
							txtInformation.setBounds(50, 120, 500, 300);
							Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
							txtInformation.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
						    scroll = new JScrollPane(txtInformation);
						    scroll.setBounds(25, 27, 289, 496);
						    scroll.setVisible(true);
						    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						    panel2.add(scroll);
							bDelete = new JButton("Unenroll Student");
							bDelete.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent ae) {
									int inusn = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert student usn to edit"));									
									try {
										ELearningDAO.delString(inusn,input);
									} catch (SQLException e) {
										e.printStackTrace();
									}
									panel2.revalidate();
									panel2.repaint();
								}
							});
							bDelete.setBounds(320, 300, 150, 100); 
							bDelete.setVisible(true);
							panel2.add(bDelete);
	        			} else if(node.equals("Question")) {
	        				panel2.removeAll();
	        				panel2.repaint();
	        				String input = JOptionPane.showInputDialog(null, "Enter the course name for it's question table");
	        				input ="q"+input;
	        				String topic = JOptionPane.showInputDialog(null, "Enter the the topic for your questions");
	        				String result[][] = ELearningDAO.getQ(topic, input);
	        				String display = topic+" \n ";
	        				for (int x = 0; x < result.length; x++){
	        					display = (display+"\n Question: "+result[x][0]
	        						+"\n Answer: "+result[x][1]);
	        				}
							JTextArea txtInformation = new JTextArea();
							txtInformation.setEditable(false);
							txtInformation.setBackground(SystemColor.control);
							txtInformation.setText(display);
							txtInformation.setBounds(50, 120, 500, 400);
							Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
							txtInformation.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
						    scroll = new JScrollPane(txtInformation);
						    scroll.setBounds(25, 27, 289, 496);
						    scroll.setVisible(true);
						    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						    panel2.add(scroll);
							bEdit = new JButton("Edit Question");
							bEdit.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent ae) {
									int qid = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert question id to edit"));
									String column = JOptionPane.showInputDialog(null, "Enter attribute to edit");
									String qainput = JOptionPane.showInputDialog(null, "Set "+qid+"'s "+column+" to?");
									try {
										ELearningDAO.editString(qid, column, qainput, "qphotoshop");
									} catch (SQLException e) {
										e.printStackTrace();
									}
									panel2.revalidate();
									panel2.repaint();
								}
							});
							bEdit.setBounds(320, 150, 150, 100);
							panel2.add(bEdit);
	    				} else if(node.equals("Student")) {
	    					panel2.removeAll();
	    					panel2.repaint();
	    					String display = ELearningDAO.getstudent();
							JTextArea txtInformation = new JTextArea();
							txtInformation.setEditable(false);
							txtInformation.setBackground(SystemColor.control);
							txtInformation.setText(display);
							txtInformation.setBounds(50, 120, 500, 300);
							Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
							txtInformation.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
						    scroll = new JScrollPane(txtInformation);
						    scroll.setBounds(25, 27, 289, 496);
						    scroll.setVisible(true);
						    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						    panel2.add(scroll);
							bEdit = new JButton("Edit Student");
							bEdit.addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent ae) {
									int inusn = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert student usn to edit"));
									String column = JOptionPane.showInputDialog(null, "Enter details to edit");
									String score = JOptionPane.showInputDialog(null, "Set "+inusn+"'s "+column+" to?");
									try {
										ELearningDAO.updateString(inusn, column, score, "student");
									} catch (SQLException e) {
										e.printStackTrace();
									}
									panel2.revalidate();
									panel2.repaint();
								}
							});
							bEdit.setBounds(320, 150, 150, 100);
							bDelete = new JButton("Delete Student");
							bDelete.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent ae) {
									int inusn = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert student usn to edit"));									
									try {
										ELearningDAO.delString(inusn,"student");
									} catch (SQLException e) {
										e.printStackTrace();
									}
									panel2.revalidate();
									panel2.repaint();
								}
							});
							bDelete.setBounds(320, 300, 150, 100); 
							panel2.add(bEdit);
							panel2.add(bDelete);
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
				if (checker == 0){
					JOptionPane.showMessageDialog(null,"Enrolling USN: "+logusn);
					try {
						ELearningDAO.insertData(logusn, topic);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				if (checker > 0){
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
									lblLesson1 = new JLabel("Lesson: " + lesson);
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
									bEdit = new JButton("Play Video");
									bEdit.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent ae) {
											String filetype = ELearningSystemModel.grabFileType(lesson, logusn);
											String video = lesson+"."+filetype;
											ELearningSystemModel.openfile(video);
										}
									});
									bEdit.setBounds(50, 500, 150, 100);
									bAT = new JButton("Assessment Task");
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
											lblHeadline = new JLabel("Assessment Task "+(count)+": " + lesson);
											lblHeadline.setFont(new Font("Tahoma", Font.PLAIN, 20));
											lblHeadline.setBounds(50, 11, 700, 32);
											int x = 0;
											lblQ1 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ1.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ1.setBounds(50, 41, 1000, 32);
											JTextField txtQ1 = new JTextField();
											txtQ1.setEditable(true);
											txtQ1.setVisible(true);
											txtQ1.setBounds(50, 71, 1000, 25);
											txtQ1.setBorder(border);
											x++;
											lblQ2 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ2.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ2.setBounds(50, 91, 1000, 32);
											JTextField txtQ2 = new JTextField();
											txtQ2.setEditable(true);
											txtQ2.setVisible(true);
											txtQ2.setBounds(50, 121, 1000, 25);
											txtQ2.setBorder(border);
											x++;
											lblQ3 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ3.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ3.setBounds(50, 141, 1000, 32);
											JTextField txtQ3 = new JTextField();
											txtQ3.setEditable(true);
											txtQ3.setVisible(true);
											txtQ3.setBounds(50, 171, 1000, 25);
											txtQ3.setBorder(border);
											x++;
											lblQ4 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ4.setBounds(50, 191, 1500, 32);
											lblQ4.setFont(new Font("Tahoma", Font.PLAIN, 15));
											JTextField txtQ4 = new JTextField();
											txtQ4.setEditable(true);
											txtQ4.setVisible(true);
											txtQ4.setBounds(50, 221, 1000, 25);
											txtQ4.setBorder(border);
											x++;
											lblQ5 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ5.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ5.setBounds(50, 241, 1500, 32);
											JTextField txtQ5 = new JTextField();
											txtQ5.setEditable(true);
											txtQ5.setVisible(true);
											txtQ5.setBounds(50, 271, 1000, 25);
											txtQ5.setBorder(border);
											x++;
											lblQ6 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ6.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ6.setBounds(50, 291, 1000, 32);
											JTextField txtQ6 = new JTextField();
											txtQ6.setEditable(true);
											txtQ6.setVisible(true);
											txtQ6.setBounds(50, 321, 1000, 25);
											txtQ6.setBorder(border);
											x++;
											lblQ7 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ7.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ7.setBounds(50, 341, 1000, 32);
											JTextField txtQ7 = new JTextField();
											txtQ7.setEditable(true);
											txtQ7.setVisible(true);
											txtQ7.setBounds(50, 371, 1000, 25);
											txtQ7.setBorder(border);
											x++;
											lblQ8 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ8.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ8.setBounds(50, 391, 1000, 32);
											JTextField txtQ8 = new JTextField();
											txtQ8.setEditable(true);
											txtQ8.setVisible(true);
											txtQ8.setBounds(50, 421, 1000, 25);
											txtQ8.setBorder(border);
											x++;
											lblQ9 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ9.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ9.setBounds(50, 441, 1000, 32);
											JTextField txtQ9 = new JTextField();
											txtQ9.setEditable(true);
											txtQ9.setVisible(true);
											txtQ9.setBounds(50, 471, 1000, 25);
											txtQ9.setBorder(border);
											x++;
											lblQ10 = new JLabel((x + 1) + ".) " + qs[x][0]);
											lblQ10.setFont(new Font("Tahoma", Font.PLAIN, 15));
											lblQ10.setBounds(50, 491, 1500, 32);
											JTextField txtQ10 = new JTextField();
											txtQ10.setEditable(true);
											txtQ10.setVisible(true);
											txtQ10.setBounds(50, 521, 1000, 25);
											txtQ10.setBorder(border);
											bSubmit = new JButton("Submit");
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
										    scroll = new JScrollPane(txtInformation);
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
		public int getUsn() {
			return usn;
		}	
		public void setUsn(int usn) {
			this.usn = usn;
		}
}