//determine if year is leap year using if statements
import java.util.*;
public class LeapYear {
	static int leap;
	
	LeapYear(int year){
		this.leap= year;
		
	}
	public void userIn() {
		Scanner input= new Scanner(System.in);
		leap= input.nextInt();
	}
	public Boolean leapYear() {
		if (leap % 4 ==0 && leap %100 !=0|| leap%400==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		LeapYear year1= new LeapYear(2008);
		System.out.println("Is this year a leap year: "+ leap);
		System.out.println(year1.leapYear());

	}

}
