package ua.academy.lgs;

public class Application {
	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, ArithmeticException, MyException {
		Methods m = new Methods();
	

		try {
			m.plus(8, 7);
		}  catch (IllegalAccessException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (ArithmeticException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (MyException e) {
			System.out.println("You trited to use method that cause " + e);
		}catch (IllegalArgumentException e) {
			System.out.println("You trited to use method that cause " + e);
		}
		try {
			m.minus(0, 7);
		}  catch (IllegalAccessException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (ArithmeticException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (MyException e) {
			System.out.println("You trited to use method that cause " + e);
		}catch (IllegalArgumentException e) {
			System.out.println("You trited to use method that cause " + e);
		}
		try {
			m.multiply(0, 0);
		}  catch (IllegalAccessException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (ArithmeticException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (MyException e) {
			System.out.println("You trited to use method that cause " + e);
		}catch (IllegalArgumentException e) {
			System.out.println("You trited to use method that cause " + e);
		}
		try {
			m.devide(-8, -7);
		}  catch (IllegalAccessException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (ArithmeticException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (MyException e) {
			System.out.println("You trited to use method that cause " + e);
		}catch (IllegalArgumentException e) {
			System.out.println("You trited to use method that cause " + e);
		}
		try {
			m.plus(-8, 7);
		}  catch (IllegalAccessException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (ArithmeticException e) {
			System.out.println("You trited to use method that cause " + e);
		} catch (MyException e) {
			System.out.println("You trited to use method that cause " + e);
		}catch (IllegalArgumentException e) {
			System.out.println("You trited to use method that cause " + e);
		}
	}
}
