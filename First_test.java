package selenium_webdriver_practise;

import org.openqa.selenium.chrome.ChromeDriver;



public class First_test {
	public static void main(String[] args)
	{
		System.setProperty(" webdriver.chrome.driver","C:\\Program Files\\java_files\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("htt://www.learn.automation.com");
		System.out.println(driver.getTitle());
	}

}
