package Lab2_B1;

import java.util.Scanner;

public class Lab2_B1 {
    public static void main(String[] args) {
        System.out.println("ax + b =0\nNhập hệ số a, b: ");
        Scanner scanner = new Scanner(System.in);

        float a, b;

        a = scanner.nextFloat();
        b = scanner.nextFloat();

        System.out.println("x = " + (-b)/a);
    }
}
