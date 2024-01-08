package testpackage;
public class interfaceTest {
    

    public static void main (String [] args){

        Sequelize seq = new Sequelize("localhost:3000","formula","admin","admin");

        System.out.println(seq.getHostname());
        System.out.println(seq.getDb());
        System.out.println(seq.getUsername());
    }
}


interface DBConnection{

    boolean dbConnection();
    boolean synchronization();
    boolean dbDisconnection();
}

class Sequelize implements DBConnection{
    private String hostname;
    private String db;
    private String username;
    private String password;

    public Sequelize(String hostname, String db, String username,String password){
        this.hostname= hostname;
        this.db= db;
        this.username = username;
        this.password = password;

    }

    public String getHostname(){
        return this.hostname;
    }

    public String getDb(){
        return this.db;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }

    public boolean dbConnection(){
        System.out.println("Request....");
        System.out.println("Connection OK");
        return true;
    };
    public boolean synchronization(){
        System.out.println("Synchronization...");
        System.out.println("Please wait...");
        System.out.println("Synchronization OK");
        return true;
    };
    public boolean dbDisconnection(){
        System.out.println("Disconnection in progres...");
        System.out.println("Disconnection OK");
        return true;
    };
}