import java.util.*;
import java.lang.*;
public class Student extends Person {
    private int numCourse;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSE=30;
    

    public Student(String name,String address)
    {
        super(name,address);
        numCourse=0;
        courses = new String[MAX_COURSE];
        grades=new int[MAX_COURSE];
    }
    @Override
    public String toString()
    {
        return "Student :"+super.toString();
    }
    public void addCourseGrade(String course,int grade)
    {
        courses[numCourse]=course;
        grades[numCourse]=grade;
        numCourse++;
    }
    public void printGrades()
    {
        
        for(int i=0;i<numCourse;i++)
        {
            System.out.println("Course"+(i+1)+" :"+courses[i]+", Grade "+grades[i]);
        }
    }
    public double getAverageGrade()
    {
        
        int sum=0;
        for(int i=0;i<numCourse;i++)
        {
            sum+=grades[i];
        }
        return (double)sum/numCourse;
    }
}