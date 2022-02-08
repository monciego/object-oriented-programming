public class Demo
{
    public static void main(String[] args)
    {
        int myNumber, answer;
        myNumber = 17;
        System.out.println("Before incrementing, myNumber is " +myNumber);
        answer = ++myNumber;
        System.out.println("After prefix increment, myNumber is " +myNumber);
        System.out.println("    and answer is " + answer);
        myNumber = 17;
        System.out.println("Before incrementing, myNumber is " +myNumber);
        answer = myNumber++;//this one is original state
        System.out.println("After postfix increment, myNumber" +myNumber);
        System.out.println("    and answer is " + answer);
    }
}