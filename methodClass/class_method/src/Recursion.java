public class Recursion {
    public static void main(String[] args) {
      /*  int result = sum(10);
        System.out.println(result);*/
        //Recursion Example

        int result = sum(4, 10);
        System.out.println(result);
    }

    //10 + (9+8+7+6+5+4)

    public static int sum(int start, int end) {
       /* if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }*/

        if (end > start) {
            return end + sum(start, end - 1);
            // 괄호안의 start와 end값이 두개인데 괄호 안 start값은 합산을 왜 안하는가
            // 매개 변수로 지정이 된 값이고 괄호 안의 수치는 연산을 하지 않는 것이 원칙.
        } else {
            return end; // 첫 조건문 미달일 경우 else 조건문 지정값 return 되는데, 지정된 start(4)와 end(10) 값이 다름에도
                        // 같은 결과가 나오는 이유는 무엇인가
                        // Answer : else 문에 도달했을때 sum에 지정된 두 int 값은 (4, 4) (5, 5) 등 같은 숫자일 경우 실행된다.
                        // 따라서 return : start or end;를 해도 같은 출력값이 출력된다.
                        // ex) return end; 출력값 49, return start; 출력값 49. return 0 = 45;
        }
        //Halting Condition
    }

    /*
    * end(10)가 start(5)보다 크다면,
    * end(10) + (5, 10 - 1)한 값을 반환.
    * 10 + (start값 = 5) + (end값 9 + 8 + 7 + 6 + 5)
    *
    * 그렇지 않다면 end(10) 반환.
    * */

    /*
    10 + sum(9)
    10 + ( 9 + sum(8) )
    10 + ( 9 + ( 8 + sum(7) ) )
    ...
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
    */
}
