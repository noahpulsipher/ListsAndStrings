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
//		showTheList();
//		changeTheList();
		practiceTheList();
	}
	
	
	private void showTheList()

	{
		String currentCreator = "";
		for (int index = 0; index < myKahoots.size(); index += 1)
		{
			currentCreator = myKahoots.get(index).getCreator();
			
			Kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if (currentCreator.equals("nobody"))
			{
				for (int loop = 0; loop < 5; loop += 1)
				{
					popup.displayText("Wow nobody does a lot");
				}
			}
			
			for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			
			String topic = currentKahoot.getTopic();
			
			for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
			{
				popup.displayText(topic.substring(letter, letter + 1));
			}
		}
	}
	
	private void fillTheList()
	{
		// Creates a bunch of Kahoots.
		
		Kahoot fiftyStates = new Kahoot("Kashish", 50	, "The fifty nifty United States");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "The Double data type");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything... literally");
		Kahoot animalColor = new Kahoot("Branton", 10, "All the colors of the animals");
		Kahoot presidents = new Kahoot("Obama", 44, "The 44th president of the US");
		
		// Adds the Kahoots to the list.
		
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);

	}
	private void changeTheList()
	{
		popup.displayText("The current list size is: " + myKahoots.size());
		Kahoot removed = myKahoots.remove(3);
		popup.displayText("I removed the Kahoot by " + removed.getCreator());
		myKahoots.add(0, removed);
		
		popup.displayText("The list is still: " + myKahoots.size() + " items big.");
		removed = myKahoots.set(2, new Kahoot());
		popup.displayText("The kahoot by " + removed.getCreator() + " was replaced with " + myKahoots.get(2).getCreator());
		
	}
	
	private void practiceTheList()
	{
		Kahoot practice = new Kahoot("Noah", 10, "Practice lists");
		Kahoot eclipse = new Kahoot("Noah", 15, "Why is my eclipse broken?");
		Kahoot dumb = new Kahoot("Jian", 10, "Why is Jian a dumb guy?");
		
		myKahoots.add(dumb);
		myKahoots.add(eclipse);
		myKahoots.add(practice);
		
		Kahoot removed = myKahoots.remove(6);
		popup.displayText("Oops, I removed " + removed.getCreator() + ", the dumb guy.");
		popup.displayText("Why? Because he is toxic.");
		
		Kahoot remove = myKahoots.remove(7);
		popup.displayText("I removed " + remove.getCreator() + "'s kahoot about eclipse because eclipse machine broke.");

	}
	
	public PopupDisplay getPopup()
	{
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots;
	}
}
