package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class TestMe {
	
	 public static WebDriver driver;
	 public static WebDriverWait wait;
	 
	
	@Given("I want to type the URL")
	public void i_want_to_type_the_URL() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Desktop\\praveen\\driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://192.168.40.4:8083/TestMeApp1");
	     driver.manage().window().maximize();
	     
	}
	@Given("click on SignUp")
	public void click_on_SignUp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    driver.findElement(By.partialLinkText("SignUp")).click();
	}

	@Then("I enter the username")
	public void i_enter_the_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.id("userName")).sendKeys("Praveen124");
	}

	@Then("enter the First name")
	public void enter_the_First_name() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.id("firstName")).sendKeys("Praveen");
	}

	@Then("enter the last name")
	public void enter_the_last_name() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.id("lastName")).sendKeys("Kumar");
	}

	@Then("enter the password")
	public void enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.id("password")).sendKeys("openpanunga");
	}

	@Then("enter the confirm password")
	public void enter_the_confirm_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.id("pass_confirmation")).sendKeys("openpanunga");
	}

	@Then("choose the Gender")
	public void choose_the_Gender() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//input[@value='Male']")).click();
	}

	@Then("enter the E-mail")
	public void enter_the_E_mail() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("emailAddress")).sendKeys("praveen@gmail.com");
	}

	@Then("enter the mobile number")
	public void enter_the_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("mobileNumber")).sendKeys("9786778978");
	}

	@Then("enter the DOB")
	public void enter_the_DOB() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("dob")).sendKeys("12/10/1964");
	}

	@Then("enter the Address")
	public void enter_the_Address() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("address")).sendKeys("chennai");
	}

	@Then("I choose the Security question")
	public void i_choose_the_Security_question() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 Select qn = new Select(driver.findElement(By.id("securityQuestion")));
		 qn.selectByVisibleText("What is your Birth Place?");
	}

	@Then("enter the answer")
	public void enter_the_answer() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.id("answer")).sendKeys("chennai");
	}

	@Then("I click on Register")
	public void i_click_on_Register() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath(".//input[@value='Register']")).click();
	}

	@Then("I click on SignIn button")
	public void i_click_on_SignIn_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@Then("I Enter {string} and {string}")
	public void i_Enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}

	@Then("I click on Login")
	public void i_click_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}

	@Then("TestMe app Homepage is displayed")
	public void testme_app_Homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.partialLinkText("SignOut"));
	}
	
	@When("User Search particular product like Head Phone")
	public void user_Search_particular_product_like_Head_Phone() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("myInput")).sendKeys("Headphone");
		driver.findElement(By.xpath(".//input[@value='FIND DETAILS']")).click();
	}

	@When("try to proceed to payment page without adding the item in the cart")
	public void try_to_proceed_to_payment_page_without_adding_the_item_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		if(driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0)
			
		{
		 driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
		}
		else
		{
			System.out.println("\n\nIcon not visible\n\n");
		}
	}

	@Then("TestMe app  does not display the cart icon")
	public void testme_app_does_not_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertEquals(0,driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size());
	
		
	}
	
		}		
	




