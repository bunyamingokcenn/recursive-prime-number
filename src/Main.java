import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static boolean isPrimeRecursive(int number, int divisor) {

        if (divisor == 1) {
            return true;
        }

        if (number % divisor == 0){
            return false;
        }

        return isPrimeRecursive(number, divisor - 1);

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        return isPrimeRecursive(number, number / 2);
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }
    }
}