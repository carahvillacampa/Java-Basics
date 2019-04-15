package hw2;
import java.util.*;

public class constructor_class { //class name constructor_class
	 int x;  			 // these are the attributes of the class/ this is the values that the class will have
	 int y;			     //also important to note that the default values of these attributes are public if we don't declare it private
	 String message;
	
	public constructor_class (int x, int y){ //this is the constructor that instantiates a class 
											//in Python the constructor is the __init__ method where initialization of variables happen
											/*
											 * this.x is same as self.something in Python--> instantiation/initialization
											 * for (int i=0; i < int_arr.length; i++) 
											 */
		this.x= x; //"this" keyword tells java that it's a member of that class. note that above we also declared x and y as integers the x in this.x
		           //is a local variable of the
		this.y= y;
	}
	public int returnVal() {
		return x+ y;
	}
	public String message1(String message) { //accessible through instances
		return message;
	}
	public static String message2(String message) { //accessible through only the class: classname.instancename
		return message;								//constructor_class.message2(string parameter);
	}
	
	public static void main(String [] args) {
		constructor_class addnum= new constructor_class(13,9);
		System.out.println(addnum.returnVal());
		System.out.println(addnum.message1("this is passed using an instance of the class because it's not static"));
		System.out.println(constructor_class.message2("this is pass using the constructor class because it is static"));
		

	}
}
