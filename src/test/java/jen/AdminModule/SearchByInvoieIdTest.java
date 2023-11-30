package jen.AdminModule;

import org.testng.annotations.Test;

import jen.SCM.GenericUtils.BaseClass;
import jen.SCM.ObjectPOm.AdminHomePage;
import jen.SCM.ObjectPOm.ViewInvoicePage;

//@Listeners(com.SCM.GenericUtils.ListImplClass.class)
public class SearchByInvoieIdTest extends BaseClass {

	@Test
	public void searchByInvoieIdTest() throws Throwable {
		
		AdminHomePage ahp = new AdminHomePage(driver);
		
		ahp.InvoiceMod();
		
		String searchData = eLib.readDataFromExcel("invData", 0, 4);
		String invIDNum = eLib.readDataFromExcel("invData", 0, 7);
		//Assert.fail();
		ViewInvoicePage vip = new ViewInvoicePage(driver);
		vip.enterDetails(invIDNum, searchData);
		
		vip.invoiceValidation(driver, invIDNum);
		
	}
}
