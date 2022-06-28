package homework.student;

public class StudentStorage {

    private Student[] array = new Student[10];
    private int size;

    public void add(Student student) {
        if (size == array.length) {
            extend();
        }
        array[size++] = student;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }
    }

    boolean isEmpty() {

        return size == 0;
    }

    Student getByIndex(int index) {

        return array[index];
    }

    int getFirstIndexByValue(Student student) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (array[i].equals(student)) {
                return i;
            }
        }
        return i;
    }

    void set(int index, Student student) {

        array[index] = student;
    }

    void add(int index, Student student) {
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

    void delete(int index) {
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


    public void printByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void changeNameLesson(int indexStudent, String changeLessonName) {
        array[indexStudent].setLesson(changeLessonName);
    }

    public Student getStudent(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return array[index];
        }
    }

    private void extend() {
        Student[] tmp = new Student[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }
}

