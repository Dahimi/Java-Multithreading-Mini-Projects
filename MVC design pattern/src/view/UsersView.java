package view;

import Controller.Controller;
import Controller.ControllerInterface;
import bean.User;
import model.DataModel;

public class UsersView implements View{
	ControllerInterface controller ;
	public void setController(ControllerInterface controller) {
		this.controller = controller;
	}
	public void refresh(DataModel dataModel) {
		System.out.println("All users:");
		for(User user : dataModel.getUsers()) {
			System.out.println(user);
		}
		System.out.println("===================================================");
	}
	public void setController(Controller controller) {
		
	}
	public void fireShowAllUsersEvent() {
		controller.onShowallUsers();
	}


}
