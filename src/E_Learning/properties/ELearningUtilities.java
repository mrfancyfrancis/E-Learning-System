package E_Learning.properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ELearningUtilities {
	/*for property set*/
	private Properties prop;
	/*for input stream*/
	private InputStream input;
	public ELearningUtilities() {
	}
	/**
	 * property value getter
	 * @return value - the value of the property being called.
	 * @throws IOException
	 */
	public String retrievePropertyValue(String propertyValue, String propertyFile) throws IOException {
		String value = "";
		this.input = new FileInputStream(propertyFile);
		this.prop = new Properties();
		this.prop.load(input);
		value = prop.getProperty(propertyValue);
		return value;
	}
}