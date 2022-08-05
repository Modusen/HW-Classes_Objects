public class Main {
    public static void main(String[] args) {
        Author author = new Author("Брэм", "Стокер");
        Book book = new Book("Дракула", author, 1888);
        System.out.println("Название: " + book.getName() + "; Автор: " + book.getAuthor() + "; Дата публикации: " + book.getPublishDate());
        book.setPublishDate(1897);
        System.out.println("Дата публикации через сеттер = " + book.getPublishDate());

        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", author1, 1767);
        System.out.println("Название: " + book1.getName() + "; Автор: " + book1.getAuthor() + "; Дата публикации: " + book1.getPublishDate());
        book1.setPublishDate(1867);
        System.out.println("Дата публикации через сеттер = " + book1.getPublishDate());
    }
}