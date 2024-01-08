package bookpack;

public class Book {
    protected String title;
    protected String author;
    protected int pubDate;

    public Book( String t, String a , int d){
        title = t;
        author = a ;
        pubDate = d;
    }

    public void show(){
        System.out.println(title);
        System.out.print(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
