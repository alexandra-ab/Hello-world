package lesson_six;

public class User {
    private String username;
    private String password;
    private String email;
    private boolean isAdmin;

    public User(String username, String password, String email, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setUsername(String username) {
        if (username.length() >= 5 && username.length() < 15) {
            this.username = username;
        } else {
            System.out.println("Invalid username");
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (newPassword.length() >= 8 && oldPassword.equals(this.password)) {
            this.password = newPassword;
        } else {
            System.out.println("Invalid old password");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}