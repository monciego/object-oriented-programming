import java.util.Scanner;
public class Average
{
    public static void main(String[]args)
    {
        int pg, mg, sfg, tfg;
        float ave;
        Scanner inputKo = new Scanner(System.in);
        System.out.print("Prelim Grade: ");
        pg = inputKo.nextInt();
        System.out.print("Midterm Grade: ");
        mg = inputKo.nextInt();
        System.out.print("Semi Final Grade: ");
        sfg = inputKo.nextInt();
        System.out.print("Final Grade: ");
        tfg = inputKo.nextInt();
        ave = (float) (pg + mg + sfg + tfg) / 4;
        System.out.println("Average: " + ave);
    }
    }
        