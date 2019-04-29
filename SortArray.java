import java.util.ArrayList;
import java.util.Scanner;

/*
 * make a class that sorts an array and print all the even sorted integers
 */
public class SortArray {
	
	static ArrayList<Number> evenlist= new ArrayList <>();
	
	public static ArrayList<Number> getEvenNumber(ArrayList<Number> list) {
		if (list== null || list.size()==0) {
			return null;
		}
		//Number number= 0; //first value in the ArrayList
		//System.out.println("number: "+ number);
		for (int i=0; i < list.size(); i++) {
			
			if (list.get(i).intValue() % 2==0) {
				evenlist.add(list.get(i));		
			}
		}
		return evenlist;
	}

	public static void main(String[] args) {
		ArrayList<Number> list=new ArrayList<> ();
		
		list.add(2);
		list.add(33);
		list.add(40);
		list.add(13);
		
		 System.out.println("The even numbers are: "+ getEvenNumber(list));

		
	}
	
		
}

