package week1.day2;

public class Fibonaci {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int range=8;
		int sum;
		System.out.println("Print "+n1);
		
		for (int i=1;i<=range;i++)
		{
			
			sum=n2+n1;
			System.out.println("sum");
			n1=n2;
			n2=sum;
			System.out.println("Fibonacci series is" + sum);
		}
		// TODO Auto-generated method stub

	}

}
