package autoTest.model;

public class LibraryItemMicrofilm extends LibraryItem{

    private String genre;

    public LibraryItemMicrofilm(Integer id, String title, String author, String year, String genre) {
        super(id, title, author, year);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Category Video:\t\t\t" +
                "Microfilm {"+
                "V.id=" + super.getId() +
                ", title=" + super.getTitle() +
                ", author=" + super.getAuthor() +
                ", year=" + super.getYear() +
                ", genre=" + getGenre() +
                '}';
    }
}
