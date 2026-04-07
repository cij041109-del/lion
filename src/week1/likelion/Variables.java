package week1.likelion;

public class Variables {

        //변수 -> 데이터가 저장되는 공간
        //변수에 저장된 값 = > 재할당을 통해 변경 가능
        // 값의 형태에 맞는 자료형을 사용
        // 변수명은 소문자로!!
        public static void main(String[] args) {


            int num = 1; // 정수.
            double width = 12.34;
            String content = "Programming";

            num = 10;
            System.out.println(num); //1->10변경
            String aa = "1234";

            //정수형
            //1. byte(1byte = 8bit) -128~127
            //.2 short(2bytes) : -3만 ~3만 사이
            //3. int(4bytes)
            //4. long(8bytes)

            //byte a = 128; //에러임.

            //실수형
            // 1. double(8bytes) - 15자리
            // 2. float(4 bytes) - 7자리

            double d = 1.23;
            float f = 9.45f; //f안넣으면 오류
            System.out.println(d);
            System.out.println(f);

            //문자형
            // char(2 bytes)
            char char_1 = 'a';
            char char_2 = 97;
            System.out.println(char_1); //a
            System.out.println(char_2); //a, 아스키코드로 표현됨

            //논리형
            //boolean(1 byte)

            boolean bool_1 = true;
            boolean bool_2 = false;
            boolean bool_3 = (100 < 0);

            System.out.println(bool_1);
            System.out.println(bool_2);
            System.out.println(bool_3);

        }
}
