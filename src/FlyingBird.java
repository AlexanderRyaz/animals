import java.util.Objects;

public class FlyingBird extends Bird{
    private String movementType;

    public FlyingBird(String nickName) {
        super(nickName);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (isEmptyString(movementType)) {
            this.movementType = "полет";
        } else {
            this.movementType = movementType;
        }
    }
    public void walk() {
        System.out.println("Летающая птица " + getNickName() + " летит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyingBird that = (FlyingBird) o;
        return movementType.equals(that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "FlyingBird " + super.toString() +
                " , movementType='" + movementType + '\'';
    }
}
