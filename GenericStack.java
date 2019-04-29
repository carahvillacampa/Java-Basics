/*
 * to implement it using an array rather than an ArrayList. 
 * you should check the array size before adding a new element
 * to the stack. If the array isFull, create a new array that
 * doubles the current arraysize and copy the elements from the
 * current array to the new array.
 * 
 */
public class GenericStack<T> {
	
	private java.util.ArrayList<T> genstack= new java.util.ArrayList <>();
		
	public int getSize() {
		return genstack.size();
	}
	
	public T Peek() {
		return genstack.get(getSize()-1);
	}
	public void Push(T obj) {
		genstack.add(obj);
	}
	
	public T pop() {
		T obj= genstack.get(getSize()-1);
		genstack.remove(getSize()-1);
		return obj;
	}
	
	public boolean isEmpty() {
		return genstack.isEmpty();
	}
	public boolean isFull() {
		for (T item: genstack)
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return genstack.toString();
	}

	public static void main(String[] args) {
		GenericStack<String> genstack1= new GenericStack<>();
		genstack1.Push("Fuck");
		genstack1.Push("This");
		genstack1.Push("Class");
		System.out.println("The stack contents: "+ genstack1.toString());

	}

}
