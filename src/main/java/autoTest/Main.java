package autoTest;

import autoTest.controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.createBook("Father Frost", "Afanasyev", "1855");
        controller.createBook("The count of Monte Cristo", "Alexandre Dumas", "1844");
        controller.createLetter("Job", "Leonardo da Vinci", "1483", "Ludovico Sforza");
        controller.createLetter("Letter", "Napoleon", "1795", "Josephine");
        controller.createMagazine("Digest", "Cambridge", "2024", "MIT Press");
        controller.createMagazine("Decoration", "New York", "2024", "Publishers");
        controller.createMicrofilm("Going Vertical", "Megerdichev", "2017", "Sport");
        controller.createMicrofilm("Challenge", "Shipenko", "2023", "Drama");

        controller.printSearchListById(1);
        controller.printSearchListById(10);
        controller.printSearchListByAuthor("Shipenko");
        controller.printSearchListByAuthor("NoName");
        controller.printAllLibrary();
    }
}
