package assignment_10;

public class SList<T> {
    Link<T> head = new Link<>(null,null);
    SListIterator<T> iterator() {
        return new SListIterator<>(head);
    }

    public String toString(){
        if(head.next == null) return "SList: []";
        System.out.print("SList: [");
        SListIterator<T> itert = this.iterator();
        StringBuilder s = new StringBuilder();
        while (itert.currentNode.next!=null){
            s.append(itert.currentNode.next.data+ (itert.currentNode.next.next!=null ? ", ":""));
            itert.currentNode=itert.currentNode.next;
        }
        return s + "]";
    }
}
