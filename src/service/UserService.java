package service;

import entity.User;

import java.util.List;


public interface UserService {

    User getByUserId(int id);
    void addUser(User user);
    void deleteUser(int id);
    List<User> getAllUsers(int id);
    List<User> getAllByNameLength(int length);
    List<User> getAllBySurnameLength(int length);
    List<User> getAllByAge(int age);
    int getAllByNameCountCompare(String name);
}
