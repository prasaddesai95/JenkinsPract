package jen.AdminModule;

import org.testng.annotations.Test;

import jen.SCM.GenericUtils.BaseClass;
import jen.SCM.ObjectPOm.AdminHomePage;
import jen.SCM.ObjectPOm.EditManufacturerPage;
import jen.SCM.ObjectPOm.ManufacturerHomePage;

//@Listeners(com.SCM.GenericUtils.ListImplClass.class)
public class EditTheManufacturerTest extends BaseClass{

	@Test
	public void editTheManufacturerTest() throws Throwable {
		
		AdminHomePage ahp = new AdminHomePage(driver);
		ahp.ManufactureMod();
		
		wLib.scrollbBarAction(driver);
		
		EditManufacturerPage emp = new EditManufacturerPage(driver);
		
		ManufacturerHomePage mhp = new ManufacturerHomePage(driver);
		mhp.clickOnEditIcon();
		//Assert.fail();
		emp.editTheData(eLib.writeMultipleData("manuData"), driver);
		
		System.out.println(wLib.getAlertText(driver));
		wLib.acceptAlert(driver);

	}
}
