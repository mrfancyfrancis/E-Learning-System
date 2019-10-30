package E_Learning.model;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class ELearningAttribute implements Serializable {
	/**
	 * 
	 */
	//Inner Outter Class
	class Attb implements Serializable {
		public int usn;
		public String logs;
		private static final long serialVersionUID = 1L;
	}
	//Serialization
	public void savelogs(int usn, String logs) {
		Attb attb = new Attb();
		attb.usn = usn;
		attb.logs = logs;
		System.out.println(attb.logs);	
		try {
			FileOutputStream fileOut = new FileOutputStream("logs.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(attb);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in ./logs.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	public static String openlogs() throws Exception {
		String logs = "";
		Attb attb = null;
		try {
			FileInputStream fileIn = new FileInputStream("logs.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			attb = (Attb) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i)  {
			i.printStackTrace();
		}catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		logs = attb.logs;
		return logs;
	}
	private static final long serialVersionUID = 1L;
}