public class Exemple2 {
    public static void main(String[] args) {
        //함수형
        byte a =1;
        short b= 128;
        int c = 1000;
        long d = 10000000;
        //실수형
        float e = 3.5f;
        // 소수는 컴퓨터가 double형태로 본다. 또한 지수부분은 아무리 나눌려고 하려고 무한히 늘어나기 때문에 float을 잘 사용하지 않는다.
        //그래서 자바한테 float임을 알려주기 위해 소수뒤에 알파벳 f를 붙여서 알려준다
        double f = 1.144372894732;
        //문자형
        char g = 'A';
        String h = "안녕하세요";
        //불리언형
        boolean i = false;


        //숫자진법에 따른 다양한 표기법
        c = 15; // 10진법표기
        System.out.println(c);
        c = 0b1111; // 이진법표기
        System.out.println(c);
        c = 0xf; // 16진법표기
        System.out.println(c);

    }
}
