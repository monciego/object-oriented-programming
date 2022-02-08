public class TestPlayer
{
    public static void main (String [] args)
    {
        BaseBallPlayer aCatcher = new BaseBallPlayer(12, .218);
        BaseBallPlayer aShortStop = new BaseBallPlayer(31, .385);
        aCatcher.showPlayer();
        aShortStop.showPlayer();
        BaseBallPlayer anOutFielder = new BaseBallPlayer(44, .505);
        anOutFielder.showPlayer();
        aCatcher.showPlayer();
    }
}