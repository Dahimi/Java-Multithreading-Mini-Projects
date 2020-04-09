import Controller.Controller;
import model.FakeModel;
import model.MainModel;
import model.Model;
import view.UsersView;
import view.View;

public class User_Emulated {
	public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireShowAllUsersEvent();
        usersView.fireShowDeletedUsersEvent();
    }
}
