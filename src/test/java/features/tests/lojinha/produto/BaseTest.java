package features.tests.lojinha.produto;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver app;
    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Samsung Galaxy S4");
        caps.setCapability("udid", "192.168.56.101:5555");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.lojinha");
        caps.setCapability("appActivity", "com.lojinha.ui.MainActivity");
        caps.setCapability("app", "C:\\Users\\Fox\\Desktop\\Mentoria em testes de Software\\Automação Mobile\\Automacao-Mobile-Java-Appium\\app\\lojinha-nativa.apk");

        app = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        app.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterEach
    public void tearDown(){
        app.quit();
    }
}
