public class TestDog
{
    public static void main (String [] args)
    {
        DogTriathlonParticipant dog1 = 
            new DogTriathlonParticipant("Bowser ", 0, 85, 89, 0);
        dog1.display();
        
        DogTriathlonParticipant dog2 = 
            new DogTriathlonParticipant("Rush ", 0, 78, 72, 80);
        dog2.display();
        
        DogTriathlonParticipant dog3 = 
            new DogTriathlonParticipant("Ginger ", 0, 90, 86, 72);
        dog3.display();
        dog1.display();
    }
}