package homework.student.storage;

import homework.student.model.Lesson;
import homework.student.model.Student;

public class LessonStorage {

    private Lesson[] array = new Lesson[10];
    private int size;

    public void add(Lesson lesson) {
        if (size == array.length) {
            extend();
        }
        array[size++] = lesson;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }
    }

    public boolean isEmpty() {

        return size == 0;
    }



    public int getFirstIndexByValue(Lesson lesson) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (array[i].equals(lesson)) {
                return i;
            }
        }
        return i;
    }

    public void set(int index, Lesson lesson) {

        array[index] = lesson;
    }

    public void add(int index, Lesson lesson) {
        if (index >= 0 && index < size) {
            for (int i = size; i >= index; i--) {
                if (size == array.length) {
                    extend();
                }
                array[i] = array[i - 1];
            }
            array[index] = lesson;
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


    public Lesson getLessonByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return array[index];
        }
    }

    private void extend() {
        Lesson[] tmp = new Lesson[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }
}

