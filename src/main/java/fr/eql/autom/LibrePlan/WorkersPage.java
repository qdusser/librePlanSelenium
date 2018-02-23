package fr.eql.autom.LibrePlan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WorkersPage extends ElementPage {

	public WorkersPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//div[contains(@id, 's5-cave')]")
	public WebElement colonneSurname;
	
	@FindBy(how=How.XPATH, using="//div[contains(@id, 't5-cave')]")
	public WebElement colonneFirstName;
	
	@FindBy(how=How.XPATH, using="//div[contains(@id, 'u5-cave')]")
	public WebElement colonneID;
	
	@FindBy(how=How.XPATH, using="//div[contains(@id, 'v5-cave')]")
	public WebElement colonneCode;
	
	@FindBy(how=How.XPATH, using="//div[contains(@id, 'w5-cave')]")
	public WebElement colonneQueue;
	
	@FindBy(how=How.XPATH, using="//div[contains(@id, 'x5-cave')]")
	public WebElement colonneOperations;
	
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'd5')]")
	public WebElement champPersonalDetails;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'i5-real')]")
	public WebElement champDebutPeriod;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'k5-real')]")
	public WebElement champFinPeriod;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'q5-real')]")
	public WebElement numeroPage;
	
	@FindBy(how=How.XPATH, using="//input[contains(@id, 'q5']/table/tbody/tr/td[6]')]")
	public WebElement totalPage;
	
	
	@FindBy(how=How.XPATH, using="//select[contains(@id, 'm5')]")
	public WebElement typePeriod;
	
	@FindBy(how=How.XPATH, using="//i[contains(@id, 'q4')]")
	public WebElement champFilterBy;
	
	@FindBy(how=How.XPATH, using="//i[contains(@id, 'q4-btn')]")
	public WebElement loupe;
		

	
	public void creerWorker(){
		WebElement btnCreateWorkers = driver.findElement(By.xpath("//table[@id='"+prefixe()+"y5-box']/tbody/tr[2]/td[2]"));
		btnCreateWorkers.click();
	}
	
	public void ajouterPersonalDetails(String recherche){
		champPersonalDetails.sendKeys(recherche);
	}
	
	public void ajouterOptions(){
		WebElement btnMoreOptions = driver.findElement(By.xpath("//td[@id='"+prefixe()+"f5-cnt']"));	
		btnMoreOptions.click();
	}
	
	public void filtrer(){
		WebElement btnFilter = driver.findElement(By.xpath("//table[@id='"+prefixe()+"n5-box']/tbody/tr[2]/td[2]"));
		btnFilter.click();
	}
	
	public void nextPage(){
		WebElement btnNextPage = driver.findElement(By.xpath("//table[@id='"+prefixe()+"q5-next']/tbody/tr[1]/td[2]/em/button"));
		btnNextPage.click();
	}
	
	public void lastPage(){
		WebElement btnLastPage = driver.findElement(By.xpath("//table[@id='"+prefixe()+"q5-last']/tbody/tr[1]/td[2]/em/button"));
		btnLastPage.click();
	}
	
	public void prevPage(){
		WebElement btnPrevPage = driver.findElement(By.xpath("//table[@id='"+prefixe()+"q5-prev']/tbody/tr[1]/td[2]/em/button"));
		btnPrevPage.click();
	}
	
	public void firstPage(){
		WebElement btnFirstPage = driver.findElement(By.xpath("//table[@id='"+prefixe()+"q5-first']/tbody/tr[1]/td[2]/em/button"));
		btnFirstPage.click();
	}
	
	public void triColonneSurnamePage(){
		this.colonneSurname.click();
	}
	
	public int presenceWorker(String surname, String firstname,String id){
		int compteurDeLigne = 1;
		List<WebElement> lignes = driver.findElements(By.xpath("//div[@id='"+prefixe()+"p5']/div[3]/table/tbody[2]/tr"));
		
		for(WebElement ligne : lignes){
			List<WebElement> cases = ligne.findElements(By.xpath("./td/div"));
			
			if(cases.get(0).getText().equals(surname) && cases.get(1).getText().equals(firstname) && cases.get(2).getText().equals(id)){
				return compteurDeLigne;
			}
			
			compteurDeLigne = compteurDeLigne+1;
		}
		return -1;
	}
	
	public String pages(){
		WebElement pages = driver.findElement(By.xpath("//div[contains(@id, 'q5')]/table/tbody/tr/td[6]"));
		String nombrePages = pages.getText();
		String totalPages = nombrePages.substring(1);
		String pageMax = totalPages.trim();
		return pageMax;
		}
	
}
