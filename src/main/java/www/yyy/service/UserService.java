package www.yyy.service;

import www.yyy.entity.User;

public interface UserService {
    User queryByName(String username);

    void insertUser(User user);
}
