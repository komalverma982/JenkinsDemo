package hj;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "komal is going to school" ;
		 String words[]=str.split(" ");  
		    String reverseWord=""; 
		    int count= words.length;
		    System.out.println(count);
		   for (int i = count-1 ; i>=0; i--)
		    {
		   
		    	reverseWord=reverseWord+words[i];
		    	
		    	
		    } */
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.verma982\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); */
		
		/*int a= 10;
		a=20;
		final int b = a;
		System.out.println(b);
		a=20;
		
		System.out.println(b); */
		
	/*	Scanner sc= new Scanner(System.in);  
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		System.out.print("Enter third number- ");  
		int c= sc.nextInt();  
		int d=a+b+c;  
		System.out.println("Total= " +d);   */
		
	/*	Scanner s = new Scanner(System.in);
		System.out.print("Enter first number- ");  
			String c=	s.next();
		String reverse = "";
		char[]d= c.toCharArray();
		int length = c.length();
		for(int i = length-1; i>=0; i--) 
		{
			reverse=reverse+d[i];
		}
		System.out.print(reverse);  
	} 
		boolean isPrime = true;
		int num = 72;
		int temp;
		for (int i=2; i<num/2; i++)
		{
			temp= num%i;
			if(temp==0)
			{
				 isPrime = false;
				break;
			}
		}
			if(isPrime = false)
			System.out.print("not a prime number");  
			else
				System.out.print(" a prime number");  
		} */
		
	/*	int a=0;
		int b=0;
		int c=1;
		int num = 72;
		for(int i=0; i<num; i++)
		{
			
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);  				
		} 
		
		int num= 756789;
		int digit = 0;
		int reverse= 0;
		
		while(num!=0)
		{
			digit= num%10;
			reverse=reverse*10+digit ;
			num= num/10;
					
		} */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.verma982\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/"); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[text()=' Amritsar (ATQ)']")).click();
		driver.findElement(By.xpath("(//*[text()=' Bengaluru (BLR)'])[2]")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //[text()=' Amritsar (ATQ)']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //[text()=' Bengaluru (BLR)']")).click();
		//ctl00_mainContent_ddl_destinationStation1_CTNR
		//ctl00_mainContent_ddl_originStation1_CTNR
		
		
				
	}
		
	}

