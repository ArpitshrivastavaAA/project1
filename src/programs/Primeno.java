package programs;

public class Primeno {

	public static void main(String[] args) 
	{
		for(int num1=2;num1<=100;num1++) 
		{
			boolean flag=true;

		for(int i=2;i<=num1/2;i++)
		{
			if(num1%i==0)
			{
				flag=false;
				break;	
			}
		}
		if(flag==true) {
			System.out.println("primeno : "+num1);
		}
}
}
}
