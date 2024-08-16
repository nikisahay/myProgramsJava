package inter;

import java.util.ArrayList;
import java.util.List;

public class FilterEvents {

	private String eventName;
	private String eventCategory;
	
	public FilterEvents(String eventName,String eventCategory) {
		this.eventName=eventName;
		this.eventCategory=eventCategory;
	}
	
	public String getName() {
		return eventName;
	}
	
	public String getCategory() {
		return eventCategory;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<FilterEvents> eventsList= new ArrayList<FilterEvents>();
      eventsList.add(new FilterEvents("Event 1","Category A"));
      eventsList.add(new FilterEvents("Event 2","Category B"));
      eventsList.add(new FilterEvents("Event 3","Category C"));
      eventsList.add(new FilterEvents("Event 4","Category D"));
      eventsList.add(new FilterEvents("Event 5","Category B"));
      eventsList.add(new FilterEvents("Event 6","Category A"));
      eventsList.add(new FilterEvents("Event 7","Category B"));
      
      List<FilterEvents> filteredList = filterEventsByCategory(eventsList, "Category B");
      
      System.out.println("Filtered Event List:");
      for (FilterEvents event : filteredList) {
          System.out.println("Name: " + event.getName() + ", Category: " + event.getCategory());
      }
      //System.out.println("The filterd event list as per category is :" +filteredList);
      System.out.println("The event list size is :" +filteredList.size());
      
	}

	private static List<FilterEvents> filterEventsByCategory(List<FilterEvents> eventsList,String eventCategory)
	{
		List<FilterEvents> filteredList = new ArrayList<FilterEvents>();
		for(FilterEvents events:eventsList)
		{
			if(events.getCategory().equals(eventCategory))
					filteredList.add(events);		
		}
		return filteredList;
	}
}
