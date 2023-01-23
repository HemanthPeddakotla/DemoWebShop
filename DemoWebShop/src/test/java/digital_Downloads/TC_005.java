package digital_Downloads;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Library.BaseUnit;
import generic_Library.ReadData;
import pom_Repo.DigitalDownloadsPage;

public class TC_005 extends BaseUnit{
	
	@Test
	public void clickOnProduct() {
		//1.Clicking on Digital downloads category
		DigitalDownloadsPage digitalDownloads = new DigitalDownloadsPage(driver); 
		digitalDownloads.getDigitalDownloadcatergory().click();
		
		String actualDigitalDownloadsPageTile = driver.getTitle(); 
		String expectedDigitalDownloadsPageTitle = ReadData.fromProperty("DigitalDownloadPageTitle");
		
		Assert.assertEquals(expectedDigitalDownloadsPageTitle,actualDigitalDownloadsPageTile,"Digital Downloads page is not displayed");
		Reporter.log("Digital downloads page is displayed", true);
		//2.Clicking on a product  
		DigitalDownloadsPage product = new DigitalDownloadsPage(driver);
		product.getClickOnProduct().click();
		
		String expectedProductPageTitle = ReadData.fromProperty("ExpectedProductPageTitle");
		String actualProductPageTitle = driver.getTitle();
		
		Assert.assertEquals(actualProductPageTitle, expectedProductPageTitle, "Product page is not displayed");
		Reporter.log("Product page is displayed");
	}

}
