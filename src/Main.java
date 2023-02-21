
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("You are adult! You can go!");
        } else {
            System.out.println("Stop! You cant pass! You need to be 18 for that.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature <= 5) {
            System.out.println("Its too cold! Get your hat.");
        } else {
            System.out.println("Too hot out there! leave your hat at home!");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int carSpeed = 58;
        if (carSpeed > 60) {
            System.out.println("Hey! Better slowdown if you dont want a ticket.");
        } else {
            System.out.println("Have a good ride, sir! You doing right.");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 35;
        if (age >= 2 && age <= 6) {
            System.out.println("Go to kindergarten, lil guy!");
        } else if (age >= 7 && age <= 18 ) {
            System.out.println("Yo, go to school!");
        } else if (age >= 19 && age <= 24) {
            System.out.println("University, BRO! Best place!!");
        } else if (age >24) {
            System.out.println("Give me a dollar, dollar is what I need!");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int ageOfKid = 12;
        boolean parentWithKid = true;
        if (ageOfKid <= 5) {
            System.out.println("Too dangerous for you kid!");
        } else if ((ageOfKid > 5 || ageOfKid < 14) && (parentWithKid == true)) {
            System.out.println("You can go with your mama, Sassy!");
        } else if (ageOfKid > 14) {
            System.out.println("Ok, you can go!");
        } else {
            System.out.println("NO!!!");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int trainCapacity = 102;
        int sittingPlaces = 60;
        int people = 53;
        if (people < 60) {
            System.out.println("There are some sits 100%");
        } else if (people >= sittingPlaces && people < trainCapacity) {
            System.out.println("Well, there are no sits, but you can stand");
        } else {
            System.out.println("No place for you! The train is full.");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 2865;
        int two = 2865;
        int three = 2865;
        if ((one > two) && (one > three)) {
            System.out.println("ONE is bigger number");
        } else if ((two > one) && (two > three)) {
            System.out.println("TWO is bigger number");
        } else if ((three > one) && (three > two)) {
            System.out.println("THREE is bigger number");
        } else {
            System.out.println("Numbers are equal!");
        }
    }
}