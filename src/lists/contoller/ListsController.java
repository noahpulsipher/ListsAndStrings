package lists.contoller;

import java.util.List;
import java.util.ArrayList;
import lists.model.Kahoot;

public class ListsController 
{
	private List<Kahoot> myKahoots;
	
	public ListsController()
	{
		myKahoots = new ArrayList<Kahoot>();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
	}
	
	private void fillTheList()
	{
		
	}
}
