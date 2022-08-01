package Hw3S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SignInAndTasks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
 		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		String title=driver.getTitle();

		if(title.equals("Instagram"))
		{
			System.out.println(" Pass title");
			
		}
		else
			System.out.println(" fail title");
		
		

 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 

 //////////////log in ///////////////////////////////
 
	driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).sendKeys("konafa03091@gmail.com");

	driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys("Ashraf03091");

	try {
		Thread.sleep(2000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//div[contains(text(),'Log In')]")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div/div/button")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button[2]")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//////////////////////////////////////////////////////////////////////////////////////
	
	
	
	////////////////////////follow/////////////////////////////////////////////////////
	
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/section/div/div/div/div/div/div[1]/div[3]/button")).click();

	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/section/div/div/div[1]/div/div/div[2]/div[3]/button")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/section/div/div/div[1]/div/div/div[3]/div[3]/button")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/section/div/div/div[1]/div/div/div[4]/div[3]/button")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/////////////////search  + follow  ///////////////////////////////////////////////////////////////////////////////////////////////
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/div[1]/div")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/ul/div/a/div")).click();

	
	
	
	try 
	{
		Thread.sleep(4000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/header/section/div[1]/div[1]/div/div/div/span/span[1]/button")).click();

	
////////////////////////////////////////////////////////// 
 /////////////////////////send message////////////////////////////////////////
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/header/section/div[1]/div[1]/div/div[1]/div/button")).click();

 
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea")).click();

 
	try {
		Thread.sleep(2000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea")).sendKeys("Hello Ashraf !");


	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button")).click();

	
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/span")).click();
	
 /////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	//////////////////////////Go Home  ///////////////////////////////////////////////////////
	
	
	
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.navigate().back(); 
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.navigate().back(); 


	try {
		Thread.sleep(5000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	//driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div[1]/div/div[1]/div[1]/div/a/div[2]")).click();



	driver.findElement(By.xpath("/html/body/div[5]/div[3]/button/div/svg")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[1]/a/div/div/img")).click();
	try {
		Thread.sleep(3000);
	} 
 catch (InterruptedException e)
 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
			/////////////////////////////////////
	
	
	///////////////////Edit/////////////////////////////////////////////////
	
	
	/////////////////////////////////////////////////////////////////////////////
			

		 try {
				Thread.sleep(6000);
			} 
		 catch (InterruptedException e)
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.quit();
		
	}

}
