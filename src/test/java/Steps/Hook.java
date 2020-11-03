package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.lexer.Th;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;

public class Hook extends BaseUtil {
    public Hook(BaseUtil base) {
        this.base = base;
    }

    private BaseUtil base;

    @Before
    public void InitializeTest() throws InterruptedException{
        System.out.println ( "Opening the browser: Firefox" );
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\Tuly\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        base.Driver = new ChromeDriver();
        Thread.sleep ( 2000 );
        base.Driver.manage().window().maximize();
        Thread.sleep ( 2000 );
//        passing the dummy webdriver
//        base.StepInfo = "FirefoxDriver";

    }

    @After
    public void TearDownTest(Scenario scenario){
        if (scenario.isFailed ()){
            System.out.println ( scenario.getName () );
        }
        System.out.println ( "Closing the browser: MOCK" );
    }
}
