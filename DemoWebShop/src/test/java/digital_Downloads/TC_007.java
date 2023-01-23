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

public class TC_007 extends BaseUnit{
	@Test
	public void addToCartButton() {
		//1.Click on Digital download category
		DigitalDownloadsPage digitalDownloads = new DigitalDownloadsPage(driver); 
		digitalDownloads.getDigitalDownloadcatergory().click();
		
		String actualDigitalDownloadsPageTile = driver.getTitle(); 
		String expectedDigitalDownloadsPageTitle = ReadData.fromProperty("DigitalDownloadPageTitle");
		
		Assert.assertEquals(expectedDigitalDownloadsPageTitle,actualDigitalDownloadsPageTile,"Digital Downloads page is not displayed");
		Reporter.log("Digital downloads page is displayed", true);
		//2.Clicking on the product
		DigitalDownloadsPage product = new DigitalDownloadsPage(driver);
		
		product.getClickOnProduct().click();
		
		String expectedProductPageTitle = ReadData.fromProperty("ExpectedProductPageTitle");
		String actualProductPageTitle = driver.getTitle();
		
		Assert.assertEquals(actualProductPageTitle, expectedProductPageTitle, "Product page is not displayed");
		Reporter.log("Product page is displayed",true);
		//3.Clicking on add to cart button
		product.getAddToCartButton().click();
		WebDriverWait explicitWait = new WebDriverWait(driver,15);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("shopping cart")));
		
		String actualSuccessfulAddedToCartMessage = driver.findElement(By.xpath("//p[contains(text(),'The product has been added to your ')]")).getText();
		String expectedSuccessfulAddedToCartMessage = ReadData.fromProperty("ExpectedSuccessfulAddedToCartMessage");
		
		Assert.assertEquals(actualSuccessfulAddedToCartMessage, expectedSuccessfulAddedToCartMessage,"Product is not addded to cart");
		Reporter.log("Product got added to cart",true);
	}

}
