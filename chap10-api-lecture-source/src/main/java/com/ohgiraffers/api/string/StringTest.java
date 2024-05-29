package com.ohgiraffers.api.string;

public class StringTest {

    public static void main(String[] args) {

        StringProcess sp = new StringProcess();
        String result = sp.preChar("hello world");
        System.out.println(result);
//        System.out.println(result.substring(0, 1).toUpperCase() + result.substring(1));

        int num = sp.charSu("application car cable", 'c');
        System.out.println(num);

        /*
String output = INPUT.substring(0, 1).toUpperCase() + INPUT.substring(1);
assertEquals(EXPECTED, output);

If we run the test, it passes.
However, if our input is an empty string, this approach will raise IndexOutOfBoundsException.
This is because the end-index
(1) is greater than the empty string’s length
(0) when we call INPUT.substring(1):

assertThrows(IndexOutOfBoundsException.class, () -> EMPTY_INPUT.substring(1));
Further, we should note that if the input string is null, this approach will throw NullPointerException.

Therefore, before using the substring approach, we need to check and ensure the input string is not null or empty.
*/
    }
}
