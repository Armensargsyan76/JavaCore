package homework.student;

import java.util.Scanner;

public class StudentDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add  student's");
            System.out.println("please input 2 for print all student's");
            System.out.println("please input 3 for delete student by index");
            System.out.println("please input 4 for print student by lesson");
            System.out.println("please input 5 for print student count");
            System.out.println("please choose 6 for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.printArray();
                    break;
                case 3:
                    studentStorage.printArray();
                    System.out.println("please choose student index");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentStorage.delete(index);
                    break;
                case 4:
                    System.out.println("please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentStorage.printByLessonName(lessonName);
                    break;
                case 5:
                    System.out.println("students count");
                    System.out.println(studentStorage.getSize());
                    break;
                case 6:
                    System.out.println("please choose student index");
                    studentStorage.printArray();
                    int indexStudent = Integer.parseInt(scanner.nextLine());
                    String changeLessonName = scanner.nextLine();
                    studentStorage.changeNameLesson(indexStudent, changeLessonName);
                    break;
                default:
                    System.out.println("invalid command");
            }
        }

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
