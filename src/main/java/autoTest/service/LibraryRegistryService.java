package autoTest.service;

import autoTest.model.*;

import java.util.ArrayList;
import java.util.List;

public class LibraryRegistryService {
    private final List<LibraryItem> libraryItemList;

    public LibraryRegistryService() {
        this.libraryItemList = new ArrayList<>();
    }

    public List<LibraryItem> getLibraryItemList() {
        return libraryItemList;
    }


    private int getFreeId(LibraryItemType type){
        Integer lastId = 1;
        boolean itsStudent = LibraryItemType.VIDEO == type;
        for (LibraryItem item : libraryItemList) {
            if (item instanceof LibraryItemBook && !itsStudent){
                lastId = ((LibraryItemBook) item).getId() + 1;
            }
            if (item instanceof LibraryItemMagazine && !itsStudent){
                lastId = ((LibraryItemMagazine) item).getId() + 1;
            }
            if (item instanceof LibraryItemLetter && !itsStudent){
                lastId = ((LibraryItemLetter) item).getId() + 1;
            }

            if (item instanceof LibraryItemMicrofilm && itsStudent){
                lastId = ((LibraryItemMicrofilm) item).getId() + 1;
            }
        }
        return lastId;
    }


    public void createBook(String title, String author, String year, LibraryItemType type){
        Integer id = getFreeId(type);
        if (type == LibraryItemType.PUBLICATION){
            LibraryItemBook book = new LibraryItemBook(id, title, author, year);
            libraryItemList.add(book);
        }
    }

    public void createLetter(String title, String author, String year, String whom, LibraryItemType type){
        Integer id = getFreeId(type);
        if (type == LibraryItemType.PUBLICATION){
            LibraryItemLetter letter = new LibraryItemLetter(id, title, author, year, whom);
            libraryItemList.add(letter);
        }
    }

    public void createMagazine(String title, String author, String year, String publishingHouse, LibraryItemType type){
        Integer id = getFreeId(type);
        if (type == LibraryItemType.PUBLICATION){
            LibraryItemMagazine magazine = new LibraryItemMagazine(id, title, author, year, publishingHouse);
            libraryItemList.add(magazine);
        }
    }

    public void createMicrofilm(String title, String author, String year, String genre, LibraryItemType type){
        Integer id = getFreeId(type);
        if (type == LibraryItemType.VIDEO){
            LibraryItemMicrofilm microfilm = new LibraryItemMicrofilm(id, title, author, year, genre);
            libraryItemList.add(microfilm);
        }
    }

    public List<LibraryItem> searchLibraryById(Integer id) {
        List<LibraryItem> searchItemListById = new ArrayList<>();
        for (LibraryItem item : getLibraryItemList()){
            if (item.getId().equals(id)){
                searchItemListById.add(item);
            }
        }
        if (searchItemListById.size() == 0){
            System.out.println("Zero matches!");
        }
        return searchItemListById;
    }

    public List<LibraryItem> searchLibraryByAuthor(String author) {
        List<LibraryItem> searchItemListByAuthor = new ArrayList<>();
        for (LibraryItem item : getLibraryItemList()){
            if (item.getAuthor().equals(author)){
                searchItemListByAuthor.add(item);
            }
        }
        if (searchItemListByAuthor.size() == 0){
            System.out.println("Zero matches!");
        }
        return searchItemListByAuthor;
    }

}
