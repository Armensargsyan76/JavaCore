package homework.student.storage;

import homework.student.model.Lesson;
import homework.student.model.User;

public class UserStorage {

    private User[] array = new User[10];
    private int size;

    public void add(User user) {
        if (size == array.length) {
            extend();
        }
        array[size++] = user;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public User getByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return array[index];
        }

    }

    public int getFirstIndexByValue(User user) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (array[i].equals(user)) {
                return i;
            }
        }
        return i;
    }

    public void set(int index, User user) {

        array[index] = user;
    }

    public void add(int index, User student) {
        if (index >= 0 && index < size) {
            for (int i = size; i >= index; i--) {
                if (size == array.length) {
                    extend();
                }
                array[i] = array[i - 1];
            }
            array[index] = student;
            size++;
        } else {
            System.out.println("Error : index out of bounds");
        }

    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                if (size == array.length) {
                    extend();
                }
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("Error : index out of bounds");
        }

    }


    public int getSize() {
        return size;
    }


    public User getUser(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return array[index];
        }
    }

    private void extend() {
        User[] tmp = new User[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public User getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)) {
                return array[i];
            }
        }
        return null;
    }
}

