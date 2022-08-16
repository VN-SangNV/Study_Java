package Lab2_B2;

import java.util.Scanner;

public class Lab2_B2 {
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);

        float a, b, c;

        System.out.println("Nhâp hệ số a: ");
        a = scanner.nextFloat();

        System.out.println("Nhập hệ số b: ");
        b = scanner.nextFloat();

        System.out.println("Nhập hệ số c: ");
        c = scanner.nextFloat();

        if(a == 0){
            System.out.println("x = " + (-c)/b);
        }
        else {
            float delta = b * b - 4 * a * c;
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm!");
            }
            else {
                if(delta == 0){
                    System.out.println("Phương trình có nghiệm kép: \nx1 = x2 = " + (-b)/(2*a));
                }
                else {
                    System.out.println("Phương trình có 2 nghiệm phân biệt:");
                    System.out.println("x1 = " + (-b - Math.sqrt(delta))/(2*a));
                    System.out.println("x2 = " + (-b + Math.sqrt(delta))/(2*a));
                }
            }
        }
    }
}
