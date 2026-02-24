package week16;
import java.util.Scanner;


/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q5
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter your name");
        String s1= input.nextLine();
        StringBuilder sb= new StringBuilder(s1);
        sb.append("hi");
        System.out.println(sb);
        sb.append(1);
        sb.append("@");
        System.out.println(sb);
        
    }
}