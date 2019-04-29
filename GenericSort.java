
public class GenericSort {
	
	public static <E extends Comparable <E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;
		
		/*
		 * two loops:
		 * 
		 * 1. Outer loop:
		 *  - changes the min and index based on the list that's passed 
		 *  as parameter
		 *  
		 *  2. Inner Loop:
		 *  - compares the next number based on the index
		 *  - compares the currentMin to list[j]
		 *  
		 *  3. if to assess if currentMinIndex doesn't equal the index in the first loop
		 *  
		 *  
		 */
		
		for (int i=0; i < list.length-1; i++) {
			currentMin= list[i];
			currentMinIndex= i;
			
			for (int j= i+1; j < list.length; j++) {
				if (currentMin.compareTo (list[j]) > 0) {
					currentMin= list[j];
					currentMinIndex= j;				
				}
			}
		if (currentMinIndex != i) {
			list[currentMinIndex]= list[i];
			list[i]= currentMin;
			}
		}
		
	}
	
	public static void printList(Object [] list) {
		for (int i=0; i < list.length; i++) {
			System.out.println(list[i]+" ");
		}
	}
		
	public static void main(String[] args) {
		Integer [] intArray= { 2, 4, 3};
		
		Double[] doubleArray= {3.2, 2.5, 6.0};
		
		Character[] charArray= {'e','b','c'};
		
		String[] strArray= {"Fuck", "This", "Class"};
		
		sort(intArray);
		sort(doubleArray);
		sort(charArray);
		sort(strArray);
		
		System.out.println("Sorted String array: "+ " ");
		printList(strArray);
		System.out.println("Sorted Integer array: "+ " ");
		printList(intArray);
		

	}

}
