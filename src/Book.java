import java.util.Objects;

public class Book {
    private String name;
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
    @Override
    public String toString() {
        return this.name + " " + author + " " + this.publishDate;
    }


    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c = (Book) other;
        return author.equals(c.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishDate);
    }

}
