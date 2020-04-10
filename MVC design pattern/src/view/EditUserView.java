package view;

import Controller.Controller;
import bean.User;
import model.DataModel;

public class EditUserView implements View {
	private Controller controller ;
	public void refresh(DataModel dataModel) {
	System.out.println("User to be edited:");
	
		System.out.println("\t" + dataModel.getActiveUser());
	
	System.out.println("===================================================");
}

public void fireShowAllUsersEvent() {
	controller.onShowAllUsers();
}
@Override
public void setController(Controller controller) {
	// TODO Auto-generated method stub
	this.controller  = controller;
	
}
@Override
public void fireShowDeletedUsersEvent() {
	controller.onShowAllDeletedUsers();
	}


}
