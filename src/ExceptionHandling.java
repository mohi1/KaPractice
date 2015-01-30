 
public class ExceptionHandling {

	public static void main(String[] args) {
       divideByZero(2);
	}
	
	public static void divideByZero(int a){
		
		try
		{
			System.out.println(a/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("you can't do that ");
			System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
