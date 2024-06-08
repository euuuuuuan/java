public class Skin {

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    /* 오버로딩 : 사용하고자 하는 이름과 같은 메소드가 있어도
    매개변수 혹은 데이터 타입이 다른 경우, 같은 메소드 이름을 사용하여 메소드 정의 가능.*/
    /*static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }*/

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        checkAge(20);
        /*int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);*/

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

    }


}
