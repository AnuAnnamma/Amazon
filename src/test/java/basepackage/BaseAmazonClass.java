package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.TimeUtils;

public class BaseAmazonClass {
	public static Properties prop=new Properties();
	//declare global variable for WebDriver driver so that all class can use this driver
	public static WebDriver driver;

//Step 1 - create constructor of this class
	public BaseAmazonClass() {
		//in this constructor i write code to read property from config.properties file
		//write code to read property from any file
		try {//instead of add throw exception we are using try and catch
		FileInputStream file=new FileInputStream("C:\\Users\\josep\\eclipse-workspace\\AmazonWebsiteProject\\src\\test\\java\\environmentvaraibles\\Config.properties");
		prop.load(file);
	}
	
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		catch(IOException a) {
			a.printStackTrace();
		}
	}
		
		/*Step 2 - I will create method under which i keep all common commands 
		           used for rest of the class(child class)*/
		public static void initiate() 
		{
			
			String browsername=prop.getProperty("browser");
			
			if (browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\josep\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
				else if (browsername.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
					driver=new ChromeDriver();
					}
		
				
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage, TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
				
		}
			
		
}

