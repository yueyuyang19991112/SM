package www.yyy.dao;

import www.yyy.entity.User;

public interface UserDao {

    User queryByName(String username);

    void insertUser(User user);
}
