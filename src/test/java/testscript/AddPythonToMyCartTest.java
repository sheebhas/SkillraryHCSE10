package testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class AddPythonToMyCartTest extends BaseClass {

	@Test
	public void addPythonToCartTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.switchToChildBrowser();
		soft.assertTrue(demoApp.getPageHeader().contains("ECommerce"));
		demoApp.selectCategory(web, 1);
		soft.assertEquals(Testing.getPageHeader(), "Testing");
		web.scrollTitleElement(Testing.getPythonImage());
		web.dragAndDropElement(Testing.getPythonImage(), Testing.getCartArea());
		web.scrollTitleElement(Testing.getFacebookIcon());
		Testing.clickFacebookIcon();
		
		soft.assertAll();
	}
}