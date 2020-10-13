package ua.academy.lgs;

public class Methods {



	public void plus(int a, int b)
			throws IllegalArgumentException, MyException, IllegalAccessException, ArithmeticException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException();
		} else if ((a == 0 & b != 0) | (a != 0 & b == 0)) {
			throw new ArithmeticException();
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 & b > 0) {
			throw new MyException("My Exception");
		} else {
			System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
		}
	}

	public void minus(int a, int b)
			throws IllegalArgumentException, MyException, IllegalAccessException, ArithmeticException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException();
		} else if ((a == 0 & b != 0) | (a != 0 & b == 0)) {
			throw new ArithmeticException();
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 & b > 0) {
			throw new MyException("My Exception");
		} else {
			System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
		}
	}

	public void multiply(int a, int b)
			throws IllegalArgumentException, MyException, IllegalAccessException, ArithmeticException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException();
		} else if ((a == 0 & b != 0) | (a != 0 & b == 0)) {
			throw new ArithmeticException();
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 & b > 0) {
			throw new MyException("My Exception");
		} else {
			System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
		}
	}

	public void devide(int a, int b)
			throws IllegalArgumentException, MyException, IllegalAccessException, ArithmeticException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException();
		} else if ((a == 0 & b != 0) | (a != 0 & b == 0)) {
			throw new ArithmeticException();
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 & b > 0) {
			throw new MyException("My Exception");
		} else {
			System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
		}
	}
}
