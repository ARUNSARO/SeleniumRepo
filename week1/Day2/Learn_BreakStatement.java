package week1.Day2;

/*public class Learn_BreakStatement 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      for (int i = 1; i < 5; i++) 
      {
		if (i==3) 
		{
			System.out.println("Three");        //expected output 1 2 Three 3 4 
			break;
		}
		System.out.println(i);
	  }
      System.out.println("OUT OF LOOP");
	}
}*/


public class Learn_BreakStatement 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <=10; i++)             // expected output 1 2 three 4 5 6 7 8 9 10
		{
			if (i==3) 
			{
			System.out.println("Three");
			continue;
			}
			System.out.println(i);
		}
	}
}