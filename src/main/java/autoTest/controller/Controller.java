package autoTest.controller;

import autoTest.model.*;
import autoTest.service.LibraryRegistryService;
import autoTest.view.*;

public class Controller {
    private final LibraryRegistryService libraryRegistryService = new LibraryRegistryService();
    private final LibraryRegistryView libraryItemView = new LibraryRegistryView();


    public void createBook(String title, String author, String year) {
        libraryRegistryService.createBook(title, author, year, LibraryItemType.PUBLICATION);
    }

    public void createLetter(String title, String author, String year, String whom) {
        libraryRegistryService.createLetter(title, author, year, whom, LibraryItemType.PUBLICATION);
    }

    public void createMagazine(String title, String author, String year, String publishingHouse) {
        libraryRegistryService.createMagazine(title, author, year, publishingHouse, LibraryItemType.PUBLICATION);
    }

    public void createMicrofilm(String title, String author, String year, String genre) {
        libraryRegistryService.createMicrofilm(title, author, year, genre, LibraryItemType.VIDEO);
    }

    public void printAllLibrary(){
        System.out.println("Library register:");
        libraryItemView.getLibraryRegistryInfo(libraryRegistryService.getLibraryItemList());
    }


    public void printSearchListById(Integer id){
        System.out.println("The result of a search in the library register by id=" + id + ":");
        libraryItemView.getLibraryRegistryInfo(libraryRegistryService.searchLibraryById(id));
    }

    public void printSearchListByAuthor(String author){
        System.out.println("The result of a search in the library register by author=" + author + ":");
        libraryItemView.getLibraryRegistryInfo(libraryRegistryService.searchLibraryByAuthor(author));
    }

}