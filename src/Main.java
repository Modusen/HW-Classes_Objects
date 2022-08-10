public class Main {
    public static void main(String[] args) {
//1st task
        Author bramStoker = new Author("Брэм", "Стокер");
        Book dracula = new Book("Дракула", bramStoker, 1888);
        System.out.println("Название: " + dracula.getName() + "; Автор: " + dracula.getAuthor() + "; Дата публикации: " + dracula.getPublishDate());
        dracula.setPublishDate(1897);
        System.out.println("Дата публикации через сеттер = " + dracula.getPublishDate());

        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1767);
        System.out.println("1) Название: " + warAndPeace.getName() + "\n2) " + "Автор: " + warAndPeace.getAuthor() + "\n3) " + "Дата публикации: " + warAndPeace.getPublishDate());
        warAndPeace.setPublishDate(1867);
        System.out.println("Дата публикации через сеттер = " + warAndPeace.getPublishDate());

// переопределение equals для Author по полю name
        Author joeHill = new Author("Джо", "Хилл");
        Author joeAbercrombie = new Author("Джо", "Аберкромби");
        if (joeHill.equals(joeAbercrombie)) {
            System.out.println("У авторов одинаковые имена");
        } else {
            System.out.println("У авторов разные имена");
        }

// переопределение equals для Book по полю author
        Book judgesHouse = new Book("Дом судьи", bramStoker, 1891);
        if (judgesHouse.equals(warAndPeace)) {
            System.out.println("У книг один и тот же автор");
        } else {
            System.out.println("У книг разные авторы");
        }

        System.out.println(judgesHouse);
        System.out.println(joeAbercrombie);
// hashCode
        System.out.println(bramStoker.hashCode());
        System.out.println(dracula.hashCode());

    }
}