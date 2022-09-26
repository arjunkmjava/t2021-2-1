import java.util.*;
class Program2
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number");
int x=scan.nextInt();
System.out.println("Output");
for(int i=1;i<=x*2;i++)
{
    if(i%2!=0)
    {
	System.out.print(i+" ");
    }
}


}	
}