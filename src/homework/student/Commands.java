package homework.student;

public interface Commands {

    int LOGOUT = 0;
    int ADD_STUDENT = 1;
    int PRINT_ALL_STUDENTS = 2;
    int DELETE_STUDENT_BY_INDEX = 3;
    int PRINT_STUDENT_BY_LESSON = 4;
    int PRINT_STUDENT_COUNT = 5;
    int CHANGE_STUDENT_LESSON = 6;

    int ADD_LESSON = 7;

    int PRINT_LESSON = 8;
    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printAdminCommands() {
        System.out.println("please input  " + LOGOUT + "logout");
        System.out.println("please input  " + ADD_STUDENT + " for add  student's");
        System.out.println("please input  " + PRINT_ALL_STUDENTS + " for print all student's");
        System.out.println("please input  " + DELETE_STUDENT_BY_INDEX + " for delete student by index");
        System.out.println("please input  " + PRINT_STUDENT_BY_LESSON + " for print student by lesson");
        System.out.println("please input  " + PRINT_STUDENT_COUNT + " for print student count");
        System.out.println("please input " + CHANGE_STUDENT_LESSON + " for change student's lesson");
        System.out.println("please input " + ADD_LESSON + " for add  lesson");
        System.out.println("please input " + PRINT_LESSON + " for print all  lesson's");
    }


    static void printLoginCommands() {
        System.out.println("please input  " + EXIT + " for exit");
        System.out.println("please input  " + LOGIN + " for login");
        System.out.println("please input  " + REGISTER + " for register");
    }

    static void printUserCommands() {
        System.out.println("please input  " + LOGOUT + " logout");
        System.out.println("please input  " + ADD_STUDENT + " for add  student's");
        System.out.println("please input  " + PRINT_ALL_STUDENTS + " for print all student's");
        System.out.println("please input  " + PRINT_STUDENT_BY_LESSON + " for print student by lesson");
        System.out.println("please input  " + PRINT_STUDENT_COUNT + " for print student count");
        System.out.println("please input " + PRINT_LESSON + " for print all  lesson's");
    }
}
