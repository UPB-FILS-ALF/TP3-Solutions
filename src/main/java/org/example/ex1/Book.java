package org.example.ex1;

public class Book {
    private String title;
    private String ISBN;
    private String datePublication;

    public Book(String title, String ISBN, String datePublication) {
        this.title = title;
        this.ISBN = ISBN;
        this.datePublication = datePublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", datePublication='" + datePublication + '\'' +
                '}';
    }
}
