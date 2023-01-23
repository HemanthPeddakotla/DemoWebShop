package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPage {
	
	public DigitalDownloadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloadcatergory;

	public WebElement getDigitalDownloadcatergory() {
		return digitalDownloadcatergory;
	}
	
	@FindBy(id = "products-orderby")
	private WebElement sortByDropDown;

	public WebElement getSortByDropDown() {
		return sortByDropDown;
	}
	
	@FindBy(xpath = "//option[text()='Name: A to Z']")
	private WebElement nameOption;

	public WebElement getNameOption() {
		return nameOption;
	}
	
	@FindBy(id = "products-pagesize")
	private WebElement displayDropDown;

	public WebElement getDisplayDropDown() {
		return displayDropDown;
	}
	
	@FindBy(id = "products-viewmode")
	private WebElement viewDropDown;

	public WebElement getViewDropDown() {
		return viewDropDown;
	}
	
	@FindBy(linkText = "3rd Album")
	private WebElement clickOnProduct;

	public WebElement getClickOnProduct() {
		return clickOnProduct;
	}
	
	@FindBy(id = "add-to-wishlist-button-53")
	private WebElement wishListButton;

	public WebElement getWishListButton() {
		return wishListButton;
	}
	
	@FindBy(id = "add-to-cart-button-53")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	private WebElement shoppingcartButtton;

	public WebElement getShoppingcartButtton() {
		return shoppingcartButtton;
	}
	
	@FindBy(name = "removefromcart")
	private WebElement removeCheckbox;

	public WebElement getRemoveCheckbox() {
		return removeCheckbox;
	}
	
	@FindBy(name = "updatecart")
	private WebElement updateShoppingcartButton;

	public WebElement getUpdateShoppingcartButton() {
		return updateShoppingcartButton;
	}
	
	@FindBy(name = "termsofservice")
	private WebElement termsAndConditionsCheckbox;

	
	public WebElement getTermsAndConditionsCheckbox() {
		return termsAndConditionsCheckbox;
	}

	@FindBy(id = "checkout")
	private WebElement checkoutButton;

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

}
