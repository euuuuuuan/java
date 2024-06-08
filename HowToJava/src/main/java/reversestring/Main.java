package reversestring;

public class Main {
    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = " ";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
            // i = 0 i < 5
            // H부터 불러오면서 reversedStr로 누적시키기 때문에 결과값은 olleh
        }
        System.out.println("reversedStr: " + reversedStr);
    }
}
