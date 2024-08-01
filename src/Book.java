public class Book {
    private final String titleOfTheBook;
    private int yearOfPublication;
    private final Author author;

    public Book(String titleOfTheBook, int yearOfPublication, Author author) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
