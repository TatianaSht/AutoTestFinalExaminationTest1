package autoTest.model;

public class LibraryItemBook extends LibraryItem {

    public LibraryItemBook(Integer id, String title, String author, String year) {
        super(id, title, author, year);
    }


    @Override
    public String toString() {
        return "Category Publication:\t" +
                "Book {" +
                "P.id=" + super.getId() +
                ", title=" + super.getTitle() +
                ", author=" + super.getAuthor() +
                ", year=" + super.getYear() +
                '}';
    }
}
