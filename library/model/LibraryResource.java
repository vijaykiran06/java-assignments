package library.model;

public abstract class LibraryResource {
   private  int  resourceId;
    private  String title;
   private String author;
    protected static String  libraryname="nava nalinanda";
    protected static int  count=0;
    public LibraryResource(int  resourceId,String title ,
        String author ){
            this.resourceId=resourceId;
            this.title=title;
            this.author=author;
            count ++;
        }
         
     protected void displayBasicDetails() {
        System.out.println("Resource ID: " + resourceId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
        
    public int getResourceId(){
        return resourceId;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public static String getLibraryName() {
        return libraryname;
    }
        public static  void  Totalresource(){
            System.out.println("total resources :"+count);
        }
     public  abstract  double  calculateFine(int overdueDays); 
    


    
}
