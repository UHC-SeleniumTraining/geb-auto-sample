import io.github.bonigarcia.wdm.ChromeDriverManager
import org.openqa.selenium.Proxy
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import io.github.bonigarcia.wdm.ChromeDriverManager

import java.util.concurrent.TimeUnit

waiting {
    timeout = 10
    retryInterval = 0.5
}

System.setProperty('webdriver.chrome.driver', '<chromedriver path>')
driver = { new ChromeDriver() }
baseUrl= "http://automationpractice.com/index.php"

reportsDir = new File("build/reports")
reportOnTestFailureOnly = false