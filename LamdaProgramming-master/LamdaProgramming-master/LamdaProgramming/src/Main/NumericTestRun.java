package Main;

public class NumericTestRun {
	public static void main(String args[]) {
		NumericTest isEven = (n) -> (n%2) == 0;
		NumericTest isNegative = (n) -> (n<0);
		
		System.out.println(isEven.computerTest(5));
		System.out.println(isNegative.computerTest(-5));
		
		MyGreeting mg = (name) -> "Good Morning " + name + "!";
		System.out.println(mg.processName("Ashik"));
		
		MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
		System.out.println(morningGreeting.processName("Shimul"));
		
		MyGreeting eveningGreeting = (str) -> "Good Evening " + str + "!";
		System.out.println(eveningGreeting.processName("Emon"));	
	
	}
}
