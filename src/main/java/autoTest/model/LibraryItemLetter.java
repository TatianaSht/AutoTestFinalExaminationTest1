package autoTest.model;

public class LibraryItemLetter extends LibraryItem {
    private String whom;

    public LibraryItemLetter(Integer id, String title, String author, String year, String whom) {
        super(id, title, author, year);
        this.whom = whom;
    }

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.whom = whom;
    }

    @Override
    public String toString() {
        return "Category Publication:\t" +
                "Letter {"+
                "P.id=" + super.getId() +
                ", title=" + super.getTitle() +
                ", author=" + super.getAuthor() +
                ", year=" + super.getYear() +
                ", whom=" + getWhom() +
                '}';
    }
}




