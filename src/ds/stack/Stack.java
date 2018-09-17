package ds.stack;

public class Stack {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size)
	{
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}
	
	public void push(long value)
	{
		top++;
		stackArray[top] = value;
	}
	
	public long pop()
	{
		int last_top = top;
		top--;
		return stackArray[last_top];
	}
	
	public long peak()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return (maxSize-1==top);
	}

}
