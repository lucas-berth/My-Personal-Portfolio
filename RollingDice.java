import java.util.Random;

public class RollingDice
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int a = rand.nextInt(6) + 1;

        System.out.println("You rolled a:" + a );


        Gambler g1 = new Gambler("Tod");
        Gambler g2 = new Gambler("Sussie");
        g1.personRolling();
        g2.personRolling();

    }
}

//this is a dice roller and it has a random number generated implemented 