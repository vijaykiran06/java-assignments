package library.model;

public class DigitalResource extends LibraryResource implements printable  { 
 private String fileFormat;
  public DigitalResource(int  resourceId,String title ,String author,String fileFormat){
    super(resourceId, title, author);
  }
   
  @Override 
  public double calculateFine(int overdueDays){
    return overdueDays*2.0;
  }
   @Override
   public void printDetails(){
     System.out.println("\n--- Digital Resource Details ---");

      displayBasicDetails();

        System.out.println("File Format: " + fileFormat);
        System.out.println("Library: " + getLibraryName());
   }
    
}
