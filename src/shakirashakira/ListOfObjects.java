package shakirashakira;
import java.util.ArrayList;

public class ListOfObjects {
private ArrayList<Object> elements = new ArrayList<Object>();
private int size;
public static final int DEFAULT_CAPACITY=16;

public ListOfObjects(){
	elements = new ArrayList<Object>(DEFAULT_CAPACITY);
}


public void push(Object value){
	if (size>= elements.size()){
		ArrayList<Object> temp = new ArrayList<Object>(elements.size()*2);
		temp = new ArrayList<Object>(elements);
		elements = temp;
	}
	elements.add(size++, value);
	}

public Object pop(){
	return elements.get(--size);
}
public Object peep(){
	return elements.get(size-1);
}
public int getSize(){
	return size;
}
public void setSize(int s){
	this.size = s;
}

public boolean isEmpty(){
	if (size==0) return true; else return false;
}

}
