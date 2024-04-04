package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

import static org.testng.Assert.fail;

public class TestBase {

  protected static final ApplicationManager app = new ApplicationManager(String.valueOf(Browser.FIREFOX));

  @BeforeSuite(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }

}
