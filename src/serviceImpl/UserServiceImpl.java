package serviceImpl;

import entity.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    static ArrayList<User> userArrayList = new ArrayList<>();

    static {
        userArrayList.add(new User(1,"Kamal","Shabanov","azerbaijani",19));
        userArrayList.add(new User(2,"Özkan","Çetin","turkish",25));
        userArrayList.add(new User(3,"Aslan","Nusalov","azerbaijani",21));
        userArrayList.add(new User(4,"İqor","Medvedyev","russian",28));
        userArrayList.add(new User(5,"Felix","Lilford","french",23));
        userArrayList.add(new User(6,"Olivier","Kahn","german",45));



    }
    @Override
    public User getByUserId(int id) {
        return userArrayList.get(id);
    }

    @Override
    public void addUser(User user) {
        userArrayList.add(user);
    }

    @Override
    public void deleteUser(int id) {
        userArrayList.remove(id);
    }

    @Override
    public List<User> getAllUsers(int id) {
        return userArrayList;
    }

    @Override
    public List<User> getAllByNameLength(int length) {
        User nameObject = (User)userArrayList.stream().filter(user -> user.getName().length() > length).collect(Collectors.toList());
        return (List<User>) nameObject;
    }

    @Override
    public List<User> getAllBySurnameLength(int length) {
        User surnameObject = (User) userArrayList.stream().filter(user -> user.getSurname().length() > length).collect(Collectors.toList()) ;
        return (List<User>) surnameObject;
    }

    @Override
    public List<User> getAllByAge(int age) {
        return userArrayList.stream().filter(user -> user.getAge() > age).collect(Collectors.toList());
    }

    @Override
    public int getAllByNameCountCompare(String name) {
        int say = (int) userArrayList.stream().filter(user -> user.getName().equals(name)).count();
        return say;
    }
}
