import java.util.Objects;

public class Predator extends Mammal {
    private String mealType;

    public Predator(String nickName) {
        super(nickName);
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        if (isEmptyString(mealType)) {
            this.mealType = "мясо";
        } else {
            this.mealType = mealType;
        }
    }

    public void hunt(String prey) {
        System.out.println("Хищник " + getNickName() + " охотится на " + prey);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return mealType.equals(predator.mealType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mealType);
    }

    @Override
    public String toString() {
        return "Predator " + super.toString() +
                " , mealType='" + mealType + '\'';
    }
}
