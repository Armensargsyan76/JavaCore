package homework.student.model;

public class User {

    private String name;
    private String surName;
    private String email;
    private String password;
    private UserType userType;

    public User(String name, String surName, String email, String password, UserType userType) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserType getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", userType=" + userType +
                '}';
    }
}
