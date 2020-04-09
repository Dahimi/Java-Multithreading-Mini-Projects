package service;

import java.util.List;

import bean.User;

public interface UserService {
    public User deleteUser(long id);

    public User createOrUpdateUser(String name, long id, int level);

    public List<User> getUsersByName(String name);

    public List<User> getAllDeletedUsers();

    public List<User> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User> filterOnlyActiveUsers(List<User> allUsers);

    User getUsersById(long userId);
}