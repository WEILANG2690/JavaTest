package July06;

import java.util.Enumeration;
import java.util.Properties;

public class TestEnumeration {

	public static void main(String[] args) {
		Properties a1 = System.getProperties();
		Enumeration<?> b1 = a1.propertyNames();

		while (b1.hasMoreElements()) {
			String key = (String) b1.nextElement();
			String value = a1.getProperty(key);
			
			System.out.println(key+":"+value);
		}
	}

}
