package bindings;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class BindingPage {

    WebDriver driver;

    //String driverPath = "C:\\geckodriver.exe";

    @Given("^that I naviagate to www\\.blueskycitadel\\.com$")
    public void that_I_naviagate_to_www_blueskycitadel_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();

        driver = new ChromeDriver();


    //    System.setProperty("webdriver.firefox.marionette", driverPath);
         //       driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(27, TimeUnit.SECONDS);
        driver.get("http://www.blueskycitadel.com/");
        driver.findElement(By.cssSelector("#popmake-1342 > button")).click();
        driver.manage().window().maximize();

    }

    @When("^I click the homepage menu$")
    public void i_click_the_homepage_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
       // menu-item-528
        driver.findElement(By.id("menu-item-528")).click();
    }

    @Then("^I can view the home page$")
    public void i_can_view_the_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    /*    String ET ="BlueSkyCitadel";
        String AT = driver.getTitle();

        Assert.assertEquals(ET,AT);*/

       // driver.quit();


        if(driver.getPageSource().contains("Welcome to BlueSky Citadel"))
        {
            System.out.println("Home Page has Passed the test");
        }
        else
        {
            System.out.println("Home Page has failed the test");
        }
    }



    //this is for the about us page
    @When("^I click the about menu$")
    public void i_click_the_about_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("menu-item-527")).click();
    }

    @Then("^I should be able to  view the about us page$")
    public void i_should_be_able_to_view_the_about_us_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        if(driver.getPageSource().contains("We have made a significant progress with over 80"))
        {
            System.out.println("About Page has Passed the test");
        }
        else
        {
            System.out.println("About Page has failed the test");
        }

    }

