// Task 1. Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
package tasks;

import java.util.Scanner;

public class Task1 {
    String name;

    public static String greet(String name) {
            return "Hello, " + name + " how are you doing today?";
        }

    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(greet(name));
    }
}
