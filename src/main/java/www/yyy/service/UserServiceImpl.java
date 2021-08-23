package www.yyy.service;

import www.yyy.dao.UserDao;
import www.yyy.entity.User;

public class UserServiceImpl implements UserService{
    private UserDao userDao;



    @Override
    public User queryByName(String username) {
        return  userDao.queryByName(username);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
