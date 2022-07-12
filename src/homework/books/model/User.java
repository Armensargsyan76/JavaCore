package homework.books.model;

import homework.books.enumstorage.UserType;

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private UserType usertype;

    public User(String name, String surname, String email, String password, UserType usertype) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.usertype = usertype;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUsertype() {
        return usertype;
    }

    public void setUsertype(UserType usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", usertype=" + usertype +
                '}';
    }
}
