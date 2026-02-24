package week16;
import java.util.ArrayList;


/**
 * Write a description of class CensusProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CensusProcessor
{
    String[] csvData = {
    "Name,Age,School,Grade,Citizenship,Phone",
    "Ram Bahadur Thapa,18,Itahari Int. College,12,01-0012345,9841234567",
    "Sita Kumari Rai,17,Itahari Int. College,11,01-0054321,9807654321",
    "Hari Prasad Sharma,19,ICK College,12,02-0098765,9812345678",
    "Gita Devi Tamang,16,ICP College,10,03-0011111,9800000000",
    "Bikash Kumar Limbu,18,Itahari Int. College,12,01-0077777,9841111111",
    "Anita Rai,17,ICK College,11,04-002222,981234",
    "Deepak Shah,20,ICP College,12,01-00ABCDE,9867890123"
    };
    
    public static Student[] parseCSV(String[] csvData)
    {
         Student[] students = new Student[csvData.length -1];
         for(int i = 1; i < csvData.length; i++)
         {
             String[] data = csvData[i].split(",");
             for(int j = 0; j < data.length; j++)
             {
                 data[j] = data[j].trim();
             }
             String name = data[0];
             int age = Integer.parseInt(data[1]);
             String school = data[2];
             int grade = Integer.parseInt(data[3]);
             String citizen = data[4];
             String phone = data[5];
             
             students[i-1] = new Student(name,school,citizen,phone,age,grade);
         }
         return students;
    }
    
    public static boolean isValidCitizenship(String cit)
    {
        if(cit.length() != 10)
        {
            return false;
        }
        if(cit.charAt(2) != '-')
        {
            return false;
        }
        for(int i = 0;i < cit.length();i++)
        {
            if(!Character.isDigit(cit.charAt(i)) && i != 2)
            {
                return false;
            }
        }
        return true;
    }
    
    public static int CountValid(Student[] students)
    {
        int valid = 0;
        for(int i = 0; i < students.length; i++)
        {
            if(isValidCitizenship(students[i].getCitizenship()))
            {
                valid++;
            }
        }
        return valid;
    }

    
    public static Student[] findBySchool(Student[] students, String school)
    {
        ArrayList<Student> stu = new ArrayList<>();
        for(int i = 0;i < students.length; i++)
        {
            if (students[i].getSchool().equalsIgnoreCase(school))
            {
                stu.add(students[i]);
            } 
        }
        return stu.toArray(new Student[stu.size()]);
    }
    
    public static int countByGrade(Student[] students,int grade)
    {
        int count = 0;
        for(int i = 0;i < students.length;i++)
        {
            if(students[i].getGrade() == grade)
            {
                count++;
            }
        }
        return count;
    }
    
    
    public static double averageAge(Student[] students)
    {
        double age = 0;
        for(int i = 0;i < students.length;i++)
        {
            age += students[i].getAge();
        }
        return age / students.length;
    }
    
    public static String findLongestName(Student[] students)
    {
        int len = 0;
        String name = "";
        for(int i = 0; i < students.length; i++)
        {
           if( len ==0 || students[i].getName().length() > len)
           {
               len = students[i].getName().length();
               name = students[i].getName();
           }
        }
        return name;
    }
    
    public static int CountStudents(Student[] students, String school)
    {
        int count = 0;
        for(int i = 0; i < students.length; i++)
        {
            if(students[i].getSchool().equalsIgnoreCase(school))
            {
                count++;
            }
        }
        return count;
    }
    
    
    public static String generateCensusReport(Student[] students)
    {
        StringBuilder sb = new StringBuilder("===== Nepal School Census Report =====\n");
        sb.append(String.format("Total students: %d   valid records: %d    invalid records:%d\n"
        , students.length, CountValid(students), students.length - CountValid(students)));
        sb.append("- Student List -\n");
        String ValidOrNot = "";
        for(int i = 0; i < students.length; i++)
        {
            if(isValidCitizenship(students[i].getCitizenship()))
            {
                ValidOrNot = "VALID";
            }
            else
            {
                ValidOrNot = "INVALID";
            }
            sb.append(String.format("%s  %s  | %d | Grade %d | %s\n",students[i].getNameInitials(),students[i].getName(),students[i].getAge(),students[i].getGrade(), ValidOrNot));
        }
        sb.append("- Statistics -\n");
        sb.append(String.format("Average age : %f\n",averageAge(students)));
        sb.append(String.format("Longest name : %s (%d characters)\n",findLongestName(students),findLongestName(students).length()));
        sb.append(String.format("Itahari Intl college: %d",CountStudents(students,"Itahari Int. College")));
        return sb.toString();
    }
}