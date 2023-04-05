package GenericPractice;

public class GenericPractice {
    public void MyGeneric() {
        Printer<String> name = new Printer<>("Dol");
        name.PrintIt();
        
        shout("Dol");
    }
    
    private static <T> void shout(T MyName) {
        System.out.println(MyName+" is not here!!!");
    }
}
