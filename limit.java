public class limit
{
    public static void main(String[] args)
    {
        int val;
        final int LIMIT = 11;
        val = 1;
        while(val < LIMIT)
        {
            System.out.println(val);
            val = val + 1;
        }
    }
}