package test;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class YahooMail {
	
	@BeforeTest
	public void gettingurl()
	{
		System.out.println("getting url for Yahoo mail");
	}
	@AfterTest
	public void closeurl()
	{
		System.out.println("closing url for Yahoo mail");
	}
	
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login for yahoo mail");
		//throw new SkipException("skipping because of reason");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	@Test
	public void test1()
	{
		System.out.println("Test Yahoo mail 1 method");
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test Yahoo mail 2 method");
	}
	@BeforeSuite
	public void connecdb()
	{
		System.out.println("connection to DB initiating");
	}
	@AfterSuite
	public void closeconnedb()
	{
		System.out.println("connection to db closing");
	}

}
