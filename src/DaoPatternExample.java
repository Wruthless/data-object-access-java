public class DaoPatternExample {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();

        for(User user : userDao.getAllUsers()) {
            System.out.println(user.getRollNo() + " Name: " + user.getName());
        }

        User user = userDao.getAllUsers().get(0);
        user.setName("Leeroy");
        userDao.updateUser(user);

        userDao.getUser(0);
        System.out.println(user.getRollNo() + " " + user.getEmail() + " Name: " + user.getName());
    }
}
