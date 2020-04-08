package view;

import Controller.Controller;
import model.DataModel;

public interface View {
	void refresh(DataModel dataModel) ;
	void setController(Controller controller);

}
