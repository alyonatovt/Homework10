package app;

public class Solution {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();
        System.out.println();
        person2.setProfession("Програміст");
        System.out.println("Оновлена інформація:");
        person2.printInfo();
    }
}
