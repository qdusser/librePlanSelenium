package fr.eql.autom.LibrePlan;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateWorkersPage extends CreateElementPage {

	public CreateWorkersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'k6')]")
	public WebElement code;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'l6-real')]")
	public WebElement checkBoxGenerateCode;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'o6')]")
	public WebElement firstName;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'u6')]")
	public WebElement lastName;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'x6')]")
	public WebElement idWorkers;
	
	@FindBy(how=How.XPATH, using="//select[contains(@id, '17')]")
	public WebElement type;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'if-real')]") 
	public WebElement notBound;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'jf-real')]") 
	public WebElement existingUser;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'kf-real')]") 
	public WebElement createNewUser;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'kf-real')]") 
	public WebElement notBound2;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'lf-real')]") 
	public WebElement existingUser2;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'mf-real')]") 
	public WebElement createNewUser2;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'i8')]")
	public WebElement userName;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'l8')]")
	public WebElement password;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'o8')]")
	public WebElement passwordConfirm;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'r8')]")
	public WebElement email;
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox z-popup']")
	public WebElement popError;		
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-center']")
	public WebElement popErrorText;		
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-right z-errbox-close']")
	public WebElement popErrorClose;	
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-right z-errbox-close z-errbox-close-over']")
	public WebElement popErrorCloseBouton;	
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-left z-arrow-u']")
	public WebElement arrowUp;
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-left z-arrow-ru']")
	public WebElement arrowRightUp;
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-left z-arrow-lu']")
	public WebElement arrowLeftUp;
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-left z-arrow-d']")
	public WebElement arrowDown;
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-left z-arrow-rd']")
	public WebElement arrowRightDown;
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-left z-arrow-ld']")
	public WebElement arrowLeftDown;
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-left z-arrow-r']")
	public WebElement arrowRight;
	
	@FindBy(how=How.XPATH, using="//div[@class='z-errbox-left z-arrow-l']")
	public WebElement arrowLeft;
	
	
	public void ajouterBloc1(String prenom, String nom, String id){
		firstName.clear();
		firstName.sendKeys(prenom);
		lastName.clear();
		lastName.sendKeys(nom);
		idWorkers.clear();
		idWorkers.sendKeys(id);
	}
	
	public void creerNouvelUtilisateur(){
		createNewUser.click();
	}
	
	public void creerNouvelUtilisateur2(){
		createNewUser2.click();
	}
	
	public void utilisateurExistant(){
		existingUser.click();
	}
	
	public void utilisateurExistant2(){
		existingUser2.click();
	}
	
	public void ajouterBloc2(String username, String mdp, String mdp2, String adresse){
		userName.clear();
		userName.sendKeys(username);
		password.clear();
		password.sendKeys(mdp);
		passwordConfirm.clear();
		passwordConfirm.sendKeys(mdp2);
		email.clear();
		email.sendKeys(adresse);
	}
	
	public WorkersPage SaveWorkers(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixe()+"7f-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, WorkersPage.class);
	}
	
	public WorkersPage SaveAndContinueWorkers(){
		WebElement boutonSaveContinue = driver.findElement(By.xpath("//table[@id='"+prefixe()+"8f-box']/tbody/tr[2]/td[2]"));
		boutonSaveContinue.click();
		return PageFactory.initElements(driver, WorkersPage.class);
	}
	
	public WorkersPage CancelWorkers(){
		WebElement boutonCancel = driver.findElement(By.xpath("//table[@id='"+prefixe()+"9f-box']/tbody/tr[2]/td[2]"));
		boutonCancel.click();
		return PageFactory.initElements(driver, WorkersPage.class);
	}
	
	public WorkersPage SaveWorkers2(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixe()+"9f-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, WorkersPage.class);
	}
	
	public WorkersPage SaveAndContinueWorkers2(){
		WebElement boutonSaveContinue = driver.findElement(By.xpath("//table[@id='"+prefixe()+"af-box']/tbody/tr[2]/td[2]"));
		boutonSaveContinue.click();
		return PageFactory.initElements(driver, WorkersPage.class);
	}
	
	public WorkersPage CancelWorkers2(){
		WebElement boutonCancel = driver.findElement(By.xpath("//table[@id='"+prefixe()+"bf-box']/tbody/tr[2]/td[2]"));
		boutonCancel.click();
		return PageFactory.initElements(driver, WorkersPage.class);
	}
	
	
	public boolean assertArrow() throws InterruptedException{
		boolean assertArrow = false;
		
		boolean arrowLU = false;
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(popError, 0, 100).build().perform();
		Thread.sleep(1000);
		if(arrowLeftUp.isDisplayed()){
			arrowLU = true;	
		}
	
		boolean arrowU = false;
		actions.dragAndDropBy(popError, -400, 0).build().perform();
		Thread.sleep(1000);
		if(arrowUp.isDisplayed()){
			arrowU = true;
		}
		
		boolean arrowRU = false;
		actions.dragAndDropBy(popError, -300, 0).build().perform();
		Thread.sleep(1000);
		if(arrowRightUp.isDisplayed()){
			arrowRU = true;
		}
	
		boolean arrowR = false;
		actions.dragAndDropBy(popError, 0, -100).build().perform();
		Thread.sleep(1000);
		if(arrowRight.isDisplayed()){
			arrowR = true;
		}
	
		boolean arrowRD = false;
		actions.dragAndDropBy(popError, 0, -100).build().perform();
		Thread.sleep(1000);
		if(arrowRightDown.isDisplayed()){
			arrowRD = true;
		}
	
		boolean arrowD = false;
		actions.dragAndDropBy(popError, 300, 0).build().perform();
		Thread.sleep(1000);
		if(arrowDown.isDisplayed()){
			arrowD = true;
		}
	
		boolean arrowLD = false;
		actions.dragAndDropBy(popError, 400, 0).build().perform();
		Thread.sleep(1000);
		if(arrowLeftDown.isDisplayed()){
			arrowLD = true;
		}
			
		boolean arrowL = false;
		actions.dragAndDropBy(popError, 0, 100).build().perform();
		Thread.sleep(1000);
		if(arrowLeft.isDisplayed()){
			arrowL = true;
		}
	
		if(arrowLU == true && arrowU == true && arrowRU == true && arrowR == true && arrowRD == true && arrowD == true && arrowLD == true && arrowL == true){
			assertArrow = true;
			}
		return assertArrow;
		}
	
		public void assertText() throws InterruptedException{
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(popErrorText).build().perform();
		Thread.sleep(1000);
		}		
	
		public void fermerPopError() throws InterruptedException{
		Actions mouseover = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		mouseover.moveToElement(popErrorClose).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='z-errbox-right z-errbox-close']")));
		popErrorClose.click();
		}
		
		public void assertPopError(String rgba, String message) throws InterruptedException{
		assertEquals(rgba, driver.findElement(By.xpath("//div[@class='z-errbox z-popup']")).getCssValue("border-top-color"));
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@class='z-errbox-left z-arrow-l']")).isDisplayed());
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='z-errbox-right z-errbox-close']")).isDisplayed());
		assertEquals(message, driver.findElement(By.xpath("//div[@class='z-errbox-center']")).getText());
		}
			
}
