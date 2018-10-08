package interfaces;

public class SingleLinkedListNode<T> {
	
	protected T data;
	protected SingleLinkedListNode<T> next;
	
	public SingleLinkedListNode() {}		// NIL
	
	public SingleLinkedListNode(T data, SingleLinkedListNode<T> next) {
		this.data = data;
		this.next = next;
	}
	
	public boolean isNil() {
		return data == null;
	}
}
