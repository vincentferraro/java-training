package testpackage;
import java.util.ArrayList;

public class server {
    
    private ArrayList<String> routes;
    private ArrayList<Data> datas;

    public boolean setRoute(String routeName){

        if(this.routes == null){
            return false;
        }else{
            if(!this.routes.contains(routeName)){
            this.routes.add(routeName);
            return true;
        }else{
            return false;
        }
        }
        
    }

    public boolean getRoute(String route){
        if(this.routes.contains(route)){
            return true;
        }else{
            return false;
        }
    }

    public boolean setData(Data data){
        this.datas.add(data);
        return true;
    }

    public Data getData(String routeName){
        for (Data object : datas) {
            if(object.getRoute() == routeName){
                return object;
            }
        }
        return null;

    }

    public static void main(String [] args){
    server serv = new server();
    // serv.setRoute("hello");
    Data d1 = new Data("hello", "Hello World");
    serv.setData(d1);

    Data value = serv.getData("hello");
    System.out.println(value);
}
}


