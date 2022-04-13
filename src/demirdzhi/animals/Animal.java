package demirdzhi.animals;

public abstract class Animal {
    String name;
    int age;
    int weight;
    String color;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        String say = "Я говорю";
        System.out.println(say);
    }
    public void go() {
        String go = "Я иду";
        System.out.println(go);
    }
    public void drink() {
        String drink = "Я пью";
        System.out.println(drink);
    }
    public void eat() {
        String eat = "Я ем";
        System.out.println(eat);
    }

    // метод для вывода лет, год, года
    private String toDate(int age) {
        int ageLastNumber = age % 10;
        long ageDecades = age - age / 100 * 100;
        if (ageDecades >= 10 && ageDecades <= 20) {
            return "лет";
        }
        if (ageLastNumber == 1) {
            return "год";
        }
        if (ageLastNumber >= 2 && ageLastNumber <= 4) {
            return "года";
        }
        return "лет";
    }

    // переопределение метода toString
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ", мне " + age + " " + toDate(this.age) + " " + "я вешу " + weight + " кг, мой цвет - " + color;
    }
}
