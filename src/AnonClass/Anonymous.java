package AnonClass;

public class Anonymous {
    public void MyAnonymous() {
        Animal a = new Animal();
        a.makeNoise();
        
        Animal newa = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Boop");
            }
        };
        newa.makeNoise();
        
        Runnable anon = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anon Runable");
            }
        };
        anon.run();
    }
}
