package Assignment2;

public class Calculator {

	
	public double add(double x, double y) { //User story 1
		return x + y;
	}
	
	public double naturallog(double x) { //User story 2
		return Math.log(x);
	}
		
	public double divide(double x, double y) { //User story 3
		if (y == 0) {
			return  Double.POSITIVE_INFINITY;
		}
		
		return x / y;
	}
	
	public double subtract(double x, double y) { //User story 4
		return x - y;
	}
	
	public double multiply(double x, double y) { //User story 5
		return x * y;
	}
	
	public double power(double x, double power) { //User story 6
		return Math.pow(x, power);
	}
	
	public double squareRoot(double x) { //User story 7
		return Math.sqrt(x);
	}
	
	public double cos(double x) { //User story 8
		x = Math.toRadians(x);
		return Math.cos(x);
	}
	
	public double sin(double x) { //User story 9
		x = Math.toRadians(x);
		return Math.sin(x);
	}
	
	public double log(double x, double base) { //User story 10
		return Math.log(x) / Math.log(base);
	}
	
}