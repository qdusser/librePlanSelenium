package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateMachinesPage extends CreateElementPage {

	public CreateMachinesPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'h6-real')]")
	public WebElement checkBoxGenerateCode;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'g6')]")
	public WebElement code;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'k6')]")
	public WebElement name;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'n6')]")
	public WebElement description;
	
	@FindBy(how=How.XPATH, using="//select[contains(@id, 's6')]")
	public WebElement type;
	
	
	public MachinesPage SaveMachines(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixe()+"jd-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, MachinesPage.class);
	}
	
	public MachinesPage SaveAndContinueMachines(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixe()+"kd-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, MachinesPage.class);
	}
	
	public MachinesPage CancelMachines(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixe()+"ld-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, MachinesPage.class);
	}
	
	public void decocherCheckbox(){
		checkBoxGenerateCode.click();
	}

	public void ajouterBloc(String codeMachine, String nameMachine, String descriptionMachine){
		code.clear();
		code.sendKeys(codeMachine);
		name.sendKeys(nameMachine);
		description.sendKeys(descriptionMachine);
	}
}
