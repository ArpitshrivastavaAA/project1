package programs;

public class np {

	public static void main(String[] args) {
		int base =2;
		int exp =3;
		int ans =1;
		while(exp!=0)
		{
			ans =ans*base;
			exp--;
		}
		System.out.println(ans);
		// TODO Auto-generated method stub

	}

}
