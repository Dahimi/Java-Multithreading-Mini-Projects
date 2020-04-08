package model;
import java.util.*;

import bean.User;
public class FakeModel implements Model{
DataModel dataModel = new DataModel();

	@Override
	public DataModel getDataModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadUsers() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList() {
			{ 
				 add(new User("Franklin", 123l, 1));
			        add(new User("Sanchez", 124l, 2));
			        add(new User("Sanchez", 125l, 1));
			        add(new User("Smith", 126l, 2));
				
			}
		};
		
	}
	
}
