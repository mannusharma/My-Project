package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestRegistration {
	@Test(dataProvider="regdata")
	public void testreg(String UserName, String password, String Login, String Country)
	{
		System.out.println(UserName+ "--" + password + "--" + Login + "--" + Country);
	}

	
	@DataProvider
	public Object[][] regdata()
	{
		Object[][] data =new Object[3][4];
		
          data[0][0]="User1";
          data[0][1]="Pass1";
          data[0][2]="User1L";
          data[0][3]="India";
          
          data[1][0]="User2";
          data[1][1]="Pass2";
          data[1][2]="User2L";
          data[1][3]="India2";
          
          data[2][0]="User3";
          data[2][1]="Pass3";
          data[2][2]="User3L";
          data[2][3]="India3";
          
          return data;
		
	}
}
