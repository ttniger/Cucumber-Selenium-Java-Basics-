package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
//import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert.*;
import pages.LoginPage;

public class loginStep extends BaseUtil {
    public static final String url = "http://www.executeautomation.com/demosite/Login.html";
    public loginStep(BaseUtil base) {
        this.base = base;
    }

    private BaseUtil base;


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage()throws Throwable {
//        System.out.println ("Navigate to login page\n");
        base.Driver.navigate ().to ( url );
        //Thread.sleep ( 2000 );
    }

//    @And("^I enter the username as admin and password as admin$")
//    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
//        System.out.println ("");
//    }

//    @And("^I enter the username as \"([^\"]*)\" and \"([^\"]*)\" as admin$")
//    public void iEnterTheUsernameAsAndAsAdmin(String username , String adminpassword) throws Throwable {
//        System.out.println("UserName is " +username +" and password is " +adminpassword+"\n");
//    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
//        System.out.println ("Click login button\n");
        LoginPage page = new LoginPage (base.Driver);
        page.ClickLogin ();
//        base.Driver.findElement ( By.name ( "Login" ) ).submit ();
    }

    @Then("^I should see userform page$")
    public void iShouldSeeUserformPage() throws Throwable {
       Assert.assertEquals("Its not displayed",base.Driver.findElement ( By.id ( "Initial" )  ).isDisplayed (),true);

//        System.out.println ("The driver is :" +base.StepInfo);
//        System.out.println ("I should see the userform page");
    }

    @And("^I enter the following details for Login$")
    public void iEnterTheFollowingDetailsForLogin(DataTable table) throws Throwable {
        /*List<List<String>> data = table.raw ();
        System.out.println ( "The value is"+data.get ( 0 ).get ( 0 ).toString ());
        System.out.println ( "The value is"+data.get ( 0 ).get ( 1 ).toString () );*/
        List<User> users = new ArrayList<User> (  );
        users=table.asList ( User.class );

        LoginPage page = new LoginPage (base.Driver);


        for(User user: users){

            page.Login ( user.username,user.password );
            Thread.sleep ( 2000 );
//            page.ClickLogin ();
//            Thread.sleep ( 2000 );
//            base.Driver.findElement ( By.name ("UserName") ).sendKeys ( user.username );
//            Thread.sleep ( 2000 );
//            base.Driver.findElement ( By.name ("Password") ).sendKeys ( user.password );
//            Thread.sleep ( 2000 );
        }

//        for (User user: users){
//            System.out.println ( "the user name :" + user.username);
//            System.out.println ( "the user name :" + user.password );
//        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*) for Login$")
    public void iEnterUsernameAndPasswordForLogin(String userName, String password) {
        System.out.println ( "username:"+userName );
        System.out.println ("PASS:" +password );
    }

    public class User{
        public User(String userName , String passWord) {
            username = userName;
            password = passWord;
        }

        public String username;
        public String password;
    }
}
