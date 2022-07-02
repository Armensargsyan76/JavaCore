package homework.books.storage;

import homework.books.model.Author;
import homework.books.model.Book;

import static homework.books.BookTest.authorStorage;
import static homework.books.BookTest.bookStorage;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size;

    public void add(Book book) {
        if (size == array.length) {
            extend();
        }
        array[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " " + array[i]);
        }
    }

    public void getAuthorNameBooks(Author authorName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                System.out.println(array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no books by the author");
        }

    }

    public void printBookByGenre(String genre) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no books by this genre");
        }
    }

    public void printBooksByPriceRange(int rangeFrom, int rangeTo) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= rangeFrom && array[i].getPrice() <= rangeTo) {
                System.out.println(array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no books in this price range");
        }
    }

    public void printAuthorsAndBooks() {
        Author J_K_Rowling = new Author("Joanne", "Rowling", "@harryPotter.com", "Female");
        Author Mario_Puzo = new Author("Mario", "Puzo", "@maildraxt.com", "male");
        Author Arthur_Conan_Doyle = new Author("Arthur", "Conan_Doyle", "@mailSherlock.com", "male");
        Author John_Tolkien = new Author("John", "Tolkien", "@mailGendalf.com", "male");
        AuthorStorage authorStorage = new AuthorStorage();
        authorStorage.add(J_K_Rowling);
        authorStorage.add(Mario_Puzo);
        authorStorage.add(Arthur_Conan_Doyle);
        authorStorage.add(John_Tolkien);
        BookStorage bookStorage = new BookStorage();
        bookStorage.add(new Book("GodFather", Mario_Puzo, 50000, "criminal drama"));
        bookStorage.add(new Book("Sherlock Holmes", Arthur_Conan_Doyle, 40000, "detective"));
        bookStorage.add(new Book("Hobbit", John_Tolkien, 30000, "fantasy"));
        bookStorage.add(new Book("Harry Potter", J_K_Rowling, 25000, "fantasy"));
    }
}
