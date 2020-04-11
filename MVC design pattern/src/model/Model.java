package model;

public interface Model {
	DataModel getDataModel();
	void loadUsers();
	void loadDeletedUsers();
	void loadUserById(long userId);

}
