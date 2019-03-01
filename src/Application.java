
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Racecar";
		System.out.println("Racecar is a palindrome: " + isPalindrome(str));
		
		System.out.println("Factorial of 5 is:  " + calcFactorial(5));
	}
	
	public static boolean isPalindrome( String t ){
		String s = t.toLowerCase();
		if ( s.length() <= 1) {
			return true;
		} else {
			if ( s.charAt(0) == s.charAt( s.length()-1 ) ){
				return isPalindrome( s.substring( 1, s.length()-1 ) );
			} else{
				return false;
			}
		} 
	} // end isPalindrome
	
	public static int calcFactorial(int n) {
		if ( n == 0 ) return 1; // tests for Base Case
		int factorial = n * calcFactorial(n-1); // recursive call ...
		return factorial;
	} // end calcFactorial
		

}
