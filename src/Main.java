public class Main {
    public static void main(String[] args) {
        Herbivore gazelle = new Herbivore("газель Маруся");
        gazelle.setAge(2);
        gazelle.setMealType("трава");
        gazelle.setAreal("степь");
        gazelle.setSpeed(40);
        System.out.println(gazelle);
        Herbivore giraffe =new Herbivore("Жираф Федя");
        giraffe.setAge(1);
        giraffe.setMealType("листья");
        giraffe.setAreal("пустыня");
        giraffe.setSpeed(30);
        System.out.println(giraffe);
        Herbivore horse = new Herbivore("Лошадь Соня");
        horse.setAge(5);
        horse.setMealType("сено");
        horse.setAreal("степь");
        horse.setSpeed(60);
        System.out.println(horse);
        Predator hyena = new Predator("Гиена Зубик");
        hyena.setAge(4);
        hyena.setMealType("падаль");
        hyena.setAreal("Саванна");
        hyena.setSpeed(45);
        System.out.println(hyena);
        Predator tiger = new Predator("Тигр Тигрелло");
        tiger.setAge(7);
        tiger.setMealType("мясо");
        tiger.setAreal("Тайга");
        tiger.setSpeed(50);
        System.out.println(tiger);
        Predator bear = new Predator("медведь Михаило Потапыч ");
        bear.setAge(8);
        bear.setMealType("рыба");
        bear.setAreal("Тайга");
        bear.setSpeed(25);
        System.out.println(bear);
        Amphibian frog = new Amphibian(" лягушка Квакушка");
        frog.setAge(4);
        frog.setAreal("пруд");
        System.out.println(frog);
        Amphibian snake = new Amphibian("змея Кусь");
        snake.setAge(10);
        snake.setAreal("лес");
        System.out.println(snake);
        FlightlessBird penguin = new FlightlessBird("Пингвин Валентин");
        penguin.setAge(5);
        penguin.setMovementType("плавает и ходит");
        penguin.setAreal("Антарктида");
        System.out.println(penguin);
        FlightlessBird peacock = new FlightlessBird("Павлин Красун");
        peacock.setAge(11);
        peacock.setMovementType("ходит");
        peacock.setAreal("джунгли");
        System.out.println(peacock);
        FlightlessBird dodo  = new FlightlessBird("птица Додо");
        dodo.setAge(3);
        dodo.setMovementType("ходит");
        dodo.setAreal("джунгли");
        System.out.println(dodo);
        FlyingBird seagull = new FlyingBird("Чайка Маша");
        seagull.setAge(2);
        seagull.setMovementType("летает");
        seagull.setAreal("побережье");
        System.out.println(seagull);
        FlyingBird albatross = new FlyingBird("Альбатрос Петя");
        albatross.setAge(1);
        albatross.setMovementType("летает");
        albatross.setAreal("побережье");
        System.out.println(albatross);
        FlyingBird falcon = new FlyingBird("Сокол Дима");
        falcon.setAge(12);
        falcon.setMovementType("летает");
        falcon.setAreal("тайга");
        System.out.println(falcon);
    }

}