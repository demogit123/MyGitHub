package primusbank.tests;

import primusbank.library.PrimusBankHomePage;
import utils.Apputils;

public class AdminLoginTest 
{

	public static void main(String[] args) 
	{

		Apputils.launchApp("http://primusbank.qedgetech.com");
		
		PrimusBankHomePage phome=new PrimusBankHomePage();
		boolean res=phome.adminLogin("Admin", "Admin");
		if(res)
		{
			System.out.println("Admin Login Test Pass");
		}else
		{
			System.out.println("Admin Login Test Fail");
		}
		phome.logout();
		
		Apputils.closeApp();	

	}

}
