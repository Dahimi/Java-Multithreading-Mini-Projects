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
		 
		dataModel.setUsers(getAllUsers());
		dataModel.setDisplayDeletedUserList(false);
		
	}

	@Override
	public void loadDeletedUsers() {
		// TODO Auto-generated method stub
		List users = userService.getAllDeletedUsers();
		
		dataModel.setUsers(users);
		dataModel.setDisplayDeletedUserList(true);
	}

	@Override
	public void loadUserById(long userId) {
		// TODO Auto-generated method stub
		User user = userService.getUsersById(userId);
		dataModel.setActiveUser(user);
		
	}

	@Override
	public void deleteUserById(long id) {
		userService.deleteUser(id);		
		dataModel.setUsers(getAllUsers());		
	}
	private List<User> getAllUsers(){
		return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1, 100));}

	@Override
	public void changeUserData(String name, long id, int level) {
		// TODO Auto-generated method stub
		userService.createOrUpdateUser(name, id, level);
		dataModel.setUsers(getAllUsers());
		dataModel.setDisplayDeletedUserList(false);
	}
		

	
}
