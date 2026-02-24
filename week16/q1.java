package week16;
import java.util.Scanner;


/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter your name");
        String s1= input.nextLine();
        String s2= input.nextLine();
        String s3=s1.concat(s2);
        System.out.println("the concatenation of two string is: " + s3);
        boolean result=s1.equals(s2);
        System.out.println("are the two string equal?" + result);
    }
}