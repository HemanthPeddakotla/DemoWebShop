package digital_Downloads;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Library.BaseUnit;
import generic_Library.ReadData;
import pom_Repo.DigitalDownloadsPage;

public class TC_002 extends BaseUnit{
	
	@Test
	public void sortByDropDown() {
		//1.Clicking in Digital downloads category
		DigitalDownloadsPage digitalDownloads = new DigitalDownloadsPage(driver); 
		digitalDownloads.getDigitalDownloadcatergory().click();
		
		String actualDigitalDownloadsPageTile = driver.getTitle(); 
		String expectedDigitalDownloadsPageTitle = ReadData.fromProperty("DigitalDownloadPageTitle");
		
		Assert.assertEquals(expectedDigitalDownloadsPageTitle,actualDigitalDownloadsPageTile,"Digital Downloads page is not displayed");
		Reporter.log("Digital downloads page is displayed", true);
		
		//2.Clicking on sortBy drop down
		DigitalDownloadsPage  sortBy = new DigitalDownloadsPage(driver);
		sortBy.getSortByDropDown().click();
		Reporter.log("Sort by drop down got displayed", true);
		
	}

}
