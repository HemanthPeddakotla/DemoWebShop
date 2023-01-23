package digital_Downloads;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Library.BaseUnit;
import generic_Library.ReadData;
import pom_Repo.DigitalDownloadsPage;

public class TC_003 extends BaseUnit{
	
	@Test
	public void displayDropDown() {
		//1.Clicking on Digital downloads category
		DigitalDownloadsPage digitalDownloads = new DigitalDownloadsPage(driver); 
		digitalDownloads.getDigitalDownloadcatergory().click();
		
		String actualDigitalDownloadsPageTile = driver.getTitle(); 
		String expectedDigitalDownloadsPageTitle = ReadData.fromProperty("DigitalDownloadPageTitle");
		
		Assert.assertEquals(expectedDigitalDownloadsPageTitle,actualDigitalDownloadsPageTile,"Digital Downloads page is not displayed");
		Reporter.log("Digital downloads page is displayed", true);
		
		//2.Clicking on Display dropdown
		DigitalDownloadsPage displayDropDown = new DigitalDownloadsPage(driver);
		displayDropDown.getDisplayDropDown().click();
		Reporter.log("Display drop down is displayed",true);
		
		
		
	}

}
