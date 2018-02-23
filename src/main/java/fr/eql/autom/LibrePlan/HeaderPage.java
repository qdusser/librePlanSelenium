package fr.eql.autom.LibrePlan;

import org.junit.ComparisonFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

protected final WebDriver driver;
	
	public HeaderPage(WebDriver driver){
	super();
	this.driver = driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//button[contains(@id, '7-b')]")
	WebElement planningHeader;
	
	@FindBy(how=How.XPATH, using="//button[contains(@id, 'r-b')]")
	WebElement resourcesHeader;
	
	@FindBy(how=How.XPATH, using="//button[contains(@id, '0-b')]")
	WebElement costHeader;
	
	@FindBy(how=How.XPATH, using="//button[contains(@id, '1-b')]")
	WebElement configurationHeader;
	
	@FindBy(how=How.XPATH, using="//button[contains(@id, '22-b')]")
	WebElement reportsHeader;
	
	
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, 'a-a')]")
	WebElement planningProjectsHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, 't-a')]")
	WebElement resourcesWorkersHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, 'u-a')]")
	WebElement resourcesMachinesHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, 'w-a')]")
	WebElement resourcesCalendarsHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, 'x-a')]")
	WebElement resourcesCalendarExceptionHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, 'y-a')]")
	WebElement resourcesCriteriaHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, '20-a')]")
	WebElement resourcesQualityHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, 'r0-a')]")
	WebElement costTimesheetsHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, 'v0-a')]")
	WebElement costCategoriesHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, 'c1-a')]")
	WebElement configurationProfilesHeader;
	
	@FindBy(how=How.XPATH, using="//a[contains(@id, '82-a')]")
	WebElement reportsEstimatedHeader;
	
	
	
	public ProjectPage PlanningProjectsHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(planningHeader).moveToElement(planningProjectsHeader).click().build().perform();
		return PageFactory.initElements(driver, ProjectPage.class);
	}
	
	public ProjectPage reessaiBoucle(){
		
		for(int i=0; i<10; i++){
			try{
				
				Actions mouseHover = new Actions(driver);
				mouseHover.moveToElement(planningHeader).moveToElement(planningProjectsHeader).click().build().perform();
				return PageFactory.initElements(driver, ProjectPage.class);
				
			} catch(StaleElementReferenceException ex){
				
				//on ignore l'exception
			}
		}
		
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(planningHeader).moveToElement(planningProjectsHeader).click().build().perform();
		return PageFactory.initElements(driver, ProjectPage.class);
	}

	
	public ProjectPage boucleHeader(){
		
		try{
		
			Actions mouseHover = new Actions(driver);
			mouseHover.moveToElement(planningHeader).moveToElement(planningProjectsHeader).click().build().perform();
			return PageFactory.initElements(driver, ProjectPage.class);
			
		} catch(StaleElementReferenceException ex){
			
			return reessaiBoucle();
		}
	}
	
	public WorkersPage ResourcesWorkersHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(resourcesHeader).moveToElement(resourcesWorkersHeader).click().build().perform();
		return PageFactory.initElements(driver, WorkersPage.class);
	}
	
	public MachinesPage ResourcesMachinesHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(resourcesHeader).moveToElement(resourcesMachinesHeader).click().build().perform();
		return PageFactory.initElements(driver, MachinesPage.class);
	}
	
	public CalendarsPage ResourcesCalendarsHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(resourcesHeader).moveToElement(resourcesCalendarsHeader).click().build().perform();
		return PageFactory.initElements(driver, CalendarsPage.class);
	}
	
	public CalendarExceptionPage ResourcesCalendarExceptionHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(resourcesHeader).moveToElement(resourcesCalendarExceptionHeader).click().build().perform();
		return PageFactory.initElements(driver, CalendarExceptionPage.class);
	}
	
	public CriteriaPage ResourcesCriteriaHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(resourcesHeader).moveToElement(resourcesCriteriaHeader).click().build().perform();
		return PageFactory.initElements(driver, CriteriaPage.class);
	}
	
	public QualityPage ResourcesQualityHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(resourcesHeader).moveToElement(resourcesQualityHeader).click().build().perform();
		return PageFactory.initElements(driver, QualityPage.class);
	}
	
	public TimesheetsPage CostTimesheetsHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(costHeader).moveToElement(costTimesheetsHeader).click().build().perform();
		return PageFactory.initElements(driver, TimesheetsPage.class);
	}
	
	public CategoriesPage CostCategoriesHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(costHeader).moveToElement(costCategoriesHeader).click().build().perform();
		return PageFactory.initElements(driver, CategoriesPage.class);
	}
	
	public ProfilesPage ConfigurationProfilesHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(configurationHeader).moveToElement(configurationProfilesHeader).click().build().perform();
		return PageFactory.initElements(driver, ProfilesPage.class);
	}
	
	public EstimatedPage ReportsEstimatedHeader(){
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(reportsHeader).moveToElement(reportsEstimatedHeader).click().build().perform();
		return PageFactory.initElements(driver, EstimatedPage.class);
	}
	
	
	public String prefixe(){
		WebElement bouton = driver.findElement(By.xpath("//body/div"));
		String idBouton = bouton.getAttribute("id");
		String prefix = idBouton.substring(0, 4);
		return prefix;
	}

}
