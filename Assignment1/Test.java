
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Digvijay", "MNNIT");
        s1.addCourseGrade("Data Structure", 85);
        s1.addCourseGrade("Automata", 92);
        s1.printGrades();
        System.out.println("Average ="+s1.getAverageGrade());
    }
}