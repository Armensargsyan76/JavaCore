package homework.books;

import homework.books.command.Commands;
import homework.books.enumstorage.Gender;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BookTest implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    public static BookStorage bookStorage = new BookStorage();
    public static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        Author JKRowling = new Author("Joanne", "Rowling", "@harryPotter.com", Gender.FEMALE);
        Author MarioPuzo = new Author("Mario", "Puzo", "@maildraxt.com", Gender.MALE);
        Author ArthurConanDoyle = new Author("Arthur", "Conan_Doyle", "@mailSherlock.com", Gender.MALE);
        Author JohnTolkien = new Author("John", "Tolkien", "@mailGendalf.com", Gender.MALE);
        authorStorage.add(JKRowling);
        authorStorage.add(MarioPuzo);
        authorStorage.add(ArthurConanDoyle);
        authorStorage.add(JohnTolkien);
        bookStorage.add(new Book("GodFather", MarioPuzo, 50000, "criminal drama"));
        bookStorage.add(new Book("Sherlock Holmes", ArthurConanDoyle, 40000, "detective"));
        bookStorage.add(new Book("Hobbit", JohnTolkien, 30000, "fantasy"));
        bookStorage.add(new Book("Harry Potter", JKRowling, 25000, "fantasy"));
        logInProgram();
    }

    private static void runProgram() {
        boolean run = true;
        while (run) {
            Commands.printCommands();
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
                default:
                    System.out.println("invalid command");
            }


        }
    }

    private static Gender chooseGenderByIndex() {
        Gender[] genders = Gender.values();
        System.out.println("Please choose correct author gender index");
        for (Gender genderValue : genders) {
            System.out.println(genderValue.ordinal() + ": " + genderValue);
        }
        int genderIndex;
        Gender gender = null;
        try {
            genderIndex = Integer.parseInt(scanner.nextLine());
            gender = genders[genderIndex];
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("please input correct index");
            addAuthor();
        }
        return gender;
    }


    private static void logInProgram() {
        System.out.println("please input login");
        String login = scanner.nextLine();
        System.out.println("please input password");
        String password = scanner.nextLine();
        if (login.equals("admin") && password.equals("123456")) {
            runProgram();
        } else {
            System.out.println("please input correct login or password");
            logInProgram();
        }

    }

    private static void addAuthor() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input author surname");
        String authorSurName = scanner.nextLine();
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        Gender gender = chooseGenderByIndex();
        if (gender==null){
        }else {
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
        int rangeFrom = 0;
        int rangeTo = 0;
        try {
            System.out.println("Please input range from");
            rangeFrom = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input price to");
            rangeTo = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("please note only numbers");
        }

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
            } catch (AuthorNotFoundException e) {
                System.out.println(e);
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
            int command = 0;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("please input only numbers");
            }

            if (command == 1) {
                addAuthor();
            } else if (false) ;
        } else {
            authorStorage.printAllAuthor();
            System.out.println("please choose index author");
            Author author = null;
            try {
                int authorIndex = Integer.parseInt(scanner.nextLine());
                author = authorStorage.getAuthorByIndex(authorIndex);
            } catch (AuthorNotFoundException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println("please input only numbers");
            }
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




