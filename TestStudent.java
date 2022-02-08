public class TestStudent
{
    public static void main (String [] args)
    {
        Student aPsychMajor = new Student(111, 3.5);
        aPsychMajor.showStudent();
        Student anITstud = new Student(222, 2.0);
        Student anBAstud = new Student(333, 3.0);
        anITstud.showStudent();
        anBAstud.showStudent();
    }
}