package fr.eql.autom.LibrePlan;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import fr.eql.autom.LibrePlan.LogPage;

public class GRE_02Test {	
	
	
	
	WebDriver wd;
	String browserName;
	
	private String getParameter(String name) { 
		  String value = System.getProperty(name);
		  if (value == null)
		     throw new RuntimeException(name + " is not a parameter!");
		  if (value.isEmpty())
		    throw new RuntimeException(name + " is empty!");
		  if(value.equals("ie")){
			  return "internet explorer";
		  }
		  if(value.equals("chrome")){
			  return "chrome";
		  }
		  if(value.equals("firefox")){
			  return "firefox";
		  }
				  
				  return value;
		 }
	
	
	@Test //Test 04/GRE_01 Cr�er un participant - nouvel utilisateur
	
	public void test() throws Exception{ 
		System.out.println("\n LANCEMENT TEST 2");
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName(getParameter("browser"));		
			wd = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Formation\\OWASP ZAP\\webdriver\\windows\\32\\chromedriver.exe");
		wd = new ChromeDriver();*/
			
	//acc�s � l'url
	wd.get("localhost:8082/libreplan");
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	LogPage pageConnexion = PageFactory.initElements(wd, LogPage.class);
	pageConnexion.connexion("admin", "admin");
	HeaderPage headerPage = PageFactory.initElements(wd, HeaderPage.class);
	MachinesPage machinesPage = PageFactory.initElements(wd, MachinesPage.class);
	CreateMachinesPage createMachinesPage = PageFactory.initElements(wd, CreateMachinesPage.class);
	//Pas de test 1 voir Before
	System.out.println("\n PT 1");
	// si chrome est le navigateur
	if (getParameter("browser").equals("chrome")) {
	assertEquals("rgba(255, 255, 255, 1)", wd.findElement(By.xpath("//button[@id='"+headerPage.prefixe()+"7-b']")).getCssValue("color"));
	}
	
	if (getParameter("browser").equals("firefox")) {
		assertEquals("rgb(255, 255, 255)", wd.findElement(By.xpath("//button[@id='"+headerPage.prefixe()+"7-b']")).getCssValue("color"));
	}
	
	//Pas de test 2 Acc�der � la page de gestion des machines
	System.out.println("\n PT 2");
	headerPage.ResourcesMachinesHeader();
	Thread.sleep(1500);
	assertEquals("Machines List", wd.findElement(By.xpath("//div[@id='"+headerPage.prefixe()+"j4']/div[2]/div/div/div")).getText());
	Assert.assertTrue(wd.findElement(By.xpath("//div[@id='"+headerPage.prefixe()+"p5']")).isDisplayed());
	assertEquals("Name", wd.findElement(By.xpath("//div[@id='"+headerPage.prefixe()+"s5-cave']")).getText());
	assertEquals("Description", wd.findElement(By.xpath("//div[@id='"+headerPage.prefixe()+"t5-cave']")).getText());
	assertEquals("Code", wd.findElement(By.xpath("//div[@id='"+headerPage.prefixe()+"u5-cave']")).getText());
	assertEquals("Queue-based", wd.findElement(By.xpath("//div[@id='"+headerPage.prefixe()+"v5-cave']")).getText());
	assertEquals("Operations", wd.findElement(By.xpath("//div[@id='"+headerPage.prefixe()+"w5-cave']")).getText());
	Assert.assertTrue(wd.findElement(By.xpath("//i[@id='"+headerPage.prefixe()+"q4-btn']")).isDisplayed());
	Assert.assertTrue(wd.findElement(By.xpath("//input[@id='"+headerPage.prefixe()+"q4-real']")).isDisplayed());
	Assert.assertTrue(wd.findElement(By.xpath("//input[@id='"+headerPage.prefixe()+"d5']")).isDisplayed());
	Assert.assertTrue(wd.findElement(By.xpath("//td[@id='"+headerPage.prefixe()+"f5-cnt']")).isDisplayed());
	Assert.assertTrue(wd.findElement(By.xpath("//table[@id='"+headerPage.prefixe()+"n5-box']/tbody/tr[2]/td[2]")).isDisplayed());
	Assert.assertTrue(wd.findElement(By.xpath("//table[@id='"+headerPage.prefixe()+"x5-box']/tbody/tr[2]/td[2]")).isDisplayed());
	
	//Pas de test 3 Cr�er une machine - Acc�s au formulaire de cr�ation
	System.out.println("\n PT 3");
	machinesPage.creerMachines();
	Thread.sleep(1000);
	assertEquals("Create Machine", wd.findElement(By.xpath("//td[@id='"+headerPage.prefixe()+"z5-cnt']")).getText());
	assertEquals("700", wd.findElement(By.xpath("//div[@id='"+headerPage.prefixe()+"16-hm']/span")).getCssValue("font-weight"));
	
	//Pas de test 4 Cr�er une machine - Conformit� de l'onglet "Donn�es de la machine"
	System.out.println("\n PT 4");
	
	if (getParameter("browser").equals("chrome")) {
	Assert.assertEquals("rgba(51, 51, 51, 1)",wd.findElement(By.xpath("//td[@id='"+headerPage.prefixe()+"g6-chdex']/input[@disabled]")).getCssValue("color"));
	}
	
	if (getParameter("browser").equals("firefox")) {
		Assert.assertEquals("rgb(51, 51, 51)",wd.findElement(By.xpath("//td[@id='"+headerPage.prefixe()+"g6-chdex']/input[@disabled]")).getCssValue("color"));
	}
	Assert.assertTrue(createMachinesPage.checkBoxGenerateCode.isSelected());
	assertEquals("", wd.findElement(By.xpath("//input[@id='"+headerPage.prefixe()+"n6']")).getText());
	assertEquals("", wd.findElement(By.xpath("//input[@id='"+headerPage.prefixe()+"k6']")).getText());
	assertEquals("Normal resource", createMachinesPage.type.getAttribute("value"));
	Assert.assertTrue(wd.findElement(By.xpath("//table[@id='"+headerPage.prefixe()+"jd-box']/tbody/tr[2]/td[2]")).isDisplayed());
	Assert.assertTrue(wd.findElement(By.xpath("//table[@id='"+headerPage.prefixe()+"kd-box']/tbody/tr[2]/td[2]")).isDisplayed());
	Assert.assertTrue(wd.findElement(By.xpath("//table[@id='"+headerPage.prefixe()+"ld-box']/tbody/tr[2]/td[2]")).isDisplayed());
	
	//Pas de test 5 Cr�er une machine - Bouton [Sauver et continuer]
	System.out.println("\n PT 5");
	createMachinesPage.decocherCheckbox();
	Thread.sleep(1000);
	createMachinesPage.ajouterBloc("MACHINETEST1","MACHINETEST1","MACHINETEST1");
	createMachinesPage.SaveAndContinueMachines();
	Thread.sleep(1000);
	//assertEquals("Machine \"MACHINETEST1\" saved", wd.findElement(By.xpath("//span[@id='"+headerPage.prefixe()+"m7']")).getText());
	//assertEquals("Edit Machine: MACHINETEST1", wd.findElement(By.xpath("//td[@id='"+headerPage.prefixe()+"z5-cnt']")).getText());

	//Pas de Test 6 Retour page de gestion des machines
	System.out.println("\n PT 6");
	createMachinesPage.CancelMachines();
	Thread.sleep(2000);
	assertEquals("Machines List", wd.findElement(By.xpath("//div[@id='"+headerPage.prefixe()+"j4-cap']")).getText());
	Assert.assertNotEquals(-1, machinesPage.presenceMachine("MACHINETEST1", "MACHINETEST1", "MACHINETEST1"));
	}
	
	@After
	public void teardown(){
		wd.quit();
	}
	
}
