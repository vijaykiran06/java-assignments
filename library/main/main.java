package library.main;

import library.model.Book;
import library.model.DigitalResource;
import library.model.LibraryResource;
import library.model.printable;
import library.service.LibraryService;
import library.util.InputValidator;

public class main {
    public static void main(String[] arg){
      if (!InputValidator.validateResourceId(1)) {
            System.out.println("Invalid Resource ID");
            return;
        }   
           LibraryResource[] resources = {

            new Book(
                    1,
                    "Java Programming",
                    "James Gosling",
                    "ISBN101"
            ),

            new Book(
                    2,
                    "Data Structures",
                    "Mark Allen",
                    "ISBN102"
            ),

            new Book(
                    3,
                    "Computer Networks",
                    "Andrew Tanenbaum",
                    "ISBN103"
            ),

            new DigitalResource(
                    4,
                    "Machine Learning Notes",
                    "Tom Mitchell",
                    "PDF"
            ),

            new DigitalResource(5,
                    "Database Systems",
                    "C.J. Date",
                    "EPUB"
            )
        };

         int[] overdueDays = {2, 5, 0, 3, 4};

          for (int days : overdueDays) {

            if (!InputValidator.validateFineDays(days)) {

                System.out.println("Invalid overdue days");
                return;
            }
        }


        // Display complete details

        System.out.println("===== LIBRARY RESOURCES =====");

        for (LibraryResource resource : resources) {

            printable print = (printable) resource;

            print.printDetails();
        }


        // Calculate Total Fine

        LibraryService service = new LibraryService();

        double totalFine =
                service.calculateTotalFine(
                        resources,
                        overdueDays
                );


        System.out.println("\n============================");

        System.out.println(
                "Total Fine of All Overdue Resources: Rs. "
                        + totalFine
        );


        // Display total objects created

        LibraryResource.Totalresource();
    }
    
}
