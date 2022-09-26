import java.util.Scanner;
class Program1
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
System.out.println("Enter the First Number");
float a=scan.nextFloat();
System.out.println("Enter the Second Number");
float b=scan.nextFloat();
System.out.println("Enter the Operation");
String oper=scan.next();
System.out.println("Result is");
switch(oper)
{
case "+":System.out.println(a+b);
{

	break;
}
case "-":System.out.println(a-b);
{
	
break;

}
case "*":System.out.println(a*b);
{
break;
}
case "/":System.out.println(a/b);
{
break;

}
default:System.out.println("Invalide Operation");
}
			
}	
}