import Controller.Controller;
import model.FakeModel;
import model.MainModel;
import model.Model;
import view.EditUserView;
import view.UsersView;
import view.View;

public class User_Emulated {
	public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();
        EditUserView editUserView = new EditUserView();
        controller.setEditUserView(editUserView);
       
        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        usersView.fireOpenUserEditFormEvent(123);
        usersView.fireShowAllUsersEvent();
        editUserView.fireUserDeletedEvent(124L);
        usersView.fireShowDeletedUsersEvent();
        editUserView.fireUserDataChangedEvent("Critiano", 123L, 12);
    }
}
