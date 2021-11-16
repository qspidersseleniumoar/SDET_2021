package pac1;

import org.testng.annotations.Test;

public class CreateOrgTest {
	
	
	@Test
	public void createOrgTest() {
		System.out.println("execute createOrg Test");

 	}
	
	@Test
	public void createOrgTest1() {
		System.out.println("execute createOrg Test1");
 	}
		String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("url");
		
		System.out.println("BROWSER====>"+BROWSER +"   , URL===>"+ENV);
 	}	
	
	@Test
	public void createOrgWithIndustriesTest() {
		System.out.println("execute createOrgWithIndustries Test");
 	}
	
	
	@Test
	public void createOrgTestWithRatingTest() {
		System.out.println("execute createOrgTestWithRating Test");
 	}
	
	
	@Test
	public void searchOrgTest() {
		System.out.println("execute searchOrgTest ");
 	}

}
