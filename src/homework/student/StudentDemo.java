package homework.student;

import java.util.Scanner;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        studentStorage.add(new Student("Sigizmund", "Vardanyan", 25, "077191012", "chochkan", "java"));
        studentStorage.add(new Student("Aylibedak", "Margaryan", 25, "56445635", "Azatan", "java"));
        studentStorage.add(new Student("Baylasz", "Margaryan", 12, "45648", "Jajur", "php"));
        boolean run = true;
        while (run) {
            System.out.println("please input  " + EXIT + " for exit");
            System.out.println("please input  " + ADD_STUDENT + " for add  student's");
            System.out.println("please input  " + PRINT_ALL_STUDENTS + " for print all student's");
            System.out.println("please input  " + DELETE_STUDENT_BY_INDEX + " for delete student by index");
            System.out.println("please input  " + PRINT_STUDENT_BY_LESSON + " for print student by lesson");
            System.out.println("please input  " + PRINT_STUDENT_COUNT + " for print student count");
            System.out.println("please choose " + CHANGE_STUDENT_LESSON + " for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.printArray();
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENT_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("students count" + studentStorage.getSize());
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentNameByIndex();
                    break;
                default:
                    System.out.println("invalid command");

            }

        }

    }

    private static void changeStudentNameByIndex() {
        studentStorage.printArray();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudent(index);
        if (student == null) {
            System.out.println("wrong index!!!");
        } else {
            System.out.println("Please input new lesson name");
            String newLesson = scanner.nextLine();
            student.setLesson(newLesson);
        }
    }

    private static void printStudentByLesson() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.printArray();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void addStudent() {
        System.out.println("please input student's name");

        String name = scanner.nextLine();
        System.out.println("please input student;s surName");
        String surName = scanner.nextLine();
        System.out.println("please input student;s age");
        String ageStr = scanner.nextLine();
        System.out.println("please input student;s phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("please input student;s city");
        String city = scanner.nextLine();
        System.out.println("please input student;s lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        Student student = new Student(name, surName, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("student created");

    }
}
