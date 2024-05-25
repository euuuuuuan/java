package excersise;

import java.util.Scanner;

public class Star {
    public static void RightTriangleStars() {
        // i for rows and j for columns
        // row denotes the number of rows you want to print
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the row of the triangle: ");
        int row = scan.nextInt();
        int i, j;

        // outer loop for rows
        for (i = 0; i < row; i++) {
            // i = 0이므로 row가 1부터 시작하게 됨.
            // 인덱스 적용으로 입력한 로우보다 작은 직전값이 row값이 됨.

            //inner loop for columns
            for (j = 1; j <= i; j++) {

                //prints stars
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }

    }

    public void LeftTriangleStars() {
        {
            //i for rows and j for columns
            //row denotes the number of rows you want to print
            int i, j, row = 6;

            //Outer loop work for rows
            for (i = 0; i < row; i++) {

            //inner loop work for space
                for (j = 2 * (row - i); j >= 0; j--) {

                //prints space between two stars
                    System.out.print(" ");
                }

                //inner loop for columns
                for (j = 0; j <= i; j++) {

                //prints star
                    System.out.print("* ");
                }

                //throws the cursor in a new line after printing each line
                System.out.println();
            }
        }
    }

    public class PyramidPattern
    {
        public static void main(String args[])
        {
                //i for rows and j for columns
                //row denotes the number of rows you want to print
            int i, j, row = 6;

                //Outer loop work for rows
            for (i=0; i<row; i++)
            {

                //inner loop work for space
                for (j=row-i; j>1; j--)
                {

                //prints space between two stars
                    System.out.print(" ");
                }

                //inner loop for columns
                for (j=0; j<=i; j++ )
                {

                //prints star
                    System.out.print("* ");
                }

                //throws the cursor in a new line after printing each line
                System.out.println();
            }
        }
    }


        public static void DownwardTrianglePattern()
        {
            int rows = 4; // 인덱스 개념을 적용.
                //inner loop
            for (int i = rows-1; i >= 0 ; i--)
                //int i = rows-1 -> 정수 4부터 시작을 하게 됨.
                // 인덱스 개념으로 -1을 해주어야 row가 7이 됨.
            {
                //outer loop
                for (int j = 0; j <= i; j++)
                {

                //prints star and space
                    System.out.print("*" + " ");
                }

                //throws the cursor in the next line after printing each line
                System.out.println();
            }
        }

}
