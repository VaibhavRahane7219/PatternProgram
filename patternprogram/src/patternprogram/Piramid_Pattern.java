package patternprogram;

public class Piramid_Pattern {

	public static void main(String[] args) {
		int a=1, b=0;
		for(int i=0;i<=6;i++)
		{
			for(int k=0; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int j=6;j>=2*i;j--)
			{ 
				System.out.print("*");
				
//				if(j%2==0 )
//				{
//					System.out.print(" "+a);
//				}
//					else
//				{
//					System.out.print(" "+b);
//				
//				}
			}
			System.out.println();
		}

	}

}
