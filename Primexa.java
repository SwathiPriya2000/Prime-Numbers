import java.util.Scanner;
public class Primexa
{
 public static void main(String []args)
 {
  System.out.println("Enter a number");
  Scanner sp=new Scanner(System.in);
  int n=sp.nextInt();
  int i;
  for(i=2;i<n;i++)
    if(n%i==0)
        break;
   if(i==n)
     System.out.println("Number is Prime");
   else 
     System.out.println("Number is not Prime");
 }
}

