package model;

import java.util.ArrayList;
import java.util.List;

import bean.User;
import service.UserService;
import service.UserServiceImpl;

public class MainModel implements Model{
	private DataModel dataModel = new DataModel();
	private UserService userService = new UserServiceImpl() ;

	@Override
	public DataModel getDataModel() {
		// TODO Auto-generated method stub
		return this.dataModel;
	}

	@Override
	public void loadUsers() {
		// TODO Auto-generated method stub
		 
		dataModel.setUsers(userService.getUsersBetweenLevels(1, 100));
		
	}

	@Override
	public void loadDeletedUsers() {
		// TODO Auto-generated method stub
		List users = userService.getAllDeletedUsers();
		dataModel.setUsers(users);
	}
	

}
