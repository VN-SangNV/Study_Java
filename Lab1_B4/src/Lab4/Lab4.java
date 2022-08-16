package Lab4;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.println("Nhâp hệ số a, b, c: ");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int delta = b*b - 4*a*c;
        System.out.println("Căn delta là: " + Math.sqrt(delta));
    }
}
