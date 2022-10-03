import java.util.Objects;

public abstract class Animal {
    private final String nickName;
    private int age;

    public Animal(String nickName) {
        if (isEmptyString(nickName)) {
            this.nickName = "default";
        } else {
            this.nickName = nickName;
        }
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public boolean isEmptyString(String s) {
        return s == null || "".equals(s);
    }

    public abstract void eat(String meal);

    public abstract void sleep();

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && nickName.equals(animal.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, age);
    }

    @Override
    public String toString() {
        return
                "nickName='" + nickName + '\'' +
                        ", age=" + age;

    }
}
