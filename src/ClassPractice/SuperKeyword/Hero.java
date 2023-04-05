package ClassPractice.SuperKeyword;

public class Hero extends Person {

    String Power, HeroName;

    public Hero(String Power, String HeroName, String HeroNickName, int HeroAge) {
        super(HeroNickName, HeroAge);
        this.Power = Power;
        this.HeroName = HeroName;
    }

    @Override
    public String toString() {
        return "Hero{" + "Power=" + Power + ", HeroName=" + HeroName
                + ", NickName=" + super.NickName + ", Age=" + super.Age + '}';
    }
}
