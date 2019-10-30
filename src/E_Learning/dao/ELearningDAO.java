package E_Learning.dao;
import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import E_Learning.properties.ELearningConstants;
import E_Learning.properties.ELearningUtilities;
public class ELearningDAO {
	public static ELearningUtilities utils = new ELearningUtilities(); 
	public static Connection conn = null;
	public static void connect() throws SQLException {
		try {
		String driver = utils.retrievePropertyValue(ELearningConstants.driverProperties, ELearningConstants.propertyFile);
		String username = utils.retrievePropertyValue(ELearningConstants.usernameProperties, ELearningConstants.propertyFile);
		String password = utils.retrievePropertyValue(ELearningConstants.passwordProperties, ELearningConstants.propertyFile);
		String url = utils.retrievePropertyValue(ELearningConstants.dburl, ELearningConstants.propertyFile);
		Class.forName(driver);
		conn = (Connection) DriverManager.getConnection(url, username, password = "root");
		}	catch(Exception e){
			 e.printStackTrace();
		}
	}
	public static int checkUSN(int usn) throws SQLException {
		connect();
		final String queryCheck = "SELECT count(*) from photoshop WHERE usn = ?";
		int count = 0;
		final PreparedStatement ps = (PreparedStatement) conn.prepareStatement(queryCheck);
		ps.setInt(1, usn);
		final ResultSet resultSet = ps.executeQuery();
		if(resultSet.next()) {
		    count = resultSet.getInt(1);
		}
		return count;
	}
	public static void insertData(int usn, String topic) throws SQLException {
		try {
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/elearningdb?useSSL=false", "root", "root");
			String sql = "INSERT INTO "+topic+" (`usn`, `info`, `lesson1`, `lesson1f`, `lesson1i`, `lesson1g`, `lesson1d`, `lesson2`, `lesson2f`, `lesson2i`, `lesson2g`, `lesson2d`, `lesson3`, `lesson3f`, `lesson3i`, `lesson3g`, `lesson3d`, `lesson4`, `lesson4f`, `lesson4i`, `lesson4g`, `lesson4d`, `lesson5`, `lesson5f`, `lesson5i`, `lesson5g`, `lesson5d`, `lesson6`, `lesson6f`, `lesson6i`, `lesson6g`, `lesson6d`, `lesson7`, `lesson7f`, `lesson7i`, `lesson7g`, `lesson7d`, `lesson8`, `lesson8f`, `lesson8i`, `lesson8g`, `lesson8d`, `lesson9`, `lesson9f`, `lesson9i`, `lesson9g`, `lesson9d`, `lesson10`, `lesson10f`, `lesson10i`, `lesson10g`, `lesson10d`, `lesson11`, `lesson11f`, `lesson11i`, `lesson11g`, `lesson11d`, `lesson12`, `lesson12f`, `lesson12i`, `lesson12g`, `lesson12d`, `lesson13`, `lesson13f`, `lesson13i`, `lesson13g`, `lesson13d`, `lesson14`, `lesson14f`, `lesson14i`, `lesson14g`, `lesson14d`, `lesson15`, `lesson15f`, `lesson15i`, `lesson15g`, `lesson15d`, `fgrade`, `photo`) VALUES ("+usn+", 'Photoshop is unlike other common software interfaces which emulate virtual typewriters or graphing paper. Photoshop creates an artists virtual studio/darkroom. When you open the program you see a toolbox on the left with tools you will use to manipulate your images, and on the right, a white square which is your canvas or work area. The gray area surrounding the canvas is not part of your image, but only defines its edges.By completing this course, youd learn different techniques in photo manipulating using Adobe Photoshop plus knowing more terms, information and jargons about images and its property types.', 'Basic', 'mp4', 'This lesson is all about the basic things needed in order for beginners to be familiar using photoshop. This particular lesson will give user the knowledge of the basic of saving, shape tools, opening, and knowing the use of different panels in photoshop.', '0', 'Undone', 'Cropping', 'pptx', 'This lesson is all about getting to know how to use the cropping, resizing, and rotating. It is basically helping beginners in photoshop to know how to use the basics of crop, resize and rotate image to have a better preference for the position of a certain image.', '0', 'Undone', 'Saving Options', 'mp4', 'This lesson is all about saving  different works in different  from most other applications. It will basically offers a variety of ways to save your images along with some common reasons to save files in different formats.', '0', 'Undone', 'Layers', 'pptx', 'This lesson is all about Layer. This introduces what Layer actually is. Beginners from this lesson will be able to determine what layer is, and how and why does it need to use Layers to improve in enhancing image.', '0', 'Undone', 'Adjustment Panel', 'pptx', 'This lesson is all about Levels and Curves, Saturation, Auto Adjustement Tools  different works in photoshop. This lesson will basically offer a variety of ways to enhance your images. In this lesson, we will talk about the different options in Photoshop, along with some common reasons to edit well files in different formats.', '0', 'Undone', 'Sharpening', 'pptx', 'This lesson is all about sharpening, what it is and how to use it. This lesson will basically offer a better knowledge for photohop beginners in enhancing the quality of images using sharpening tool.', '0', 'Undone', 'Background Layers', 'pptx', 'In this lesson, we will talk about some of the more advanced options, such as opacity, blending modes, layer masks, and layer groups. We will also provide links to additional resources if you want to learn more about using these tools.', '0', 'Undone', 'Brush Tool', 'pptx', 'In this lesson, we will talk about Eraser, Spot Healing Brush. We will also provide beginners a better knowledge using different types of Brush Tools. You will also have different settings to choose from, which can help you customize it for different situations.', '0', 'Undone', 'Text Tool', 'pptx', 'In this lesson, we will talk about Text Tool. We will also provide beginners a better knowledge using Text Tool to, and being able to customized the text  to suit the users’ need. After the this topic the user will be able to use Text Tool better', '0', 'Undone', 'Hide Layers', 'mp4', 'In this lesson, we will talk more about Layers Panel. In this topic user will be able to have a deeper understanding in maximizing the uses of Layers and the Layers Panel.', '0', 'Undone', 'Layer Masks', 'mp4', 'In this lesson, we will talk about Free Transform. In this topic users will be able to determine what Free Transform is. Also users will be taught different ways in enhancing photo editing', '0', 'Undone', 'Gradient', 'mp4', 'In this lesson, we will talk about Gradient Editor. Users are provided a good knowledge about how Gradient Editor is used, and the other tools that can be coordinated in order to maximize the capabilities of Gradient Editor.', '0', 'Undone', 'Blending', 'mp4', 'In this lesson, we will talk about Layer Masks and Gradients. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Layer Masks together with Gradients.', '0', 'Undone', 'Free Transform', 'mp4', 'In this lesson, we will talk about Layer Masks. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using purely the functionalities of Layer Masks.', '0', 'Undone', 'Histogram', 'mp4', 'In this lesson, we will talk about Histogram. In this topic user will acquire a good knowledge and will be able to perform the basic to advance techniques using Histogram, basically showing users how many shadows, midtones, and highlights there are in the image.', '0', 'Undone', '0', 'ps.jpg')";
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);	
			statement.execute();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateInt(int usn, String lessonf, int score, String topic) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/elearningdb?useSSL=false", "root", "root");
		    String sql = "UPDATE "+topic+" SET "+lessonf+" = "+score+" where usn = "+usn+"";
		    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.executeUpdate(sql);
			statement.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateString(int usn, String column, String score, String topic) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/elearningdb?useSSL=false", "root", "root");
		    String sql = "UPDATE "+topic+" SET "+column+" = '"+score+"' where usn = "+usn+"";
		    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.executeUpdate(sql);
			statement.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	public static void editString(int qid, String column, String input, String topic) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/elearningdb?useSSL=false", "root", "root");
		    String sql = "UPDATE "+topic+" SET "+column+" = '"+input+"' where qid = "+qid+"";
		    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.executeUpdate(sql);
			statement.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	public static void delString(int usn, String topic) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/elearningdb?useSSL=false", "root", "root");
		    String sql = "DELETE from "+topic+" where usn = "+usn+"";
		    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.executeUpdate(sql);
			statement.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	/*
	 * @param searchedRecord
	 * @return
	 */
	//SQL Statement
	public static String searchData(int searchedRecord, String topic) {
		try {
			String driver = utils.retrievePropertyValue(ELearningConstants.driverProperties, ELearningConstants.propertyFile);
			String username = utils.retrievePropertyValue(ELearningConstants.usernameProperties, ELearningConstants.propertyFile);
			String password = utils.retrievePropertyValue(ELearningConstants.passwordProperties, ELearningConstants.propertyFile);
			String url = utils.retrievePropertyValue(ELearningConstants.dburl, ELearningConstants.propertyFile);
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password = "root");
			Statement statement = (Statement) conn.createStatement();
			String info = "";
	    	ResultSet result = statement.executeQuery("Select * from "+topic+" where usn = " + searchedRecord);
	    	while (result.next()) {
	    		info = searchedData(result);
			}
	    	return info;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	public static String getstudent() {
		try {
			String driver = utils.retrievePropertyValue(ELearningConstants.driverProperties, ELearningConstants.propertyFile);
			String username = utils.retrievePropertyValue(ELearningConstants.usernameProperties, ELearningConstants.propertyFile);
			String password = utils.retrievePropertyValue(ELearningConstants.passwordProperties, ELearningConstants.propertyFile);
			String url = utils.retrievePropertyValue(ELearningConstants.dburl, ELearningConstants.propertyFile);
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password = "root");
			Statement statement = (Statement) conn.createStatement();
			String info = "Student List:";
	    	ResultSet result = statement.executeQuery("Select * from student");
	    	while (result.next()){
	    		info = (info+"\n"+
					" Student Number: " + result.getInt("usn") + "\n" +
					" Lastname:    " +result.getString("lname")+ "\n" +
					" Firstname: " + result.getString("fname")+ "\n" +
					" Password:    " +result.getString("pass")+ "\n");			
	    	}
	    	return info;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	/*
	 * @param result
	 * @return
	 * @throws SQLException
	 */
	/*
	 * @param searchedRecord
	 * @return
	 */
	public static String[][] getQ(String lesson, String table) {
		try {
			String driver = utils.retrievePropertyValue(ELearningConstants.driverProperties, ELearningConstants.propertyFile);
			String username = utils.retrievePropertyValue(ELearningConstants.usernameProperties, ELearningConstants.propertyFile);
			String password = utils.retrievePropertyValue(ELearningConstants.passwordProperties, ELearningConstants.propertyFile);
			String url = utils.retrievePropertyValue(ELearningConstants.dburl, ELearningConstants.propertyFile);
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password = "root");
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement("SELECT * FROM "+table+" WHERE lesson =?");
			statement.setString(1,lesson);
			String[][] qInfo = new String[10][2];
	    	ResultSet result = statement.executeQuery();
	    	int x = 0;
	    	while (result.next()) {
	    		qInfo[x][0] = result.getString("question");
	    		qInfo[x][1] = result.getString("answer");
	    		x++;
	    	}
	    	return qInfo;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	private static String searchedData(ResultSet result) throws SQLException {
		String info;
		info = ( "Student Number: " + result.getInt("usn") + "\n" +
				"Lesson:    " +result.getString("lesson1")+ "\n" +
				"Grade: " + result.getInt("lesson1g")+ "\n" +
				"Lesson:    " +result.getString("lesson2")+ "\n" +
				"Grade: " + result.getInt("lesson2g")+ "\n" +
				"Lesson:    " +result.getString("lesson3")+ "\n" +
				"Grade: " + result.getInt("lesson3g")+ "\n" +
				"Lesson:    " +result.getString("lesson4")+ "\n" +
				"Grade: " + result.getInt("lesson4g")+ "\n" +
				"Lesson:    " +result.getString("lesson5")+ "\n" +
				"Grade: " + result.getInt("lesson5g")+ "\n" +
				"Lesson:    " +result.getString("lesson6")+ "\n" +
				"Grade: " + result.getInt("lesson6g")+ "\n" +
				"Lesson:    " +result.getString("lesson7")+ "\n" +
				"Grade: " + result.getInt("lesson7g")+ "\n" +
				"Lesson:    " +result.getString("lesson8")+ "\n" +
				"Grade: " + result.getInt("lesson8g")+ "\n" +
				"Lesson:    " +result.getString("lesson9")+ "\n" +
				"Grade: " + result.getInt("lesson9g")+ "\n" +
				"Lesson:    " +result.getString("lesson10")+ "\n" +
				"Grade: " + result.getInt("lesson10g")+ "\n" +
				"Lesson:    " +result.getString("lesson11")+ "\n" +
				"Grade: " + result.getInt("lesson11g")+ "\n" +
				"Lesson:    " +result.getString("lesson12")+ "\n" +
				"Grade: " + result.getInt("lesson12g")+ "\n" +
				"Lesson:    " +result.getString("lesson13")+ "\n" +
				"Grade: " + result.getInt("lesson13g")+ "\n" +
				"Lesson:    " +result.getString("lesson14")+ "\n" +
				"Grade: " + result.getInt("lesson14g")+ "\n" +
				"Lesson:    " +result.getString("lesson15")+ "\n" +
				"Grade: " + result.getInt("lesson15g")+ "\n" +
				"Final Grade: " + result.getInt("fgrade"));
		return info;
	}
	/*
	 * @param searchedRecord
	 * @return
	 */
	public static String[] getData(int searchedRecord) {
		try {
			String driver = utils.retrievePropertyValue(ELearningConstants.driverProperties, ELearningConstants.propertyFile);
			String username = utils.retrievePropertyValue(ELearningConstants.usernameProperties, ELearningConstants.propertyFile);
			String password = utils.retrievePropertyValue(ELearningConstants.passwordProperties, ELearningConstants.propertyFile);
			String url = utils.retrievePropertyValue(ELearningConstants.dburl, ELearningConstants.propertyFile);
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password = "root");
			Statement statement = (Statement) conn.createStatement();
			String[] info = new String[15];
	    	ResultSet result = statement.executeQuery("Select * from photoshop where usn = " + searchedRecord);
	    	while (result.next()) {
	    		info[0] = (result.getString("lesson1"));
	    		info[1] = (result.getString("lesson2"));
	    		info[2] = (result.getString("lesson3"));
	    		info[3] = (result.getString("lesson4"));
	    		info[4] = (result.getString("lesson5"));
	    		info[5] = (result.getString("lesson6"));
	    		info[6] = (result.getString("lesson7"));
	    		info[7] = (result.getString("lesson8"));
				info[8] = (result.getString("lesson9"));
				info[9] = (result.getString("lesson10"));
				info[10] = (result.getString("lesson11"));
				info[11] = (result.getString("lesson12"));
				info[12] = (result.getString("lesson13"));
				info[13] = (result.getString("lesson14"));
				info[14] = (result.getString("lesson15"));
	    	}
	    	return info;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String[] getILO(int searchedRecord) {
		try {
			String driver = utils.retrievePropertyValue(ELearningConstants.driverProperties, ELearningConstants.propertyFile);
			String username = utils.retrievePropertyValue(ELearningConstants.usernameProperties, ELearningConstants.propertyFile);
			String password = utils.retrievePropertyValue(ELearningConstants.passwordProperties, ELearningConstants.propertyFile);
			String url = utils.retrievePropertyValue(ELearningConstants.dburl, ELearningConstants.propertyFile);
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password = "root");
			Statement statement = (Statement) conn.createStatement();
			String[] info = new String[15];
	    	ResultSet result = statement.executeQuery("Select * from photoshop where usn = " + searchedRecord);
	    	while (result.next()) {
	    		info[0] = (result.getString("lesson1i"));
	    		info[1] = (result.getString("lesson2i"));
	    		info[2] = (result.getString("lesson3i"));
	    		info[3] = (result.getString("lesson4i"));
	    		info[4] = (result.getString("lesson5i"));
				info[5] = (result.getString("lesson6i"));
				info[6] = (result.getString("lesson7i"));
				info[7] = (result.getString("lesson8i"));
				info[8] = (result.getString("lesson9i"));
				info[9] = (result.getString("lesson10i"));
				info[10] = (result.getString("lesson11i"));
				info[11] = (result.getString("lesson12i"));
				info[12] = (result.getString("lesson13i"));
				info[13] = (result.getString("lesson14i"));
				info[14] = (result.getString("lesson15i"));
	    	}
	    	return info;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String[] getFiletype(int searchedRecord) {
		try {
			String driver = utils.retrievePropertyValue(ELearningConstants.driverProperties, ELearningConstants.propertyFile);
			String username = utils.retrievePropertyValue(ELearningConstants.usernameProperties, ELearningConstants.propertyFile);
			String password = utils.retrievePropertyValue(ELearningConstants.passwordProperties, ELearningConstants.propertyFile);
			String url = utils.retrievePropertyValue(ELearningConstants.dburl, ELearningConstants.propertyFile);
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password = "root");
			Statement statement = (Statement) conn.createStatement();
			String[] info = new String[15];
	    	ResultSet result = statement.executeQuery("Select * from photoshop where usn = " + searchedRecord);
	    	while (result.next()) {
	    		info[0] = (result.getString("lesson1f"));
	    		info[1] = (result.getString("lesson2f"));
	    		info[2] = (result.getString("lesson3f"));
	    		info[3] = (result.getString("lesson4f"));
	    		info[4] = (result.getString("lesson5f"));
	    		info[5] = (result.getString("lesson6f"));
	    		info[6] = (result.getString("lesson7f"));
	    		info[7] = (result.getString("lesson8f"));
	    		info[8] = (result.getString("lesson9f"));
	    		info[9] = (result.getString("lesson10f"));
	    		info[10] = (result.getString("lesson11f"));
	    		info[11] = (result.getString("lesson12f"));
	    		info[12] = (result.getString("lesson13f"));
	    		info[13] = (result.getString("lesson14f"));
	    		info[14] = (result.getString("lesson15f"));
	    	}
	    	return info;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String getEntry(int searchedRecord, String column) {
		try {
			String driver = utils.retrievePropertyValue(ELearningConstants.driverProperties, ELearningConstants.propertyFile);
			String username = utils.retrievePropertyValue(ELearningConstants.usernameProperties, ELearningConstants.propertyFile);
			String password = utils.retrievePropertyValue(ELearningConstants.passwordProperties, ELearningConstants.propertyFile);
			String url = utils.retrievePropertyValue(ELearningConstants.dburl, ELearningConstants.propertyFile);
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password = "root");
			Statement statement = (Statement) conn.createStatement();
			String info = "";
	    	ResultSet result = statement.executeQuery("Select * from photoshop where usn = " + searchedRecord);
	    	while (result.next()) {
	    		info = (result.getString(column));
	    	}
	    	return info;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String retrieveUsernameAndPassword(int usn, String pwd) {
		try {
			String driver = utils.retrievePropertyValue(ELearningConstants.driverProperties, ELearningConstants.propertyFile);
			String username = utils.retrievePropertyValue(ELearningConstants.usernameProperties, ELearningConstants.propertyFile);
			String password = utils.retrievePropertyValue(ELearningConstants.passwordProperties, ELearningConstants.propertyFile);
			String url = utils.retrievePropertyValue(ELearningConstants.dburl, ELearningConstants.propertyFile);
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password = "root");
			Statement statement = (Statement) conn.createStatement();
			String info = "";
	    	ResultSet result = statement.executeQuery("Select * from student where usn = " + usn + " and pass = " + "'"+pwd+"'");
	    	while (result.next()) {
	    		int retrievedUsn = result.getInt("usn");
	    		String retrievedPassword = result.getString("pass");
				info = String.valueOf(retrievedUsn);
	    	}
	    	return info;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}