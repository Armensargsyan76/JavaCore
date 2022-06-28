package homework.books;

import java.util.Scanner;

public class BookTest implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        bookStorage.add(new Book("GodFather", "Mario Puzo", 50000, "criminal drama"));
        bookStorage.add(new Book("Sherlock Holmes", "Arthur Conan Doyle", 40000, "detective"));
        bookStorage.add(new Book("Hobbit", "John Tolkien", 30000, "fantasy"));

        boolean run = true;
        while (run) {
            System.out.println("Please input " + EXIT + " for exit");
            System.out.println("Please input " + ADD_BOOK + " for add book's");
            System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all book's");
            System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print book's by author name");
            System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print book's by genre");
            System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print book's by price range");

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
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        bookStorage.getAuthorNameBooks(authorName);
    }

    private static void addBook() {
        System.out.println("Please input book's name");
        String booksName = scanner.nextLine();
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input genre");
        String genre = scanner.nextLine();
        double price = Double.parseDouble(priceStr);

        if (booksName == null || booksName.equals("")) {
            System.out.println("Please input book's name!!!!");
        } else if (authorName == null || authorName.equals("")) {
            System.out.println("Please input author name!!!!");
        } else if (price < 0) {
            System.out.println("Please input correct price");
        } else if (genre == null || genre.equals("")) {
            System.out.println("Please input genre name!!!!");
        } else {
            Book book = new Book(booksName.trim(), authorName.trim(), price, genre.trim());
            bookStorage.add(book);
            System.out.println("book created");
        }


    }
}

