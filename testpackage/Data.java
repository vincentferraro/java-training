package testpackage;

public class Data {
    private String route;
    private String data;

    public Data(String r, String d){
        this.route = r;
        this.data = d;
    }

    public void setRoute(String route){
        this.route = route;
    }

    public String getRoute(){
        return this.route;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
}