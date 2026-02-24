package week16;


/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
    public static void main(String[] args){
        String text=" Hello  World ";
        String tt= text.trim(); //Hello World
        System.out.println(tt);
        
        String tChar=tt.substring(0,10);
        System.out.println(tChar);
        
        String[] words=tt.split("\\s+");
        
        for(String word: words){
            System.out.println(word);
        }
    }
}