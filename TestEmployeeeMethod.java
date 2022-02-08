public class TestEmployeeeMethod
{
    public static void main (String []args)
    {
        Employeee1 aWorker = new Employeee1();
        aWorker.setValues();
        aWorker.methodThatUsesInstanceAttributes();
        aWorker.methodThatUsesLocalVariables();
    }
}