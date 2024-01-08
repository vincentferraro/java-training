package bookpackext;
import bookpack.*;
public class UseBook {
    public static void main(String[] args) {
        Book arr[] = new Book[3];
        arr[0] = new Book("Java : A beginner's Guide", "Shildt", 2011);
        arr[1] = new Book("Java : The complete Reference", "Shildt", 2011);
        arr[2] = new Book("The Art of Java", "Shildt and Holmes", 2003);

        for(int i = 0; i < arr.length; i++){
            arr[i].show();
        }
    }
}
