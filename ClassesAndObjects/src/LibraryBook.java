public class LibraryBook {
    private String title;
    private String author;
    private int isbNumber;
    private boolean isAvailable;

    public LibraryBook(String title, String author, int isbNumber){
        this.title=title;
        this.author=author;
        this.isbNumber=isbNumber;
        this.isAvailable=true;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    public boolean borrowBook(){
        if(isAvailable){
            this.isAvailable=false;
            return true;
        }
        return false;
    }

    public void returnBook(){
        this.isAvailable=true;
    }

    public void printBookDetails(){
        System.out.println("title "+this.title);
        System.out.println("author "+this.author);
        System.out.println("isb "+this.isbNumber);
        System.out.println("availability "+this.isAvailable());
    }

}
