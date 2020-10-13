package ua.academy.lgs;

public class MyException extends Exception {
private String message;
MyException(String message){
	super();
	this.message=message;
}
public String getMessage() {
	return message;
}


}
