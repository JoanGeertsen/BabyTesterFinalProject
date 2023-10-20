package helpers;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import POM.GooglePage;

public class HelperGoogle{
	private GooglePage google;
	private int index= 0;
	private List<WebElement> list;
	private List<String> stringList1= new ArrayList<String>();
	private List<String> stringList2= new ArrayList<String>();
	
	public HelperGoogle(GooglePage google) {
		this.google = google;
	}
	
	public void searchAndPrintSuggestions(String keyword) {
		google.search(keyword);		
		list = google.getSuggestions();		
		System.out.println("\nSuggestions of the keyword: <"+keyword.toUpperCase()+"> :");
		printList(list);
	}
	
	public void printList(List<WebElement> listToPrint){	
		index++;
		for (WebElement element : listToPrint) {
	        String toPrint = element.getText();
	        System.out.println(toPrint);

	        if (index == 1) 
	            stringList1.add(toPrint);
	        else 
	            stringList2.add(toPrint);	        
	    }
	}
	
	public boolean noMatchBetweenLists() {
		for (String item : stringList1)
	        if (stringList2.contains(item)) 
	            return false; 	        
	    return true;
	}
}