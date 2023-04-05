package ClassPractice.Polymorphism;

public class Blue extends Color{

    @Override
    public String Greeting() {
        return super.Greeting() + "Blue";
    }
}
