package demirdzhi;

import demirdzhi.animals.Animal;
import demirdzhi.animals.birds.Duck;
import demirdzhi.animals.pets.Cat;
import demirdzhi.animals.pets.Dog;
import demirdzhi.data.Command;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите команду ADD/LIST/EXIT");
            try {
                String input = scanner.next().trim().toUpperCase();
                Command command = null;
                for (Command c: Command.values()) {
                    if (c.name().equals(input)){
                        command = c;
                        break;
                    }
                }
                if (command == null){
                    System.out.println("Wrong enter");
                    continue;
                }

                switch (command) {
                    case ADD:
                        Animal animal = null;
                        System.out.println("Какое животное добавить cat/dog/duck ?");
                        String animalType = scanner.next();
                        switch (animalType) {
                            case "cat":
                                animal = new Cat();
                                characteristicsAnimal(animal, scanner);
                                animal.say();
                                break;
                            case "dog":
                                animal = new Dog();
                                characteristicsAnimal(animal, scanner);
                                animal.say();
                                break;
                            case "duck":
                                animal = new Duck();
                                characteristicsAnimal(animal, scanner);
                                animal.say();
                                break;
                            default:
                                System.out.println("неверный ввод");
                                break;
                        }
                        animals.add(animal);
                        break;
                    case LIST:
                        System.out.println(animals);
                        break;
                    case EXIT:
                        System.exit(0);
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка ввода с консоли");
            }
        }
    }

    private static void characteristicsAnimal(Animal animal, Scanner sc) {
        System.out.println("Введите имя");
        String animalName = sc.nextLine();
        if (sc.hasNext()) {
            animalName = animalName + " " + sc.nextLine();
        }
        animal.setName(animalName);
        System.out.println("Введите возраст");
        animal.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Введите вес");
        animal.setWeight(Integer.parseInt(sc.nextLine()));
        System.out.println("Введите цвет");
        animal.setColor(sc.next());
    }
}


