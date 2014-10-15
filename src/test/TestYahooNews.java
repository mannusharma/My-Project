package test;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestYahooNews {
	
	@BeforeTest
	public void gettingurl()
	{
		System.out.println("getting url for Yahoo news");
		//throw new SkipException("skipping news because of reason");
	}
	@AfterTest
	public void closeurl()
	{
		System.out.println("closing url for Yahoo news");
	}
	@Test
	public void test2()
	{
		
		System.out.println("Test Yahoo news only method");
		//Assert.assertTrue(4>5, "Error is generated");
		
	}

}
