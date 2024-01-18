package HashMap;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Vinc", 18);
        Person p2 = new Person("Ka",18);
        HashMap <Integer, Person>  h = new HashMap<>();

        h.put(1,p1);
        h.put(2,p2);

        Person p3 = h.get(1);
        System.out.println("Name : "+ p3.name + ", Age : "+ p3.age);
        for(int i : h.keySet()){
            System.out.println(i);
        }
        

    }
}

class Person{
    String name;
    int age;

    Person(String n, int a){
        name = n;
        age = a;
    }
}