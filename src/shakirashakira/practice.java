package shakirashakira;

import java.util.Arrays;

//import javax.xml.crypto.Data;

public class practice {
	/**
	 * main, where i test things
	 * @param args
	 */

	public static void main(String[] args) {
		Time theTime = new Time();
		Time aTime = new Time(555550000);
		
		theTime.toStandard();
		aTime.toStandard();
                System.out.println(countN(22282,2));
                
		
		int[] list = new int[10];
	    for (int i=0; i<10; i++){
	        int n = (int)(Math.random()*9 + 1);
	        list[i] = n;
	    }
	    System.out.println(Arrays.toString(list) + " prior to sorting;\n");
	    quickSort(list);
	}
        public static int countN(int number, int digit){
            int ones = number%10;
            if(ones == digit){
                return countN((number/10), digit)+1;
            } else if (number == 0){
                return 0;
            } else {
                return countN((number/10), digit);
            }       
        }
	
	public static void swap(int[] data, int i, int j){
		int temp;
		temp = data[i];
		data[i]= data[j];
		data[j]=temp;
		System.out.print(data[i] + " swapped with " + data[j] +"\n");
	}
	/**
	 * bubblesort stuff
	 * @param data
	 */
	public static void doubleBubbleSort(int[] data){
		int swaps =0; // int flag
		int n = data.length;
		for(int i = 0; i < n-2; i++){// from 0 through the list's size
			swaps = 0;//set flag
			for (int j = 1; j<n-i-1; j++){ // from index 1 through the last index 
				if(data[j]>data[j-1])// of the elemnts that hadnt been sorted. if j is greater than its neighbor
					swap(data, j, j-1); swaps++; // bubble it forwards
			}
			for (int k = n-1; k>1+i; k--){ //from the last index through the most recently unsorted element
				if(data[k]<data[k-1])// if k is less than it's neighbor
					swap(data, k, k-1); swaps++; //bubble k backwards
			}
			System.out.println(Arrays.toString(data));
			if(swaps ==0) // if there havent been any swaps, break, cuz your finished
				break;
		}
	}
	public static void ModifiedBubbleSort(int[] a){
		int swaps;
		int n = a.length; 
		for(int i=0;i<n-2;i++){ 
			swaps = 0;
			for(int j=0;j<n-i-1;j++){
				if(a[j] > a[j+1]){ 
					swap(a, j ,j+1);
					swaps++;
				}
			}
			System.out.println(Arrays.toString(a));
			if(swaps==0){
				break;
			}
		}
	}
	/**
	 * quicksort stuff
	 * @param data
	 */
	public static void quickSort(int[] data){
		quickSort(data, 0, data.length-1);
		
	}
	
	public static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) { // for these two loops, traverse the array until 
	    	  // you find elements that are out of place
	            while (arr[i] < pivot) // while element at I is less than pivot
	                  i++; // move I forward until the element at I is greater than pivot
	            while (arr[j] > pivot) // while element at J is greater than pivot
	                  j--; // j traverses backward until the element at J is less than pivot
	            if (i <= j) { // then, if i < j; you swap them into their proper area
	                  swap(arr, i, j);
	                  i++;//move forward through the array
	                  j--;//move backward through the array
	            } // stop when i and j cross or meet
	      };
	      System.out.println(Arrays.toString(arr));
	      System.out.println("pivot is: " + arr[i]);
	      return i; // i is the index of the pivot
	}
	 
	public static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right); // index becomes equal to the index of the pivot
	      if (left < index - 1) // call recursively on the left side if left is less than index
	            quickSort(arr, left, index - 1);
	      if (index < right) // if right is less than index, do the same
	            quickSort(arr, index, right);
	}
	public static int parent(int n){
		return (n-1)/2;
	}
	
	public static void makeHeap(int[] data){ // O(n)
		int n = data.length;
		int i, next;
		for(i=1; i<n-1;i++){// from 1 through the length of the array 
			next=i;
			while(next != 0 && data[next] > data[parent(next)]){ // while next is larger tha its parent, 
				swap(data, next, parent(next)); // and it hasnt reached zero position yet, swap it with it's parent
				next=parent(next);// retain the postition of next, so you can continue this if next 
			} // is still larger than its parent
		}
	}
	
	public static void reheapify(int[] data, int heapsize){ // or fixheap (Ologn)
		int position = 0, childPos;
		while(position*2+1<heapsize){ // while it hasnt reached the end of the heap yet
			childPos = position*2+1;
			if(childPos < heapsize-1 && data[childPos+1]>data[childPos])// if the other child's data is larger
				childPos++; // than current child's data, get the index of that data
			if(data[childPos] > data[position]){ // if the bigger child's data is bigger than parent's data
				swap(data, position, childPos); // swap the child into the parents position
				position = childPos; // retain the position of the larger data
			}
			else return;
		}
	}
	
	public static void insertIntoHeap(int[] data, int heapsize, int item){
		int position = ++heapsize; // insert into last position in the heap
		data[position] = item;
		while(position != 0 && data[position] > data[parent(position)]){ // then move it level by level until it fits
			swap(data, position, parent(position));
			position = parent(position);  // to retain the value
		}
	}
	
	public static int removeFromHeap(int[] data, int heapsize){
		int result = data[0];
		data[0] = data[heapsize];
		heapsize--;
		reheapify(data, heapsize);
		return result;
	}

	public static void heapSort(int[] data, int n){
		int lastHeapPosition;// keep track of the final position
		makeHeap(data);
		lastHeapPosition = n-1;
		while(lastHeapPosition > 0){//while movig the final position towards zero
			swap(data, 0, lastHeapPosition);// move the largest elemnt to the final position
			reheapify(data, lastHeapPosition); // reheapify
			lastHeapPosition--; //move it backwards
		}
	}
	public static void mergeSort(int[] data){
		mergeSort(data, 0, data.length);
	}
	
	public static void mergeSort(int[] data, int first, int n){
		int n1, n2;
		if(n>1){
			n1=n/2; n2=n-n1;
			mergeSort(data,first,n1);
			mergeSort(data, first+n1, n2);
			merge(data,first,n1,n2);
		}
	}
	
	public static void merge(int[] data, int first, int n1, int n2){
		//only works for n1+n2 elements starting from data[first]
		int[] temp = new int[n1+n2]; //temp array
		int copied = 0; //number of copied elements in total
		int copied1 = 0; // number of copied elements from first half
		int copied2 = 0; // number of copied elements from second half
		
		while((copied1<n1)&&(copied2<n2)){ // while the number of copied elements is less than elemsnts within the halves
			if(data[first+copied1]<data[first+n1+copied2])//if the data in copied
				temp[copied++] = data[first+(copied1++)];
			else
				temp[copied++] = data[first+n1+(copied2++)];
		}
		//
		while(copied1<n1)
			temp[copied++]=data[first+(copied1++)];
		while(copied2<n2)
			temp[copied++]=data[first+n1+(copied2++)];
		//copy temp array over onto data
		for(int i=0;i<n1+n2;i++)
			data[first+i] = temp[i];
		System.out.println(Arrays.toString(temp));
	}
}

