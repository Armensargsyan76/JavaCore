package homework.books.storage;

import homework.books.model.Author;
import homework.books.model.Book;

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
}
