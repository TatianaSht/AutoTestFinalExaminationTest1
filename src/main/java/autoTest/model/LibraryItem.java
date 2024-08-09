package autoTest.model;

abstract public class LibraryItem {

    private Integer id;
    private String year;
    private String title;
    private String author;


    public LibraryItem(Integer id, String title, String author, String year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "LibraryItem{" +
                ", id=" + id +
                ", title=" + title +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}
