public class User {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUserName("KGM");
        user.setPassword("Kgm@123");

        System.out.println("Username: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());
    }
}
