package model;
import java.util.*;

import bean.User;
public class FakeModel implements Model{
	private DataModel dataModel = new DataModel();

	@Override
	public DataModel getDataModel() {
		// TODO Auto-generated method stub
		return this.dataModel;
	}

	@Override
	public void loadUsers() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList() {
			{ 
				 add(new User("Franklin", 13l, 1));
			        add(new User("Sanchez", 124l, 2));
			        add(new User("Sanchhhhez", 125l, 1));
			        add(new User("Smith", 126l, 2));
				
			}
		};
		dataModel.setUsers(list);
		
	}

	@Override
	public void loadDeletedUsers() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
}
