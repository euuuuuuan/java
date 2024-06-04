package com.ohgiraffers.lambda.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss을 출력하는 람다식을 작성
     * </pre>
     */
/*    private void test1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        Consumer<LocalTime> consumer = (str) -> System.out.println(str);
        consumer.accept(LocalTime.now());
    }*/
    private void test1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        Consumer<LocalTime> consumer = (time) ->
        {
            String formattedTime = time.format(formatter);
            System.out.println(formattedTime);
        };
        consumer.accept(LocalTime.now());

    }

    /**
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */
//    private void test2() {
//        IntSupplier intSupplier = () -> (int) (Math.random() * 45) + 1;
//        System.out.println("Lotto Number Generator : " + intSupplier.getAsInt());
//
//    }
    private static void test2() {
        IntSupplier intSupplier = () -> (int) (Math.random() * 45) + 1; // 0부터 45까지의 랜덤한 숫자 생성
        Set<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6) {
            lottoNumbers.add(intSupplier.getAsInt());
        }
        System.out.println("Lotto Numbers: " + lottoNumbers);
        /*
        주어진 코드에서 lottoNumbers.size() < 6는
        세트(Set)인 lottoNumbers의 크기가 6보다 작은지 확인하는 부분입니다.
        이 조건은 while 루프의 반복을 결정합니다.

        세트(Set)는 중복된 요소를 허용하지 않는 자료구조이므로,
        lottoNumbers.add(intSupplier.getAsInt())를 통해 중복된 번호가 추가되는 경우에는
        크기가 증가하지 않습니다.
        따라서 lottoNumbers의 크기가 6이 될 때까지 랜덤한 숫자를 계속해서
        추가하는 것이 이 while 루프의 목적입니다.

        즉, while 루프는 lottoNumbers의 크기가 6이 될 때까지 계속해서 반복됩니다.
        이것은 중복된 로또 번호를 생성하지 않으면서 0부터 45까지의 범위에서
        6개의 서로 다른 랜덤한 숫자를 얻기 위한 것입니다.
        */
    }

    /**
     * <pre>
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1300원이다.
     * </pre>
     */
    // * Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다. (매개변수 소비자 역할)
    private void test3() {
        IntConsumer intConsumer = (num) -> System.out.println("입력하신 원화(￦)의 달러(＄)는 " + ((float) num / 1300 + "＄") + " 입니다");
        intConsumer.accept(1500);
    }

    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */
    // * Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑)
    private void test4() {
        Function<Integer, String> converter = (num) -> "입력하신 원화(￦)의 달러(＄)는 " + ((float) num / 1300) + "＄ 입니다";
        System.out.println(converter.apply(1500));
    }
    /*람다 표현식인 (num) -> "입력하신 원화(￦)의 달러(＄)는 " + ((float)num / 1300) + "＄ 입니다"가 반환하는 함수
     * 입력값은 apply 메서드에 전달된 인수인 1500
     * 출력값은 converter 함수에 의해 반환된 문자열
     * */

    /*Function 함수형 인터페이스는 입력값을 받아서 출력값을 반환하는 함수를 나타내는 인터페이스입니다.
    주어진 코드의 경우에는 입력값만을 받고 반환값이 없는 IntConsumer를 사용하고 있습니다.
    따라서 이를 Function 인터페이스로 변환하려면 반환값이 있어야 합니다.
    예를 들어, 달러로 변환된 결과를 반환하는 Function 인터페이스를 사용할 수 있습니다.*/

    /*
    이 코드에서 converter는 입력으로 받은 한국 원화(KRW)를 미국 달러(USD)로 변환하는 함수를 정의합니다.
    이 함수는 Function<Integer, String> 인터페이스를 구현합니다.
    여기서:

    입력값으로는 정수형으로 표현된 한국 원화(KRW)가 제공됩니다.
    예를 들어, 1500원을 입력으로 제공하면,
    함수는 해당 원화(KRW)를 미국 달러(USD)로 변환하고,
    변환된 결과를 문자열(String)로 반환합니다.
    반환된 문자열은 "입력하신 원화(￦)의 달러(＄)는 X.XX＄ 입니다"
    형식으로 되어 있습니다. 여기서 X.XX는 변환된 달러 금액을 나타냅니다.
    작동 원리는 다음과 같습니다:

    입력으로 받은 원화(KRW) 값을 미국 달러(USD)로 변환하기 위해,
    해당 값을 1300으로 나누어 주어진 환율에 따라 달러로 변환합니다.
    그리고 변환된 달러 금액을 문자열로 변환하여 반환합니다.
    마지막으로 System.out.println()을 사용하여 변환된 결과를 콘솔에 출력합니다.
    따라서 예를 들어, converter.apply(1500)을 호출하면 "입력하신 원화(￦)의 달러(＄)는 1.15＄ 입니다"와
    같은 결과가 출력됩니다.*/

    /*
    Function 인터페이스의 apply 메서드는 해당 함수를 호출하고 입력값을 전달하여 결과를 반환하는 역할을 합니다.
    apply 메서드는 Function 인터페이스의 일부로, 모든 구현체에서 해당 입력값에 대한 처리를 수행하고
    결과값을 반환할 때 호출됩니다. 따라서 converter.apply(1500)은 converter 함수에 1500을 입력값으로 전달하고,
    변환된 결과를 반환합니다.
    이를 System.out.println()을 사용하여 콘솔에 출력하면 변환된 결과를 확인할 수 있습니다.*/


    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     * </pre>
     */
    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");
        for (String str : strList) {
            boolean isEmptyOrWhitespace = str.trim().isEmpty();
            System.out.println("[" + str + "]의 길이는 " + 0/*str.length()*/ + "입니까? " + isEmptyOrWhitespace);
        }
        /*
        공백이 있는 문자열도 빈문자열로 체크하게 하기 위해서,
        isEmpty() 메소드를 호출하기 전에 trim() 메소드를 호출해 줍니다.
        trim() 메소드는 문자열의 앞뒤 공백을 제거해 주는 메소드입니다.

        isEmpty() 메소드를 호출하기 전에,
        trim() 메소드를 호출하여 문자열의 앞뒤 공백을 제거하였습니다.
        공백이 있는 문자열도, 공백으로 체크되어 true를 리턴하는 것을 확인할 수 있습니다.
        */

    }
}

