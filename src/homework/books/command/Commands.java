package homework.books.command;

import homework.books.model.Author;
import homework.books.model.Book;

import static homework.books.BookTest.authorStorage;
import static homework.books.BookTest.bookStorage;

public interface Commands {

    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;

    int ADD_AUTHORS = 6;

    int PRINT_AUTHORS = 7;

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_BOOK + " for add book's");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all book's");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print book's by author name");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print book's by genre");
        System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print book's by price range");
        System.out.println("Please input " + ADD_AUTHORS + " for add author's");
        System.out.println("Please input " + PRINT_AUTHORS + " for print all author's");
    }


}