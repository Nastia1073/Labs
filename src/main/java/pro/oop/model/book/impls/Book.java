package pro.oop.model.book.impls;

import pro.oop.model.book.interfaces.IBook;

/**
 * Created by nastu on 3/11/2017.
 */
public class Book implements IBook {
    int id;
    int pages;
    String author;
    int publicationDate;
    String publication;
    String genre;
    String type;
    String name;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    String degree;

    public Book(String degree) {
        this.degree = degree;
    }

    public Book(int id, int pages, String author, int publicationDate, String publication, String genre, String type, String name) {
        this.id = id;
        this.pages = pages;
        this.author = author;
        this.publicationDate = publicationDate;
        this.publication = publication;
        this.genre = genre;
        this.type = type;
        this.name = name;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return 2017 - this.publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                ", publication='" + publication + '\'' +
                ", genre='" + genre + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }

    public String getInfo() {
        return this.toString();
    }
}
