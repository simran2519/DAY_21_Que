//        1.Imagine you are developing a word processor that represents text as linked lists. In this system, every character in a text string is represented by a node in the linked list. For example, the word "Hello" is represented as a linked list: 'H' -> 'e' -> 'l' -> 'l' -> 'o'- > Null.
//        Your task is to implement a function string_list_slice that allows users to select a portion of the text, starting at a specified index and ending at another specified index. So, if we specify 0 and 4, our slice will consist of the values at indices 0, 1, 2, and 3. This selected portion should be returned as a new linked list, representing the selected text. The linked list stores the string like so:
//        The inputs to the string_list_slice function will be string_list (a string), begin (the starting index), and end (the ending index + 1). The function should return a string containing the requested slice (substring).
//        Note:
//        • The index values supplied assume that the programming language is 0-indexed. If you choose to solve the problem in a language that is 1-indexed, you must take that into account and make the adjustment.
//        • If the ending index exceeds the end of the list, include characters up to the end.
//        • The function should work for linked lists representing strings of any length.
//
//
//        Example 1
//        Input:
//        string_list = StringList('A whole new internet')
//        begin = 2
//        end = 11
//        Output:
//        'whole new'
//        Explanation:
//        We begin at index 2 (the first letter 'w') and continue until index 10 (the second letter 'w')
//        Example 2
//        Input:
//
//        string_list = StringList('Computing calmly at home')
//        begin = 0
//        end = 50
//        Output:
//        'Computing calmly at home'
//
//        Explanation:
//        • Because our ending index exceeds the length of the string, we just stop at the end
package DAY_21_Que;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1_substring
{
    public static String string_list_slice(String str,int begin, int end)
    {
        String g="";
        int count=begin;
        for(int i=count;i<str.length();i++)  //count will start from the begin index
        {
            char ch=str.charAt(i);
            if(count<end)          //the character will goes moving in the g string until the i will not reach to the endIndex
            {
                g=g+ch;  //the character goes to the ouptut string
                count++; // and the count increment at every iteration
            }
            else
            {
                break;  //the loop will break when the i reaches to the endindex
            }
        }
        return g;
    }
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("Enter the String ");
        String str=sc.nextLine();
        System.out.println("Enter the beginIndex");
        int begin=sc.nextInt();
        System.out.println("Enter the ending Index");
        int end=sc.nextInt();
        String ans=string_list_slice(str,begin,end);
        System.out.println("The required substring is:"+ ans);
    }
}
