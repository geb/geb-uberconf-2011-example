/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver

driver = { new FirefoxDriver() } // default
reportsDir = "build/reports/geb"
baseUrl = "http://uberconf.com/conference/denver/2011/07/"

waiting {
	timeout = 2
}
