import java.util.*;
import java.lang.*;
public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    public static final int MAX_COURSE=30;

    public Teacher(String name,String address)
    {
        super(name,address);
        numCourses=0;
        courses=new String[MAX_COURSE];
    }
    public String toString()
    {
        return "Teacher "+ super.toString();
    }
    public boolean addCourse(String course)
    {
        for(int i=0;i<numCourses;i++)
        {
            if(courses[i].equals(course))
            {
                return false;
            }
        }
        courses[numCourses]=course;
        numCourses++;
        return true;
    }
    public boolean removeCourse(String course)
    {
        boolean ok = false;
        int idx=0;
        for(int i=0;i<numCourses;i++)
        {
            if(courses[i].equals(course))
            {
                ok = true;
                idx=i;
                break;
            }
        }
        if(!ok)return ok;
        else
        {
            for(int j=idx;j<numCourses-1;j++)
            {
                courses[j]=courses[j+1];
            }
            numCourses--;
            return true;

        }

    }

}