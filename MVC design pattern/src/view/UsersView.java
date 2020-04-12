package view;

import Controller.Controller;
import Controller.ControllerInterface;
import bean.User;
import model.DataModel;

public class UsersView implements View{
	private Controller controller ;
		public void refresh(DataModel dataModel) {
		
		if(dataModel.isDisplayDeletedUserList())  System.out.println("All deleted users:");
		else System.out.println("All users:");
		for(User user : dataModel.getUsers()) {
			System.out.println("\t" + user);
		}
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
	public void fireOpenUserEditFormEvent(long id) {
		 controller.onOpenUserEditForm(id);
		}
	public void fireUserDeletedEvent(long id) {
		controller.onDeleteUser( id);}



}
