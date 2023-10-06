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
		for(int i=0; i<10; i++) {
			String toPrint= listToPrint.get(i).getText();
			System.out.println(toPrint);
			if(index == 1)
				stringList1.add(toPrint);
			else
				stringList2.add(toPrint);
		}
	}
	
	public boolean noMatchBetweenLists() {
		boolean noMatch=true;
		for(int i=0; i<10 && noMatch; i++) {
			for(int j=0; j<10 && noMatch; j++) {
				if(stringList1.get(i).equals(stringList2.get(j)))
					noMatch=false;				
			}
		}
		return noMatch;
	}
}