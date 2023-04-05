package ClassPractice.Polymorphism;

public class Green extends Color{

    @Override
    public String Greeting() {
        return super.Greeting() + "Green";
    }
}
