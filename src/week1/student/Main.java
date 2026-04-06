package week1.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");

            num = scanner.nextInt();
            scanner.nextLine();

            if( num <5) {
                System.out.println("[오류] 5 이상 입력해주세요.");
            } else {

                break;
            }

        }
        String[] lionName = new String[num];

        System.out.println("아기사자 이름을 입력해주세요");
        for (int i = 0; i<num; i++) {

            lionName[i] = scanner.nextLine();

        }

        System.out.println("아기사자 명단을 최종적으로 출력합니다.");
        for (int i = 0; i<num; i++) {

            System.out.println((i+1) +". " + lionName[i]);

        }
    }
}
