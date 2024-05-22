package Review.Array;

public class App2 {
    public static void main(String[] args) {

                /*아래의 내용을 선언하여
        `int[][] iarr = new int[4][];`

        하단의 내용을 출력하는 이중 For문을 작성하시오.

        1. `iarr[0][0] = 1;        iarr[0][1] = 2;        iarr[0][2] = 3;`
        2. `iarr[1][0] = 4;        iarr[1][1] = 5;        iarr[1][2] = 6;`
        3. `iarr[2][0] = 7;        iarr[2][1] = 8;`
        4. `iarr[3][0] = 9;        iarr[3][1] = 10;`*/

        int[][] iarr = new int[4][];
        iarr[0] = new int[] { 1, 2, 3 };
        iarr[1] = new int[] { 4, 5, 6 };
        iarr[2] = new int[] { 7, 8 };
        iarr[3] = new int[] { 9, 10 };

        for(int i = 0; i < iarr.length; i++) { // 0부터 3까지 즉 4번 실행
            for(int j = 0; j < iarr[i].length; j++) {
                // iarr[0]번에 있는 것은 {1,2,3} 즉 3번 실행
                // iarr[1]번은 3번 iarr[2]과 [3]번은 2번 실행.
                System.out.println(iarr[i][j]);
            }
            System.out.println();
        }
    }
}
