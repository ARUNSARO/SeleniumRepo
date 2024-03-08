package week1.Day2;

public class Learn_Methods 
{
    public int no_of_bicycles()      // method name should always start with lowercase or camelcase
    {
		// TODO Auto-generated method stub
        return 2;
	}
    public String bicycle_Data() 
    {
		// TODO Auto-generated method stub
        return "Honda";
	}
    public boolean electric_Bicycle() 
    {
		// TODO Auto-generated method stub
        return false;
	}
    public void add_TwoNumbers(int num1, int num2) 
    {
		// TODO Auto-generated method stub
        System.out.println(num1+num2);
	}
    public static void main(String[] args) 
    {  //object should be created by the name of class name(Learn_Methods)
		Learn_Methods lm = new Learn_Methods();
		lm.add_TwoNumbers(2, 3);
		
		//In boolean we have to assign an object to get the output
		boolean result = lm.electric_Bicycle();
		System.out.println(result);
		
		System.out.println(lm.bicycle_Data());
	}
}
