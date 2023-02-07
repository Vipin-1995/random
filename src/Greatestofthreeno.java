public class Greatestofthreeno
{

        public static void main (String[]args)
        {
            int num1 =40;
            int num2 =60;
            int num3 =20;
            if (num3 >= num2 && num3>= num1)
                System.out.println(num3 +"=  is greatest");
            else if (num1 >= num2 && num1 >= num3)
                System.out.println (num1 + "=  is greatest");
            else if (num2 >= num1 && num2 >= num3)
                System.out.println (num2 + "= is greatest");

        }

}
