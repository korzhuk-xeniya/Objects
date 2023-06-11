import ObjectsAndClasses.Author;

public class Main {
    public static void main(String[] args) {
        Author lermontov = new Author("Mikhail" , "Lermontov");
        Book aHeroOfOurTime = new Book("A Hero of Our Time", lermontov, 1840);
        Author dostoyevsky = new Author("Fedor", "Dostoyevsky");
        Book crimeAndPunishment = new Book("Crime and Punishment", dostoyevsky, 1866);
        aHeroOfOurTime.setYearOfPublicatoin(1841);
        System.out.println("Автор: " + aHeroOfOurTime.getAuthor().getName() + " " + aHeroOfOurTime.getAuthor().getLastName() + " Название: " + aHeroOfOurTime.getTitle() +
                " Год публикации: " + aHeroOfOurTime.getYearOfPublicatoin());
        System.out.println("Автор: " + crimeAndPunishment.getAuthor().getName() + " " + crimeAndPunishment.getAuthor().getLastName() + " Название: " + crimeAndPunishment.getTitle() +
                " Год публикации: " + crimeAndPunishment.getYearOfPublicatoin());
    }
}