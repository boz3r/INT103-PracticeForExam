package ClassPractice.Inheritance;

public class Person {
    String FirstName, LastName, NickName;
    int Age;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    public String ClubRule(int age) {
        if (age < 18) {
            return "Get the fuck out!!!";
        } else {
            return "Welcome to the club buddy!!!";
        }
    }
}
