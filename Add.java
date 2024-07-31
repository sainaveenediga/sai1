import java.util.Scanner;
public class Add
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first numer ");
        int num1=scan.nextInt();
        System.out.println("enter second numer ");
        int num2=scan.nextInt();

        int sum=num1+num2;
        System.out.println("sum of two numbers is  "+num1 +" "+num2+" "+sum);
        scan.close();

    }
}