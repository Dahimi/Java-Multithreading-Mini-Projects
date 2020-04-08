package Controller;

import model.Model;

public class Controller implements ControllerInterface{
	private Model model;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}


	public void onShowallUsers() {
		// TODO Auto-generated method stub
		model.loadUsers();

	}
	

}
