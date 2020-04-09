package Controller;

import com.sun.glass.ui.View;

import model.Model;
import view.UsersView;

public class Controller implements ControllerInterface{
	private Model model;
	private UsersView usersView;
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
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
	

}
