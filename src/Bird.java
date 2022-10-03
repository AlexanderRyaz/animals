import java.util.Objects;

public class Bird extends Animal {
    private String areal;

    public Bird(String nickName) {
        super(nickName);
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        if (isEmptyString(areal)) {
            this.areal = "лес";
        } else {
            this.areal = areal;
        }
    }
    public void hunt(String prey){
        System.out.println("Птица " + getNickName() + " охотится на " + prey);
    }

    @Override
    public void eat(String meal) {
        System.out.println("Птица " + getNickName() + " склевала " + meal);
    }

    @Override
    public void sleep() {
        System.out.println("Птица " + getNickName() + "спит");
    }

    @Override
    public void go() {
        System.out.println("Птица " + getNickName() + "летит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return areal.equals(bird.areal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), areal);
    }

    @Override
    public String toString() {
        return super.toString() +
                " , areal='" + areal + '\'';

    }
}
