import java.util.Scanner;

class main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int ticket_price = 15;

        System.out.print("Number of tickets: ");
        int x = input.nextInt();
        int total = x * ticket_price;
        System.out.println("Your total is $" + total);
    }
}