import ObjectsAndClasses.Author;

public class Main {
    public static void main(String[] args) {
        Author lermontov = new Author("Mikhail", "Lermontov");
        Book aHeroOfOurTime = new Book("A Hero of Our Time", lermontov, 1840);
        Author dostoyevsky = new Author("Fedor", "Dostoyevsky");
        Book crimeAndPunishment = new Book("Crime and Punishment", dostoyevsky, 1866);
        aHeroOfOurTime.setYearOfPublication(1841);
        System.out.println(aHeroOfOurTime.toString());
        System.out.println(crimeAndPunishment.toString());
        Book testBook = new Book("Crime and Punishment", dostoyevsky, 1866);
        if (testBook.getAuthor().hashCode() != crimeAndPunishment.getAuthor().hashCode()) {
            System.out.println("Книги разные");
        } else {
            if (testBook.getAuthor().equals(crimeAndPunishment.getAuthor())) {
                System.out.println("Автор тот же");
                if (testBook.hashCode() != crimeAndPunishment.hashCode()) {
                    System.out.println("Книги разные");
                } else {
                    if (testBook.equals(crimeAndPunishment)) {
                        System.out.println("Книги одинаковые");
                    }
                }

            }
        }
    }
}