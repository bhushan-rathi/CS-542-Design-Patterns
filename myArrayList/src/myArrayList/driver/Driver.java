package myArrayList.driver;
import myArrayList.MyArrayList;

public class Driver 
{

	public static void main(String[] args) 
	{
		MyArrayList al = new MyArrayList();
		al.insertSorted(1);
		al.insertSorted(11);
		al.insertSorted(15);
		al.insertSorted(1);
		al.insertSorted(11);
		al.insertSorted(15);
		al.insertSorted(1);
		al.insertSorted(1);
		al.insertSorted(11);
		//al.removeValue(11);
		//System.out.println("Index of item is " +al.indexOf(15));
		//System.out.println("size of the array is " +al.size());
		//System.out.println("sum of the array is " +al.sum());

		for(int i=0; i<al.getArray().length;i++) {
			System.out.println(al.getArray()[i]);
		}
	}
	
}


