package LambdaPractice;

public class LambdaPractice {
   
    public void MyLambda() {
        /*
            'x" is a receiver from "run" method argument.
            มองให้เห็นภาพก็คือการรับ parameter ของ annonymous function ใน golang
        */
        Activity ac = (x) -> {
            System.out.println("I'm running here!!!");
            if (x < 20) {
                System.out.println("Ha!!!");
            }
        };
        ac.run(18);
    }
}
