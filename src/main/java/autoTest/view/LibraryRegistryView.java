package autoTest.view;

import autoTest.model.LibraryItem;

import java.util.List;

public class LibraryRegistryView {

    public void getLibraryRegistryInfo(List<LibraryItem> libraryItem){
        libraryItem.forEach(System.out::println);
    }

}
