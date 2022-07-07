package springpp.dao;

import springpp.model.User;
import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();
    public void addUser(User user);
    public void removeUser(int id);
    public User getUser(int id);
    public void updateUser(int id, User user);
}
