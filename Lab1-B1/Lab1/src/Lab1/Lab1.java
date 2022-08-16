package Lab1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String hoVaTen;
        int diemTrungBinh;

        System.out.println("Nhập họ và tên: ");
        hoVaTen = scanner.nextLine();

        System.out.println("Nhập điểm trung bình: ");
        diemTrungBinh = scanner.nextInt();

        System.out.println(hoVaTen + " " + diemTrungBinh + " điểm");


    }
}
