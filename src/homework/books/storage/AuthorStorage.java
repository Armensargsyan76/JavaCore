package homework.books.storage;

import homework.books.model.Author;
import homework.books.model.Book;

public class AuthorStorage {

    private Author[] array = new Author[10];
    private int size;

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void printAllAuthor() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " " + array[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public Author getAuthorByIndex(int authorIndex) {
        if (authorIndex >= 0 && authorIndex < size) {
            return array[authorIndex];
        } else {
            return null;
        }

    }
}