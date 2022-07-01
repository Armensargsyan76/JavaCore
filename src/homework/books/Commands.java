package homework.books;

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

    static void createAuthorsAndBooks() {
        Author J_K_Rowling = new Author("Joanne", "Rowling", "@harryPotter.com", "Female");
        Author Mario_Puzo = new Author("Mario", "Puzo", "@maildraxt.com", "male");
        Author Arthur_Conan_Doyle = new Author("Arthur", "Conan_Doyle", "@mailSherlock.com", "male");
        Author John_Tolkien = new Author("John", "Tolkien", "@mailGendalf.com", "male");
        authorStorage.add(J_K_Rowling);
        authorStorage.add(Mario_Puzo);
        authorStorage.add(Arthur_Conan_Doyle);
        authorStorage.add(John_Tolkien);
        bookStorage.add(new Book("GodFather", Mario_Puzo, 50000, "criminal drama"));
        bookStorage.add(new Book("Sherlock Holmes", Arthur_Conan_Doyle, 40000, "detective"));
        bookStorage.add(new Book("Hobbit", John_Tolkien, 30000, "fantasy"));
        bookStorage.add(new Book("Harry Potter", J_K_Rowling, 25000, "fantasy"));
    }
}