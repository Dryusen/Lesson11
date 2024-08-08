public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", 30, "Інженер"),
                new Person("Mary", 25, "Вчитель"),
                new Person("Bob", 35, "Лікар")
        };

        System.out.println("1.");
        for (Person person : persons) {
            person.displayInfo();
        }

        Person person4 = new Person("Alice", 28, "Архітектор");

        System.out.println("\n2.");
        person4.displayInfo();

        person4.setProfession("Дизайнер");

        System.out.println("   (Після оновлення професії)");
        person4.displayInfo();
    }
}
