import java.util.Scanner;
class Program3
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number");
int x=scan.nextInt();
System.out.println("Output");
if(x%2!=0)
{
for(int i=1;i<=x;i++)
{
    
	System.out.print(i+" ");
    }
}

  else
{
for(int j=1;j<=x-1;j++)	
{
	System.out.print(j+" ");
}
}	
}
}	
