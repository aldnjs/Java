public class Typechage2 {
    public static void main(String[] args) {
        // 업캐스팅, 업캐스팅일경우 명시적인 캐스팅이 있어도 되고 없어도 되나 붙여주는 것이 습관적으로 좋다.
        float value1 = 3;
        long value2 = 5;
        double value3 = 7;
        // 다운캐스팅
        byte value4 = 9;
        short value5 = 11;

        byte value6 = (byte) 128; // 다운캐스팅인데 에러가 발생!! 명시적인 캐스팅 필요!!
        System.out.println(value6); // -128, 순환방식에 따른 오류이며 이는 자바만의 특징이다.
        // 사용한 변수는 진한 하얀색으로 표현 ex)value6
        int value7 = (int)7.5;
        float value8 = (float)7.5;

    }
}
