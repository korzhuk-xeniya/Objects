package ObjectsAndClasses;

import java.util.Objects;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.lastName = lastName;
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Автор: " + name + " " + lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }
}
