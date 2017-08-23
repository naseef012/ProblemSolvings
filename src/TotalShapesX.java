import java.util.Scanner;

/**
 * Created by USER on 8/21/2017.
 *
 * Given N * M string array of O's and X's
 Return the number of 'X' total shapes. 'X' shape consists of one or more adjacent X's (diagonals not included).

 Example (1):

 OOOXOOO OXXXXXO OXOOOXO

 answer is 1 , shapes are  :
 (i)     X
    X X X X
    X     X


 Example (2):

 XXX OOO XXX

 answer is 2, shapes are
 (i)  XXX

 (ii) XXX

 Input:
 The first line of input takes the number of test cases, T.
 Then T test cases follow. Each of the T test cases takes 2 input lines.
 The first line of each test case have two integers N and M.The second line of N space separated strings follow which indicate the elements in the array.

 Output:
 Print number of shapes.

 Input:
 2
 4 7
 OOOOXXO OXOXOOX XXXXOXO OXXXOOO
 10 3
 XXO OOX OXO OOO XOX XOX OXO XXO XXX OOO

 Output:
 4
 6
 */
public class TotalShapesX
{

    public void shapeCount (char [][] input_pattern,int rowPos, int columnPos, int row, int column, boolean visited[][])
    {
        if (!visited[rowPos][columnPos] && input_pattern[rowPos][columnPos]=='X')
        {
            visited[rowPos][columnPos]=true;
            if (rowPos+1 < row)
            {
                shapeCount(input_pattern,rowPos+1, columnPos,row,column,visited);
            }
            if (rowPos-1 >= 0)
            {
                shapeCount(input_pattern,rowPos-1,columnPos,row,column,visited);
            }
            if (columnPos+1 < column)
            {
                shapeCount(input_pattern,rowPos,columnPos+1,row,column,visited);
            }
            if (columnPos-1 >= 0)
            {
                shapeCount(input_pattern,rowPos,columnPos-1,row,column,visited);
            }
        }
    }


    public int findPattern (char [][] input_pattern, int row, int column)
    {
        boolean [][] visited = new boolean[row][column];
        int count=0;

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                if (input_pattern[i][j] == 'X' && !visited[i][j])
                {
                    shapeCount(input_pattern,i,j, row,column,visited);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of cases ");
        int cases = s.nextInt();

        for (int i = 0 ; i<cases;i++)
        {
            System.out.println("Enter rows: ");
            int row = s.nextInt();

            System.out.println("Enter Column: ");
            int column = s.nextInt();

            s.nextLine();//This is used to so that String value can be captured from input

            System.out.println("Enter your pattern separated by space: ");
            String pattern = s.nextLine();

            String modified_pattern = pattern.replaceAll("\\s",""); //Removing all the white spaces

            char [][]array = new char[row][column];

            int stringCharacterCount = 0;

            for (int j = 0; j<row ; j++)
            {
                for (int k =0;k<column ; k++)
                {
                    array[j][k] = modified_pattern.charAt(stringCharacterCount++);
                }
            }

            /*for (int j = 0; j<row ; j++)
            {
                for (int k =0;k<column ; k++)
                {
                    System.out.print(array[j][k]);
                }
                System.out.println("");
            }*/

            TotalShapesX sp = new TotalShapesX();
            int result = sp.findPattern(array, row, column);

            System.out.println("Number of Shapes: " + result);
            System.out.println("");
        }
    }
}
