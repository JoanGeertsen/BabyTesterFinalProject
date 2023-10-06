package helpers;
import POM.DemoblazeCartPage;
import POM.DemoblazeHomePage;

public class HelperPurchase {
	private DemoblazeHomePage homePage;
	private DemoblazeCartPage cartPage;
	protected String name="Juan Pérez"; 
	protected String country="Republica de Banania"; 
	protected String city="Bahia de los cocos"; 
	protected String card="MasterCoin"; 
	protected String month="12"; 
	protected String year="2023";
	
	public HelperPurchase(DemoblazeHomePage homePage, DemoblazeCartPage cartPage) {
		this.homePage = homePage;
		this.cartPage = cartPage;
	}
	
	public void fillPlaceOrder() {
		cartPage.fillName(name);
		cartPage.fillCountry(country);
		cartPage.fillCity(city);
		cartPage.fillCard(card);
		cartPage.fillMonth(month);
		cartPage.fillYear(year);
	}
	
	public void clickCategory(String category) {
		if(category.equals("laptops"))
			homePage.clickLaptopButton();
		else if(category.equals("phones"))
			homePage.clickPhoneButton();
		else if(category.equals("monitors"))
			homePage.clickMonitorButton();
	}
	
	public boolean checkInfoIsCorrect(String info) {
		boolean toReturn = false;
		if (info.contains(name) && info.contains(card))
			toReturn = true;
		return toReturn;		
	}
}