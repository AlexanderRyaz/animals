import java.util.Objects;

public class Herbivore extends Mammal {
    private String mealType;

    public Herbivore(String nickName) {
        super(nickName);
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        if (isEmptyString(mealType)) {
            this.mealType = "трава";
        } else {
            this.mealType = mealType;
        }
    }
    public void graze (){
        System.out.println("Травоядное " + getNickName() + " пасется");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return mealType.equals(herbivore.mealType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mealType);
    }

    @Override
    public String toString() {
        return "Herbivore " +
                super.toString() +
                " , mealType='" + mealType + '\'';
    }
}
