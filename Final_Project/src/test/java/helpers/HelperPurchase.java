package helpers;
import POM.DemoblazeCartPage;

public class HelperPurchase {
	private DemoblazeCartPage cartPage;
	protected String name="Juan Pérez"; 
	protected String country="Republica de Banania"; 
	protected String city="Bahia de los cocos"; 
	protected String card="MasterCoin"; 
	protected String month="12"; 
	protected String year="2023";
	
	public HelperPurchase(DemoblazeCartPage cartPage) {
		this.cartPage = cartPage;
	}
	
	public void fillPlaceOrder() {
		cartPage.fillOrder(name, country, city, card, month, year);
	}	
	
	public boolean checkInfoIsCorrect(String info) {
		return info.contains(name) && info.contains(card);		
	}
}