package week1.likelion;

public class TypeCasting {

    public static void main(String[] args) {

        //형 변환
        //byte < short < int < long <<< float < double


        //자동 형변환
        int a = 128;
        short x = 10;
        int y = x;

        System.out.println(x);

        //강제 형병환 == 명시적 형변환
        int b = 128;
        short ba = (short) a;
        System.out.println(ba);

        int m = 80;
        double n = m;
        System.out.println(m); //80
        System.out.println(n); //80.0 (실수)

        //정밀도 차이 강제 캐스팅은 왜곡 주의하삼
        double c = 10.38838383838;
        float d = (float) c;
        System.out.println(c);
        System.out.println(d);

        int e = 10;
        short f = 20;
        //short g = e + f; // 에러 int가 기본
    }
}
