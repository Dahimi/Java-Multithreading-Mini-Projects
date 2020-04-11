package Controller;

import com.sun.glass.ui.View;

import model.Model;
import view.EditUserView;
import view.UsersView;

public class Controller implements ControllerInterface{
	private Model model;
	private UsersView usersView;
	private EditUserView editUserView;
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	public void setEditUserView(EditUserView editUserView){
	    this.editUserView  = editUserView;
	}
	@Override
	public void onShowAllUsers() {
		// TODO ,jAuto-generated method stub
		model.loadUsers();
		usersView.refresh(model.getDataModel());

	}
	public void onShowAllDeletedUsers() {
		model.loadDeletedUsers();
		
		usersView.refresh(model.getDataModel());
		}
	public void setUsersView(UsersView usersView2) {
		this.usersView = usersView2;
	}

	public void onOpenUserEditForm(long userId) {
		// TODO Auto-generated method stub
		model.loadUserById(userId);
		
		editUserView.refresh(model.getDataModel());
		
	}
	

}
