package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {
	
	public void getPhoto(WebDriver driver) throws IOException  {
		
		Date d = new Date(0);
		String currentdate = d.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(AutoConstant.photopath+".png");
		FileUtils.copyFile(src, dest);
	
		
		
	}

}
