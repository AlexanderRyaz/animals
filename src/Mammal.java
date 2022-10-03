import java.util.Objects;

public class Mammal extends Animal {
    private String areal;
    private int speed;

    public Mammal(String nickName) {
        super(nickName);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 1;
        } else {
            this.speed = speed;
        }
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        if (isEmptyString(areal)) {
            this.areal = "поле";
        } else {
            this.areal = areal;
        }
    }

    public void walk() {
        System.out.println("Млекопитающее " + getNickName() + " гуляет");
    }

    @Override
    public void eat(String meal) {
        System.out.println("Млекопитающее " + getNickName() + " сжевало " + meal);
    }

    @Override
    public void sleep() {
        System.out.println("Млекопитающее " + getNickName() + "спит");
    }

    @Override
    public void go() {
        System.out.println("Млекопитающее " + getNickName() + "бежит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && areal.equals(mammal.areal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), areal, speed);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", areal='" + areal + '\'' +
                ", speed=" + speed;

    }
}

