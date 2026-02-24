package week16;


/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{
    public static void main(String[] args){
        String name=" siraPA  baidYA "; 
        String tn=name.trim();
        String[] words=tn.split("\\s+"); //sirapa baidya
        
        String wordInUpperCase=name.toUpperCase();
        System.out.println("the upper case character is: " + wordInUpperCase);
        
        String wordInLowerCase=name.toLowerCase();
        System.out.println("the lower case character is: " + wordInLowerCase);
        
        StringBuilder sb= new StringBuilder();
        
        for (int i=0; i< words.length; i++){
            String first=words[i].substring(0,1).toUpperCase(); //S
            String rest=words[i].substring(1).toLowerCase(); //irapa
            sb.append(first).append(rest).append(" "); //Sirapa
        }
        System.out.println(sb.toString().trim());
    }
}