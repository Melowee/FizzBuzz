package testss.etsss;

public class FizzBuzz {
	public String doFizzBuzz(int number) {
		String result = "";
		
		if (number % 3 == 0) {
			result += "Fizz";
		}
		
		if (number % 5 == 0) {
			result += "Buzz";
		}
		
		if (result.equals("")) {
			return number + "";
		}
		
		return result;
	}
}
