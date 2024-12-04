
public class FindFactorial{
	
	public static int factorial(int n){
	if(n == 1)
		return 1;

	else
		return n * factorial(n - 1);
}

public static void main(String[] args){
	
	int result = factorial(10);
	System.out.println("Factorial is " + result);
	}

}	
