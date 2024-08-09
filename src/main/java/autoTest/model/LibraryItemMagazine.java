package autoTest.model;

public class LibraryItemMagazine extends LibraryItem{

    private String publishingHouse;

    public LibraryItemMagazine(Integer id, String title, String author, String year, String publishingHouse) {
        super(id, title, author, year);
        this.publishingHouse = publishingHouse;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Category Publication:\t" +
                "Magazine {"+
                "P.id=" + super.getId() +
                ", title=" + super.getTitle() +
                ", author=" + super.getAuthor() +
                ", year=" + super.getYear() +
                ", publishingHouse=" + getPublishingHouse() +
                '}';
    }
}
