package GenericPractice;

public class Printer<T> {

    T MyName;

    public Printer(T thingtoprint) {
        this.MyName = thingtoprint;
    }
    
    public void PrintIt() {
        System.out.println(MyName);
    }
}
