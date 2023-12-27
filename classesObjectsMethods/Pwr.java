package classesObjectsMethods;

public class Pwr {
    double b;
    int e;
    double val;

    // Using this in order to reffer to the class variables
    Pwr(double base, int exp){
        this.b = base;
        this.e = exp;

        this.val = 1;
        if(exp == 0) return;
        for(; exp>0; exp--)this.val = this.val*base;
    }

    double get_pwr(){
        return this.val;
    }

}
