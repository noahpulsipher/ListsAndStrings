package lists.contoller;

import java.util.List;
import java.util.ArrayList;
import lists.model.Kahoot;
import lists.view.PopupDisplay;

public class ListsController 
{
	// Creates your list.
	
	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	
	public ListsController()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new PopupDisplay();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		for (int index = 0; index < myKahoots.size(); index += 1)
		{
			popup.displayText(myKahoots.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		// Creates a bunch of Kahoots.
		
		Kahoot fiftyStates = new Kahoot("Kashish", 50	);
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		Kahoot animalColor = new Kahoot("Branton", 10);
		Kahoot presidents = new Kahoot("Obama", 44);
		
		// Adds the Kahoots to the list.
		
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
