package myArrayList;

import java.util.Arrays;

public class MyArrayList{
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + "]";
	}

	private int array[] = new int[2];
	private int location = 0;

	/**
	 * @return the location
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(int location) {
		this.location = location;
	}

	/**
	 * @return array
	 */
	public int[] getArray() {
		return array;
	}
	
	/**
	 * @param array
	 */
	public void setArray(int[] array) {
		this.array = array;
	}
		
	public MyArrayList() {

		for(int i=0;i<array.length;i++)
			array[i]=0;
		location=0;
	}
		
	/**
	 * @param arrayIn
	 * @return
	 * it increases the size of array by 1.5 times
	 */
	public int[] arrayExpander(int[] arrayIn) {
	
		int[] tempArray = new int[(arrayIn.length*3)/2];
		
		for(int i=0; i<array.length;i++) {
			tempArray[i] = arrayIn[i];
		}
		
		return tempArray;
	}
	
	/**
	 * @param a
	 * it insert element in the array in sorted order
	 */
	public void insertSorted(int a) {
		array[0] = a;
		location++;
		if(location == array.length) array = arrayExpander(array); 
		Arrays.sort(array);
	}
	
	/*
	 * it removes the param element occurrences from array
	 */
	public void removeValue(int a) {
		
		int lowerIndex = -1;
		int higherIndex =-1;
		
		//finding 1st occurrence
		for(int i=0; i<array.length;i++) {
			if(array[i]==a) {
				lowerIndex = i;
				break;
			}
		}
		
		//finding last occurrence
		for(int i=array.length-1; i>=0;i--) {
			if(lowerIndex == -1)break;
			if(array[i]==a) {
				higherIndex = i;
				break;
			}
		}
		
		if(lowerIndex!=-1) {
			//removing the item
			for(int i = lowerIndex; i <= higherIndex;i++) {
				array[i] = 0;
			}
			System.out.println("Item "+a+" is removed");
		}
		else System.out.println("Item "+a+" is not present in the array");
		Arrays.sort(array);
	}
	
	/*
	 * returns index of element
	 */
	public int indexOf(int a) {
		int index =-1;
				
		for(int i=0; i<array.length;i++) {
			if(array[i]==a) return i;
		}
		return index;
	}
	
	/*
	 * returns size of the array
	 */
	public int size() {
		return array.length;
	}
	
	public int sum() {
		int result=0;
		for(int i=0;i<array.length;i++) {
			result += array[i];
		}
		return result;
	}
		
}

