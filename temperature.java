import java.util.Scanner;

class main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the temperature in degrees Fahrenheit: ");
        int temperature = cin.nextInt();
        
        if(temperature <= 32)
        {
            System.out.println("Freezing");
        }
        else if(temperature <= 50)
        {
            System.out.println("Cold");
        }
        else if(temperature <=85)
        {
            System.out.println("Warm");
        }
        else
        {
            System.out.println("Hot");
        }   
    }
}