package myPack2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;

public class ReadFrmPropFile {
	
	@Test
	public void atTest() throws Exception{

		String filePath = "DataStorage/testData.properties";
		
		File file = new File(filePath);
		
		FileInputStream fIP = new FileInputStream(file);
		
		Properties prop = new Properties();
		
		prop.load(fIP);
		
		String vName = prop.getProperty("name");
		System.out.println(vName);
		
		String vAdds = prop.getProperty("adds");
		System.out.println(vAdds);
	
	}

}