//this is for the contact us page

    @Given("^I click the Contact menu$")
    public void i_click_the_Contact_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("menu-item-524")).click();
    }

    @Given("^I fill the contact us form$")
    public void i_fill_the_contact_us_form() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("wpforms-755-field_0")).sendKeys("Flora");
        driver.findElement(By.id("wpforms-755-field_0-last")).sendKeys("Fayehun");
        driver.findElement(By.id("wpforms-755-field_1")).sendKeys("flora.fayehun@yahoo.com");
        driver.findElement(By.id("wpforms-755-field_2")).sendKeys("Please give me a call back");

    }

    @When("^I click the submit button$")
    public void i_click_the_submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("wpforms-submit-755")).click();
    }

    @Then("^It should be successfully submitted$")
    public void it_should_be_successfully_submitted() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement errorMessage= driver.findElement(By.id("wpforms-confirmation-755"));
        Assert.assertEquals(errorMessage.getText(),"Thanks for contacting us! We will be in touch with you shortly.");
    }


    //this is for the event page
    @When("^I click the event menu$")
    public void i_click_the_event_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("menu-item-704")).click();
    }

    @Then("^I can view the event page$")
    public void i_can_view_the_event_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if(driver.getPageSource().contains("Events for"))
        {
            System.out.println("Event Page has Passed the test");
        }
        else
        {
            System.out.println("Event Page has failed the test");
        }

    }


    //this is for the gallery page

    @When("^I click the gallery menu$")
    public void i_click_the_gallery_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("menu-item-904")).click();
    }

    @Then("^I can view the gallery page$")
    public void i_can_view_the_gallery_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if(driver.getPageSource().contains("Gallery"))
        {
            System.out.println("Gallery Page has Passed the test");
        }
        else
        {
            System.out.println("Gallery Page has failed the test");
        }

    }


    //courses page
    @When("^I click the course menu$")
    public void i_click_the_course_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   driver.findElement(By.id("menu-item-579")).click();
    }

    @Then("^I should be able to  view the course page with videos$")
    public void i_should_be_able_to_view_the_course_page_with_videos() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       /* if(driver.getPageSource().contains("Business Analysis"))
        {
            System.out.println("Courses Page has Passed the test");
        }
        else
        {
            System.out.println("Courses Page has failed the test");
        }*/
    }


    //tennager application
    @Given("^I click the Youth Application Form menu$")
    public void i_click_the_Youth_Application_Form_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

     WebElement   menu = driver.findElement(By.xpath("//*[@id=\"menu-item-1306\"]/a"));

     //this moves mouse pointer to drop down menu
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        driver.findElement(By.id("menu-item-1299")).click();



    }

    @Given("^I fill all the fields$")
    public void i_fill_all_the_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("nf-field-59")).sendKeys("Flora");
        driver.findElement(By.id("nf-field-60")).sendKeys("Fayehun");
        driver.findElement(By.id("nf-field-61")).sendKeys("planox2jsam@yahoo.com");
        driver.findElement(By.id("nf-field-62")).sendKeys("0897889897");
        driver.findElement(By.id("nf-field-55")).sendKeys("Flora Address United Kingdom");

        driver.findElement(By.id("nf-label-class-field-66-2")).click();
        driver.findElement(By.id("nf-label-field-64-1")).click();
        driver.findElement(By.id("nf-label-field-64-4")).click();
        driver.findElement(By.name("nf-field-63")).sendKeys("My personal statement statement personal");
        driver.findElement(By.id("nf-field-56")).sendKeys("Btech Computer Science");

          }

    @When("^I click the Register button$")
    public void i_click_the_Register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("nf-field-57")).click();
    }

    @Then("^I should be registered with a success message$")
    public void i_should_be_registered_with_a_success_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if(driver.getPageSource().contains("BlueSky Citadel Team has received your application and would get back to you soon."))
        {
            System.out.println("Teenager Application has Passed the test");
        }
        else
        {
            System.out.println("Teenager Application has failed the test");
        }

    }


    @Given("^I click the Adult Application Form menu$")
    public void i_click_the_Adult_Application_Form_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions



        WebElement   menu2 = driver.findElement(By.xpath("//*[@id=\"menu-item-1306\"]/a"));

        //this moves mouse pointer to drop down menu
        Actions actions = new Actions(driver);
        actions.moveToElement(menu2).perform();
        driver.findElement(By.id("menu-item-1312")).click();
    }

    @Given("^I fill all the fields on the form$")
    public void i_fill_all_the_fields_on_the_form() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.id("nf-field-34")).sendKeys("Shade");
        driver.findElement(By.id("nf-field-35")).sendKeys("Toluhi");
        driver.findElement(By.id("nf-field-36")).sendKeys("adekunlefayehun@yahoo.com");
        driver.findElement(By.id("nf-field-37")).sendKeys("08098997778");
        driver.findElement(By.id("nf-field-44")).sendKeys("Testing address");
        driver.findElement(By.id("nf-label-field-46-0")).click();
        driver.findElement(By.id("nf-field-42")).sendKeys("Testing personal statement");
        driver.findElement(By.id("nf-field-45")).sendKeys("Testing background");
    }

    @When("^I click the Register Button$")
    public void i_click_the_Register_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("nf-field-32")).click();
    }

    @Then("^I should be registered successfully with a success message$")
    public void i_should_be_registered_successfully_with_a_success_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if(driver.getPageSource().contains("BlueSky Citadel Team has received your application and would get back to you soon."))
        {
            System.out.println("Adult Application has Passed the test");
        }
        else
        {
            System.out.println("Adult Application has failed the test");
        }
    }

    //user registration

    @Given("^I click the Register / Login link on the menu$")
    public void i_click_the_Register_Login_link_on_the_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.id("menu-item-1283")).click();
    }

    @Given("^I click the Not a member yet\\? Register now link$")
    public void i_click_the_Not_a_member_yet_Register_now_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.cssSelector("#ur-frontend-form > form > div > div > p.user-registration-register.register > a")).click();
    }

    @Given("^I fill all the form fields$")
    public void i_fill_alltheform_fields() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("user_login")).sendKeys("Shade");
    driver.findElement(By.id("user_email")).sendKeys("flora.toluhi@yahoo.com");
    driver.findElement(By.id("user_pass")).sendKeys("TomJones@1");
    driver.findElement(By.id("user_confirm_password")).sendKeys("TomJones@1");
}

    @Given("^I click register button$")
    public void i_click_register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("#user-registration-form-1243 > form > div.ur-button-container > button")).click();
    }

    @Then("^I should be registered as a student$")
    public void i_should_be_registered_as_a_student() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    //    WebElement errorMessage2= driver.findElement(By.id("ur-submit-message-node"));
      //  Assert.assertEquals(errorMessage2.getT0[
        //  bfcext(),"User registered. Verify your email by clicking on the link sent to your email.");

        if(driver.getPageSource().contains("User registered. Verify your email"))
        {
            System.out.println("User Registration has Passed the test");
        }
        else
        {
            System.out.println("User Registration has failed the test");
        }

    }



    //resources
    @When("^I click the resource menu$")
    public void i_click_the_resource_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   driver.findElement(By.id("menu-item-579")).click();
    }

    @Then("^I should be able to  view the resources page with download buttons$")
    public void i_should_be_able_to_view_the_resources_page_with_download_buttons() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}


/*
package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageobjectmodel {

    public pageobjectmodel(WebDriver driver){

        PageFactory.initElements(driver, this);
    }



}
*/