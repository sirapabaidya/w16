package week16;


/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q3
{
    public static void main(String[] args){
        String s1= " programming class ";
        String t=s1.trim();
        char characterAtIndex=s1.charAt(1);
        System.out.println("the character at given index is: " + characterAtIndex);
        
        int index=s1.indexOf("a");
        System.out.println("the index of given character is: " + index);
        
        boolean search=s1.contains("am");
        System.out.println("does the string contain am ?" + search); 
    }
}