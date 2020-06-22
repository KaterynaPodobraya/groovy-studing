package javacomparing

class Person {

    String name;
    int age;
    Town town;

    public Person(String name, int age, Town town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public String toString() {
        return "Person named " + name + " with age " + age + " and with town " + town.name();
    }

    static List<Person> persons =
            Arrays.asList(
                    new Person("Max", 18, Town.KYIV),
                    new Person("Peter", 23, Town.LONDON),
                    new Person("Pamela", 23, Town.KYIV),
                    new Person("David", 12, Town.TOKYO));

}

