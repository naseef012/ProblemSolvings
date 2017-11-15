package algorithms;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created By Naseef M Abdus Sattar on 11/13/2017 at 8:53 PM
 */
/*
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true
 */
public class ParenthesesBalance
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        List<String> listOfString = new ArrayList<>();
        String line;
        int count =1;

        while (true)
        {
            System.out.println("Enter new test case: "+count);
           line = s.next();
           if(line.equals("q"))
               break;
           listOfString.add(line);
           count++;
        }

        count=1;

        for (String str: listOfString)
        {
            Stack<Character> list = new Stack<>();

            for (char c : str.toCharArray())
            {
                if (c=='(' || c == '{' || c == '[')
                {
                    list.push(c);
                    continue;
                }

                if (c == ')' && !list.isEmpty() && list.peek() =='(')
                {
                    list.pop();
                    continue;
                }

                if (c == '}' && !list.isEmpty() && list.peek()=='{')
                {
                    list.pop();
                    continue;
                }

                if (c == ']' && !list.isEmpty() && list.peek()=='[' )
                {
                    list.pop();
                    continue;
                }

                if (c==')' || c == '}' || c == ']')
                {
                    list.push(c);
                    break;
                }
            }

            System.out.println("Answer of test case "+count+" = "+ list.isEmpty());
            count++;
        }
    }
}
