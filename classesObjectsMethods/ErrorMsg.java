package classesObjectsMethods;

class Err{
    String msg;
    int severity;

    Err(String m, int s){
        msg=m;
        severity=s;
    }
}
// returning object from class
public class ErrorMsg {
    String [] msgs = {
        "Outpur Error",
        "Input Error",
        "Disk Full",
        "Index Out-Of-Bounds"
    };
    int [] howbad = {3,3,2,4};

    Err getErrorInfo(int i){
        if(i >= 0 & i<msgs.length){
            return new Err(msgs[i],howbad[i]);
        }else{
            return new Err("Invalid Error Code",0);
        }
    }
}

class ErrMsg{
    public static void main (String args[]){
        ErrorMsg err = new ErrorMsg();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg+" severity: "+ e.severity);
        
    }
}