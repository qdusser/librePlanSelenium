package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProjectsListPage extends PlanPage {
	
	public ProjectsListPage(WebDriver driver) {
		super(driver);
	}
	


	public ProjectDetailsPage selectionProject(String nomProjet){
		WebElement project =driver.findElement(By.xpath("//span[.='"+nomProjet+"']"));
		project.click();
		return PageFactory.initElements(driver, ProjectDetailsPage.class);
	}
	
	public void elementProjet1(){
		try{
		driver.findElement(By.xpath("//tr[@id='"+prefixe()+"ja']/td/div/span")).click();
		}catch(NoSuchElementException ex){
			
		}
	}
	
	public void verifieName(String text){
		WebElement element = driver.findElement(By.xpath("//th[@id='"+prefixe()+"45']/div"));
		text.equals(element.getText());
	}
	
	public void verifieCode(String text){
		WebElement element = driver.findElement(By.xpath("//th[@id='"+prefixe()+"55']/div"));
		text.equals(element.getText());
	}
	
	public void verifieDateDebut(String text){
		WebElement element = driver.findElement(By.xpath("//th[@id='"+prefixe()+"65']/div"));
		text.equals(element.getText());
	}
	
	public void verifieDateFin(String text){
		WebElement element = driver.findElement(By.xpath("//th[@id='"+prefixe()+"75']/div"));
		text.equals(element.getText());
	}
	
	public void verifieClients(String text){
		WebElement element = driver.findElement(By.xpath("//th[@id='"+prefixe()+"85']/div"));
		text.equals(element.getText());
	}
	
	public void verifieBudget(String text){
		WebElement element = driver.findElement(By.xpath("//th[@id='"+prefixe()+"95']/div"));
		text.equals(element.getText());
	}
	
	public void verifieHeures(String text){
		WebElement element = driver.findElement(By.xpath("//th[@id='"+prefixe()+"a5']/div"));
		text.equals(element.getText());
	}
	
	public void verifieEtat(String text){
		WebElement element = driver.findElement(By.xpath("//th[@id='"+prefixe()+"b5']/div"));
		text.equals(element.getText());
	}
	
	public void verifieOperation1(String text){
		WebElement element = driver.findElement(By.xpath("//span[@id='"+prefixe()+"f7']"));
		text.equals(element.getAttribute("title"));
	}
	
	public void verifieOperation2(String text){
		WebElement element = driver.findElement(By.xpath("//span[@id='"+prefixe()+"g7']"));
		text.equals(element.getAttribute("title"));
	}
	
	public void verifieOperation3(String text){
		WebElement element = driver.findElement(By.xpath("//span[@id='"+prefixe()+"h7']"));
		text.equals(element.getAttribute("title"));
	}
	
	public void verifieOperation4(String text){
		WebElement element = driver.findElement(By.xpath("//span[@id='"+prefixe()+"i7']"));
		text.equals(element.getAttribute("title"));
	}

	
}
