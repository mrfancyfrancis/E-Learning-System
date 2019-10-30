package E_Learning.properties;
public class ELearningQueryConstants {
	public static final String UPDATE_QUERY(String table) {
		String query= "Update "+table+" SET "
			 + "usn =?, " //1
			 + "lesson1 =?, " //2
			 + "lesson1g = ? ," //3
			 + "lesson2 = ? ," //4
			 + "lesson2g =? ," //5
			 + "lesson3  =? ," //6
			 + "lesson3g =? ," //7
			 + "lesson4 =?," //8
			 + "lesson4g =? ," //9
			 + "lesson5=? ," //10
			 + "lesson5g=? ," //11
			 + "lesson6 =? ," //12
			 + "lesson6g =? ,"//13
			 + "lesson7=? ," //14
			 + "lesson7g =?," //15
			 + "lesson8 =? ," //16
			 + "lesson8g =? ," //17
			 + "lesson9 =? " //18
			 + "lesson9g = ?"
			 + "fgrade = ?"; //19x
			return query;
	}
}
