import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public User getUser(int rollNo);

    public void updateUser(User user);
    public void deleteUser(User user);
}
