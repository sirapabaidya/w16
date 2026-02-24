package week16;
import java.util.Scanner;


/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter your name");
        String s= input.nextLine();
        String trimmed=s.trim();
        String p="";
        for(int i=trimmed.length()-1; i>=0; i--){
            p=p+trimmed.charAt(i);;
        }
        
        System.out.println("the reverse is " +p);
        
        if(s.equals(p)){
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
        }
    }
