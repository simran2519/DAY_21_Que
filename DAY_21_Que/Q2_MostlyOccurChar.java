//2.Your task is to write a function named getMaxChars that takes a string, str, as input, and returns the character in it that appears most frequently.
//        Consider uppercase and lowercase characters to be distinct entities. The input string may include letters, numbers, punctuation marks, and special characters, all encoded in ASCII format.
//        Note: there will always be only one character that appears most frequently.
//        Example 1
//        Input:
//        . str = 'abcc defg'
//        Output:
//        'C'
//        Explanation:
//        'c' is the only character that appears more than once.
//
//        Example 2
//        Input:
//        . str = 'The weather forecast predicts rain tomorrow.'
//        Output:
//        'r'
//        Explanation:
//        • The lowercase letter 'r' appears six times in the sentence, making it the most frequent character.
package DAY_21_Que;

import java.util.Scanner;

public class Q2_MostlyOccurChar
{
    public static char getMaxChars(String str)
    {

        int hash[]= new int[123];        //i have taken an array to store the count for each character
        int max = hash[0];             //to find maximum in the array i.e. highest count character
        int maxIndex=0;                // to return the index of that character which is the maximum i.e. whose count is higher
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            hash[ch]++;                   //to initialize or keep the count for each character that exists in the string
        }
        for(int i=0;i<hash.length;i++)   //to find maximum in the hash array (whose count is higher it means that character appears the most times
        {
           if(hash[i]>max)
           {
               max=hash[i];
               maxIndex=i;
           }
        }
        return (char)maxIndex;     //returnt the character that appears the most times
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        char maxChar=getMaxChars(str);
        System.out.println(maxChar);
    }

    //time complexity=O(N)+O(N)=O(2N)       i.e.O(N)
    //space complexity=O(N)
}
