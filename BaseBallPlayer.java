public class BaseBallPlayer
{
    private static int count = 0;
    private int number;
    private double battingAverage;
    public BaseBallPlayer(int id, double avg)
    {
        number = id;
        battingAverage = avg;
        count = count + 4;
    }
    public void showPlayer()
    {
        System.out.println("Player #" + number +
            " batting average is " + battingAverage +
                " There are " + count + " Players");
    }
}