package Lab2;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Nhập cạnh a: ");
        a = scanner.nextInt();

        System.out.println("Nhập cạnh b: ");
        b = scanner.nextInt();

        System.out.println("Chu vi hình chữ nhật là: " + (a+b)*2);
        System.out.println("Diện tích hình chữ nhật là: " + a*b);
        System.out.println("Cạnh nhỏ của hình chữ nhật là: " + Math.min(a, b));
    }
}
