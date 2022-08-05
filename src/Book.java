public class Book {
    private final String name;
    public Author author;
    private int publishDate;

    public Book(String name, Author author, int publishDate) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

}
