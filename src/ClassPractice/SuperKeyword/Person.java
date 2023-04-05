package ClassPractice.SuperKeyword;

public class Person {
    String NickName;
    int Age;

    public Person(String NickName, int Age) {
        this.NickName = NickName;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Person{" + "NickName=" + NickName + ", Age=" + Age + '}';
    }
}
