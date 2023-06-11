import ObjectsAndClasses.Author;

public class Book {
   private String title;
   private Author author;
   private int yearOfPublicatoin;
   public Book (String title, Author author, int yearOfPublicatoin) {
       this.title = title;
       this.author = author;
       this.yearOfPublicatoin = yearOfPublicatoin;
   }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublicatoin() {
        return this.yearOfPublicatoin;
    }
    public void setYearOfPublicatoin (int year) {
       this.yearOfPublicatoin = year;
    }
}
