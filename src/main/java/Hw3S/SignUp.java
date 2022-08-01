package Hw3S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SignUp {

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
 
 
 
 
          
          //////////////sign up ///////////////////////////////
	driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/div/p/a/span")).click();


	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
          
		//driver.navigate().back();  رجوع 

     //  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/label[1]/input[1]")).sendKeys("konafa03091@gmail.com");
		driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/label[1]/input[1]")).sendKeys("Ashraf_Laith");
		driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/label[1]/input[1]")).sendKeys("AshrafLaith03091");
		driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/label[1]/input[1]")).sendKeys("Ashraf03091");
		driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]")).click();

		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[1]/select[1]")).click();

		
		WebElement dr1=driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[1]/select[1]"));
		try {
			Thread.sleep(2000);
		} 
	 catch (InterruptedException e)
	 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select s1=new Select(dr1);
		s1.selectByValue("2");

		
		///
		try {
			Thread.sleep(2000);
		} 
	 catch (InterruptedException e)
	 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[2]/select[1]")).click();

		
		WebElement dr2=driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[2]/select[1]"));
		try {
			Thread.sleep(2000);
		} 
	 catch (InterruptedException e)
	 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select s2=new Select(dr2);
		s2.selectByValue("8");

		///
		try {
			Thread.sleep(2000);
		} 
	 catch (InterruptedException e)
	 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[3]/select[1]")).click();

		
		WebElement dr3=driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[3]/select[1]"));
		try {
			Thread.sleep(2000);
		} 
	 catch (InterruptedException e)
	 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select s3=new Select(dr3);
		s3.selectByValue("2000");
//

		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	
		///
		
	
		
		
		
		
		
		 try {
				Thread.sleep(20000);
			} 
		 catch (InterruptedException e)
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

			driver.findElement(By.xpath("//body]")).click();

			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			
			
			

			 try {
					Thread.sleep(3000);
				} 
			 catch (InterruptedException e)
			 {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			driver.findElement(By.xpath("//input[@id='f2df60ab06049f8']")).sendKeys("0594478368");

			 try {
					Thread.sleep(3000);
				} 
			 catch (InterruptedException e)
			 {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			driver.findElement(By.xpath("//button[contains(text(),'Send Confirmation')]")).click();

			 try {
					Thread.sleep(30000);
				} 
			 catch (InterruptedException e)
			 {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			 
				driver.findElement(By.xpath("//button[contains(text(),'Back to Instagram')]")).click();

				
				
				 try {
						Thread.sleep(6000);
					} 
				 catch (InterruptedException e)
				 {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[5]/div[2]/div[1]")).click();

					try {
						Thread.sleep(1000);
					} 
				 catch (InterruptedException e)
				 {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					driver.findElement(By.xpath("//div[contains(text(),'Log Out')]")).click();
/////////////////////////////////////////////////////////////////////////////////////////

	
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
