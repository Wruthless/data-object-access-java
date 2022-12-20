import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    List<User> users;

    public UserDaoImpl() {
        users = new ArrayList<User>();
        User user1 = new User("john", "john@domain.com", 0);
        User user2 = new User("susan", "susan@domain.com", 1);
        users.add(user1);
        users.add(user2);
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user.getRollNo());
        System.out.println(user.getRollNo() + " deleted.");
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUser(int rollNo) {
        return users.get(rollNo);
    }

    @Override
    public void updateUser(User user) {
        users.get(user.getRollNo()).setName(user.getName());
        System.out.println("User " + user.getRollNo() + " updated.");
    }
}