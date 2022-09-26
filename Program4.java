class Program4
{
public static void main(String[] args) 
{
int arr1[]={1,2,8,9,12,46,76,82,15,20,30};
int div=1;

for(int i=1;i<arr1.length-1;i++)
	{
	int count=0;
	for(int j=0;j<arr1.length;j++)
	{
	
		if(arr1[j]%div==0)
		{
			count++;
			

			
		}
	}
	

System.out.print(div+":"+count+",");
div++;
	}
}	
}