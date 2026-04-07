package week1.likelion;

import java.util.Scanner;

public class ConsoleIO {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요. >>");

        String username = sc.nextLine();

        System.out.println("생년월일을 입력해주세요. >>");
        int birthDate = sc.nextInt();

        System.out.printf("%s %d", username, birthDate);

    }
}
