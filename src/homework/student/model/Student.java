package homework.student.model;

import homework.student.util.DateUtil;

import java.util.Date;

import static homework.student.util.DateUtil.dateToString;

import java.util.Objects;


public class Student {

    private String name;
    private String surName;
    private int age;
    private String phoneNumber;
    private String city;
    private Lesson lesson;
    private User registeredUser;

    private Date registerDate;

    public Student(String name, String surName, int age, String phoneNumber, String city, Lesson lesson, User registeredUser, Date registerDate) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.lesson = lesson;
        this.registeredUser = registeredUser;
        this.registerDate = registerDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lesson='" + lesson.getName() + '\'' +
                ", registeredUser='" + registeredUser + '\'' +
                ", registeredDate='" + dateToString(registerDate) + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name) && surName.equals(student.surName) && phoneNumber.equals(student.phoneNumber) && city.equals(student.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age, phoneNumber, city);
    }
}
