package week16;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name, school, citizenship, phone;
    private int age, grade;
    
    public Student(String n, String s, String c, String p, int a, int g)
    {
        this.name = n;
        this.school = s;
        this.citizenship = c;
        this.phone = p;
        this.age = a; 
        this.grade = g;
    }
    
    // getter methods for all fields
    public String getName()
    {
        return this.name;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    
    public String getSchool()
    {
        return this.school;
    }
    public void setSchool(String n)
    {
        this.school = n;
    }
    
    public String getCitizenship()
    {
        return this.citizenship;
    }
    public void setCitizenship(String n)
    {
        this.citizenship = n;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    public void setPhone(String n)
    {
        this.phone = n;
    }
    
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int n)
    {
        this.age = n;
    }
    
    public int getGrade()
    {
        return this.grade;
    }
    public void setGrade(int n)
    {
        this.grade = n;
    }
    
    
    public String getNameInitials()
    {
        name = name.trim();
        String words[] = name.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < words.length; i++)
        {
            String f = words[i].substring(0,1).toUpperCase();
            sb.append(f).append(".");
        }
        
        return sb.toString().trim();
    }
    
    @Override
    public String toString()
    {
        return String.format("%s|%d|Grade %d|%s|%d|%s",this.name,this.age,this.grade,this.school, this.phone,this.citizenship);
    }
}