import java.util.Objects;

public class FlightlessBird extends Bird {
    private String movementType;

    public FlightlessBird(String nickName) {
        super(nickName);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (isEmptyString(movementType)) {
            this.movementType = "бег";
        } else {
            this.movementType = movementType;
        }
    }
    public void walk() {
        System.out.println("Нелетающая птица " + getNickName() + " гуляет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlightlessBird that = (FlightlessBird) o;
        return movementType.equals(that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "FlightlessBird " + super.toString() +
                " , movementType='" + movementType + '\'';
    }
}
