import ObjectsAndClasses.Author;

import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int year) {
        this.yearOfPublication = year;
    }

    @Override
    public String toString() {
        return author.toString() + " Название: " + title +
                " Год публикации: " + yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author.hashCode(), yearOfPublication);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(yearOfPublication, book.yearOfPublication)
                && author.equals(book.author);
    }
}
