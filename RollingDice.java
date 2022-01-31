import java.util.Random;

public class RollingDice
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int a = rand.nextInt(6) + 1;

        System.out.println("You rolled a:" + a );
    }
}

//this is a dice roller