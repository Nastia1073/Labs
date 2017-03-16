package pro.oop.model.book.impls;

/**
 * Created by nastu on 3/11/2017.
 */
public class StudentsBook extends Book {
    public StudentsBook(int id, int pages, String author, int publicationDate, String publication, String genre, String type, String name) {
        super(id, pages, author, publicationDate, publication, genre, type, name);
        this.degree = "low";
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
}
