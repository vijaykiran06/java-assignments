package library.model;

public class Book extends LibraryResource implements printable {

    private String isbn;

    public Book(int resourceId, String title, String author, String isbn) {

        super(resourceId, title, author);

        this.isbn = isbn;
    }

    @Override
    public double calculateFine(int overdueDays) {

        return overdueDays * 5.0;
    }

    @Override
    public void printDetails(){
    
        System.out.println("\n--- Book Details ---");

        displayBasicDetails();

        System.out.println("ISBN: " + isbn);
        System.out.println("Library: " + getLibraryName());
    }
}