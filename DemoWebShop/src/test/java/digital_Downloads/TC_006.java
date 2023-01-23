package digital_Downloads;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Library.BaseUnit;
import generic_Library.ReadData;
import pom_Repo.DigitalDownloadsPage;

public class TC_006 extends BaseUnit{
	@Test
	public void wishListButton() {
		DigitalDownloadsPage digitalDownloads = new DigitalDownloadsPage(driver); 
		digitalDownloads.getDigitalDownloadcatergory().click();
		
		String actualDigitalDownloadsPageTile = driver.getTitle(); 
		String expectedDigitalDownloadsPageTitle = ReadData.fromProperty("DigitalDownloadPageTitle");
		
		Assert.assertEquals(expectedDigitalDownloadsPageTitle,actualDigitalDownloadsPageTile,"Digital Downloads page is not displayed");
		Reporter.log("Digital downloads page is displayed", true);
		
		DigitalDownloadsPage product = new DigitalDownloadsPage(driver);
		product.getClickOnProduct().click();
		
		String expectedProductPageTitle = ReadData.fromProperty("ExpectedProductPageTitle");
		String actualProductPageTitle = driver.getTitle();
		
		Assert.assertEquals(actualProductPageTitle, expectedProductPageTitle, "Product page is not displayed");
		Reporter.log("Product page is displayed");
		
		DigitalDownloadsPage wishlistIcon = new DigitalDownloadsPage(driver);
		wishlistIcon.getWishListButton().click();
		
		WebDriverWait explicitWait = new WebDriverWait(driver,15);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("wishlist")));
		
		String actualSuccessfulWishlistMessage = driver.findElement(By.xpath("//p[contains(text(),'The product has been added to your ')]")).getText();
		String expectedSuccessfulWishlistMessage = ReadData.fromProperty("ExpectedSuccessfulWishlistMessage");
		
		Assert.assertEquals(actualSuccessfulWishlistMessage, expectedSuccessfulWishlistMessage, "Product is not added to wishlist");
	}

}
