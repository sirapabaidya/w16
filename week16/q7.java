package week16;


/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7{
public static boolean isValidPhone(String phone){
    return phone.matches("9[78]\\d{8}");
}

public static void main (String[] args){
    System.out.println(isValidPhone("9841401289"));
    System.out.println(isValidPhone("2341401289"));
    System.out.println(isValidPhone("9841401280"));
    System.out.println(isValidPhone("98-414-01287"));
}
}