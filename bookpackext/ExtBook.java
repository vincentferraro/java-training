package bookpackext;


public class ExtBook extends bookpack.Book {
    private String publisher;
    
    public ExtBook(String t, String a, int d , String p){
        super(t,a,d);
        publisher = p;
    }

    public void show(){
        super.show();
        System.out.println(publisher);
        System.out.println();

    }

    public String getPublisher(){ return publisher;}
    public void setPublisher(String p){ publisher = p;}

    // SubClass can access protected member
    public String getTitle(){ return title;}
    public void setTitle(String t){ title = t; }
    public String getAuthor(){ return author;}
    public void setAuthor(String a){ author = a; }
    public int getPubDate(){ return pubDate;}
    public void setPubDate(int d){ pubDate = d;}

}


class ProtectDemo{
    public static void main (String args[]){

        ExtBook books[] = new ExtBook[3];

        books[0] = new ExtBook("Java : A beginner's Guide", "Shildt", 2011, "McGraw-Hill");
        books[1] = new ExtBook("Java : The complete Reference", "Shildt", 2011, "McGraw-Hill");
        books[2] = new ExtBook("The Art of Java", "Shildt and Holmes", 2003, "Osborne/McGraw-Hill");

        for(int i = 0; i < books.length; i++) books[i].show();

        // showing all books by Shildt
        System.out.println("Showing all books by Shildt.");
        for(int i = 0; i< books.length; i++){
            if(books[i].getAuthor() == "Shildt"){
                System.out.println(books[i].getTitle());

            }
            // books[0].title = "test title";  // Error - not accessible
        }
    }
}

