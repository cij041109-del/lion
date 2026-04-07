package week1.likelion;

public class StringExample {

    public static void main(String[] args) {

        //String => 문자열 객체
        // 객체 => 힙 메모리 영역
        // 변수 => 힙 메모리 영역의 주소

        String str = "안녕하세요!"; //문자열 리터럴
        String str_2 = new String("안녕하세요!"); //셍성자
        String str_3 = "안녕하세요!";


        if( str == str_2) {
            System.out.println("str == str_2");
        }

        if( str == str_3) {
            System.out.println("str == str_2");
        }

        if (str.equals(str_2)) {
            System.out.println("str.equals(str_2)");
        }

        if (str.equals(str_3)) {
            System.out.println("str.equals(str_3)");
        }

        if (str_2.equals(str_3)) {
            System.out.println("str_2.equals(str_3)");
        }


        //문자열 병합

        //1. '+' 연산자
        String str1 = "Hello,";
        String str2 = "World!";

        System.out.println(str1 + " " + str2);

        //2. StringBuilder

        StringBuilder strBdr_1 = new StringBuilder("Hello,");

        strBdr_1.append("World!");

        String str_new = strBdr_1.toString();

        System.out.println(str_new);


        //문자열 슬라이스

        String a = "이름: 김자바";

        String str_name = a.substring(4,7);
        System.out.println(str_name);

        //문자열 대소문자 변환

        String x = "abc";
        String y = "ABC";

        x = x.toUpperCase();
        y = y.toLowerCase();

        System.out.println(x);
        System.out.println(y);

        //공백 제거

        //1. 양쪽 끝 공백
        String bb ="       Hello        ";
        bb = bb.trim();
        System.out.println(bb);

        //2. 문자열 중간 공백
        String cc = "     Hel  lo   ";
        cc = cc.trim();
        cc = cc.replace(" ", "");
        System.out.println(cc);
    }
}
