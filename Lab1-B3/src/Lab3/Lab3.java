package Lab3;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int canh;

        System.out.println("Nhập cạnh khối lập phương: ");

        canh = scanner.nextInt();

        System.out.println("Thể tích khối lập phương là: " + Math.pow(canh, 3));

    }
}
