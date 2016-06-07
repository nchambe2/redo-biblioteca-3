public class Book {

    private final String title;
    private final String author;
    private final String yearPublished;

    public Book(String title, String author, String yearPublished) {

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String details() {

        return String.join(" | ", title, author, yearPublished);
    }
}
