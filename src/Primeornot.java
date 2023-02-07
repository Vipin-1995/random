public class Primeornot
{
    public static void main (String[]args)
    {
        int i, n = 23;
        boolean isprime= true;
        if(n < 2)
        {
            isprime = false;
        }
            else
            {
            for (i = 2; i <= n/2; i++)
            {
                if (n % i == 0)
                {
                    isprime = false;
                    break;
                }
            }
        }
        String result = isprime ? "prime" : "not prime";
        System.out.println ("the number is "  + n + "is :" + result);

    }
}

