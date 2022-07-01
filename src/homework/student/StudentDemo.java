package homework.student;

import homework.student.model.Lesson;
import homework.student.model.Student;
import homework.student.storage.LessonStorage;
import homework.student.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    private static LessonStorage lessonStorage = new LessonStorage();


    public static void main(String[] args) {
        Lesson java = new Lesson("java", "teacher", 7, 10000);
        Lesson php = new Lesson("php", "teacher", 7, 5000);
        Lesson javaScript = new Lesson("javascript", "teacher", 7, 200);
        lessonStorage.add(java);
        lessonStorage.add(php);
        lessonStorage.add(javaScript);
        studentStorage.add(new Student("Sigizmund", "Vardanyan", 25, "077191012", "chochkan", java));
        studentStorage.add(new Student("Aylibedak", "Margaryan", 25, "56445635", "Azatan", javaScript));
        studentStorage.add(new Student("Baylasz", "Margaryan", 12, "45648", "Jajur", php));
        boolean run = true;
        while (run) {
            Commands.printCommands();
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
                    changeStudentLessonNameByIndex();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_LESSON:
                    lessonStorage.printArray();
                    break;
                default:
                    System.out.println("invalid command");

            }
        }
    }

    private static void addLesson() {
        System.out.println("please input lesson name");
        String name = scanner.nextLine();
        System.out.println("please input teacher name");
        String teacherName = scanner.nextLine();
        System.out.println("please input duration by month");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("please input price");
        double price = Double.parseDouble(scanner.nextLine());
        Lesson lesson = new Lesson(name, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("lesson created!");
    }


    private static void changeStudentLessonNameByIndex() {
        if (studentStorage.getSize() != 0) {
            studentStorage.printArray();
        } else {
            System.out.println("there are no students");
        }
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getByIndex(index);
        if (student == null) {
            changeStudentLessonNameByIndex();
        } else {
            if (lessonStorage.getSize() != 0) {
                lessonStorage.printArray();
                System.out.println("please choose lesson index");
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                if (lesson != null) {
                    student.setLesson(lesson);
                    System.out.println("lesson changed");
                } else {
                    System.out.println("wrong index!!!");
                }
            }


        }
    }

    private static void printStudentByLesson() {
        if (lessonStorage.getSize() == 0) {
            System.out.println("please add lesson");
        } else {
            lessonStorage.printArray();
            System.out.println("please choose lesson");
            int index = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(index);
            if (lesson != null) {
                studentStorage.printByLessonName(lesson);
            } else {
                System.out.println("please input correct index");
            }
        }

    }

    private static void deleteByIndex() {
        studentStorage.printArray();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void addStudent() {
        if (lessonStorage.getSize() != 0) {
            lessonStorage.printArray();
            System.out.println("please choose index");
            int lessonName = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonName);
            if (lesson == null) {
                addStudent();
            } else {
                System.out.println("please input student's name");
                String name = scanner.nextLine();
                System.out.println("please input student;s surName");
                String surName = scanner.nextLine();
                System.out.println("please input student;s age");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("please input student;s phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("please input student;s city");
                String city = scanner.nextLine();
                Student student = new Student(name, surName, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("student created");

            }
        }


    }
}
