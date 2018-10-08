package interfaces;

public interface LinkedList<T> {
	
	public void insert();
	public T remove();
	public int size();
	public T search(T element);
	public boolean isEmpty();
	public T[] toArray();
	
}
