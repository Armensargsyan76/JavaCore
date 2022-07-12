package homework.books.model;

public class Book {

    private String title;
    private Author authorName;
    private double price;
    private int count;
    private String genre;
    private User userRegistered;

    public Book(String title, Author authorName, double price, String genre, User userRegistered) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.genre = genre;
        this.userRegistered = userRegistered;
    }

    public Book() {
    }

    public User getUserRegistered() {
        return userRegistered;
    }

    public void setUserRegistered(User userRegistered) {
        this.userRegistered = userRegistered;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName.getName() + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", userRegistered=" + userRegistered +
                ", genre='" + genre + '\'' +
                '}';
    }
}