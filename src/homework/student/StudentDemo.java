package homework.student;

import homework.student.model.Lesson;
import homework.student.model.Student;
import homework.student.model.User;
import homework.student.model.UserType;
import homework.student.storage.LessonStorage;
import homework.student.storage.StudentStorage;
import homework.student.storage.UserStorage;

import java.util.Date;
import java.util.Scanner;

import static homework.student.util.DateUtil.stringToDate;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    private static LessonStorage lessonStorage = new LessonStorage();

    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;

    public static void main(String[] args) {
        initData();


        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("invalid command");

            }
        }
    }

    private static void login() {
        System.out.println("please input email, password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("user witch" + emailPassword[0] + "does not exists");
        } else if (user.getPassword().equals(emailPassword[1])) {
            currentUser = user;
            if (user.getUserType() == UserType.ADMIN) {
                loginAdmin();
            } else if (user.getUserType() == UserType.USER) {
                loginUser();
            }
        } else {
            System.out.println("password is wrong!");
        }
    }

    private static void loginUser() {
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

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
                case PRINT_STUDENT_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("students count" + studentStorage.getSize());
                    break;
                case PRINT_LESSON:
                    lessonStorage.printArray();
                    break;
                default:
                    System.out.println("invalid command");

            }
        }
    }

    private static void register() {
        System.out.println("please input name, surname, email, password");
        String userDataString = scanner.nextLine();
        String[] userdata = userDataString.split(",");
        if (userdata.length < 4) {
            System.out.println("please input correct data");
        } else {
            if (userStorage.getUserByEmail(userdata[2]) == null) {
                User user = new User();
                user.setName(userdata[0]);
                user.setSurName(userdata[1]);
                user.setEmail(userdata[2]);
                user.setPassword(userdata[3]);
                user.setUserType(UserType.USER);
                System.out.println("user created");
                userStorage.add(user);
            } else {
                System.out.println("user witch " + userdata[0] + " already exists");
            }
        }


    }

    private static void loginAdmin() {
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

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

    private static void initData() {
        User admin = new User("admin", "admin", "admin@mail.com", "admin", UserType.ADMIN);
        userStorage.add(admin);
        Lesson java = new Lesson("java", "teacher", 7, 10000, stringToDate("03/10/1960"));
        Lesson php = new Lesson("php", "teacher", 7, 5000, stringToDate("10/11/1945"));
        Lesson javaScript = new Lesson("javascript", "teacher", 7, 200, stringToDate("10/7/1998"));
        lessonStorage.add(java);
        lessonStorage.add(php);
        lessonStorage.add(javaScript);
        studentStorage.add(new Student("Sigizmund", "Vardanyan", 25, "077191012", "chochkan", java, admin, new Date()));
        studentStorage.add(new Student("Aylibedak", "Margaryan", 25, "56445635", "Azatan", javaScript, admin, new Date()));
        studentStorage.add(new Student("Baylasz", "Margaryan", 12, "45648", "Jajur", php, admin, new Date()));
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
        System.out.println("please input lesson start date (dd/mm/yyyy)");
        String startDate = scanner.nextLine();
        Lesson lesson = new Lesson(name, teacherName, duration, price, stringToDate(startDate));
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
                Student student = new Student(name, surName, age, phoneNumber, city, lesson, currentUser, new Date());
                studentStorage.add(student);
                System.out.println("student created");

            }
        }


    }
}
