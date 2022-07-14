//Task 3. Nathan loves cycling. Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling. You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

package tasks;

import java.util.Scanner;

public class Task3 {

    public static int Liters(double time)  {
        double result =  time * 0.5;
        int litres = (int) result;
        return litres;
    }

    public static void main(String[] args) {
        System.out.println("Enter time:");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        double time = Double.parseDouble(answer);
        System.out.println(Liters(time));
    }

}
