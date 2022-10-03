import java.util.Objects;

public class Amphibian extends Animal {
    private String areal;

    public Amphibian(String nickName) {
        super(nickName);
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        if (isEmptyString(areal)) {
            this.areal = "Пруд";
        } else {
            this.areal = areal;
        }
    }

    public void hunt(String prey) {
        System.out.println("Земноводное " + getNickName() + " охотится на " + prey);
    }

    @Override
    public void eat(String meal) {
        System.out.println("Земноводное " + getNickName() + " сжевало " + meal);
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное " + getNickName() + "спит");
    }

    @Override
    public void go() {
        System.out.println("Земноводное " + getNickName() + "плывет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian amphibian = (Amphibian) o;
        return areal.equals(amphibian.areal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areal);
    }

    @Override
    public String toString() {
        return "Amphibian " + super.toString() +
                " , areal='" + areal + '\'';
    }
}
