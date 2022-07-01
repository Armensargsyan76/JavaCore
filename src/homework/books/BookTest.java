package homework.books;

import chapters.chapter8.A;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BookTest implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    static BookStorage bookStorage = new BookStorage();

    static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        Commands.createAuthorsAndBooks();
        boolean run = true;
        while (run) {
            try {
                Commands.printCommands();
                int command = Integer.parseInt(scanner.nextLine());
                switch (command) {
                    case EXIT:
                        run = false;
                        break;
                    case ADD_BOOK:
                        addBook();
                        break;
                    case PRINT_ALL_BOOKS:
                        bookStorage.printAllBooks();
                        break;
                    case PRINT_BOOKS_BY_AUTHOR_NAME:
                        printBooksByAuthorName();
                        break;
                    case PRINT_BOOKS_BY_GENRE:
                        printBooksByGenre();
                        break;
                    case PRINT_BOOKS_BY_PRICE_RANGE:
                        printBooksByRange();
                        break;
                    case ADD_AUTHORS:
                        addAuthor();
                        break;
                    case PRINT_AUTHORS:
                        authorStorage.printAllAuthor();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("please input only numbers!!");

            }

        }
    }

    private static void addAuthor() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input author surname");
        String authorSurName = scanner.nextLine();
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        System.out.println("Please choose author gender index: 1.male, 2.female");
        String gender;
        int indexGender = Integer.parseInt(scanner.nextLine());
        if (indexGender == 1) {
            gender = "male";
        } else gender = "female";
        if (indexGender < 1 || indexGender > 2) {
            System.out.println("Please choose index 1 or index 2 !!!");
            addAuthor();
        } else {
            if (authorName == null || authorName.equals("")) {
                System.out.println("Please input author name!!!");
            } else if (authorSurName == null || authorSurName.equals("")) {
                System.out.println("Please input author surname");
            } else if (!email.contains("@")) {
                System.out.println("please input correct email");
            } else {
                Author author = new Author(authorName.trim(), authorSurName.trim(), email.trim(), gender);
                authorStorage.add(author);
                System.out.println("author created");
            }
        }

    }

    private static void printBooksByRange() {
        System.out.println("Please input range from");
        int rangeFrom = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input price to");
        int rangeTo = Integer.parseInt(scanner.nextLine());
        int tmp = 0;
        if (rangeFrom > rangeTo) {
            tmp = rangeTo;
            rangeTo = rangeFrom;
            rangeFrom = tmp;
        }
        bookStorage.printBooksByPriceRange(rangeFrom, rangeTo);
    }

    private static void printBooksByGenre() {
        System.out.println("Please input genre");
        String genre = scanner.nextLine();
        bookStorage.printBookByGenre(genre);
    }

    private static void printBooksByAuthorName() {
        if (authorStorage.getSize() != 0) {
            authorStorage.printAllAuthor();
            System.out.println("Please choose author index");
            try {
                int index = Integer.parseInt(scanner.nextLine());
                Author author = authorStorage.getAuthorByIndex(index);
                if (author != null) {
                    bookStorage.getAuthorNameBooks(author);
                } else {
                    System.out.println("Please choose correct index");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please note only numbers");
            }
        } else {
            System.out.println("Please create author");
        }

    }

    private static void addBook() {
        if (authorStorage.getSize() == 0) {
            System.out.println("for create book need has author");
            System.out.println(" please create author");
            System.out.println("for create author choose_1: for exit choose_2");
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                addAuthor();
            } else if (false) ;
        } else {
            authorStorage.printAllAuthor();
            System.out.println("please choose index author");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("please choose correct index!!!");
                addBook();
            } else {
                System.out.println("Please input book's name");
                String booksName = scanner.nextLine();
                System.out.println("Please input genre");
                String genre = scanner.nextLine();
                try {
                    System.out.println("Please input price");
                    double price = Double.parseDouble(scanner.nextLine());
                    if (booksName == null || booksName.equals("")) {
                        System.out.println("Please input book's name!!!!");
                    } else if (price < 0) {
                        System.out.println("Please input correct price");
                    } else if (genre == null || genre.equals("")) {
                        System.out.println("Please input genre name!!!!");
                    } else {
                        Book book = new Book(booksName.trim(), author, price, genre.trim());
                        bookStorage.add(book);
                        System.out.println("book created");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please note only numbers");
                    addBook();
                }
            }
        }

    }


}




