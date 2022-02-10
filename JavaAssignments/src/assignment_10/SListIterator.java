package assignment_10;

public class SListIterator <T>{
    Link<T> currentNode;

    public SListIterator(Link<T> n){
        currentNode = n;
    }
    public void insert(T data){
        currentNode.next = new Link<T>(data,null);
        currentNode = currentNode.next;
    }
    public  void remove(Link<T> head){
        while (head.next.next!=null){
            head = head.next;
        }
        head.next = null;
        currentNode = head;
    }
}
